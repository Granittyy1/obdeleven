package Ub;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ESDescriptor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cc.b f6608h = cc.c.b(e.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6609c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f6611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f6612f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6610d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6613g = new ArrayList();

    public e() {
        this.f6597b = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f6610d != eVar.f6610d || this.f6609c != eVar.f6609c) {
            return false;
        }
        d dVar = this.f6611e;
        if (dVar == null ? eVar.f6611e != null : !dVar.equals(eVar.f6611e)) {
            return false;
        }
        ArrayList arrayList = this.f6613g;
        ArrayList arrayList2 = eVar.f6613g;
        if (arrayList == null ? arrayList2 != null : !arrayList.equals(arrayList2)) {
            return false;
        }
        g gVar = this.f6612f;
        g gVar2 = eVar.f6612f;
        return gVar == null ? gVar2 == null : gVar.equals(gVar2);
    }

    @Override // Ub.b
    public final int f() {
        int iH = this.f6612f.h() + this.f6611e.h() + 3;
        if (this.f6613g.size() <= 0) {
            return iH;
        }
        throw new RuntimeException(" Doesn't handle other descriptors yet");
    }

    public final int hashCode() {
        int i10 = ((((((((((((((((this.f6609c * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f6610d) * 31) + 0) * 961) + 0) * 31) + 0) * 31;
        d dVar = this.f6611e;
        int iHashCode = (i10 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        g gVar = this.f6612f;
        int i11 = (iHashCode + (gVar != null ? gVar.f6614c : 0)) * 31;
        ArrayList arrayList = this.f6613g;
        return i11 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    public final ByteBuffer k() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h()]);
        C6.b.k(3, byteBufferWrap);
        j(f(), byteBufferWrap);
        C6.b.i(this.f6609c, byteBufferWrap);
        byteBufferWrap.put((byte) (((0 << 7) | (0 << 6) | (0 << 5) | (0 & 31)) & 255));
        d dVar = this.f6611e;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dVar.h());
        C6.b.k(dVar.f6597b, byteBufferAllocate);
        dVar.j(dVar.f(), byteBufferAllocate);
        byteBufferAllocate.put((byte) (dVar.f6601c & 255));
        byteBufferAllocate.put((byte) (((dVar.f6602d << 2) | (0 << 1) | 1) & 255));
        C6.b.j(dVar.f6603e, byteBufferAllocate);
        byteBufferAllocate.putInt((int) dVar.f6604f);
        byteBufferAllocate.putInt((int) dVar.f6605g);
        a aVar = dVar.f6606h;
        if (aVar != null) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(aVar.h());
            C6.b.k(aVar.f6597b, byteBufferAllocate2);
            aVar.j(aVar.f(), byteBufferAllocate2);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[aVar.f()]);
            c cVar = new c(byteBufferWrap2);
            a.k(0, cVar);
            cVar.a(aVar.f6589d, 4);
            if (aVar.f6589d == 15) {
                cVar.a(0, 24);
            }
            cVar.a(aVar.f6590e, 4);
            int i10 = aVar.f6588c;
            if (i10 == 5 || i10 == 29) {
                aVar.f6591f = 5;
                aVar.f6592g = true;
                if (i10 == 29) {
                    aVar.f6593h = true;
                }
                cVar.a(aVar.f6594i, 4);
                if (aVar.f6594i == 15) {
                    cVar.a(0, 24);
                }
                a.k(aVar.f6588c, cVar);
                if (aVar.f6588c == 22) {
                    cVar.a(0, 4);
                }
            }
            switch (aVar.f6588c) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    cVar.a(0, 1);
                    cVar.a(0, 1);
                    cVar.a(0, 1);
                    if (aVar.f6590e == 0) {
                        throw new UnsupportedOperationException("can't parse program_config_element yet");
                    }
                    int i11 = aVar.f6588c;
                    if (i11 == 6 || i11 == 20) {
                        cVar.a(0, 3);
                    }
                    break;
                case 5:
                case 10:
                case 11:
                case 18:
                case 29:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                default:
                    int i12 = aVar.f6588c;
                    if (i12 == 17 || i12 == 39) {
                        cVar.a(0, 2);
                    } else {
                        switch (i12) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                                cVar.a(0, 2);
                        }
                    }
                    int i13 = aVar.f6596l;
                    if (i13 >= 0) {
                        cVar.a(i13, 11);
                        if (aVar.f6596l == 695) {
                            a.k(aVar.f6591f, cVar);
                            if (aVar.f6591f == 5) {
                                cVar.a(aVar.f6592g ? 1 : 0, 1);
                                if (aVar.f6592g) {
                                    cVar.a(aVar.f6594i, 4);
                                    if (aVar.f6594i == 15) {
                                        cVar.a(0, 24);
                                    }
                                    int i14 = aVar.f6595k;
                                    if (i14 >= 0) {
                                        cVar.a(i14, 11);
                                        if (aVar.j == 1352) {
                                            cVar.a(aVar.f6593h ? 1 : 0, 1);
                                        }
                                    }
                                }
                            }
                            if (aVar.f6591f == 22) {
                                cVar.a(aVar.f6592g ? 1 : 0, 1);
                                if (aVar.f6592g) {
                                    cVar.a(aVar.f6594i, 4);
                                    if (aVar.f6594i == 15) {
                                        cVar.a(0, 24);
                                    }
                                }
                                cVar.a(0, 4);
                            }
                        }
                    }
                    byteBufferAllocate2.put((ByteBuffer) byteBufferWrap2.rewind());
                    byteBufferAllocate.put((ByteBuffer) byteBufferAllocate2.rewind());
                    break;
                case 8:
                    throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
                case 9:
                    throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
                case 12:
                    throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
                case 13:
                case 14:
                case 15:
                case 16:
                    throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
                case 24:
                    throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
                case 25:
                    throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
                case 26:
                case 27:
                    throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
                case 28:
                    throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    cVar.a(0, 1);
                    throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    cVar.a(0, 5);
                    throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
            }
        }
        for (f fVar : dVar.f6607i) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(fVar.h());
            C6.b.k(20, byteBufferAllocate3);
            fVar.j(1, byteBufferAllocate3);
            byteBufferAllocate3.put((byte) (0 & 255));
            byteBufferAllocate.put(byteBufferAllocate3);
        }
        ByteBuffer byteBuffer = (ByteBuffer) byteBufferAllocate.rewind();
        g gVar = this.f6612f;
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(gVar.h());
        C6.b.k(6, byteBufferAllocate4);
        gVar.j(1, byteBufferAllocate4);
        byteBufferAllocate4.put((byte) (gVar.f6614c & 255));
        byteBufferWrap.put(byteBuffer.array());
        byteBufferWrap.put(byteBufferAllocate4.array());
        return byteBufferWrap;
    }

    public final String toString() {
        return "ESDescriptor{esId=" + this.f6609c + ", streamDependenceFlag=0, URLFlag=0, oCRstreamFlag=0, streamPriority=0, URLLength=" + this.f6610d + ", URLString='" + ((String) null) + "', remoteODFlag=0, dependsOnEsId=0, oCREsId=0, decoderConfigDescriptor=" + this.f6611e + ", slConfigDescriptor=" + this.f6612f + '}';
    }
}
