package C1;

import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: ListChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f2323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2324b;

    public f(int i10, ImmutableList<a> immutableList) {
        this.f2324b = i10;
        this.f2323a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, r rVar) {
        String str;
        String str2;
        a cVar;
        ImmutableList.a aVar = new ImmutableList.a();
        int i11 = rVar.f41064c;
        int iA = -2;
        while (rVar.a() > 8) {
            int iJ = rVar.j();
            int iJ2 = rVar.f41063b + rVar.j();
            rVar.F(iJ2);
            if (iJ != 1414744396) {
                g gVar = null;
                switch (iJ) {
                    case 1718776947:
                        if (iA == 2) {
                            rVar.H(4);
                            int iJ3 = rVar.j();
                            int iJ4 = rVar.j();
                            rVar.H(4);
                            int iJ5 = rVar.j();
                            switch (iJ5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                com.google.gson.internal.b.e(iJ5, "Ignoring track with unsupported compression ");
                            } else {
                                n.a aVar2 = new n.a();
                                aVar2.f35345t = iJ3;
                                aVar2.f35346u = iJ4;
                                aVar2.f35338m = t.m(str2);
                                gVar = new g(new n(aVar2));
                            }
                        } else if (iA == 1) {
                            int iN = rVar.n();
                            if (iN == 1) {
                                str = "audio/raw";
                            } else if (iN == 85) {
                                str = "audio/mpeg";
                            } else if (iN == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iN != 8192) {
                                str = iN != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str == null) {
                                com.google.gson.internal.b.e(iN, "Ignoring track with unsupported format tag ");
                            } else {
                                int iN2 = rVar.n();
                                int iJ6 = rVar.j();
                                rVar.H(6);
                                int iT = A.t(rVar.n());
                                int iN3 = rVar.a() > 0 ? rVar.n() : 0;
                                n.a aVar3 = new n.a();
                                aVar3.f35338m = t.m(str);
                                aVar3.f35317C = iN2;
                                aVar3.f35318D = iJ6;
                                if (str.equals("audio/raw") && iT != 0) {
                                    aVar3.f35319E = iT;
                                }
                                if (str.equals("audio/mp4a-latm") && iN3 > 0) {
                                    byte[] bArr = new byte[iN3];
                                    rVar.f(bArr, 0, iN3);
                                    aVar3.f35341p = ImmutableList.M(bArr);
                                }
                                gVar = new g(new n(aVar3));
                            }
                        } else {
                            k.f("Ignoring strf box for unsupported track type: " + A.x(iA));
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int iJ7 = rVar.j();
                        rVar.H(8);
                        int iJ8 = rVar.j();
                        int iJ9 = rVar.j();
                        rVar.H(4);
                        rVar.j();
                        rVar.H(12);
                        cVar = new c(iJ7, iJ8, iJ9);
                        break;
                    case 1752331379:
                        int iJ10 = rVar.j();
                        rVar.H(12);
                        rVar.j();
                        int iJ11 = rVar.j();
                        int iJ12 = rVar.j();
                        rVar.H(4);
                        int iJ13 = rVar.j();
                        int iJ14 = rVar.j();
                        rVar.H(4);
                        cVar = new d(iJ10, iJ11, iJ12, iJ13, iJ14, rVar.j());
                        break;
                    case 1852994675:
                        cVar = new h(rVar.s(rVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            } else {
                cVar = b(rVar.j(), rVar);
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    iA = ((d) cVar).a();
                }
                aVar.c(cVar);
            }
            rVar.G(iJ2);
            rVar.F(i11);
        }
        return new f(i10, aVar.h());
    }

    public final <T extends a> T a(Class<T> cls) {
        ImmutableList.b bVarListIterator = this.f2323a.listIterator(0);
        while (bVarListIterator.hasNext()) {
            T t8 = (T) bVarListIterator.next();
            if (t8.getClass() == cls) {
                return t8;
            }
        }
        return null;
    }

    @Override // C1.a
    public final int getType() {
        return this.f2324b;
    }
}
