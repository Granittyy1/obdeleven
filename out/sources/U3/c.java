package U3;

import X3.j;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.SingleRequest;

/* JADX INFO: compiled from: CustomTarget.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SingleRequest f6335d;

    public c() {
        if (!j.h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f6333b = Integer.MIN_VALUE;
        this.f6334c = Integer.MIN_VALUE;
    }

    @Override // U3.g
    public final T3.b c() {
        return this.f6335d;
    }

    @Override // U3.g
    public final void f(SingleRequest singleRequest) throws Throwable {
        singleRequest.a(this.f6333b, this.f6334c);
    }

    @Override // U3.g
    public final void g(SingleRequest singleRequest) {
        this.f6335d = singleRequest;
    }

    @Override // Q3.f
    public final void a() {
    }

    @Override // Q3.f
    public final void e() {
    }

    @Override // Q3.f
    public final void k() {
    }

    @Override // U3.g
    public final void d(SingleRequest singleRequest) {
    }

    @Override // U3.g
    public void h(Drawable drawable) {
    }

    @Override // U3.g
    public final void i(Drawable drawable) {
    }
}
