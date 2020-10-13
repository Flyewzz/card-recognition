package com.card;

public interface Constants {
    public static final String DEFAULT_INPUT_DIR = System.getProperty("user.dir");
    // Шаблоны мастей
    public static final String[] SUITS_TEMPLS = {"c.png","d.png","h.png","s.png"};
    // Шаблоны рангов
    public static final String[] RANK_TEMPLS = {"2.png","3.png","4.png","5.png","6.png","7.png",
            "8.png","9.png","10.png","A_7.png","J.png","K.png","Q.png"};


    // Для более точного распознавания карт с тенью
    public static final int[] ARRAY_RGB_OF_SHADOW_CARD_SURFACE = {120, 120, 120};
    public static final int[] ARRAY_RGB_OF_NORMAL_CARD_SURFACE  = {255, 255, 255};

    // Размер картинки на входе
    public static final int IMAGE_WIDTH = 636;
    public static final int IMAGE_HEIGHT = 1166;

    // Допуски при распознавании
    public static final int ALLOW_RANK_SCALE = 17;
    public static final int ALLOW_SUITS_SCALE = 7;

    // Здесь задаются координаты начаоа карты
    public static final int[] ARRAY_OF_CARD_POSITION_X = {142, 214, 285, 357, 428};

    //Смещения и координаты на картинке для выделения подобласти для распознавания
    public static final int OFFSET_OF_CARD_RANK_X = 11;
    public static final int OFFSET_OF_CARD_SUITS_X = 28;
    public static final int CARD_POSITION_RANK_Y = 592;
    public static final int CARD_POSITION_SUITS_Y = 634;
}
