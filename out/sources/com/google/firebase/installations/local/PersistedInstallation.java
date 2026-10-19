package com.google.firebase.installations.local;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p144l6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class PersistedInstallation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f28214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f28215b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegistrationStatus {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RegistrationStatus f28216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RegistrationStatus f28217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final RegistrationStatus f28218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final RegistrationStatus f28219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final RegistrationStatus f28220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ RegistrationStatus[] f28221g;

        static {
            RegistrationStatus registrationStatus = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            f28216b = registrationStatus;
            RegistrationStatus registrationStatus2 = new RegistrationStatus("NOT_GENERATED", 1);
            f28217c = registrationStatus2;
            RegistrationStatus registrationStatus3 = new RegistrationStatus("UNREGISTERED", 2);
            f28218d = registrationStatus3;
            RegistrationStatus registrationStatus4 = new RegistrationStatus("REGISTERED", 3);
            f28219e = registrationStatus4;
            RegistrationStatus registrationStatus5 = new RegistrationStatus("REGISTER_ERROR", 4);
            f28220f = registrationStatus5;
            f28221g = new RegistrationStatus[]{registrationStatus, registrationStatus2, registrationStatus3, registrationStatus4, registrationStatus5};
        }

        public RegistrationStatus() {
            throw null;
        }

        public static RegistrationStatus valueOf(String str) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, str);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) f28221g.clone();
        }
    }

    public PersistedInstallation(e eVar) {
        this.f28215b = eVar;
    }

    public final File a() {
        if (this.f28214a == null) {
            synchronized (this) {
                try {
                    if (this.f28214a == null) {
                        e eVar = this.f28215b;
                        eVar.a();
                        this.f28214a = new File(eVar.f44388a.getFilesDir(), "PersistedInstallation." + this.f28215b.d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f28214a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f28222b);
            jSONObject.put("Status", aVar.f28223c.ordinal());
            jSONObject.put("AuthToken", aVar.f28224d);
            jSONObject.put("RefreshToken", aVar.f28225e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f28227g);
            jSONObject.put("ExpiresInSecs", aVar.f28226f);
            jSONObject.put("FisError", aVar.f28228h);
            e eVar = this.f28215b;
            eVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", eVar.f44388a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = b.f28236a;
        RegistrationStatus registrationStatus = RegistrationStatus.values()[iOptInt];
        if (registrationStatus != null) {
            return new a(strOptString, registrationStatus, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
