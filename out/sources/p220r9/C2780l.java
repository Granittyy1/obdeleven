package p220r9;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: r9.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2780l implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        Double d10 = (Double) obj;
        return Double.valueOf(((((Double) obj2).doubleValue() - d10.doubleValue()) * ((double) f10)) + d10.doubleValue());
    }
}
