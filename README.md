@@ -35,7 +35,7 @@ Mario.BackgroundGenerator.prototype = {
    }

    GenerateOverground :  función ( nivel ) {
        rango var =  esto . Distante  ?  4  :  6 ;
        rango var =  esto . Distante  ?  3  :  6 ;
        var offs =  esto . Distante  ?  2  :  1 ;
        var oh =  Matemáticas . piso ( Math . random () * range) + offs;
        var h =  matemáticas . piso ( Math . random () * range) + offs;
@@ -55,9 +55,9 ​​@@ Mario.BackgroundGenerator.prototype = {
                    si ( este . distante ) {
                        s =  2 ;
                        si (y <  2 ) {s = y; }
                        nivel . SetBlock (x, y, 4  + s *  8 );
                        nivel . SetBlock (x, y, 3  + s *  8 );
                    } else {
                        nivel . SetBlock (x, y, 5 );
                        nivel . SetBlock (x, y, 2 );
                    }
                } else  if (y === h0) {
                    s = h0 === h ?  0  :  1 ;
