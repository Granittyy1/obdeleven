package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p191p5.h f27761b;

    public w() {
        this.f27761b = null;
    }

    public void a(Exception exc) {
        p191p5.h hVar = this.f27761b;
        if (hVar != null) {
            hVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public w(p191p5.h hVar) {
        this.f27761b = hVar;
    }
}
