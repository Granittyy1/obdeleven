package A8;

import java.util.List;
import p255u9.D;
import p304y9.K;

/* JADX INFO: compiled from: VehicleBaseDBMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@p293xa.d
public final class z {
    public static D a(K input) {
        String str;
        kotlin.jvm.internal.i.e(input, "input");
        D d10 = new D();
        d10.setObjectId(input.f48524a);
        String forumLink = input.f48525b;
        kotlin.jvm.internal.i.e(forumLink, "forumLink");
        d10.put("forum", forumLink);
        List<String> list = input.f48526c;
        if (!list.isEmpty()) {
            kotlin.jvm.internal.i.b(list);
            d10.put("klineCUs", list);
        }
        d10.put("isFirewallProtected", Boolean.valueOf(input.f48527d));
        List<String> list2 = input.f48528e;
        kotlin.jvm.internal.i.b(list2);
        d10.put("modelValue", list2);
        String model = input.f48529f;
        kotlin.jvm.internal.i.e(model, "model");
        d10.put("model", model);
        List<String> list3 = input.f48530g;
        if (!list3.isEmpty()) {
            kotlin.jvm.internal.i.b(list3);
            d10.put("cuBlacklist", list3);
        }
        d10.put("supported", Boolean.valueOf(input.f48531h));
        String str2 = input.f48532i;
        kotlin.jvm.internal.i.b(str2);
        d10.put("make", str2);
        List<String> list4 = input.j;
        kotlin.jvm.internal.i.b(list4);
        d10.put("wmi", list4);
        String str3 = input.f48533k;
        kotlin.jvm.internal.i.b(str3);
        d10.put("platform", str3);
        Integer num = input.f48534l;
        d10.put("endYear", Integer.valueOf(num != null ? num.intValue() : 0));
        p304y9.m mVar = input.f48536n;
        if (mVar == null || (str = mVar.f48602b) == null) {
            str = "";
        }
        d10.put("picture_url", str);
        Boolean bool = input.f48538p;
        d10.put("isSfdProtected", Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return d10;
    }
}
