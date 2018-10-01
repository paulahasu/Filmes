package sin.multiprog.usjt.br.meusfilmes;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;
/**
 *
 *Nome: Paula Akemi Hasu RA817126817
 *
 */

public class Util {
    /**
     *
     *Nome: Paula Akemi Hasu RA817126817
     *
     */
    public static Drawable getImagem(Context context, String nome){
        Class<?> c = R.drawable.class;
        try {
            Field f = c.getDeclaredField(nome);
            int id = f.getInt(f);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e ) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return context.getDrawable(R.drawable.happy);
    }
}
