package N8;

import android.view.View;

/* JADX INFO: compiled from: OnClickListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4672c;

    /* JADX INFO: compiled from: OnClickListener.java */
    public interface a {
        void a(int i10);
    }

    public b(a aVar, int i10) {
        this.f4671b = aVar;
        this.f4672c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4671b.a(this.f4672c);
    }
}
