package Ab;

import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: MethodSignatureImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class[] f1053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Class[] f1054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Class f1055i;

    @Override // Ab.d
    public final String a() {
        e eVar = e.f1063f;
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = this.f1057a;
        if (i10 == -1) {
            throw null;
        }
        String strConcat = "";
        if (eVar.f1066c) {
            String string = Modifier.toString(i10);
            if (string.length() != 0) {
                strConcat = string.concat(" ");
            }
        }
        stringBuffer.append(strConcat);
        if (eVar.f1065b) {
            Class cls = this.f1055i;
            cls.getClass();
            stringBuffer.append(e.a(cls, cls.getName(), eVar.f1064a));
        }
        if (eVar.f1065b) {
            stringBuffer.append(" ");
        }
        Class cls2 = this.f1060d;
        cls2.getClass();
        if (this.f1059c == null) {
            Class cls3 = this.f1060d;
            cls3.getClass();
            this.f1059c = cls3.getName();
        }
        stringBuffer.append(e.a(cls2, this.f1059c, eVar.f1067d));
        stringBuffer.append(".");
        String str = this.f1058b;
        str.getClass();
        stringBuffer.append(str);
        Class[] clsArr = this.f1053g;
        clsArr.getClass();
        if (eVar.f1065b) {
            stringBuffer.append("(");
            for (int i11 = 0; i11 < clsArr.length; i11++) {
                if (i11 > 0) {
                    stringBuffer.append(", ");
                }
                Class cls4 = clsArr[i11];
                stringBuffer.append(e.a(cls4, cls4.getName(), eVar.f1064a));
            }
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
        this.f1054h.getClass();
        return stringBuffer.toString();
    }
}
