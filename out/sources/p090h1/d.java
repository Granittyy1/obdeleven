package p090h1;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import coil.util.t;
import p114j1.C2479a;

/* JADX INFO: compiled from: AudioManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f35732a;

    public static synchronized AudioManager a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f35732a = null;
            }
            AudioManager audioManager = f35732a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                t tVar = new t();
                C2479a.i().execute(new c(applicationContext, 0, tVar));
                tVar.c();
                AudioManager audioManager2 = f35732a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f35732a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }
}
