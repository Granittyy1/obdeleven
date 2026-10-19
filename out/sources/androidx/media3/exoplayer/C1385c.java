package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

/* JADX INFO: renamed from: androidx.media3.exoplayer.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1385c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f18320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p114j1.g f18321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18322d;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.c$a */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f18323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p114j1.g f18324b;

        public a(p114j1.g gVar, b bVar) {
            this.f18324b = gVar;
            this.f18323a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f18324b.e(new RunnableC1384b(0, this));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.c$b */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface b {
    }

    public C1385c(Context context, Looper looper, Looper looper2, b bVar, p114j1.t tVar) {
        this.f18319a = context.getApplicationContext();
        this.f18321c = tVar.a(looper, null);
        this.f18320b = new a(tVar.a(looper2, null), bVar);
    }

    public final void a() {
        if (this.f18322d) {
            this.f18321c.e(new X5.C(1, this));
            this.f18322d = false;
        }
    }
}
