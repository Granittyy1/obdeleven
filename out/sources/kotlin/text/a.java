package kotlin.text;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43119a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f43120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f43121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f43122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Charset f43123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Charset f43124f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.i.d(charsetForName, "forName(...)");
        f43120b = charsetForName;
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        Charset charsetForName2 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.i.d(charsetForName2, "forName(...)");
        f43121c = charsetForName2;
        Charset charsetForName3 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.i.d(charsetForName3, "forName(...)");
        f43122d = charsetForName3;
    }
}
