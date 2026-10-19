package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BufferedChannel f15058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(BufferedChannel bufferedChannel, Handler handler) {
        super(handler);
        this.f15058a = bufferedChannel;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f15058a.n(p293xa.r.f47939a);
    }
}
