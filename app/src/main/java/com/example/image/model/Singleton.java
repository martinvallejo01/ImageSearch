package com.example.image.model;

import android.util.Log;
import com.google.gson.Gson;

public class Singleton {
    private static Singleton mInstance = null;
    public Image[] mImages;

    private Singleton() {
        load_data();
        Log.d("DATA_MODEL", "data loaded");
    }

    public static Singleton get() {
        if (mInstance == null)
            mInstance = new Singleton();
        return mInstance;
    }

    private void load_data() {
        String stringData = "[\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1107a',\n" +
                        "        title: 'A rose made of galaxies',\n" +
                        "        width: 7887,\n" +
                        "        height: 7994,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1107a.jpg',\n" +
                        "        url: '/images/heic1107a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1345a',\n" +
                        "        title: 'Antennae Galaxies reloaded',\n" +
                        "        width: 4240,\n" +
                        "        height: 4211,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1345a.jpg',\n" +
                        "        url: '/images/potw1345a/',\n" +
                        "        potw: '11 November 2013'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0817a',\n" +
                        "        title: 'Magnetic monster NGC 1275',\n" +
                        "        width: 4633,\n" +
                        "        height: 3590,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0817a.jpg',\n" +
                        "        url: '/images/heic0817a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0406a',\n" +
                        "        title: 'Hubble sees galaxies galore',\n" +
                        "        width: 6200,\n" +
                        "        height: 6200,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0406a.jpg',\n" +
                        "        url: '/images/heic0406a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo0328a',\n" +
                        "        title: 'Hubble mosaic of the majestic Sombrero Galaxy',\n" +
                        "        width: 11472,\n" +
                        "        height: 6429,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo0328a.jpg',\n" +
                        "        url: '/images/opo0328a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1811a',\n" +
                        "        title: 'Spirals and supernovae',\n" +
                        "        width: 3928,\n" +
                        "        height: 4538,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1811a.jpg',\n" +
                        "        url: '/images/potw1811a/',\n" +
                        "        potw: '12 March 2018'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0506a',\n" +
                        "        title: 'Out of this whirl: The Whirlpool Galaxy (M51) and companion galaxy',\n" +
                        "        width: 11477,\n" +
                        "        height: 7965,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0506a.jpg',\n" +
                        "        url: '/images/heic0506a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo0511a',\n" +
                        "        title: 'Hubble spies cosmic dust bunnies',\n" +
                        "        width: 3228,\n" +
                        "        height: 3280,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo0511a.jpg',\n" +
                        "        url: '/images/opo0511a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo0501a',\n" +
                        "        title: 'A poster-size image of the beautiful barred spiral galaxy NGC 1300',\n" +
                        "        width: 6637,\n" +
                        "        height: 3787,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo0501a.jpg',\n" +
                        "        url: '/images/opo0501a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0206b',\n" +
                        "        title: 'Hubble&#39;s newest camera takes a deep look at two merging galaxies',\n" +
                        "        width: 3857,\n" +
                        "        height: 2893,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0206b.jpg',\n" +
                        "        url: '/images/heic0206b/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0206a',\n" +
                        "        title: 'A &#39;wallpaper&#39; of distant galaxies is a stunning backdrop for a runaway galaxy',\n" +
                        "        width: 4360,\n" +
                        "        height: 3798,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0206a.jpg',\n" +
                        "        url: '/images/heic0206a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1302a',\n" +
                        "        title: 'Hubble view of Messier 106',\n" +
                        "        width: 7910,\n" +
                        "        height: 6178,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1302a.jpg',\n" +
                        "        url: '/images/heic1302a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1104a',\n" +
                        "        title: 'Flocculent spiral NGC 2841',\n" +
                        "        width: 3897,\n" +
                        "        height: 3044,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1104a.jpg',\n" +
                        "        url: '/images/heic1104a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0910s',\n" +
                        "        title: 'Barred spiral galaxy NGC 6217',\n" +
                        "        width: 2631,\n" +
                        "        height: 3289,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0910s.jpg',\n" +
                        "        url: '/images/heic0910s/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0910i',\n" +
                        "        title: 'Galactic wreckage in Stephan&#39;s Quintet',\n" +
                        "        width: 6064,\n" +
                        "        height: 6760,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0910i.jpg',\n" +
                        "        url: '/images/heic0910i/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0905a',\n" +
                        "        title: 'Dramatically backlit dust lanes in NGC 7049',\n" +
                        "        width: 1766,\n" +
                        "        height: 1948,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0905a.jpg',\n" +
                        "        url: '/images/heic0905a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0719a',\n" +
                        "        title: 'Holiday wishes from the Hubble Space Telescope',\n" +
                        "        width: 4014,\n" +
                        "        height: 3865,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0719a.jpg',\n" +
                        "        url: '/images/heic0719a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0706a',\n" +
                        "        title: 'Stellar nursery in the arms of NGC 1672',\n" +
                        "        width: 5302,\n" +
                        "        height: 3805,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0706a.jpg',\n" +
                        "        url: '/images/heic0706a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo0624a',\n" +
                        "        title: 'ACS image of NGC 5866',\n" +
                        "        width: 3190,\n" +
                        "        height: 3756,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo0624a.jpg',\n" +
                        "        url: '/images/opo0624a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0604a',\n" +
                        "        title: 'The magnificent starburst galaxy Messier 82',\n" +
                        "        width: 9500,\n" +
                        "        height: 7400,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0604a.jpg',\n" +
                        "        url: '/images/heic0604a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0602a',\n" +
                        "        title: 'Largest ever galaxy portrait - stunning HD image of Pinwheel Galaxy',\n" +
                        "        width: 15852,\n" +
                        "        height: 12392,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0602a.jpg',\n" +
                        "        url: '/images/heic0602a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo9941a',\n" +
                        "        title: 'A grazing encounter between two spiral galaxies',\n" +
                        "        width: 2907,\n" +
                        "        height: 1486,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo9941a.jpg',\n" +
                        "        url: '/images/opo9941a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1516a',\n" +
                        "        title: 'Hubble image of ESO 381-12',\n" +
                        "        width: 3936,\n" +
                        "        height: 3849,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1516a.jpg',\n" +
                        "        url: '/images/heic1516a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo0123a',\n" +
                        "        title: 'Galaxy playing twister',\n" +
                        "        width: 1435,\n" +
                        "        height: 732,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo0123a.jpg',\n" +
                        "        url: '/images/opo0123a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1441a',\n" +
                        "        title: 'Turquoise-tinted plumes in the Large Magellanic Cloud',\n" +
                        "        width: 1483,\n" +
                        "        height: 1194,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1441a.jpg',\n" +
                        "        url: '/images/potw1441a/',\n" +
                        "        potw: '13 October 2014'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1305a',\n" +
                        "        title: 'Hubble image of Messier 77',\n" +
                        "        width: 2948,\n" +
                        "        height: 2321,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1305a.jpg',\n" +
                        "        url: '/images/heic1305a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1110a',\n" +
                        "        title: 'Spectacular Hubble view of Centaurus A',\n" +
                        "        width: 4027,\n" +
                        "        height: 4174,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1110a.jpg',\n" +
                        "        url: '/images/heic1110a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0814a',\n" +
                        "        title: 'Abell 2218',\n" +
                        "        width: 4739,\n" +
                        "        height: 4504,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0814a.jpg',\n" +
                        "        url: '/images/heic0814a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1805a',\n" +
                        "        title: 'Twins with differences',\n" +
                        "        width: 4061,\n" +
                        "        height: 3038,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1805a.jpg',\n" +
                        "        url: '/images/potw1805a/',\n" +
                        "        potw: '29 January 2018'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1542a',\n" +
                        "        title: 'Starburst galaxy Messier 94',\n" +
                        "        width: 1002,\n" +
                        "        height: 981,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1542a.jpg',\n" +
                        "        url: '/images/potw1542a/',\n" +
                        "        potw: '19 October 2015'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1919a',\n" +
                        "        title: 'Arp-Madore 2026-424',\n" +
                        "        width: 1846,\n" +
                        "        height: 2000,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1919a.jpg',\n" +
                        "        url: '/images/heic1919a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1921a',\n" +
                        "        title: 'Bucking the trend',\n" +
                        "        width: 3762,\n" +
                        "        height: 3000,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1921a.jpg',\n" +
                        "        url: '/images/potw1921a/',\n" +
                        "        potw: '27 May 2019'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1850a',\n" +
                        "        title: '25 years of stunning definition',\n" +
                        "        width: 3679,\n" +
                        "        height: 3645,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1850a.jpg',\n" +
                        "        url: '/images/potw1850a/',\n" +
                        "        potw: '10 December 2018'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1849a',\n" +
                        "        title: 'Clusters within clusters',\n" +
                        "        width: 18281,\n" +
                        "        height: 10283,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1849a.jpg',\n" +
                        "        url: '/images/potw1849a/',\n" +
                        "        potw: '3 December 2018'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1811a',\n" +
                        "        title: 'Peculiar galaxy NGC 3256',\n" +
                        "        width: 3948,\n" +
                        "        height: 3978,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1811a.jpg',\n" +
                        "        url: '/images/heic1811a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1822a',\n" +
                        "        title: 'A green cosmic arc',\n" +
                        "        width: 3461,\n" +
                        "        height: 3037,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1822a.jpg',\n" +
                        "        url: '/images/potw1822a/',\n" +
                        "        potw: '28 May 2018'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1806a',\n" +
                        "        title: 'A ghostly galaxy lacking dark matter',\n" +
                        "        width: 3000,\n" +
                        "        height: 2000,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1806a.jpg',\n" +
                        "        url: '/images/heic1806a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1712a',\n" +
                        "        title: 'NGC 1512 and NGC 1510',\n" +
                        "        width: 11423,\n" +
                        "        height: 4177,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1712a.jpg',\n" +
                        "        url: '/images/heic1712a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1503a',\n" +
                        "        title: 'Hubble image of NGC 7714',\n" +
                        "        width: 3269,\n" +
                        "        height: 2240,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1503a.jpg',\n" +
                        "        url: '/images/heic1503a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1502a',\n" +
                        "        title: 'Sharpest ever view of the Andromeda Galaxy',\n" +
                        "        width: 69536,\n" +
                        "        height: 22230,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1502a.jpg',\n" +
                        "        url: '/images/heic1502a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'opo1438b',\n" +
                        "        title: 'Spiral galaxy M81',\n" +
                        "        width: 10555,\n" +
                        "        height: 7223,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/opo1438b.jpg',\n" +
                        "        url: '/images/opo1438b/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic0814b',\n" +
                        "        title: 'Abell 1703',\n" +
                        "        width: 4784,\n" +
                        "        height: 4961,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic0814b.jpg',\n" +
                        "        url: '/images/heic0814b/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw2006a',\n" +
                        "        title: 'Open Arms',\n" +
                        "        width: 3130,\n" +
                        "        height: 1886,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw2006a.jpg',\n" +
                        "        url: '/images/potw2006a/',\n" +
                        "        potw: '10 February 2020'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1940a',\n" +
                        "        title: 'A Spiral in Profile',\n" +
                        "        width: 4079,\n" +
                        "        height: 3789,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1940a.jpg',\n" +
                        "        url: '/images/potw1940a/',\n" +
                        "        potw: '7 October 2019'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1924a',\n" +
                        "        title: 'Spiral, elliptical, irregular',\n" +
                        "        width: 6130,\n" +
                        "        height: 3448,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1924a.jpg',\n" +
                        "        url: '/images/potw1924a/',\n" +
                        "        potw: '17 June 2019'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1802a',\n" +
                        "        title: 'A gargantuan collision',\n" +
                        "        width: 7791,\n" +
                        "        height: 4784,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1802a.jpg',\n" +
                        "        url: '/images/potw1802a/',\n" +
                        "        potw: '8 January 2018'\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1752b',\n" +
                        "        title: 'Galaxy cluster RCS2 J2327',\n" +
                        "        width: 4036,\n" +
                        "        height: 4013,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1752b.jpg',\n" +
                        "        url: '/images/potw1752b/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1752a',\n" +
                        "        title: 'Hubble and HAWK-I explore a cluster with the mass of two quadrillion Suns',\n" +
                        "        width: 4036,\n" +
                        "        height: 4013,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1752a.jpg',\n" +
                        "        url: '/images/potw1752a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'heic1716a',\n" +
                        "        title: 'Result of a galactic crash',\n" +
                        "        width: 4128,\n" +
                        "        height: 3968,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/heic1716a.jpg',\n" +
                        "        url: '/images/heic1716a/',\n" +
                        "        potw: ''\n" +
                        "    },\n" +
                        "    \n" +
                        "    {\n" +
                        "        id: 'potw1451a',\n" +
                        "        title: 'The beautiful side of IC 335',\n" +
                        "        width: 3989,\n" +
                        "        height: 3324,\n" +
                        "        src: 'https://cdn.spacetelescope.org/archives/images/thumb300y/potw1451a.jpg',\n" +
                        "        url: '/images/potw1451a/',\n" +
                        "        potw: '22 December 2014'\n" +
                        "    },\n" +
                        "    \n" +
                        "]";
        Gson gson = new Gson();
        mImages = gson.fromJson(stringData, Image[].class);

    }
}
