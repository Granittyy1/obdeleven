package io.intercom.android.sdk.m5.navigation;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2432f implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p141l2.H f39376c;

    public /* synthetic */ C2432f(p141l2.H h8, int i10) {
        this.f39375b = i10;
        this.f39376c = h8;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39375b) {
            case 0:
                return ConversationDestinationKt.AnonymousClass11.invoke$lambda$2(this.f39376c);
            default:
                return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$0(this.f39376c);
        }
    }
}
