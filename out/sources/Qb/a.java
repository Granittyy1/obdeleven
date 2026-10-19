package Qb;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import org.koin.core.instance.SingleInstanceFactory;

/* JADX INFO: compiled from: InstanceRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ib.a f5138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<Integer, SingleInstanceFactory<?>> f5140c;

    public a(Ib.a _koin) {
        i.e(_koin, "_koin");
        this.f5138a = _koin;
        this.f5139b = new ConcurrentHashMap();
        this.f5140c = new HashMap<>();
    }
}
