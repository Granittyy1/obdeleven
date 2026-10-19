package W6;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: RenewableTimer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.a f7036a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j, p.a aVar) {
        super(j, 1000L);
        this.f7036a = aVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f7036a.a();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
