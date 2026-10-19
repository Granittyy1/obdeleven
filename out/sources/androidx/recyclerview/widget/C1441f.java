package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BatchingListUpdateCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1441f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1437b f19839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19840b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19841c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19842d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19843e = null;

    public C1441f(C1437b c1437b) {
        this.f19839a = c1437b;
    }

    public final void a() {
        int i10 = this.f19840b;
        if (i10 == 0) {
            return;
        }
        C1437b c1437b = this.f19839a;
        if (i10 == 1) {
            c1437b.a(this.f19841c, this.f19842d);
        } else if (i10 == 2) {
            c1437b.b(this.f19841c, this.f19842d);
        } else if (i10 == 3) {
            c1437b.f19817a.notifyItemRangeChanged(this.f19841c, this.f19842d, this.f19843e);
        }
        this.f19843e = null;
        this.f19840b = 0;
    }

    public final void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int i14;
        if (this.f19840b == 3 && i10 <= (i13 = this.f19842d + (i12 = this.f19841c)) && (i14 = i10 + i11) >= i12 && this.f19843e == obj) {
            this.f19841c = Math.min(i10, i12);
            this.f19842d = Math.max(i13, i14) - this.f19841c;
            return;
        }
        a();
        this.f19841c = i10;
        this.f19842d = i11;
        this.f19843e = obj;
        this.f19840b = 3;
    }

    public final void c(int i10, int i11) {
        a();
        this.f19839a.f19817a.notifyItemMoved(i10, i11);
    }
}
