package io.reactivex.internal.disposables;

import Q3.d;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p148la.b;
import p231sa.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableHelper implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DisposableHelper f40662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DisposableHelper[] f40663c;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        f40662b = disposableHelper;
        f40663c = new DisposableHelper[]{disposableHelper};
    }

    public DisposableHelper() {
        throw null;
    }

    public static void a(AtomicReference atomicReference) {
        b bVar;
        b bVar2 = (b) atomicReference.get();
        DisposableHelper disposableHelper = f40662b;
        if (bVar2 == disposableHelper || (bVar = (b) atomicReference.getAndSet(disposableHelper)) == disposableHelper || bVar == null) {
            return;
        }
        bVar.dispose();
    }

    public static boolean b(b bVar) {
        return bVar == f40662b;
    }

    public static boolean c(AtomicReference<b> atomicReference, b bVar) {
        while (true) {
            b bVar2 = atomicReference.get();
            if (bVar2 != f40662b) {
                while (!atomicReference.compareAndSet(bVar2, bVar)) {
                    if (atomicReference.get() != bVar2) {
                    }
                }
                return true;
            }
            if (bVar == null) {
                return false;
            }
            bVar.dispose();
            return false;
        }
    }

    public static void e() {
        a.c(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean f(AtomicReference<b> atomicReference, b bVar) {
        d.I(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() == f40662b) {
                    return false;
                }
                e();
                return false;
            }
        }
        return true;
    }

    public static boolean g(b bVar, b bVar2) {
        if (bVar2 == null) {
            a.c(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        e();
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) f40663c.clone();
    }

    @Override // p148la.b
    public final boolean d() {
        return true;
    }

    @Override // p148la.b
    public final void dispose() {
    }
}
