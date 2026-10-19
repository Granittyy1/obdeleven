package io.reactivex.internal.operators.flowable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableInternalHelper$RequestMax implements p183oa.b<bc.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FlowableInternalHelper$RequestMax f40717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FlowableInternalHelper$RequestMax[] f40718c;

    static {
        FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax = new FlowableInternalHelper$RequestMax("INSTANCE", 0);
        f40717b = flowableInternalHelper$RequestMax;
        f40718c = new FlowableInternalHelper$RequestMax[]{flowableInternalHelper$RequestMax};
    }

    public FlowableInternalHelper$RequestMax() {
        throw null;
    }

    public static FlowableInternalHelper$RequestMax valueOf(String str) {
        return (FlowableInternalHelper$RequestMax) Enum.valueOf(FlowableInternalHelper$RequestMax.class, str);
    }

    public static FlowableInternalHelper$RequestMax[] values() {
        return (FlowableInternalHelper$RequestMax[]) f40718c.clone();
    }

    @Override // p183oa.b
    public final void a(bc.c cVar) throws Exception {
        cVar.g(Long.MAX_VALUE);
    }
}
