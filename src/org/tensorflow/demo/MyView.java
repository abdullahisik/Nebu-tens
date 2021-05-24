package org.tensorflow.demo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
public class MyView extends View {
   public static Canvas cenvas;
    Paint mPaint, otherPaint, outerPaint, mTextPaint;
    RectF mRectF;
    int mPadding;

    float arcLeft, arcTop, arcRight, arcBottom;

    Path mPath;


    public MyView(Context context) {
        super(context);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.CYAN);
        mPaint.setStrokeWidth(5);


        mTextPaint = new Paint(Paint.LINEAR_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(Color.CYAN);
        mTextPaint.setTextSize(pxFromDp(context, 24));

        otherPaint = new Paint();

        outerPaint = new Paint();
        outerPaint.setStyle(Paint.Style.FILL);
        outerPaint.setColor(Color.YELLOW);

        mPadding = 100;


        DisplayMetrics displayMetrics = new DisplayMetrics();

        ((Activity) getContext()).getWindowManager()
                .getDefaultDisplay()
                .getMetrics(displayMetrics);


        int screenWidth = displayMetrics.widthPixels;
        int screenHeight = displayMetrics.heightPixels;

        arcLeft = pxFromDp(context, 20);
        arcTop = pxFromDp(context, 20);
        arcRight = pxFromDp(context, 100);
        arcBottom = pxFromDp(context, 100);


        Point p1 = new Point((int) pxFromDp(context, 80) + (screenWidth / 2), (int) pxFromDp(context, 40));
        Point p2 = new Point((int) pxFromDp(context, 40) + (screenWidth / 2), (int) pxFromDp(context, 80));
        Point p3 = new Point((int) pxFromDp(context, 120) + (screenWidth / 2), (int) pxFromDp(context, 80));

        mPath = new Path();
        mPath.moveTo(p1.x, p1.y);
        mPath.lineTo(p2.x, p2.y);
        mPath.lineTo(p3.x, p3.y);
        mPath.close();

        mRectF = new RectF(screenWidth / 4, screenHeight / 3, screenWidth / 6, screenHeight / 2);

    }
public static Canvas cenves;
public void rects () {
    postInvalidate();

}
@Override
    protected void onDraw(Canvas canvas) {
super.onDraw(canvas);
   //     canvas.drawRoundRect(mRectF, 10, 10, otherPaint);
      //  canvas.clipRect(mRectF, Region.Op.DIFFERENCE);
       // canvas.drawPaint(outerPaint);
       // cenves = canvas;
     //   cenves.drawRect(DetectorActivity.left, DetectorActivity.right, DetectorActivity.top, DetectorActivity.bottom, mPaint);

        Log.println(Log.ASSERT,"CANVAS LOG"+DetectorActivity.left+"LEFT"+ DetectorActivity.right+"RİGHT"+ DetectorActivity.top+"TOP"+DetectorActivity.bottom+"BOTTOM","HERE THAT");
     //   canvas.drawLine(250, 250, 400, 400, mPaint);
        //canvas.drawArc(arcLeft, arcTop, arcRight, arcBottom, 75, 45, true, mPaint);


        otherPaint.setColor(Color.GREEN);
        otherPaint.setStyle(Paint.Style.FILL);
//
//        canvas.drawRect(
//                getLeft() + (getRight() - getLeft()) / 3,
//                getTop() + (getBottom() - getTop()) / 3,
//                getRight() - (getRight() - getLeft()) / 3,
//                getBottom() - (getBottom() - getTop()) / 3, otherPaint);


      //  canvas.drawPath(mPath, mPaint);
        otherPaint.setColor(Color.BLACK);
      //  canvas.drawCircle(getWidth() / 2, getHeight() / 2, arcLeft, otherPaint);
mTextPaint.setColor(Color.CYAN);

canvas.drawText("NEBU V2.0", 0,  getHeight(), mTextPaint);

    }

    public void kareciz() {

    }
    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }

}