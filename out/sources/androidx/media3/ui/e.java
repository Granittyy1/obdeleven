package androidx.media3.ui;

import V.u;
import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import p128k2.o;

/* JADX INFO: compiled from: SpannedToHtmlConverter.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f19049a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f19051b;

        public a(String str, Map map) {
            this.f19050a = str;
            this.f19051b = map;
        }
    }

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o f19052e = new o();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final u f19053f = new u(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f19057d;

        public b(int i10, int i11, String str, String str2) {
            this.f19054a = i10;
            this.f19055b = i11;
            this.f19056c = str;
            this.f19057d = str2;
        }
    }

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19058a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f19059b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f19049a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
