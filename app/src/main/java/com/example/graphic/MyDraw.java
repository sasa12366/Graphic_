package com.example.graphic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class MyDraw extends View{

    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       Paint paint = new Paint();
        // Выбираем кисть
       /* paint.setStyle(Paint.Style.FILL);
        // Белый цвет кисти
        paint.setColor(Color.WHITE);
        // Закрашиваем холст
        canvas.drawPaint(paint);

        // Включаем антиальясинг
        paint.setAntiAlias(true);

        paint.setColor(Color.argb(127,0,0,255));
        // Полупрозрачный синий круг радиусом 100 пикселей в центре экрана
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 200, paint);

        // Синий прямоугольник вверху экрана
        paint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, getWidth(),200, paint);

        // Текст
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(30);
        canvas.drawText("Samsung IT school", 50, 100, paint);

        // текст под углом
        float rotate_center_x = 200; //центр поворота по оси X
        float rotate_center_y = 200; // центр поворота по оси Y
        float rotate_angle = 45; //угол поворота

        // поворачиваем холст
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);


        paint.setColor(Color.BLACK);
        paint.setTextSize(40);

        canvas.drawText("Samsung IT school",0,450,paint);

        // возвращаем холст на прежний угол
       // canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        // Выведем изображение логотипа Samsung на экран в правом нижнем углу экрана
        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.samsung);
        int xx = canvas.getWidth(), yy = canvas.getHeight();
        canvas.drawBitmap(image, xx - image.getWidth(), yy - image.getHeight(), paint);
       //круг
        */
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(20);
        //толщина линий
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawCircle(300, 300, 200, paint);
        //размер линий
       paint.setStrokeWidth(20);
        //Рисуем лучики
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        // х и у - начальная точка, х и у - конечные точки
        canvas.drawLine(300,300,700,650,paint);
       // canvas.drawLine(300,300,655,50,paint);
       canvas.drawLine(300,300,660,100,paint);
       // canvas.drawLine(300,300,660,150,paint);
        canvas.drawLine(300,300,665,200,paint);
       // canvas.drawLine(300,300,670,250,paint);
        canvas.drawLine(300,300,675,300,paint);
        //canvas.drawLine(300,300,680,350,paint);
        canvas.drawLine(300,300,685,400,paint);
        //canvas.drawLine(300,300,690,450,paint);
        canvas.drawLine(300,300,695,500,paint);
        //canvas.drawLine(300,300,700,550,paint);
        canvas.drawLine(300,300,300,0,paint);
        canvas.drawLine(300,300,300,800,paint);
        canvas.drawLine(300,300,400,780,paint);
        canvas.drawLine(300,300,500,760,paint);
        canvas.drawLine(300,300,600,750,paint);
        canvas.drawLine(300,300,200,750,paint);
        canvas.drawLine(300,300,100,750,paint);
        canvas.drawLine(300,300,0,750,paint);
        canvas.drawLine(300,300,0,650,paint);
        canvas.drawLine(300,300,0,550,paint);
        canvas.drawLine(300,300,0,450,paint);
        canvas.drawLine(300,300,0,350,paint);
        canvas.drawLine(300,300,0,250,paint);
        canvas.drawLine(300,300,0,150,paint);
        canvas.drawLine(300,300,0,50,paint);
        canvas.drawLine(300,300,0,0,paint);
        canvas.drawLine(300,300,50,0,paint);
        canvas.drawLine(300,300,100,0,paint);
        canvas.drawLine(300,300,200,0,paint);
        canvas.drawLine(300,300,300,0,paint);
        canvas.drawLine(300,300,400,0,paint);
        canvas.drawLine(300,300,500,0,paint);
        canvas.drawLine(300,300,600,0,paint);

        //рисуем домик
        paint.setColor(Color.RED);
        //полная заливка
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(20);
        //прямоугольник - основание дома
//парамметры: х и у - верхнего угла,х и у - нижнего угла, х и у - радиуса закругления
        canvas.drawRoundRect(300,1300,1030,1800, 0, 0, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(20);
        paint.setAntiAlias(true);
        //рисуем крышу
        canvas.drawLine(300,1300,700,800,paint);
        canvas.drawLine(700,800,1030,1300,paint);

        //дверь
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        //парамметры х и у верхней точки , х и у нижней точки
        canvas.drawRect(800,1400,1000,1800,paint);
        //рисуем дерево
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        //парамметры это координаты верхней точки x и y, нижней точки x и у
        canvas.drawOval(50,1100,200,1700,paint);
        //ножка дерева
        paint.setColor(Color.parseColor("#964b00"));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(115,1700,135,1800,paint);
        //кружочек на доме
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(700, 1100, 100, paint);

     //  Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        // Закрашиваем холст
        canvas.drawPaint(paint);
        paint.setColor(Color.parseColor("#09ab3f"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 1500, 1100, 2130, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(150, 150, 250, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(20);
        canvas.drawLine(150, 150, 550, 550, paint);
        canvas.drawLine(150, 150, 550, 450, paint);
        canvas.drawLine(150, 150, 700, 380, paint);
        canvas.drawLine(150, 150, 800, 320, paint);
        canvas.drawLine(150, 150, 800, 180, paint);
        canvas.drawLine(150, 150, 800, 100, paint);
        canvas.drawLine(150, 150, 600, 50, paint);
        canvas.drawLine(150, 150, 400, 550, paint);
        canvas.drawLine(150, 150, 300, 650, paint);
        canvas.drawLine(150, 150, 200, 550, paint);
        canvas.drawLine(150, 150, 100, 600, paint);
        canvas.drawLine(150, 150, 50, 550, paint);

        //дом
        paint.setColor(Color.parseColor("#964b00"));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(50,1200,700,1900,paint);

        //крыша
        paint.setStrokeWidth(50);
        canvas.drawLine(50,1200,400,800,paint);
        canvas.drawLine(700,1200,400,800,paint);


        paint.setStrokeWidth(20);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(400, 1050, 100, paint);

        //дверь
        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(350,1400,680,1900,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.BLACK);
        canvas.drawRect(350,1400,680,1900,paint);

        paint.setColor(Color.parseColor("#964b00"));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(900,1850,950,1950,paint);

        paint.setColor(Color.parseColor("#19ff19"));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(850,1000,1000,1850,paint);

    }
}