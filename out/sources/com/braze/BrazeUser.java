package com.braze;

import A1.C0575j;
import bo.app.C1471i;
import bo.app.a2;
import bo.app.c2;
import bo.app.e6;
import bo.app.e7;
import bo.app.m2;
import bo.app.r5;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeUser {
    private final c2 brazeManager;
    private volatile String internalUserId;
    private final m2 locationManager;
    private final r5 serverConfigStorageProvider;
    private final e7 userCache;
    private final ReentrantLock userIdLock;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23892b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
        }
    }

    public static final class a0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f23894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, JSONArray jSONArray) {
            super(0);
            this.f23893b = str;
            this.f23894c = jSONArray;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom json attribute " + this.f23893b + " with value \n" + JsonUtils.getPrettyPrintedString(this.f23894c) + '.';
        }
    }

    public static final class a1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(String str) {
            super(0);
            this.f23895b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to unset custom attribute "), this.f23895b, '.');
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f23896b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
        }
    }

    public static final class b0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(0);
            this.f23897b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to set custom attribute "), this.f23897b, " to now.");
        }
    }

    public static final class b1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b1 f23898b = new b1();

        public b1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f23899b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set alias: " + this.f23899b;
        }
    }

    public static final class c0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f23901c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, long j) {
            super(0);
            this.f23900b = str;
            this.f23901c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Failed to set custom attribute ");
            sb2.append(this.f23900b);
            sb2.append(" to ");
            return p005a4.o.d(this.f23901c, " seconds from epoch.", sb2);
        }
    }

    public static final class c1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(String str) {
            super(0);
            this.f23902b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to unset custom location attribute with key '"), this.f23902b, '\'');
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f23903b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key was invalid. Not adding to attribute array.";
        }
    }

    public static final class d0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Month f23905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(int i10, Month month, int i11) {
            super(0);
            this.f23904b = i10;
            this.f23905c = month;
            this.f23906d = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set date of birth to: " + this.f23904b + '-' + this.f23905c.getValue() + '-' + this.f23906d;
        }
    }

    public static final class d1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(String str) {
            super(0);
            this.f23907b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "User object user id set to: " + this.f23907b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f23908b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to add custom attribute with key '"), this.f23908b, "'.");
        }
    }

    public static final class e0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e0 f23909b = new e0();

        public e0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid email parameter: email is required to be non-empty. Not setting email.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f23910b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
        }
    }

    public static final class f0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str) {
            super(0);
            this.f23911b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Email address is not valid: " + this.f23911b;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f23912b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add user to subscription group " + this.f23912b;
        }
    }

    public static final class g0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23913b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str) {
            super(0);
            this.f23913b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set email to: " + this.f23913b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10) {
            super(0);
            this.f23914b = str;
            this.f23915c = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Failed to increment custom attribute ");
            sb2.append(this.f23914b);
            sb2.append(" by ");
            return C0575j.b(sb2, this.f23915c, '.');
        }
    }

    public static final class h0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NotificationSubscriptionType f23916b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f23916b = notificationSubscriptionType;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set email notification subscription to: " + this.f23916b;
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f23917b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key was invalid. Not removing from attribute array.";
        }
    }

    public static final class i0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i0 f23918b = new i0();

        public i0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f23919b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to remove custom attribute with key '"), this.f23919b, "'.");
        }
    }

    public static final class j0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str) {
            super(0);
            this.f23920b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set first name to: " + this.f23920b;
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f23921b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
        }
    }

    public static final class k0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gender f23922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(Gender gender) {
            super(0);
            this.f23922b = gender;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set gender to: " + this.f23922b;
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23923b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.f23923b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to remove user from subscription group " + this.f23923b;
        }
    }

    public static final class l0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l0 f23924b = new l0();

        public l0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f23925b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set attribution data.";
        }
    }

    public static final class m0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str) {
            super(0);
            this.f23926b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set home city to: " + this.f23926b;
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f23927b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid country parameter: country is required to be non-blank. Not setting country.";
        }
    }

    public static final class n0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n0 f23928b = new n0();

        public n0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid language parameter: language is required to be non-empty. Not setting language.";
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23929b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.f23929b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set country to: " + this.f23929b;
        }
    }

    public static final class o0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str) {
            super(0);
            this.f23930b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set language to: " + this.f23930b;
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f23931b = new p();

        public p() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    public static final class p0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p0 f23932b = new p0();

        public p0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to manually set location.";
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f23934c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, Object obj) {
            super(0);
            this.f23933b = str;
            this.f23934c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not add unsupported custom attribute value with key: " + this.f23933b + " and value: " + this.f23934c;
        }
    }

    public static final class q0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q0 f23935b = new q0();

        public q0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f23937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, Object obj) {
            super(0);
            this.f23936b = str;
            this.f23937c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not build NestedCustomAttributeEvent for key " + this.f23936b + " and " + this.f23937c;
        }
    }

    public static final class r0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String str) {
            super(0);
            this.f23938b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set last name to: " + this.f23938b;
        }
    }

    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(0);
            this.f23939b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to set custom attribute array with key: '"), this.f23939b, "'.");
        }
    }

    public static final class s0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s0 f23940b = new s0();

        public s0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    public static final class t extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(0);
            this.f23941b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to set custom boolean attribute "), this.f23941b, '.');
        }
    }

    public static final class t0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f23942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f23943c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(double d10, double d11) {
            super(0);
            this.f23942b = d10;
            this.f23943c = d11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot set custom location attribute due with invalid latitude '" + this.f23942b + " and longitude '" + this.f23943c + '\'';
        }
    }

    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(0);
            this.f23944b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to set custom integer attribute "), this.f23944b, '.');
        }
    }

    public static final class u0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f23946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f23947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(String str, double d10, double d11) {
            super(0);
            this.f23945b = str;
            this.f23946c = d10;
            this.f23947d = d11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom location attribute with key '" + this.f23945b + "' and latitude '" + this.f23946c + "' and longitude '" + this.f23947d + '\'';
        }
    }

    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(0);
            this.f23948b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to set custom float attribute "), this.f23948b, '.');
        }
    }

    public static final class v0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v0 f23949b = new v0();

        public v0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
        }
    }

    public static final class w extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(0);
            this.f23950b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to set custom long attribute "), this.f23950b, '.');
        }
    }

    public static final class w0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str) {
            super(0);
            this.f23951b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): " + this.f23951b;
        }
    }

    public static final class x extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(0);
            this.f23952b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to set custom string attribute "), this.f23952b, '.');
        }
    }

    public static final class x0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23953b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(String str) {
            super(0);
            this.f23953b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set phone number to: " + this.f23953b;
        }
    }

    public static final class y extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23954b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(0);
            this.f23954b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to set custom double attribute "), this.f23954b, '.');
        }
    }

    public static final class y0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NotificationSubscriptionType f23955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f23955b = notificationSubscriptionType;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set push notification subscription to: " + this.f23955b;
        }
    }

    public static final class z extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f23957c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, JSONObject jSONObject) {
            super(0);
            this.f23956b = str;
            this.f23957c = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom json attribute " + this.f23956b + " with value \n" + JsonUtils.getPrettyPrintedString(this.f23957c) + '.';
        }
    }

    public static final class z0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z0 f23958b = new z0();

        public z0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    public BrazeUser(e7 userCache, c2 brazeManager, String internalUserId, m2 locationManager, r5 serverConfigStorageProvider) {
        kotlin.jvm.internal.i.e(userCache, "userCache");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(internalUserId, "internalUserId");
        kotlin.jvm.internal.i.e(locationManager, "locationManager");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.userCache = userCache;
        this.brazeManager = brazeManager;
        this.internalUserId = internalUserId;
        this.locationManager = locationManager;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        this.userIdLock = new ReentrantLock();
    }

    public static /* synthetic */ boolean incrementCustomUserAttribute$default(BrazeUser brazeUser, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return brazeUser.incrementCustomUserAttribute(str, i10);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z10);
    }

    public static /* synthetic */ boolean setCustomUserAttribute$default(BrazeUser brazeUser, String str, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return brazeUser.setCustomUserAttribute(str, jSONObject, z10);
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d10, double d11, Double d12, Double d13, Double d14, int i10, Object obj) {
        brazeUser.setLastKnownLocation(d10, d11, (i10 & 4) != 0 ? null : d12, (i10 & 8) != 0 ? null : d13, (i10 & 16) != 0 ? null : d14);
    }

    public final boolean addAlias(String alias, String label) {
        kotlin.jvm.internal.i.e(alias, "alias");
        kotlin.jvm.internal.i.e(label, "label");
        if (kotlin.text.n.S(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.f23892b, 2, (Object) null);
            return false;
        }
        if (kotlin.text.n.S(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.f23896b, 2, (Object) null);
            return false;
        }
        try {
            a2 a2VarG = C1471i.f21202h.g(alias, label);
            if (a2VarG != null) {
                return this.brazeManager.a(a2VarG);
            }
            return false;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new c(alias));
            return false;
        }
    }

    public final boolean addToCustomAttributeArray(String key, String value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        try {
            if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.f23903b, 2, (Object) null);
                return false;
            }
            if (!com.braze.support.b.b(value)) {
                return false;
            }
            a2 a2VarA = C1471i.f21202h.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (a2VarA == null) {
                return false;
            }
            return this.brazeManager.a(a2VarA);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new e(key));
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String subscriptionGroupId) {
        kotlin.jvm.internal.i.e(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (kotlin.text.n.S(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, f.f23910b, 2, (Object) null);
                return false;
            }
            a2 a2VarA = C1471i.f21202h.a(subscriptionGroupId, e6.SUBSCRIBED);
            if (a2VarA == null) {
                return true;
            }
            this.brazeManager.a(a2VarA);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new g(subscriptionGroupId));
            return false;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        return incrementCustomUserAttribute$default(this, key, 0, 2, null);
    }

    public final boolean removeFromCustomAttributeArray(String key, String value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        try {
            if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i.f23917b, 2, (Object) null);
                return false;
            }
            if (!com.braze.support.b.b(value)) {
                return false;
            }
            a2 a2VarF = C1471i.f21202h.f(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (a2VarF == null) {
                return false;
            }
            return this.brazeManager.a(a2VarF);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new j(key));
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(String subscriptionGroupId) {
        kotlin.jvm.internal.i.e(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (kotlin.text.n.S(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, k.f23921b, 2, (Object) null);
                return false;
            }
            a2 a2VarA = C1471i.f21202h.a(subscriptionGroupId, e6.UNSUBSCRIBED);
            if (a2VarA == null) {
                return true;
            }
            this.brazeManager.a(a2VarA);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new l(subscriptionGroupId));
            return false;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            this.userCache.a(attributionData);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, m.f23925b);
            return false;
        }
    }

    public final boolean setCountry(String str) {
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, n.f23927b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new o(str));
                return false;
            }
        }
        this.userCache.a(str);
        return true;
    }

    public final boolean setCustomAttribute(String key, Object value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        return setCustomAttribute$default(this, key, value, false, 4, null);
    }

    public final boolean setCustomAttributeArray(String key, String[] values) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(values, "values");
        try {
            if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                return false;
            }
            a2 a2VarA = C1471i.f21202h.a(ValidationUtils.ensureBrazeFieldLength(key), com.braze.support.b.a(values));
            if (a2VarA == null) {
                return false;
            }
            return this.brazeManager.a(a2VarA);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new s(key));
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long j10) {
        kotlin.jvm.internal.i.e(key, "key");
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(j10), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        return setCustomUserAttribute$default(this, key, value, false, 4, null);
    }

    public final boolean setCustomUserAttributeToNow(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, DateTimeUtils.nowInSeconds());
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new b0(key));
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(String key, long j10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, j10);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new c0(key, j10));
            return false;
        }
    }

    public final boolean setDateOfBirth(int i10, Month month, int i11) {
        kotlin.jvm.internal.i.e(month, "month");
        try {
            return this.userCache.b(DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i10, month.getValue(), i11, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new d0(i10, month, i11));
            return false;
        }
    }

    public final boolean setEmail(String str) {
        String string;
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e0.f23909b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new g0(str));
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.i.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            string = str.subSequence(i10, length + 1).toString();
        } else {
            string = null;
        }
        if (string != null && !ValidationUtils.isValidEmailAddress(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f0(str), 3, (Object) null);
            return false;
        }
        return this.userCache.c(string);
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType emailNotificationSubscriptionType) {
        kotlin.jvm.internal.i.e(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            this.userCache.a(emailNotificationSubscriptionType);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new h0(emailNotificationSubscriptionType));
            return false;
        }
    }

    public final boolean setFirstName(String str) {
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i0.f23918b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new j0(str));
                return false;
            }
        }
        this.userCache.d(str);
        return true;
    }

    public final boolean setGender(Gender gender) {
        kotlin.jvm.internal.i.e(gender, "gender");
        try {
            this.userCache.a(gender);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new k0(gender));
            return false;
        }
    }

    public final boolean setHomeCity(String str) {
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, l0.f23924b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new m0(str));
                return false;
            }
        }
        this.userCache.e(str);
        return true;
    }

    public final boolean setLanguage(String str) {
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, n0.f23928b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new o0(str));
                return false;
            }
        }
        this.userCache.f(str);
        return true;
    }

    public final void setLastKnownLocation(double d10, double d11) {
        setLastKnownLocation$default(this, d10, d11, null, null, null, 28, null);
    }

    public final boolean setLastName(String str) {
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q0.f23935b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new r0(str));
                return false;
            }
        }
        this.userCache.g(str);
        return true;
    }

    public final void setLocationCustomAttribute(String key, double d10, double d11) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, s0.f23940b, 2, (Object) null);
                return;
            }
            if (!ValidationUtils.isValidLocation(d10, d11)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new t0(d10, d11), 2, (Object) null);
                return;
            }
            a2 a2VarA = C1471i.f21202h.a(ValidationUtils.ensureBrazeFieldLength(key), d10, d11);
            if (a2VarA != null) {
                this.brazeManager.a(a2VarA);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new u0(key, d10, d11));
        }
    }

    public final boolean setPhoneNumber(String str) {
        String string;
        if (str != null) {
            try {
                if (kotlin.text.n.S(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, v0.f23949b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new x0(str));
                return false;
            }
        }
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.i.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            string = str.subSequence(i10, length + 1).toString();
        } else {
            string = null;
        }
        if (string != null && !ValidationUtils.isValidPhoneNumber(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new w0(string), 2, (Object) null);
            return false;
        }
        return this.userCache.h(string);
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType pushNotificationSubscriptionType) {
        kotlin.jvm.internal.i.e(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            this.userCache.b(pushNotificationSubscriptionType);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new y0(pushNotificationSubscriptionType));
            return false;
        }
    }

    public final void setUserId(String userId) {
        kotlin.jvm.internal.i.e(userId, "userId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d1(userId), 2, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!kotlin.jvm.internal.i.a(this.internalUserId, "") && !kotlin.jvm.internal.i.a(this.internalUserId, userId)) {
                throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + userId + ']');
            }
            this.internalUserId = userId;
            this.userCache.i(userId);
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean unsetCustomUserAttribute(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            if (com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                return this.userCache.j(key);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, z0.f23958b, 2, (Object) null);
            return false;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new a1(key));
            return false;
        }
    }

    public final void unsetLocationCustomAttribute(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b1.f23898b, 2, (Object) null);
                return;
            }
            a2 a2VarK = C1471i.f21202h.k(ValidationUtils.ensureBrazeFieldLength(key));
            if (a2VarK != null) {
                this.brazeManager.a(a2VarK);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new c1(key));
        }
    }

    public final boolean incrementCustomUserAttribute(String key, int i10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
                return false;
            }
            a2 a2VarA = C1471i.f21202h.a(ValidationUtils.ensureBrazeFieldLength(key), i10);
            if (a2VarA == null) {
                return false;
            }
            return this.brazeManager.a(a2VarA);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new h(key, i10));
            return false;
        }
    }

    public final boolean setCustomAttribute(String key, Object value, boolean z10) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        if (!com.braze.support.b.a(key, this.serverConfigStorageProvider.d())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.f23931b, 2, (Object) null);
            return false;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        Object objA = com.braze.support.b.a(com.braze.support.b.f24359a, value, 0, 2, null);
        if (objA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new q(key, value), 2, (Object) null);
            return false;
        }
        if (!(objA instanceof JSONObject) || !z10) {
            return this.userCache.a(strEnsureBrazeFieldLength, objA);
        }
        a2 a2VarA = C1471i.f21202h.a(strEnsureBrazeFieldLength, (JSONObject) objA);
        if (a2VarA != null) {
            return this.brazeManager.a(a2VarA);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new r(strEnsureBrazeFieldLength, objA), 2, (Object) null);
        return false;
    }

    public final boolean setCustomUserAttribute(String key, boolean z10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttribute$default(this, key, Boolean.valueOf(z10), false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new t(key));
            return false;
        }
    }

    public final void setLastKnownLocation(double d10, double d11, Double d12) {
        setLastKnownLocation$default(this, d10, d11, d12, null, null, 24, null);
    }

    public final void setLastKnownLocation(double d10, double d11, Double d12, Double d13) {
        setLastKnownLocation$default(this, d10, d11, d12, d13, null, 16, null);
    }

    public final boolean setCustomUserAttribute(String key, int i10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttribute$default(this, key, Integer.valueOf(i10), false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new u(key));
            return false;
        }
    }

    public final void setLastKnownLocation(double d10, double d11, Double d12, Double d13, Double d14) {
        try {
            this.locationManager.a(new BrazeLocation(d10, d11, d12, d13, d14));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, p0.f23932b);
        }
    }

    public final boolean setCustomUserAttribute(String key, float f10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttribute$default(this, key, Float.valueOf(f10), false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new v(key));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, long j10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttribute$default(this, key, Long.valueOf(j10), false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new w(key));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, String value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new x(key));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double d10) {
        kotlin.jvm.internal.i.e(key, "key");
        try {
            return setCustomAttribute$default(this, key, Double.valueOf(d10), false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new y(key));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value, boolean z10) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        try {
            return setCustomAttribute(key, value, z10);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new z(key, value));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONArray value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new a0(key, value));
            return false;
        }
    }
}
