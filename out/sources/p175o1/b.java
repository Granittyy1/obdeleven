package p175o1;

import I4.e;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.compose.foundation.C0936h;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.n0;
import com.google.android.play.integrity.internal.k;
import java.util.Objects;
import p078g1.C2198d;
import p114j1.A;
import p259v1.j;

/* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f45062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f45063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f45064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f45065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0513b f45066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p175o1.a f45067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f45068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2198d f45069i;
    public boolean j;

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public final class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.a(p175o1.a.c(bVar.f45061a, bVar.f45069i, bVar.f45068h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            k kVar = bVar.f45068h;
            int i10 = A.f40996a;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (Objects.equals(audioDeviceInfo, kVar)) {
                    bVar.f45068h = null;
                    break;
                }
            }
            bVar.a(p175o1.a.c(bVar.f45061a, bVar.f45069i, bVar.f45068h));
        }
    }

    /* JADX INFO: renamed from: o1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public final class C0513b extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f45071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f45072b;

        public C0513b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f45071a = contentResolver;
            this.f45072b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            b bVar = b.this;
            bVar.a(p175o1.a.c(bVar.f45061a, bVar.f45069i, bVar.f45068h));
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b bVar = b.this;
            bVar.a(p175o1.a.b(context, intent, bVar.f45069i, bVar.f45068h));
        }
    }

    public b(Context context, e eVar, C2198d c2198d, k kVar) {
        Context applicationContext = context.getApplicationContext();
        this.f45061a = applicationContext;
        this.f45062b = eVar;
        this.f45069i = c2198d;
        this.f45068h = kVar;
        int i10 = A.f40996a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f45063c = handler;
        this.f45064d = A.f40996a >= 23 ? new a() : null;
        this.f45065e = new c();
        p175o1.a aVar = p175o1.a.f45052c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f45066f = uriFor != null ? new C0513b(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(p175o1.a aVar) {
        n0.a aVar2;
        if (!this.j || aVar.equals(this.f45067g)) {
            return;
        }
        this.f45067g = aVar;
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f45062b.f3849b;
        defaultAudioSink.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = defaultAudioSink.f18237f0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(C0936h.d("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        p175o1.a aVar3 = defaultAudioSink.f18256w;
        if (aVar3 == null || aVar.equals(aVar3)) {
            return;
        }
        defaultAudioSink.f18256w = aVar;
        androidx.media3.exoplayer.audio.c.a aVar4 = defaultAudioSink.f18251r;
        if (aVar4 != null) {
            androidx.media3.exoplayer.audio.c cVar = androidx.media3.exoplayer.audio.c.this;
            synchronized (cVar.f18362b) {
                aVar2 = cVar.f18377r;
            }
            if (aVar2 != null) {
                j jVar = (j) aVar2;
                synchronized (jVar.f47531c) {
                    jVar.f47534f.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        k kVar = this.f45068h;
        if (Objects.equals(audioDeviceInfo, kVar == null ? null : (AudioDeviceInfo) kVar.f27754b)) {
            return;
        }
        k kVar2 = audioDeviceInfo != null ? new k(audioDeviceInfo) : null;
        this.f45068h = kVar2;
        a(p175o1.a.c(this.f45061a, this.f45069i, kVar2));
    }
}
