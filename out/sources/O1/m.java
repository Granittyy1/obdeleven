package O1;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p078g1.r;
import p114j1.A;

/* JADX INFO: compiled from: TextInformationFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList<String> f4768c;

    public m(String str, String str2, List<String> list) {
        super(str);
        p241t7.b.e(!list.isEmpty());
        this.f4767b = str2;
        ImmutableList<String> immutableListG = ImmutableList.G(list);
        this.f4768c = immutableListG;
        immutableListG.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // g1.s.a
    public final void b(r.a aVar) {
        String str = this.f4755a;
        ImmutableList<String> immutableList = this.f4768c;
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b10 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = 22;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    aVar.f35422c = immutableList.get(0);
                    break;
                case 1:
                case 11:
                    aVar.f35437s = immutableList.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = immutableList.get(0);
                    int i10 = Integer.parseInt(str2.substring(2, 4));
                    int i11 = Integer.parseInt(str2.substring(0, 2));
                    aVar.d(Integer.valueOf(i10));
                    aVar.c(Integer.valueOf(i11));
                    break;
                case 3:
                case 18:
                    aVar.f35421b = immutableList.get(0);
                    break;
                case 4:
                case 19:
                    aVar.f35423d = immutableList.get(0);
                    break;
                case 5:
                case 20:
                    aVar.f35438t = immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String[] strArrO = A.O(immutableList.get(0));
                    int i12 = Integer.parseInt(strArrO[0]);
                    Integer numValueOf = strArrO.length > 1 ? Integer.valueOf(Integer.parseInt(strArrO[1])) : null;
                    aVar.f35427h = Integer.valueOf(i12);
                    aVar.f35428i = numValueOf;
                    break;
                case 7:
                case 17:
                    aVar.f35420a = immutableList.get(0);
                    break;
                case 8:
                case 16:
                    aVar.f35436r = immutableList.get(0);
                    break;
                case 9:
                case 22:
                    aVar.e(Integer.valueOf(Integer.parseInt(immutableList.get(0))));
                    break;
                case 12:
                    Integer numM0 = Ints.m0(immutableList.get(0));
                    if (numM0 != null) {
                        String strA = i.a(numM0.intValue());
                        if (strA != null) {
                            aVar.b(strA);
                        }
                    } else {
                        aVar.b(immutableList.get(0));
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d(immutableList.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.c((Integer) arrayListD.get(2));
                            }
                        }
                        aVar.d((Integer) arrayListD.get(1));
                    }
                    aVar.e((Integer) arrayListD.get(0));
                    break;
                case 15:
                    ArrayList arrayListD2 = d(immutableList.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.f35435q = (Integer) arrayListD2.get(2);
                            }
                        }
                        aVar.f35434p = (Integer) arrayListD2.get(1);
                    }
                    aVar.f35433o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f4755a, mVar.f4755a) && Objects.equals(this.f4767b, mVar.f4767b) && this.f4768c.equals(mVar.f4768c);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f4755a, 527, 31);
        String str = this.f4767b;
        return this.f4768c.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": description=" + this.f4767b + ": values=" + this.f4768c;
    }
}
