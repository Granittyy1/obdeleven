package R5;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: ShadowRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5319i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5320k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f5321l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f5322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f5323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f5324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f5328g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f5329h;

    public a() {
        Paint paint = new Paint();
        this.f5329h = paint;
        this.f5322a = new Paint();
        this.f5325d = p222s0.a.h(-16777216, 68);
        this.f5326e = p222s0.a.h(-16777216, 20);
        this.f5327f = p222s0.a.h(-16777216, 0);
        this.f5322a.setColor(this.f5325d);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5323b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5324c = new Paint(paint2);
    }
}
