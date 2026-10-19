package A1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f570c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f571a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f572b = -1;

    public final boolean a(String str) {
        Matcher matcher = f570c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = p114j1.A.f40996a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f571a = i11;
            this.f572b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(p078g1.s sVar) {
        int i10 = 0;
        while (true) {
            g1.s.a[] aVarArr = sVar.f35445a;
            if (i10 >= aVarArr.length) {
                return;
            }
            g1.s.a aVar = aVarArr[i10];
            if (aVar instanceof O1.e) {
                O1.e eVar = (O1.e) aVar;
                if ("iTunSMPB".equals(eVar.f4744c) && a(eVar.f4745d)) {
                    return;
                }
            } else if (aVar instanceof O1.j) {
                O1.j jVar = (O1.j) aVar;
                if ("com.apple.iTunes".equals(jVar.f4757b) && "iTunSMPB".equals(jVar.f4758c) && a(jVar.f4759d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
