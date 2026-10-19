package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.decode.A;
import coil.decode.DataSource;
import coil.decode.z;
import coil.util.p;
import java.io.IOException;
import kotlin.collections.q;
import kotlin.text.n;
import org.xmlpull.v1.XmlPullParserException;
import p318zb.v;

/* JADX INFO: compiled from: ResourceUriFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22988b;

    /* JADX INFO: compiled from: ResourceUriFetcher.kt */
    public static final class a implements h.a<Uri> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            Uri uri = (Uri) obj;
            if (kotlin.jvm.internal.i.a(uri.getScheme(), "android.resource")) {
                return new k(uri, kVar);
            }
            return null;
        }
    }

    public k(Uri uri, coil.request.k kVar) {
        this.f22987a = uri;
        this.f22988b = kVar;
    }

    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) throws XmlPullParserException, IOException {
        Integer numA;
        Drawable drawableA;
        boolean z10 = true;
        Uri uri = this.f22987a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (n.S(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) q.W(uri.getPathSegments());
                if (str == null || (numA = kotlin.text.l.A(str)) == null) {
                    throw new IllegalStateException(B1.a.h(uri, "Invalid android.resource URI: "));
                }
                int iIntValue = numA.intValue();
                coil.request.k kVar = this.f22988b;
                Context context = kVar.f23098a;
                Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strB = coil.util.k.b(MimeTypeMap.getSingleton(), charSequence.subSequence(n.U(charSequence, '/', 0, 6), charSequence.length()).toString());
                if (!kotlin.jvm.internal.i.a(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new l(new A(v.b(v.g(resources.openRawResource(iIntValue, typedValue2))), new androidx.navigation.compose.v(context, 1), new z(authority, iIntValue, typedValue2.density)), strB, DataSource.f22859d);
                }
                if (authority.equals(context.getPackageName())) {
                    drawableA = com.voltasit.obdeleven.domain.usecases.device.v.e(context, iIntValue);
                    if (drawableA == null) {
                        throw new IllegalStateException(J4.i.b(iIntValue, "Invalid resource ID: ").toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = p211r0.f.f46248a;
                    drawableA = r0.f.a.a(resources, iIntValue, theme);
                    if (drawableA == null) {
                        throw new IllegalStateException(J4.i.b(iIntValue, "Invalid resource ID: ").toString());
                    }
                }
                if (!(drawableA instanceof VectorDrawable) && !(drawableA instanceof E2.g)) {
                    z10 = false;
                }
                if (z10) {
                    drawableA = new BitmapDrawable(context.getResources(), p.a(drawableA, kVar.f23099b, kVar.f23101d, kVar.f23102e, kVar.f23103f));
                }
                return new f(drawableA, z10, DataSource.f22859d);
            }
        }
        throw new IllegalStateException(B1.a.h(uri, "Invalid android.resource URI: "));
    }
}
