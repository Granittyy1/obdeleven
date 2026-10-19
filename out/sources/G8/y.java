package G8;

/* JADX INFO: compiled from: Sgbd.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3570i;

    public y() {
        this("", "", "", -1, -1, "", "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.i.a(this.f3562a, yVar.f3562a) && kotlin.jvm.internal.i.a(this.f3563b, yVar.f3563b) && kotlin.jvm.internal.i.a(this.f3564c, yVar.f3564c) && this.f3565d == yVar.f3565d && this.f3566e == yVar.f3566e && kotlin.jvm.internal.i.a(this.f3567f, yVar.f3567f) && kotlin.jvm.internal.i.a(this.f3568g, yVar.f3568g) && kotlin.jvm.internal.i.a(this.f3569h, yVar.f3569h) && kotlin.jvm.internal.i.a(this.f3570i, yVar.f3570i);
    }

    public final int hashCode() {
        return this.f3570i.hashCode() + B1.a.b(this.f3569h, B1.a.b(this.f3568g, B1.a.b(this.f3567f, p005a4.q.b(this.f3566e, p005a4.q.b(this.f3565d, B1.a.b(this.f3564c, B1.a.b(this.f3563b, this.f3562a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Sgbd(id=");
        sb2.append(this.f3562a);
        sb2.append(", textId=");
        sb2.append(this.f3563b);
        sb2.append(", name=");
        sb2.append(this.f3564c);
        sb2.append(", adr=");
        sb2.append(this.f3565d);
        sb2.append(", index=");
        sb2.append(this.f3566e);
        sb2.append(", series=");
        sb2.append(this.f3567f);
        sb2.append(", sgbdFileName=");
        sb2.append(this.f3568g);
        sb2.append(", picture=");
        sb2.append(this.f3569h);
        sb2.append(", group=");
        return Q8.d.a(sb2, this.f3570i, ")");
    }

    public y(String id, String textId, String name, int i10, int i11, String series, String sgbdFileName, String picture, String group) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(textId, "textId");
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(series, "series");
        kotlin.jvm.internal.i.e(sgbdFileName, "sgbdFileName");
        kotlin.jvm.internal.i.e(picture, "picture");
        kotlin.jvm.internal.i.e(group, "group");
        this.f3562a = id;
        this.f3563b = textId;
        this.f3564c = name;
        this.f3565d = i10;
        this.f3566e = i11;
        this.f3567f = series;
        this.f3568g = sgbdFileName;
        this.f3569h = picture;
        this.f3570i = group;
    }
}
