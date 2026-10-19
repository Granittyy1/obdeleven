package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Suppliers;
import p078g1.C2198d;

/* JADX INFO: renamed from: androidx.media3.exoplayer.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1388f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.base.j<AudioManager> f18348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P f18350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2198d f18351d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18353f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p090h1.a f18355h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18354g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18352e = 0;

    public C1388f(final Context context, Looper looper, P p10) {
        this.f18348a = Suppliers.a(new com.google.common.base.j() { // from class: androidx.media3.exoplayer.e
            @Override // com.google.common.base.j
            public final Object get() {
                return p090h1.d.a(context);
            }
        });
        this.f18350c = p10;
        this.f18349b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.f18352e;
        if (i10 == 1 || i10 == 0 || this.f18355h == null) {
            return;
        }
        AudioManager audioManager = this.f18348a.get();
        p090h1.a aVar = this.f18355h;
        if (p114j1.A.f40996a < 26) {
            audioManager.abandonAudioFocus(aVar.f35717b);
            return;
        }
        AudioFocusRequest audioFocusRequest = aVar.f35721f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i10) {
        P p10 = this.f18350c;
        if (p10 != null) {
            p10.f18097i.c(33, i10, 0).b();
        }
    }

    public final void c(int i10) {
        if (this.f18352e == i10) {
            return;
        }
        this.f18352e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f18354g == f10) {
            return;
        }
        this.f18354g = f10;
        P p10 = this.f18350c;
        if (p10 != null) {
            p10.f18097i.i(34);
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        int iRequestAudioFocus;
        p090h1.a.C0374a c0374a;
        if (i10 == 1 || (i11 = this.f18353f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z10) {
            int i12 = this.f18352e;
            if (i12 != 1) {
                return i12 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f18352e == 2) {
            return 1;
        }
        p090h1.a aVar = this.f18355h;
        if (aVar == null) {
            if (aVar == null) {
                c0374a = new p090h1.a.C0374a();
                c0374a.f35723b = C2198d.f35244b;
                c0374a.f35722a = i11;
            } else {
                p090h1.a.C0374a c0374a2 = new p090h1.a.C0374a();
                c0374a2.f35722a = aVar.f35716a;
                c0374a2.f35723b = aVar.f35719d;
                c0374a2.f35724c = aVar.f35720e;
                c0374a = c0374a2;
            }
            C2198d c2198d = this.f18351d;
            c2198d.getClass();
            c0374a.f35723b = c2198d;
            c0374a.f35724c = false;
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.d
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i13) {
                    C1388f c1388f = this.f18330a;
                    c1388f.getClass();
                    if (i13 == -3 || i13 == -2) {
                        if (i13 != -2) {
                            c1388f.c(4);
                            return;
                        } else {
                            c1388f.b(0);
                            c1388f.c(3);
                            return;
                        }
                    }
                    if (i13 == -1) {
                        c1388f.b(-1);
                        c1388f.a();
                        c1388f.c(1);
                    } else if (i13 != 1) {
                        com.google.gson.internal.b.e(i13, "Unknown focus change type: ");
                    } else {
                        c1388f.c(2);
                        c1388f.b(1);
                    }
                }
            };
            Handler handler = this.f18349b;
            handler.getClass();
            this.f18355h = new p090h1.a(c0374a.f35722a, onAudioFocusChangeListener, handler, c0374a.f35723b, c0374a.f35724c);
        }
        AudioManager audioManager = this.f18348a.get();
        p090h1.a aVar2 = this.f18355h;
        if (p114j1.A.f40996a >= 26) {
            AudioFocusRequest audioFocusRequest = aVar2.f35721f;
            audioFocusRequest.getClass();
            iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
        } else {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = aVar2.f35717b;
            aVar2.f35719d.getClass();
            iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, 3, aVar2.f35716a);
        }
        if (iRequestAudioFocus == 1) {
            c(2);
            return 1;
        }
        c(1);
        return -1;
    }
}
