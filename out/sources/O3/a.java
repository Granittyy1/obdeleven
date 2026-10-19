package O3;

import D3.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteBufferGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements A3.e<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0071a f4794f = new C0071a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f4795g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0071a f4799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O3.b f4800e;

    /* JADX INFO: renamed from: O3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    public static class C0071a {
    }

    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f4801a;

        public b() {
            char[] cArr = X3.j.f7214a;
            this.f4801a = new ArrayDeque(0);
        }

        public final synchronized void a(p310z3.d dVar) {
            dVar.f48805b = null;
            dVar.f48806c = null;
            this.f4801a.offer(dVar);
        }
    }

    public a(Context context, ArrayList arrayList, E3.c cVar, E3.h hVar) {
        C0071a c0071a = f4794f;
        this.f4796a = context.getApplicationContext();
        this.f4797b = arrayList;
        this.f4799d = c0071a;
        this.f4800e = new O3.b(cVar, hVar);
        this.f4798c = f4795g;
    }

    @Override // A3.e
    public final boolean a(ByteBuffer byteBuffer, A3.d dVar) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) dVar.c(i.f4841b)).booleanValue()) {
            return false;
        }
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            ArrayList arrayList = this.f4797b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType imageTypeA = ((ImageHeaderParser) arrayList.get(i10)).a(byteBuffer2);
                if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = imageTypeA;
                    break;
                }
                i10++;
            }
        }
        return imageType == ImageHeaderParser.ImageType.GIF;
    }

    @Override // A3.e
    public final o<c> b(ByteBuffer byteBuffer, int i10, int i11, A3.d dVar) throws IOException {
        p310z3.d dVar2;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f4798c;
        synchronized (bVar) {
            try {
                p310z3.d dVar3 = (p310z3.d) bVar.f4801a.poll();
                if (dVar3 == null) {
                    dVar3 = new p310z3.d();
                }
                dVar2 = dVar3;
                dVar2.f48805b = null;
                Arrays.fill(dVar2.f48804a, (byte) 0);
                dVar2.f48806c = new p310z3.c();
                dVar2.f48807d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                dVar2.f48805b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                dVar2.f48805b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer2, i10, i11, dVar2, dVar);
        } finally {
            this.f4798c.a(dVar2);
        }
    }

    public final e c(ByteBuffer byteBuffer, int i10, int i11, p310z3.d dVar, A3.d dVar2) {
        int i12 = X3.f.f7206a;
        SystemClock.elapsedRealtimeNanos();
        try {
            p310z3.c cVarB = dVar.b();
            if (cVarB.f48796c > 0 && cVarB.f48795b == 0) {
                Bitmap.Config config = dVar2.c(i.f4840a) == DecodeFormat.f24518c ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(cVarB.f48800g / i11, cVarB.f48799f / i10);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                Log.isLoggable("BufferGifDecoder", 2);
                C0071a c0071a = this.f4799d;
                O3.b bVar = this.f4800e;
                c0071a.getClass();
                p310z3.e eVar = new p310z3.e(bVar, cVarB, byteBuffer, iMax);
                eVar.d(config);
                eVar.b();
                Bitmap bitmapA = eVar.a();
                if (bitmapA == null) {
                    return null;
                }
                return new e(new c(new c.a(new g(com.bumptech.glide.b.b(this.f4796a), eVar, i10, i11, J3.a.f3969b, bitmapA))));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
