package coil.decode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2683f0;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: GifDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22903c;

    /* JADX INFO: compiled from: GifDecoder.kt */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22904a = true;

        @Override // coil.decode.d.a
        public final d create(coil.fetch.l lVar, coil.request.k kVar, coil.f fVar) {
            InterfaceC2841h interfaceC2841hI = lVar.f22989a.i();
            if (!interfaceC2841hI.c0(0L, k.f22891b) && !interfaceC2841hI.c0(0L, k.f22890a)) {
                return null;
            }
            return new m(lVar.f22989a, kVar, this.f22904a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public m(x xVar, coil.request.k kVar, boolean z10) {
        this.f22901a = xVar;
        this.f22902b = kVar;
        this.f22903c = z10;
    }

    @Override // coil.decode.d
    public final Object decode(kotlin.coroutines.c<? super c> cVar) {
        return C2683f0.a(new l(0, this), (ContinuationImpl) cVar);
    }
}
