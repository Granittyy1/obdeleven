package bo.app;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends Lambda implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(String str) {
        super(0);
        this.f20779b = str;
    }

    @Override // Ia.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to create valid enum from string: " + this.f20779b;
    }
}
