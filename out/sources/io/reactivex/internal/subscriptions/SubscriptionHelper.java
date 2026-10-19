package io.reactivex.internal.subscriptions;

import Q3.d;
import bc.c;
import com.google.gson.internal.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import p231sa.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionHelper implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SubscriptionHelper f40968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SubscriptionHelper[] f40969c;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        f40968b = subscriptionHelper;
        f40969c = new SubscriptionHelper[]{subscriptionHelper};
    }

    public SubscriptionHelper() {
        throw null;
    }

    public static void a(AtomicReference atomicReference) {
        c cVar;
        c cVar2 = (c) atomicReference.get();
        SubscriptionHelper subscriptionHelper = f40968b;
        if (cVar2 == subscriptionHelper || (cVar = (c) atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    public static boolean b(AtomicReference<c> atomicReference, c cVar) {
        d.I(cVar, "s is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == f40968b) {
                    return false;
                }
                a.c(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j) {
        if (j > 0) {
            return true;
        }
        a.c(new IllegalArgumentException(b.b(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean d(c cVar, c cVar2) {
        if (cVar2 == null) {
            a.c(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        a.c(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) f40969c.clone();
    }

    @Override // bc.c
    public final void cancel() {
    }

    @Override // bc.c
    public final void g(long j) {
    }
}
