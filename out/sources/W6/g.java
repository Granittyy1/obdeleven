package W6;

/* JADX INFO: compiled from: FiamImageLoader_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7017b;

    public /* synthetic */ g(int i10, Object obj) {
        this.f7016a = i10;
        this.f7017b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f7016a) {
            case 0:
                return new f((com.bumptech.glide.e) ((p268va.a) this.f7017b).get());
            default:
                a aVar = ((Y6.e) this.f7017b).f7627c.get();
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }
}
