package io.ktor.utils.io.jvm.javaio;

import A8.p;
import io.ktor.utils.io.ByteReadChannel;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.P;
import p293xa.r;

/* JADX INFO: compiled from: Blocking.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteReadChannel f40644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2700k0 f40645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f40646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f40647e;

    /* JADX INFO: compiled from: Blocking.kt */
    public static final class a extends BlockingAdapter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f40648g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2694i0 interfaceC2694i0, b bVar) {
            super(interfaceC2694i0);
            this.f40648g = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.utils.io.jvm.javaio.BlockingAdapter
        public final Object a(ContinuationImpl continuationImpl) {
            InputAdapter$loop$1$loop$1 inputAdapter$loop$1$loop$1;
            int iIntValue;
            a aVar;
            Object obj;
            kotlin.coroutines.c cVarY;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            if (continuationImpl instanceof InputAdapter$loop$1$loop$1) {
                inputAdapter$loop$1$loop$1 = (InputAdapter$loop$1$loop$1) continuationImpl;
                int i10 = inputAdapter$loop$1$loop$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    inputAdapter$loop$1$loop$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    inputAdapter$loop$1$loop$1 = new InputAdapter$loop$1$loop$1(this, continuationImpl);
                }
            } else {
                inputAdapter$loop$1$loop$1 = new InputAdapter$loop$1$loop$1(this, continuationImpl);
            }
            Object objS = inputAdapter$loop$1$loop$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = inputAdapter$loop$1$loop$1.label;
            Object obj2 = null;
            if (i11 != 0) {
                if (i11 == 1) {
                    aVar = (a) inputAdapter$loop$1$loop$1.L$0;
                    kotlin.b.b(objS);
                    i.c(objS, "null cannot be cast to non-null type kotlin.ByteArray");
                    ByteReadChannel byteReadChannel = aVar.f40648g.f40644b;
                    int i12 = aVar.f40637d;
                    int i13 = aVar.f40638e;
                    inputAdapter$loop$1$loop$1.L$0 = aVar;
                    inputAdapter$loop$1$loop$1.L$1 = null;
                    inputAdapter$loop$1$loop$1.label = 2;
                    objS = byteReadChannel.s((byte[]) objS, i12, i13, inputAdapter$loop$1$loop$1);
                    if (objS == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) inputAdapter$loop$1$loop$1.L$0;
                    kotlin.b.b(objS);
                }
                iIntValue = ((Number) objS).intValue();
                if (iIntValue == -1) {
                    aVar.f40648g.f40645c.b();
                    aVar.result = iIntValue;
                    return r.f47939a;
                }
            } else {
                kotlin.b.b(objS);
                iIntValue = 0;
                aVar = this;
            }
            aVar.result = iIntValue;
            inputAdapter$loop$1$loop$1.L$0 = aVar;
            inputAdapter$loop$1$loop$1.L$1 = aVar;
            inputAdapter$loop$1$loop$1.label = 1;
            while (true) {
                Object obj3 = aVar.state;
                if (obj3 instanceof Thread) {
                    cVarY = p.y(inputAdapter$loop$1$loop$1);
                    obj = obj3;
                } else {
                    if (!i.a(obj3, aVar)) {
                        throw new IllegalStateException("Already suspended or in finished state");
                    }
                    obj = obj2;
                    cVarY = p.y(inputAdapter$loop$1$loop$1);
                }
                do {
                    atomicReferenceFieldUpdater = BlockingAdapter.f40633f;
                    if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj3, cVarY)) {
                        if (obj != null) {
                            d.a().b(obj);
                        }
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
                        return coroutineSingletons;
                    }
                } while (atomicReferenceFieldUpdater.get(aVar) == obj3);
                obj2 = obj;
            }
        }
    }

    public b(InterfaceC2694i0 interfaceC2694i0, ByteReadChannel channel) {
        i.e(channel, "channel");
        this.f40644b = channel;
        this.f40645c = new C2700k0(interfaceC2694i0);
        this.f40646d = new a(interfaceC2694i0, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f40644b.r();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            ByteReadChannel byteReadChannel = this.f40644b;
            i.e(byteReadChannel, "<this>");
            byteReadChannel.o(null);
            if (!this.f40645c.I0()) {
                this.f40645c.i(null);
            }
            a aVar = this.f40646d;
            P p10 = aVar.f40636c;
            if (p10 != null) {
                p10.dispose();
            }
            aVar.f40635b.resumeWith(kotlin.b.a(new CancellationException("Stream closed")));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.f40647e;
            if (bArr == null) {
                bArr = new byte[1];
                this.f40647e = bArr;
            }
            int iB = this.f40646d.b(bArr, 0, 1);
            if (iB == -1) {
                return -1;
            }
            if (iB == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iB + " bytes.").toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        a aVar;
        aVar = this.f40646d;
        i.b(bArr);
        return aVar.b(bArr, i10, i11);
    }
}
