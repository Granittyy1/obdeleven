package M1;

import I.e;
import com.google.common.primitives.Ints;
import p078g1.r;
import p078g1.s;

/* JADX INFO: compiled from: VorbisComment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4517b;

    public b(String str, String str2) {
        this.f4516a = e.m(str);
        this.f4517b = str2;
    }

    @Override // g1.s.a
    public final void b(r.a aVar) {
        String str = this.f4516a;
        str.getClass();
        String str2 = this.f4517b;
        switch (str) {
            case "TOTALTRACKS":
                Integer numM0 = Ints.m0(str2);
                if (numM0 != null) {
                    aVar.f35428i = numM0;
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numM1 = Ints.m0(str2);
                if (numM1 != null) {
                    aVar.f35440v = numM1;
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numM2 = Ints.m0(str2);
                if (numM2 != null) {
                    aVar.f35427h = numM2;
                    break;
                }
                break;
            case "ALBUM":
                aVar.f35422c = str2;
                break;
            case "GENRE":
                aVar.f35441w = str2;
                break;
            case "TITLE":
                aVar.f35420a = str2;
                break;
            case "DESCRIPTION":
                aVar.f35424e = str2;
                break;
            case "DISCNUMBER":
                Integer numM3 = Ints.m0(str2);
                if (numM3 != null) {
                    aVar.f35439u = numM3;
                    break;
                }
                break;
            case "ALBUMARTIST":
                aVar.f35423d = str2;
                break;
            case "ARTIST":
                aVar.f35421b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4516a.equals(bVar.f4516a) && this.f4517b.equals(bVar.f4517b);
    }

    public final int hashCode() {
        return this.f4517b.hashCode() + B1.a.b(this.f4516a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f4516a + "=" + this.f4517b;
    }
}
