package p307z0;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: compiled from: HtmlCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Spanned a(String str, int i10) {
        return Html.fromHtml(str, i10);
    }

    public static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i10, imageGetter, tagHandler);
    }

    public static String c(Spanned spanned, int i10) {
        return Html.toHtml(spanned, i10);
    }
}
