package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyDraw extends View {
    public MyDraw (Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setAntiAlias(true);
        paint.setColor(Color.argb(127, 0, 0, 255));
//        Небо
        canvas.drawRect(0, 0, 1300, 1200, paint);
//        Травка
        paint.setColor(Color.GREEN);
        canvas.drawRect(0, 1200, 1300, 1900, paint);
//        Основание дома
        paint.setColor(Color.rgb(176, 175, 179));
        canvas.drawRect(100, 700, 900, 1500, paint);
        paint.setColor(Color.BLACK);
//        Контур
        canvas.drawLine(100, 700, 100, 1500, paint);
        canvas.drawLine(100, 1500, 900, 1500, paint);
        canvas.drawLine(900, 1500, 900, 700, paint);
        canvas.drawLine(900, 700, 100, 700, paint);
//        Вход
        paint.setColor(Color.BLACK);
        canvas.drawRect(150, 1250, 360, 1500, paint);
        canvas.drawCircle(255, 1250, 105, paint);
//        Крыша
        paint.setColor(Color.rgb(146, 145, 148));
        canvas.drawRect(75, 600, 225, 750, paint);
        canvas.drawRect(300, 600, 450, 750, paint);
        canvas.drawRect(525, 600, 675, 750, paint);
        canvas.drawRect(775, 600, 925, 750, paint);
//        Солнышко
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(1000, 140, 120, paint);

    }


}

