package coil.util;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import coil.decode.DataSource;
import coil.size.Scale;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.R;
import java.io.Closeable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f23160a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f23161b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final okhttp3.o f23162c = new okhttp3.o.a().e();

    /* JADX INFO: compiled from: Utils.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23163a;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DataSource dataSource = DataSource.f22857b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DataSource dataSource2 = DataSource.f22857b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DataSource dataSource3 = DataSource.f22857b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f23163a = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Scale scale = Scale.f23143b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || kotlin.text.n.S(str)) {
            return null;
        }
        String strO0 = kotlin.text.n.o0(kotlin.text.n.o0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(kotlin.text.n.l0('.', kotlin.text.n.l0('/', strO0, strO0), ""));
    }

    public static final coil.request.r c(View view) {
        Object tag = view.getTag(R.id.coil_request_manager);
        coil.request.r rVar = tag instanceof coil.request.r ? (coil.request.r) tag : null;
        if (rVar == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(R.id.coil_request_manager);
                    coil.request.r rVar2 = tag2 instanceof coil.request.r ? (coil.request.r) tag2 : null;
                    if (rVar2 != null) {
                        rVar = rVar2;
                    } else {
                        rVar = new coil.request.r(view);
                        view.addOnAttachStateChangeListener(rVar);
                        view.setTag(R.id.coil_request_manager, rVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return rVar;
    }

    public static final boolean d(Uri uri) {
        return kotlin.jvm.internal.i.a(uri.getScheme(), "file") && kotlin.jvm.internal.i.a((String) kotlin.collections.q.P(uri.getPathSegments()), "android_asset");
    }

    public static final int e(Z2.a aVar, Scale scale) {
        if (aVar instanceof Z2.a.C0110a) {
            return ((Z2.a.C0110a) aVar).f7725a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return BrazeLogger.SUPPRESS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
