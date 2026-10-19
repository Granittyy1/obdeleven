package N6;

import D2.V;
import Ia.l;
import S4.C0760b;
import T4.C0780m;
import T4.Z;
import android.os.Bundle;
import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.foundation.gestures.s;
import androidx.compose.foundation.gestures.snapping.i;
import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Z, androidx.compose.foundation.gestures.snapping.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4653b;

    public /* synthetic */ d(Object obj) {
        this.f4653b = obj;
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            e eVar = (e) this.f4653b;
            f fVar = new f(stringWriter, eVar.f4658a, eVar.f4659b, eVar.f4660c, eVar.f4661d);
            fVar.h(obj);
            fVar.j();
            fVar.f4664b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // T4.Z
    public void d(int i10) {
        C0760b c0760b;
        C0780m c0780m = (C0780m) this.f4653b;
        ReentrantLock reentrantLock = c0780m.f5984n;
        ReentrantLock reentrantLock2 = c0780m.f5984n;
        reentrantLock.lock();
        try {
            if (c0780m.f5983m || (c0760b = c0780m.f5982l) == null || !c0760b.k()) {
                c0780m.f5983m = false;
                C0780m.g(c0780m, i10);
            } else {
                c0780m.f5983m = true;
                c0780m.f5977f.e(i10);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public Object e(s sVar, Float f10, Float f11, l lVar, kotlin.coroutines.c cVar) {
        float fFloatValue = f10.floatValue();
        float fFloatValue2 = f11.floatValue();
        Object objC = i.c(sVar, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, V.d(0.0f, fFloatValue2, 28), (InterfaceC0906f) this.f4653b, lVar, (ContinuationImpl) cVar);
        return objC == CoroutineSingletons.f43038b ? objC : (androidx.compose.foundation.gestures.snapping.a) objC;
    }

    @Override // T4.Z
    public void f(Bundle bundle) {
        C0780m c0780m = (C0780m) this.f4653b;
        ReentrantLock reentrantLock = c0780m.f5984n;
        ReentrantLock reentrantLock2 = c0780m.f5984n;
        reentrantLock.lock();
        try {
            Bundle bundle2 = c0780m.j;
            if (bundle2 == null) {
                c0780m.j = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            c0780m.f5981k = C0760b.f5525g;
            C0780m.h(c0780m);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // T4.Z
    public void g(C0760b c0760b) {
        C0780m c0780m = (C0780m) this.f4653b;
        ReentrantLock reentrantLock = c0780m.f5984n;
        ReentrantLock reentrantLock2 = c0780m.f5984n;
        reentrantLock.lock();
        try {
            c0780m.f5981k = c0760b;
            C0780m.h(c0780m);
        } finally {
            reentrantLock2.unlock();
        }
    }
}
