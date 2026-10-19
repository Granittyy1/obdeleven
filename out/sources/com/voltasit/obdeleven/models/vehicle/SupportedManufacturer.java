package com.voltasit.obdeleven.models.vehicle;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: SupportedManufacturer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SupportedManufacturer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SupportedManufacturer f31174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SupportedManufacturer[] f31175d;
    private final String dbName;
    private final ManufacturerGroup manufacturerGroup;

    /* JADX INFO: Fake field, exist only in values array */
    SupportedManufacturer EF0;

    /* JADX INFO: compiled from: SupportedManufacturer.kt */
    public static final class a {
    }

    static {
        ManufacturerGroup manufacturerGroup = ManufacturerGroup.f31169b;
        SupportedManufacturer supportedManufacturer = new SupportedManufacturer("Bmw", 0, "BMW", manufacturerGroup);
        SupportedManufacturer supportedManufacturer2 = new SupportedManufacturer("Mini", 1, "MINI", manufacturerGroup);
        SupportedManufacturer supportedManufacturer3 = new SupportedManufacturer("RollsRoyce", 2, "Rolls-Royce", manufacturerGroup);
        ManufacturerGroup manufacturerGroup2 = ManufacturerGroup.f31170c;
        SupportedManufacturer supportedManufacturer4 = new SupportedManufacturer("Audi", 3, "Audi", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer5 = new SupportedManufacturer("Volkswagen", 4, "Volkswagen", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer6 = new SupportedManufacturer("Seat", 5, "Seat", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer7 = new SupportedManufacturer("Skoda", 6, "Skoda", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer8 = new SupportedManufacturer("Lamborghini", 7, "Lamborghini", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer9 = new SupportedManufacturer("Bentley", 8, "Bentley", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer10 = new SupportedManufacturer("Porsche", 9, "Porsche", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer11 = new SupportedManufacturer("Man", 10, "MAN", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer12 = new SupportedManufacturer("Ktm", 11, "KTM", manufacturerGroup2);
        SupportedManufacturer supportedManufacturer13 = new SupportedManufacturer("NotSupported", 12, "NotSupported", ManufacturerGroup.f31171d);
        f31174c = supportedManufacturer13;
        SupportedManufacturer[] supportedManufacturerArr = {supportedManufacturer, supportedManufacturer2, supportedManufacturer3, supportedManufacturer4, supportedManufacturer5, supportedManufacturer6, supportedManufacturer7, supportedManufacturer8, supportedManufacturer9, supportedManufacturer10, supportedManufacturer11, supportedManufacturer12, supportedManufacturer13};
        f31175d = supportedManufacturerArr;
        kotlin.enums.a.a(supportedManufacturerArr);
        f31173b = new a();
    }

    public SupportedManufacturer(String str, int i10, String str2, ManufacturerGroup manufacturerGroup) {
        super(str, i10);
        this.dbName = str2;
        this.manufacturerGroup = manufacturerGroup;
    }

    public static SupportedManufacturer valueOf(String str) {
        return (SupportedManufacturer) Enum.valueOf(SupportedManufacturer.class, str);
    }

    public static SupportedManufacturer[] values() {
        return (SupportedManufacturer[]) f31175d.clone();
    }

    public final String a() {
        return this.dbName;
    }

    public final ManufacturerGroup b() {
        return this.manufacturerGroup;
    }
}
