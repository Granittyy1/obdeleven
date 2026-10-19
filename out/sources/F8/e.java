package F8;

import G8.G;
import J8.f;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p304y9.C2830i;
import p316z9.q;

/* JADX INFO: compiled from: UserPersonalInfoMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3282a;

    public e(f fVar) {
        this.f3282a = fVar;
    }

    public final G a(q userPersonalInfoDTO) {
        String str;
        i.e(userPersonalInfoDTO, "userPersonalInfoDTO");
        String str2 = "";
        String str3 = userPersonalInfoDTO.f49017g;
        String str4 = (str3 == null || n.S(str3)) ? "" : str3;
        String str5 = userPersonalInfoDTO.f49018h;
        String str6 = (str5 == null || n.S(str5)) ? "" : str5;
        String str7 = userPersonalInfoDTO.f49019i;
        if (str7 == null) {
            str7 = "";
        }
        f fVar = this.f3282a;
        long jD = fVar.d(str7);
        C2830i c2830i = userPersonalInfoDTO.f49020k;
        if (c2830i != null && (str = c2830i.f48583b) != null) {
            str2 = str;
        }
        long jD2 = fVar.d(str2);
        Boolean bool = userPersonalInfoDTO.j;
        return new G(userPersonalInfoDTO.f49011a, userPersonalInfoDTO.f49012b, userPersonalInfoDTO.f49013c, userPersonalInfoDTO.f49014d, userPersonalInfoDTO.f49015e, userPersonalInfoDTO.f49016f, str4, str6, jD, bool != null ? bool.booleanValue() : false, jD2);
    }
}
