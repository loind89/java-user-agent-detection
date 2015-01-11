package net.pieroxy.ua.detection;
import java.io.*;
import java.util.*;
public enum Language {  UNKNOWN("Unknown"),
                        AA("Afar"),
                        AB("Abkhazian"),
                        AF("Afrikaans"),
                        AK("Akan"),
                        SQ("Albanian"),
                        AM("Amharic"),
                        AR("Arabic"),
                        AN("Aragonese"),

                        AS("Assamese"),
                        AV("Avaric"),
                        AE("Avestan"),
                        AY("Aymara"),
                        AZ("Azerbaijani"),
                        BA("Bashkir"),
                        BM("Bambara"),

                        BE("Belarusian"),
                        BN("Bengali"),
                        BH("Bihari languages"),
                        BI("Bislama"),
                        BO("Tibetan"),
                        BS("Bosnian"),
                        BR("Breton"),
                        BG("Bulgarian"),

                        CA("Catalan; Valencian"),

                        CH("Chamorro"),
                        CE("Chechen"),

                        CU("Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic"),
                        CV("Chuvash"),
                        KW("Cornish"),
                        CO("Corsican"),
                        CR("Cree"),
                        CY("Welsh"),
                        CS("Czech"),
                        DA("Danish"),
                        DE("German"),
                        DV("Divehi; Dhivehi; Maldivian"),

                        DZ("Dzongkha"),
                        EL("Greek, Modern (1453-)"),
                        EN("English"),
                        EO("Esperanto"),
                        ET("Estonian"),
                        EU("Basque"),
                        EE("Ewe"),
                        FO("Faroese"),
                        FA("Persian"),
                        FJ("Fijian"),
                        FI("Finnish"),
                        FR("French"),

                        FY("Western Frisian"),
                        FF("Fulah"),


                        GD("Gaelic; Scottish Gaelic"),
                        GA("Irish"),
                        GL("Galician"),
                        GV("Manx"),

                        GN("Guarani"),
                        GU("Gujarati"),
                        HT("Haitian; Haitian Creole"),
                        HA("Hausa"),
                        HE("Hebrew"),
                        HZ("Herero"),
                        HI("Hindi"),
                        HO("Hiri Motu"),
                        HR("Croatian"),
                        HU("Hungarian"),
                        HY("Armenian"),
                        IG("Igbo"),
                        IS("Icelandic"),
                        IO("Ido"),
                        II("Sichuan Yi; Nuosu"),
                        IU("Inuktitut"),
                        IE("Interlingue; Occidental"),
                        IA("Interlingua (International Auxiliary Language Association)"),
                        ID("Indonesian"),
                        IK("Inupiaq"),
                        IN("Indonesian"),
                        IW("Hebrew"),

                        IT("Italian"),
                        JI("Yiddish"),
                        JV("Javanese"),
                        JA("Japanese"),
                        KL("Kalaallisut; Greenlandic"),
                        KN("Kannada"),
                        KS("Kashmiri"),
                        KA("Georgian"),
                        KR("Kanuri"),
                        KK("Kazakh"),
                        KM("Central Khmer"),
                        KI("Kikuyu; Gikuyu"),
                        RW("Kinyarwanda"),
                        KY("Kirghiz; Kyrgyz"),
                        KV("Komi"),
                        KG("Kongo"),
                        KO("Korean"),
                        KJ("Kuanyama; Kwanyama"),
                        KU("Kurdish"),
                        LO("Lao"),
                        LA("Latin"),
                        LV("Latvian"),
                        LI("Limburgan; Limburger; Limburgish"),
                        LN("Lingala"),
                        LT("Lithuanian"),
                        LB("Luxembourgish; Letzeburgesch"),
                        LU("Luba-Katanga"),
                        LG("Ganda"),

                        MH("Marshallese"),
                        ML("Malayalam"),
                        MI("Maori"),
                        MR("Marathi"),
                        MS("Malay"),
                        MK("Macedonian"),
                        MG("Malagasy"),
                        MT("Maltese"),
                        MN("Mongolian"),


                        MY("Burmese"),
                        NA("Nauru"),
                        NV("Navajo; Navaho"),
                        NR("Ndebele, South; South Ndebele"),
                        ND("Ndebele, North; North Ndebele"),
                        NG("Ndonga"),
                        NE("Nepali"),
                        NL("Dutch; Flemish"),
                        NN("Norwegian Nynorsk; Nynorsk, Norwegian"),
                        NB("Bokmal, Norwegian; Norwegian Bokmal"),
                        NO("Norwegian"),
                        NY("Chichewa; Chewa; Nyanja"),
                        OC("Occitan (post 1500)"),
                        OJ("Ojibwa"),
                        OR("Oriya"),
                        OM("Oromo"),
                        OS("Ossetian; Ossetic"),
                        PA("Panjabi; Punjabi"),

                        PI("Pali"),
                        PL("Polish"),
                        PT("Portuguese"),
                        PS("Pushto; Pashto"),
                        QU("Quechua"),
                        RM("Romansh"),

                        RO("Romanian; Moldavian; Moldovan"),
                        RN("Rundi"),
                        RU("Russian"),
                        SG("Sango"),
                        SA("Sanskrit"),
                        SI("Sinhala; Sinhalese"),

                        SK("Slovak"),
                        SL("Slovenian"),
                        SE("Northern Sami"),
                        SM("Samoan"),
                        SN("Shona"),
                        SD("Sindhi"),
                        SO("Somali"),
                        ST("Sotho, Southern"),
                        ES("Spanish; Castilian"),
                        SC("Sardinian"),
                        SR("Serbian"),
                        SS("Swati"),
                        SU("Sundanese"),
                        SW("Swahili"),
                        SV("Swedish"),
                        TY("Tahitian"),
                        TA("Tamil"),
                        TT("Tatar"),
                        TE("Telugu"),
                        TG("Tajik"),
                        TL("Tagalog"),
                        TH("Thai"),

                        TI("Tigrinya"),
                        TO("Tonga (Tonga Islands)"),
                        TN("Tswana"),
                        TS("Tsonga"),
                        TK("Turkmen"),
                        TR("Turkish"),
                        TW("Twi"),
                        UG("Uighur; Uyghur"),
                        UK("Ukrainian"),
                        UR("Urdu"),
                        UZ("Uzbek"),
                        VE("Venda"),
                        VI("Vietnamese"),
                        VO("Volapuk"),

                        WA("Walloon"),
                        WO("Wolof"),
                        XH("Xhosa"),
                        YI("Yiddish"),
                        YO("Yoruba"),
                        ZA("Zhuang; Chuang"),
                        ZH("Chinese"),
                        ZU("Zulu");

                        private String label;
Language(String _label) {
    label = _label;
}
public String getLabel() {
    return label;
}

                     }