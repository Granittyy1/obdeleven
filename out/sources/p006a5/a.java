package p006a5;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.b;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2708s;
import p013b0.d;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f8055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8056b;

    public static d a() {
        return new d(1.0f, 1.0f);
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static synchronized boolean c(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f8055a;
        if (context2 != null && (bool = f8056b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f8056b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f8056b = boolValueOf;
        f8055a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static final String e(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = bufferedReader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static final Object f(Object obj) {
        return obj instanceof C2708s ? b.a(((C2708s) obj).f43531a) : obj;
    }
}
