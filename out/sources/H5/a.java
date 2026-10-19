package H5;

import A8.p;
import P5.b;
import android.content.Context;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ElevationOverlayProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3730f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3735e;

    public a(Context context) {
        boolean zB = b.b(context, R.attr.elevationOverlayEnabled, false);
        int iX = p.x(context, R.attr.elevationOverlayColor, 0);
        int iX2 = p.x(context, R.attr.elevationOverlayAccentColor, 0);
        int iX3 = p.x(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f3731a = zB;
        this.f3732b = iX;
        this.f3733c = iX2;
        this.f3734d = iX3;
        this.f3735e = f10;
    }
}
