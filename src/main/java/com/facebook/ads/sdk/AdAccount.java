/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

package com.facebook.ads.sdk;

import java.io.File;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import com.facebook.ads.sdk.APIException.MalformedResponseException;

/**
 * This class is auto-generated.
 *
 * For any issues or feature requests related to this class, please let us know
 * on github and we'll fix in our codegen framework. We'll not be able to accept
 * pull request for this class.
 *
 */
public class AdAccount extends APINode {
  @SerializedName("account_id")
  private String mAccountId = null;
  @SerializedName("account_status")
  private Long mAccountStatus = null;
  @SerializedName("ad_account_creation_request")
  private AdAccountCreationRequest mAdAccountCreationRequest = null;
  @SerializedName("ad_account_promotable_objects")
  private AdAccountPromotableObjects mAdAccountPromotableObjects = null;
  @SerializedName("age")
  private Double mAge = null;
  @SerializedName("agency_client_declaration")
  private AgencyClientDeclaration mAgencyClientDeclaration = null;
  @SerializedName("amount_spent")
  private String mAmountSpent = null;
  @SerializedName("attribution_spec")
  private List<AttributionSpec> mAttributionSpec = null;
  @SerializedName("balance")
  private String mBalance = null;
  @SerializedName("business")
  private Business mBusiness = null;
  @SerializedName("business_city")
  private String mBusinessCity = null;
  @SerializedName("business_country_code")
  private String mBusinessCountryCode = null;
  @SerializedName("business_name")
  private String mBusinessName = null;
  @SerializedName("business_state")
  private String mBusinessState = null;
  @SerializedName("business_street")
  private String mBusinessStreet = null;
  @SerializedName("business_street2")
  private String mBusinessStreet2 = null;
  @SerializedName("business_zip")
  private String mBusinessZip = null;
  @SerializedName("can_create_brand_lift_study")
  private Boolean mCanCreateBrandLiftStudy = null;
  @SerializedName("capabilities")
  private List<String> mCapabilities = null;
  @SerializedName("created_time")
  private String mCreatedTime = null;
  @SerializedName("currency")
  private String mCurrency = null;
  @SerializedName("disable_reason")
  private Long mDisableReason = null;
  @SerializedName("end_advertiser")
  private String mEndAdvertiser = null;
  @SerializedName("end_advertiser_name")
  private String mEndAdvertiserName = null;
  @SerializedName("failed_delivery_checks")
  private List<DeliveryCheck> mFailedDeliveryChecks = null;
  @SerializedName("fb_entity")
  private Long mFbEntity = null;
  @SerializedName("funding_source")
  private String mFundingSource = null;
  @SerializedName("funding_source_details")
  private FundingSourceDetails mFundingSourceDetails = null;
  @SerializedName("has_migrated_permissions")
  private Boolean mHasMigratedPermissions = null;
  @SerializedName("has_page_authorized_adaccount")
  private Boolean mHasPageAuthorizedAdaccount = null;
  @SerializedName("id")
  private String mId = null;
  @SerializedName("io_number")
  private String mIoNumber = null;
  @SerializedName("is_attribution_spec_system_default")
  private Boolean mIsAttributionSpecSystemDefault = null;
  @SerializedName("is_direct_deals_enabled")
  private Boolean mIsDirectDealsEnabled = null;
  @SerializedName("is_in_3ds_authorization_enabled_market")
  private Boolean mIsIn3dsAuthorizationEnabledMarket = null;
  @SerializedName("is_in_middle_of_local_entity_migration")
  private Boolean mIsInMiddleOfLocalEntityMigration = null;
  @SerializedName("is_notifications_enabled")
  private Boolean mIsNotificationsEnabled = null;
  @SerializedName("is_personal")
  private Long mIsPersonal = null;
  @SerializedName("is_prepay_account")
  private Boolean mIsPrepayAccount = null;
  @SerializedName("is_tax_id_required")
  private Boolean mIsTaxIdRequired = null;
  @SerializedName("line_numbers")
  private List<Long> mLineNumbers = null;
  @SerializedName("media_agency")
  private String mMediaAgency = null;
  @SerializedName("min_campaign_group_spend_cap")
  private String mMinCampaignGroupSpendCap = null;
  @SerializedName("min_daily_budget")
  private Long mMinDailyBudget = null;
  @SerializedName("name")
  private String mName = null;
  @SerializedName("offsite_pixels_tos_accepted")
  private Boolean mOffsitePixelsTosAccepted = null;
  @SerializedName("owner")
  private String mOwner = null;
  @SerializedName("partner")
  private String mPartner = null;
  @SerializedName("rf_spec")
  private ReachFrequencySpec mRfSpec = null;
  @SerializedName("show_checkout_experience")
  private Boolean mShowCheckoutExperience = null;
  @SerializedName("spend_cap")
  private String mSpendCap = null;
  @SerializedName("tax_id")
  private String mTaxId = null;
  @SerializedName("tax_id_status")
  private Long mTaxIdStatus = null;
  @SerializedName("tax_id_type")
  private String mTaxIdType = null;
  @SerializedName("timezone_id")
  private Long mTimezoneId = null;
  @SerializedName("timezone_name")
  private String mTimezoneName = null;
  @SerializedName("timezone_offset_hours_utc")
  private Double mTimezoneOffsetHoursUtc = null;
  @SerializedName("tos_accepted")
  private Map<String, Long> mTosAccepted = null;
  @SerializedName("user_role")
  private String mUserRole = null;
  @SerializedName("user_tos_accepted")
  private Map<String, Long> mUserTosAccepted = null;
  protected static Gson gson = null;

  AdAccount() {
  }

  public AdAccount(Long id, APIContext context) {
    this(id.toString(), context);
  }

  public AdAccount(String id, APIContext context) {
    this.mId = id.replaceAll("act_", "");

    this.context = context;
  }

  public AdAccount fetch() throws APIException{
    AdAccount newInstance = fetchById(this.getPrefixedId().toString(), this.context);
    this.copyFrom(newInstance);
    mId = mId.replaceAll("act_", "");
    return this;
  }

  public static AdAccount fetchById(Long id, APIContext context) throws APIException {
    return fetchById(id.toString(), context);
  }

  public static ListenableFuture<AdAccount> fetchByIdAsync(Long id, APIContext context) throws APIException {
    return fetchByIdAsync(id.toString(), context);
  }

  public static AdAccount fetchById(String id, APIContext context) throws APIException {
    return
      new APIRequestGet(id, context)
      .requestAllFields()
      .execute();
  }

  public static ListenableFuture<AdAccount> fetchByIdAsync(String id, APIContext context) throws APIException {
    return
      new APIRequestGet(id, context)
      .requestAllFields()
      .executeAsync();
  }

  public static APINodeList<AdAccount> fetchByIds(List<String> ids, List<String> fields, APIContext context) throws APIException {
    return (APINodeList<AdAccount>)(
      new APIRequest<AdAccount>(context, "", "/", "GET", AdAccount.getParser())
        .setParam("ids", APIRequest.joinStringList(ids))
        .requestFields(fields)
        .execute()
    );
  }

  public static ListenableFuture<APINodeList<AdAccount>> fetchByIdsAsync(List<String> ids, List<String> fields, APIContext context) throws APIException {
    return
      new APIRequest(context, "", "/", "GET", AdAccount.getParser())
        .setParam("ids", APIRequest.joinStringList(ids))
        .requestFields(fields)
        .executeAsyncBase();
  }

  private String getPrefixedId() {
    return "act_" + getId();
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static AdAccount loadJSON(String json, APIContext context, String header) {
    AdAccount adAccount = getGson().fromJson(json, AdAccount.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(adAccount.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      };
    }
    adAccount.context = context;
    adAccount.rawValue = json;
    adAccount.header = header;
    JsonParser parser = new JsonParser();
    JsonObject o = parser.parse(json).getAsJsonObject();
    if (o.has("account_id")) {
      String accountId = o.get("account_id").getAsString();
      if (accountId != null) {
        adAccount.mId = accountId;
      }
    }
    if (adAccount.mId != null) {
      adAccount.mId = adAccount.mId.replaceAll("act_", "");
    }
    return adAccount;
  }

  public static APINodeList<AdAccount> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<AdAccount> adAccounts = new APINodeList<AdAccount>(request, json, header);
    JsonArray arr;
    JsonObject obj;
    JsonParser parser = new JsonParser();
    Exception exception = null;
    try{
      JsonElement result = parser.parse(json);
      if (result.isJsonArray()) {
        // First, check if it's a pure JSON Array
        arr = result.getAsJsonArray();
        for (int i = 0; i < arr.size(); i++) {
          adAccounts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return adAccounts;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                adAccounts.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            adAccounts.setPaging(previous, next);
            if (context.hasAppSecret()) {
              adAccounts.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              adAccounts.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
            };
          } else if (obj.get("data").isJsonObject()) {
            // Third, check if it's a JSON object with "data"
            obj = obj.get("data").getAsJsonObject();
            boolean isRedownload = false;
            for (String s : new String[]{"campaigns", "adsets", "ads"}) {
              if (obj.has(s)) {
                isRedownload = true;
                obj = obj.getAsJsonObject(s);
                for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
                  adAccounts.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              adAccounts.add(loadJSON(obj.toString(), context, header));
            }
          }
          return adAccounts;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              adAccounts.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return adAccounts;
        } else {
          // Fifth, check if it's an array of objects indexed by id
          boolean isIdIndexedArray = true;
          for (Map.Entry entry : obj.entrySet()) {
            String key = (String) entry.getKey();
            if (key.equals("__fb_trace_id__")) {
              continue;
            }
            JsonElement value = (JsonElement) entry.getValue();
            if (
              value != null &&
              value.isJsonObject() &&
              value.getAsJsonObject().has("id") &&
              value.getAsJsonObject().get("id") != null &&
              value.getAsJsonObject().get("id").getAsString().equals(key)
            ) {
              adAccounts.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return adAccounts;
          }

          // Sixth, check if it's pure JsonObject
          adAccounts.clear();
          adAccounts.add(loadJSON(json, context, header));
          return adAccounts;
        }
      }
    } catch (Exception e) {
      exception = e;
    }
    throw new MalformedResponseException(
      "Invalid response string: " + json,
      exception
    );
  }

  @Override
  public APIContext getContext() {
    return context;
  }

  @Override
  public void setContext(APIContext context) {
    this.context = context;
  }

  @Override
  public String toString() {
    return getGson().toJson(this);
  }

  public APIRequestGetActivities getActivities() {
    return new APIRequestGetActivities(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdPlacePageSets getAdPlacePageSets() {
    return new APIRequestGetAdPlacePageSets(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdPlacePageSet createAdPlacePageSet() {
    return new APIRequestCreateAdPlacePageSet(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdSet createAdSet() {
    return new APIRequestCreateAdSet(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdStudies getAdStudies() {
    return new APIRequestGetAdStudies(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdContracts getAdContracts() {
    return new APIRequestGetAdContracts(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdCreatives getAdCreatives() {
    return new APIRequestGetAdCreatives(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdCreative createAdCreative() {
    return new APIRequestCreateAdCreative(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdCreativesByLabels getAdCreativesByLabels() {
    return new APIRequestGetAdCreativesByLabels(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAdImages deleteAdImages() {
    return new APIRequestDeleteAdImages(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdImages getAdImages() {
    return new APIRequestGetAdImages(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdImage createAdImage() {
    return new APIRequestCreateAdImage(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdLabels getAdLabels() {
    return new APIRequestGetAdLabels(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdLabel createAdLabel() {
    return new APIRequestCreateAdLabel(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdPlayables getAdPlayables() {
    return new APIRequestGetAdPlayables(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdPlayable createAdPlayable() {
    return new APIRequestCreateAdPlayable(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAdReportRuns deleteAdReportRuns() {
    return new APIRequestDeleteAdReportRuns(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdReportSchedules getAdReportSchedules() {
    return new APIRequestGetAdReportSchedules(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdReportSchedule createAdReportSchedule() {
    return new APIRequestCreateAdReportSchedule(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdReportSpec createAdReportSpec() {
    return new APIRequestCreateAdReportSpec(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdRulesHistory getAdRulesHistory() {
    return new APIRequestGetAdRulesHistory(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdRulesLibrary getAdRulesLibrary() {
    return new APIRequestGetAdRulesLibrary(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdRulesLibrary createAdRulesLibrary() {
    return new APIRequestCreateAdRulesLibrary(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAds deleteAds() {
    return new APIRequestDeleteAds(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAds getAds() {
    return new APIRequestGetAds(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAd createAd() {
    return new APIRequestCreateAd(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdsByLabels getAdsByLabels() {
    return new APIRequestGetAdsByLabels(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAdSets deleteAdSets() {
    return new APIRequestDeleteAdSets(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdSets getAdSets() {
    return new APIRequestGetAdSets(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdSetsByLabels getAdSetsByLabels() {
    return new APIRequestGetAdSetsByLabels(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdsPixels getAdsPixels() {
    return new APIRequestGetAdsPixels(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdsPixel createAdsPixel() {
    return new APIRequestCreateAdsPixel(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdToplineDetails getAdToplineDetails() {
    return new APIRequestGetAdToplineDetails(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdTopLines getAdTopLines() {
    return new APIRequestGetAdTopLines(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdvertisableApplications getAdvertisableApplications() {
    return new APIRequestGetAdvertisableApplications(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAdVideos deleteAdVideos() {
    return new APIRequestDeleteAdVideos(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdVideos getAdVideos() {
    return new APIRequestGetAdVideos(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAdVideo createAdVideo() {
    return new APIRequestCreateAdVideo(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAgencies deleteAgencies() {
    return new APIRequestDeleteAgencies(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAgencies getAgencies() {
    return new APIRequestGetAgencies(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAgency createAgency() {
    return new APIRequestCreateAgency(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetApplications getApplications() {
    return new APIRequestGetApplications(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAssignedUsers deleteAssignedUsers() {
    return new APIRequestDeleteAssignedUsers(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAssignedUsers getAssignedUsers() {
    return new APIRequestGetAssignedUsers(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAssignedUser createAssignedUser() {
    return new APIRequestCreateAssignedUser(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAsyncBatchRequest createAsyncBatchRequest() {
    return new APIRequestCreateAsyncBatchRequest(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAsyncRequests getAsyncRequests() {
    return new APIRequestGetAsyncRequests(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAsyncAdRequestSets getAsyncAdRequestSets() {
    return new APIRequestGetAsyncAdRequestSets(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAsyncAdRequestSet createAsyncAdRequestSet() {
    return new APIRequestCreateAsyncAdRequestSet(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAudienceReplace createAudienceReplace() {
    return new APIRequestCreateAudienceReplace(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateBatchReplace createBatchReplace() {
    return new APIRequestCreateBatchReplace(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateBatchUpload createBatchUpload() {
    return new APIRequestCreateBatchUpload(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateBlockListDraft createBlockListDraft() {
    return new APIRequestCreateBlockListDraft(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateBrandAudience createBrandAudience() {
    return new APIRequestCreateBrandAudience(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetBroadTargetingCategories getBroadTargetingCategories() {
    return new APIRequestGetBroadTargetingCategories(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetBusinessProjects getBusinessProjects() {
    return new APIRequestGetBusinessProjects(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteCampaigns deleteCampaigns() {
    return new APIRequestDeleteCampaigns(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetCampaigns getCampaigns() {
    return new APIRequestGetCampaigns(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateCampaign createCampaign() {
    return new APIRequestCreateCampaign(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetCampaignsByLabels getCampaignsByLabels() {
    return new APIRequestGetCampaignsByLabels(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetCustomAudiences getCustomAudiences() {
    return new APIRequestGetCustomAudiences(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateCustomAudience createCustomAudience() {
    return new APIRequestCreateCustomAudience(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetCustomAudiencesTos getCustomAudiencesTos() {
    return new APIRequestGetCustomAudiencesTos(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateCustomAudiencesTo createCustomAudiencesTo() {
    return new APIRequestCreateCustomAudiencesTo(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetCustomConversions getCustomConversions() {
    return new APIRequestGetCustomConversions(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateCustomConversion createCustomConversion() {
    return new APIRequestCreateCustomConversion(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateDeactivate createDeactivate() {
    return new APIRequestCreateDeactivate(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetDeliveryEstimate getDeliveryEstimate() {
    return new APIRequestGetDeliveryEstimate(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetDeprecatedTargetingAdSets getDeprecatedTargetingAdSets() {
    return new APIRequestGetDeprecatedTargetingAdSets(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetGeneratePreviews getGeneratePreviews() {
    return new APIRequestGetGeneratePreviews(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetImpactingAdStudies getImpactingAdStudies() {
    return new APIRequestGetImpactingAdStudies(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetInsights getInsights() {
    return new APIRequestGetInsights(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetInsightsAsync getInsightsAsync() {
    return new APIRequestGetInsightsAsync(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetInstagramAccounts getInstagramAccounts() {
    return new APIRequestGetInstagramAccounts(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetLeadGenForms getLeadGenForms() {
    return new APIRequestGetLeadGenForms(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetMatchedSearchApplications getMatchedSearchApplications() {
    return new APIRequestGetMatchedSearchApplications(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetMaxBid getMaxBid() {
    return new APIRequestGetMaxBid(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetMinimumBudgets getMinimumBudgets() {
    return new APIRequestGetMinimumBudgets(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetOfflineConversionDataSets getOfflineConversionDataSets() {
    return new APIRequestGetOfflineConversionDataSets(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetOnBehalfRequests getOnBehalfRequests() {
    return new APIRequestGetOnBehalfRequests(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreatePartnerRequest createPartnerRequest() {
    return new APIRequestCreatePartnerRequest(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateProductAudience createProductAudience() {
    return new APIRequestCreateProductAudience(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPromotePages getPromotePages() {
    return new APIRequestGetPromotePages(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPublisherBlockLists getPublisherBlockLists() {
    return new APIRequestGetPublisherBlockLists(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreatePublisherBlockList createPublisherBlockList() {
    return new APIRequestCreatePublisherBlockList(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetReachEstimate getReachEstimate() {
    return new APIRequestGetReachEstimate(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetReachFrequencyPredictions getReachFrequencyPredictions() {
    return new APIRequestGetReachFrequencyPredictions(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateReachFrequencyPrediction createReachFrequencyPrediction() {
    return new APIRequestCreateReachFrequencyPrediction(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetRoas getRoas() {
    return new APIRequestGetRoas(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetSavedAudiences getSavedAudiences() {
    return new APIRequestGetSavedAudiences(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateSponsoredMessageAd createSponsoredMessageAd() {
    return new APIRequestCreateSponsoredMessageAd(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTargetingBrowse getTargetingBrowse() {
    return new APIRequestGetTargetingBrowse(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTargetingSearch getTargetingSearch() {
    return new APIRequestGetTargetingSearch(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTargetingSentenceLines getTargetingSentenceLines() {
    return new APIRequestGetTargetingSentenceLines(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTargetingSuggestions getTargetingSuggestions() {
    return new APIRequestGetTargetingSuggestions(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTargetingValidation getTargetingValidation() {
    return new APIRequestGetTargetingValidation(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteTracking deleteTracking() {
    return new APIRequestDeleteTracking(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTracking getTracking() {
    return new APIRequestGetTracking(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateTracking createTracking() {
    return new APIRequestCreateTracking(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteUsers deleteUsers() {
    return new APIRequestDeleteUsers(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetUsers getUsers() {
    return new APIRequestGetUsers(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateUser createUser() {
    return new APIRequestCreateUser(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteUsersOfAnyAudience deleteUsersOfAnyAudience() {
    return new APIRequestDeleteUsersOfAnyAudience(this.getPrefixedId().toString(), context);
  }

  public APIRequestGet get() {
    return new APIRequestGet(this.getPrefixedId().toString(), context);
  }

  public APIRequestUpdate update() {
    return new APIRequestUpdate(this.getPrefixedId().toString(), context);
  }


  public String getFieldAccountId() {
    return mAccountId;
  }

  public Long getFieldAccountStatus() {
    return mAccountStatus;
  }

  public AdAccountCreationRequest getFieldAdAccountCreationRequest() {
    if (mAdAccountCreationRequest != null) {
      mAdAccountCreationRequest.context = getContext();
    }
    return mAdAccountCreationRequest;
  }

  public AdAccountPromotableObjects getFieldAdAccountPromotableObjects() {
    return mAdAccountPromotableObjects;
  }

  public Double getFieldAge() {
    return mAge;
  }

  public AgencyClientDeclaration getFieldAgencyClientDeclaration() {
    return mAgencyClientDeclaration;
  }

  public String getFieldAmountSpent() {
    return mAmountSpent;
  }

  public List<AttributionSpec> getFieldAttributionSpec() {
    return mAttributionSpec;
  }

  public String getFieldBalance() {
    return mBalance;
  }

  public Business getFieldBusiness() {
    if (mBusiness != null) {
      mBusiness.context = getContext();
    }
    return mBusiness;
  }

  public String getFieldBusinessCity() {
    return mBusinessCity;
  }

  public String getFieldBusinessCountryCode() {
    return mBusinessCountryCode;
  }

  public String getFieldBusinessName() {
    return mBusinessName;
  }

  public String getFieldBusinessState() {
    return mBusinessState;
  }

  public String getFieldBusinessStreet() {
    return mBusinessStreet;
  }

  public String getFieldBusinessStreet2() {
    return mBusinessStreet2;
  }

  public String getFieldBusinessZip() {
    return mBusinessZip;
  }

  public Boolean getFieldCanCreateBrandLiftStudy() {
    return mCanCreateBrandLiftStudy;
  }

  public List<String> getFieldCapabilities() {
    return mCapabilities;
  }

  public String getFieldCreatedTime() {
    return mCreatedTime;
  }

  public String getFieldCurrency() {
    return mCurrency;
  }

  public Long getFieldDisableReason() {
    return mDisableReason;
  }

  public String getFieldEndAdvertiser() {
    return mEndAdvertiser;
  }

  public String getFieldEndAdvertiserName() {
    return mEndAdvertiserName;
  }

  public List<DeliveryCheck> getFieldFailedDeliveryChecks() {
    return mFailedDeliveryChecks;
  }

  public Long getFieldFbEntity() {
    return mFbEntity;
  }

  public String getFieldFundingSource() {
    return mFundingSource;
  }

  public FundingSourceDetails getFieldFundingSourceDetails() {
    return mFundingSourceDetails;
  }

  public Boolean getFieldHasMigratedPermissions() {
    return mHasMigratedPermissions;
  }

  public Boolean getFieldHasPageAuthorizedAdaccount() {
    return mHasPageAuthorizedAdaccount;
  }

  public String getFieldId() {
    return mId;
  }

  public String getFieldIoNumber() {
    return mIoNumber;
  }

  public Boolean getFieldIsAttributionSpecSystemDefault() {
    return mIsAttributionSpecSystemDefault;
  }

  public Boolean getFieldIsDirectDealsEnabled() {
    return mIsDirectDealsEnabled;
  }

  public Boolean getFieldIsIn3dsAuthorizationEnabledMarket() {
    return mIsIn3dsAuthorizationEnabledMarket;
  }

  public Boolean getFieldIsInMiddleOfLocalEntityMigration() {
    return mIsInMiddleOfLocalEntityMigration;
  }

  public Boolean getFieldIsNotificationsEnabled() {
    return mIsNotificationsEnabled;
  }

  public Long getFieldIsPersonal() {
    return mIsPersonal;
  }

  public Boolean getFieldIsPrepayAccount() {
    return mIsPrepayAccount;
  }

  public Boolean getFieldIsTaxIdRequired() {
    return mIsTaxIdRequired;
  }

  public List<Long> getFieldLineNumbers() {
    return mLineNumbers;
  }

  public String getFieldMediaAgency() {
    return mMediaAgency;
  }

  public String getFieldMinCampaignGroupSpendCap() {
    return mMinCampaignGroupSpendCap;
  }

  public Long getFieldMinDailyBudget() {
    return mMinDailyBudget;
  }

  public String getFieldName() {
    return mName;
  }

  public Boolean getFieldOffsitePixelsTosAccepted() {
    return mOffsitePixelsTosAccepted;
  }

  public String getFieldOwner() {
    return mOwner;
  }

  public String getFieldPartner() {
    return mPartner;
  }

  public ReachFrequencySpec getFieldRfSpec() {
    return mRfSpec;
  }

  public Boolean getFieldShowCheckoutExperience() {
    return mShowCheckoutExperience;
  }

  public String getFieldSpendCap() {
    return mSpendCap;
  }

  public String getFieldTaxId() {
    return mTaxId;
  }

  public Long getFieldTaxIdStatus() {
    return mTaxIdStatus;
  }

  public String getFieldTaxIdType() {
    return mTaxIdType;
  }

  public Long getFieldTimezoneId() {
    return mTimezoneId;
  }

  public String getFieldTimezoneName() {
    return mTimezoneName;
  }

  public Double getFieldTimezoneOffsetHoursUtc() {
    return mTimezoneOffsetHoursUtc;
  }

  public Map<String, Long> getFieldTosAccepted() {
    return mTosAccepted;
  }

  public String getFieldUserRole() {
    return mUserRole;
  }

  public Map<String, Long> getFieldUserTosAccepted() {
    return mUserTosAccepted;
  }



  public static class APIRequestGetActivities extends APIRequest<AdActivity> {

    APINodeList<AdActivity> lastResponse = null;
    @Override
    public APINodeList<AdActivity> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "add_children",
      "after",
      "business_id",
      "category",
      "extra_oids",
      "limit",
      "oid",
      "since",
      "uid",
      "until",
    };

    public static final String[] FIELDS = {
      "actor_id",
      "actor_name",
      "application_id",
      "application_name",
      "date_time_in_timezone",
      "event_time",
      "event_type",
      "extra_data",
      "object_id",
      "object_name",
      "object_type",
      "translated_event_type",
    };

    @Override
    public APINodeList<AdActivity> parseResponse(String response, String header) throws APIException {
      return AdActivity.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdActivity> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdActivity> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdActivity>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdActivity>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdActivity>>() {
           public APINodeList<AdActivity> apply(ResponseWrapper result) {
             try {
               return APIRequestGetActivities.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetActivities(String nodeId, APIContext context) {
      super(context, nodeId, "/activities", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetActivities setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetActivities setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetActivities setAddChildren (Boolean addChildren) {
      this.setParam("add_children", addChildren);
      return this;
    }
    public APIRequestGetActivities setAddChildren (String addChildren) {
      this.setParam("add_children", addChildren);
      return this;
    }

    public APIRequestGetActivities setAfter (String after) {
      this.setParam("after", after);
      return this;
    }

    public APIRequestGetActivities setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetActivities setCategory (AdActivity.EnumCategory category) {
      this.setParam("category", category);
      return this;
    }
    public APIRequestGetActivities setCategory (String category) {
      this.setParam("category", category);
      return this;
    }

    public APIRequestGetActivities setExtraOids (List<String> extraOids) {
      this.setParam("extra_oids", extraOids);
      return this;
    }
    public APIRequestGetActivities setExtraOids (String extraOids) {
      this.setParam("extra_oids", extraOids);
      return this;
    }

    public APIRequestGetActivities setLimit (Long limit) {
      this.setParam("limit", limit);
      return this;
    }
    public APIRequestGetActivities setLimit (String limit) {
      this.setParam("limit", limit);
      return this;
    }

    public APIRequestGetActivities setOid (String oid) {
      this.setParam("oid", oid);
      return this;
    }

    public APIRequestGetActivities setSince (String since) {
      this.setParam("since", since);
      return this;
    }

    public APIRequestGetActivities setUid (Long uid) {
      this.setParam("uid", uid);
      return this;
    }
    public APIRequestGetActivities setUid (String uid) {
      this.setParam("uid", uid);
      return this;
    }

    public APIRequestGetActivities setUntil (String until) {
      this.setParam("until", until);
      return this;
    }

    public APIRequestGetActivities requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetActivities requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetActivities requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetActivities requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetActivities requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetActivities requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetActivities requestActorIdField () {
      return this.requestActorIdField(true);
    }
    public APIRequestGetActivities requestActorIdField (boolean value) {
      this.requestField("actor_id", value);
      return this;
    }
    public APIRequestGetActivities requestActorNameField () {
      return this.requestActorNameField(true);
    }
    public APIRequestGetActivities requestActorNameField (boolean value) {
      this.requestField("actor_name", value);
      return this;
    }
    public APIRequestGetActivities requestApplicationIdField () {
      return this.requestApplicationIdField(true);
    }
    public APIRequestGetActivities requestApplicationIdField (boolean value) {
      this.requestField("application_id", value);
      return this;
    }
    public APIRequestGetActivities requestApplicationNameField () {
      return this.requestApplicationNameField(true);
    }
    public APIRequestGetActivities requestApplicationNameField (boolean value) {
      this.requestField("application_name", value);
      return this;
    }
    public APIRequestGetActivities requestDateTimeInTimezoneField () {
      return this.requestDateTimeInTimezoneField(true);
    }
    public APIRequestGetActivities requestDateTimeInTimezoneField (boolean value) {
      this.requestField("date_time_in_timezone", value);
      return this;
    }
    public APIRequestGetActivities requestEventTimeField () {
      return this.requestEventTimeField(true);
    }
    public APIRequestGetActivities requestEventTimeField (boolean value) {
      this.requestField("event_time", value);
      return this;
    }
    public APIRequestGetActivities requestEventTypeField () {
      return this.requestEventTypeField(true);
    }
    public APIRequestGetActivities requestEventTypeField (boolean value) {
      this.requestField("event_type", value);
      return this;
    }
    public APIRequestGetActivities requestExtraDataField () {
      return this.requestExtraDataField(true);
    }
    public APIRequestGetActivities requestExtraDataField (boolean value) {
      this.requestField("extra_data", value);
      return this;
    }
    public APIRequestGetActivities requestObjectIdField () {
      return this.requestObjectIdField(true);
    }
    public APIRequestGetActivities requestObjectIdField (boolean value) {
      this.requestField("object_id", value);
      return this;
    }
    public APIRequestGetActivities requestObjectNameField () {
      return this.requestObjectNameField(true);
    }
    public APIRequestGetActivities requestObjectNameField (boolean value) {
      this.requestField("object_name", value);
      return this;
    }
    public APIRequestGetActivities requestObjectTypeField () {
      return this.requestObjectTypeField(true);
    }
    public APIRequestGetActivities requestObjectTypeField (boolean value) {
      this.requestField("object_type", value);
      return this;
    }
    public APIRequestGetActivities requestTranslatedEventTypeField () {
      return this.requestTranslatedEventTypeField(true);
    }
    public APIRequestGetActivities requestTranslatedEventTypeField (boolean value) {
      this.requestField("translated_event_type", value);
      return this;
    }
  }

  public static class APIRequestGetAdPlacePageSets extends APIRequest<AdPlacePageSet> {

    APINodeList<AdPlacePageSet> lastResponse = null;
    @Override
    public APINodeList<AdPlacePageSet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "id",
      "location_types",
      "name",
      "pages_count",
      "parent_page",
    };

    @Override
    public APINodeList<AdPlacePageSet> parseResponse(String response, String header) throws APIException {
      return AdPlacePageSet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdPlacePageSet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdPlacePageSet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdPlacePageSet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdPlacePageSet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdPlacePageSet>>() {
           public APINodeList<AdPlacePageSet> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdPlacePageSets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdPlacePageSets(String nodeId, APIContext context) {
      super(context, nodeId, "/ad_place_page_sets", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdPlacePageSets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdPlacePageSets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdPlacePageSets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdPlacePageSets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdPlacePageSets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdPlacePageSets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdPlacePageSets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdPlacePageSets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdPlacePageSets requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdPlacePageSets requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdPlacePageSets requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdPlacePageSets requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdPlacePageSets requestLocationTypesField () {
      return this.requestLocationTypesField(true);
    }
    public APIRequestGetAdPlacePageSets requestLocationTypesField (boolean value) {
      this.requestField("location_types", value);
      return this;
    }
    public APIRequestGetAdPlacePageSets requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdPlacePageSets requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdPlacePageSets requestPagesCountField () {
      return this.requestPagesCountField(true);
    }
    public APIRequestGetAdPlacePageSets requestPagesCountField (boolean value) {
      this.requestField("pages_count", value);
      return this;
    }
    public APIRequestGetAdPlacePageSets requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetAdPlacePageSets requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
  }

  public static class APIRequestCreateAdPlacePageSet extends APIRequest<AdPlacePageSet> {

    AdPlacePageSet lastResponse = null;
    @Override
    public AdPlacePageSet getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "location_types",
      "name",
      "parent_page",
      "targeted_area_type",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdPlacePageSet parseResponse(String response, String header) throws APIException {
      return AdPlacePageSet.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdPlacePageSet execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdPlacePageSet execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdPlacePageSet> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdPlacePageSet> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdPlacePageSet>() {
           public AdPlacePageSet apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdPlacePageSet.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdPlacePageSet(String nodeId, APIContext context) {
      super(context, nodeId, "/ad_place_page_sets", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdPlacePageSet setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdPlacePageSet setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdPlacePageSet setLocationTypes (List<AdPlacePageSet.EnumLocationTypes> locationTypes) {
      this.setParam("location_types", locationTypes);
      return this;
    }
    public APIRequestCreateAdPlacePageSet setLocationTypes (String locationTypes) {
      this.setParam("location_types", locationTypes);
      return this;
    }

    public APIRequestCreateAdPlacePageSet setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdPlacePageSet setParentPage (String parentPage) {
      this.setParam("parent_page", parentPage);
      return this;
    }

    public APIRequestCreateAdPlacePageSet setTargetedAreaType (AdPlacePageSet.EnumTargetedAreaType targetedAreaType) {
      this.setParam("targeted_area_type", targetedAreaType);
      return this;
    }
    public APIRequestCreateAdPlacePageSet setTargetedAreaType (String targetedAreaType) {
      this.setParam("targeted_area_type", targetedAreaType);
      return this;
    }

    public APIRequestCreateAdPlacePageSet requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdPlacePageSet requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdPlacePageSet requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdPlacePageSet requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdPlacePageSet requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdPlacePageSet requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateAdSet extends APIRequest<AdSet> {

    AdSet lastResponse = null;
    @Override
    public AdSet getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_keywords",
      "adlabels",
      "adset_schedule",
      "attribution_spec",
      "bid_adjustments",
      "bid_amount",
      "bid_constraints",
      "bid_strategy",
      "billing_event",
      "campaign_id",
      "campaign_spec",
      "creative_sequence",
      "daily_budget",
      "daily_imps",
      "daily_min_spend_target",
      "daily_spend_cap",
      "date_format",
      "destination_type",
      "end_time",
      "execution_options",
      "frequency_control_specs",
      "full_funnel_exploration_mode",
      "is_dynamic_creative",
      "lifetime_budget",
      "lifetime_imps",
      "lifetime_min_spend_target",
      "lifetime_spend_cap",
      "line_number",
      "name",
      "optimization_goal",
      "optimization_sub_event",
      "pacing_type",
      "promoted_object",
      "rb_prediction_id",
      "rf_prediction_id",
      "source_adset_id",
      "start_time",
      "status",
      "targeting",
      "time_based_ad_rotation_id_blocks",
      "time_based_ad_rotation_intervals",
      "time_start",
      "time_stop",
      "topline_id",
      "upstream_events",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdSet parseResponse(String response, String header) throws APIException {
      return AdSet.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdSet execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdSet execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdSet> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdSet> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdSet>() {
           public AdSet apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdSet.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdSet(String nodeId, APIContext context) {
      super(context, nodeId, "/ad_sets", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdSet setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdSet setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdSet setAdKeywords (Object adKeywords) {
      this.setParam("ad_keywords", adKeywords);
      return this;
    }
    public APIRequestCreateAdSet setAdKeywords (String adKeywords) {
      this.setParam("ad_keywords", adKeywords);
      return this;
    }

    public APIRequestCreateAdSet setAdlabels (List<Object> adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }
    public APIRequestCreateAdSet setAdlabels (String adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }

    public APIRequestCreateAdSet setAdsetSchedule (List<Object> adsetSchedule) {
      this.setParam("adset_schedule", adsetSchedule);
      return this;
    }
    public APIRequestCreateAdSet setAdsetSchedule (String adsetSchedule) {
      this.setParam("adset_schedule", adsetSchedule);
      return this;
    }

    public APIRequestCreateAdSet setAttributionSpec (List<Map<String, String>> attributionSpec) {
      this.setParam("attribution_spec", attributionSpec);
      return this;
    }
    public APIRequestCreateAdSet setAttributionSpec (String attributionSpec) {
      this.setParam("attribution_spec", attributionSpec);
      return this;
    }

    public APIRequestCreateAdSet setBidAdjustments (Object bidAdjustments) {
      this.setParam("bid_adjustments", bidAdjustments);
      return this;
    }
    public APIRequestCreateAdSet setBidAdjustments (String bidAdjustments) {
      this.setParam("bid_adjustments", bidAdjustments);
      return this;
    }

    public APIRequestCreateAdSet setBidAmount (Long bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }
    public APIRequestCreateAdSet setBidAmount (String bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }

    public APIRequestCreateAdSet setBidConstraints (Map<String, Object> bidConstraints) {
      this.setParam("bid_constraints", bidConstraints);
      return this;
    }
    public APIRequestCreateAdSet setBidConstraints (String bidConstraints) {
      this.setParam("bid_constraints", bidConstraints);
      return this;
    }

    public APIRequestCreateAdSet setBidStrategy (AdSet.EnumBidStrategy bidStrategy) {
      this.setParam("bid_strategy", bidStrategy);
      return this;
    }
    public APIRequestCreateAdSet setBidStrategy (String bidStrategy) {
      this.setParam("bid_strategy", bidStrategy);
      return this;
    }

    public APIRequestCreateAdSet setBillingEvent (AdSet.EnumBillingEvent billingEvent) {
      this.setParam("billing_event", billingEvent);
      return this;
    }
    public APIRequestCreateAdSet setBillingEvent (String billingEvent) {
      this.setParam("billing_event", billingEvent);
      return this;
    }

    public APIRequestCreateAdSet setCampaignId (String campaignId) {
      this.setParam("campaign_id", campaignId);
      return this;
    }

    public APIRequestCreateAdSet setCampaignSpec (Object campaignSpec) {
      this.setParam("campaign_spec", campaignSpec);
      return this;
    }
    public APIRequestCreateAdSet setCampaignSpec (String campaignSpec) {
      this.setParam("campaign_spec", campaignSpec);
      return this;
    }

    public APIRequestCreateAdSet setCreativeSequence (List<String> creativeSequence) {
      this.setParam("creative_sequence", creativeSequence);
      return this;
    }
    public APIRequestCreateAdSet setCreativeSequence (String creativeSequence) {
      this.setParam("creative_sequence", creativeSequence);
      return this;
    }

    public APIRequestCreateAdSet setDailyBudget (Long dailyBudget) {
      this.setParam("daily_budget", dailyBudget);
      return this;
    }
    public APIRequestCreateAdSet setDailyBudget (String dailyBudget) {
      this.setParam("daily_budget", dailyBudget);
      return this;
    }

    public APIRequestCreateAdSet setDailyImps (Long dailyImps) {
      this.setParam("daily_imps", dailyImps);
      return this;
    }
    public APIRequestCreateAdSet setDailyImps (String dailyImps) {
      this.setParam("daily_imps", dailyImps);
      return this;
    }

    public APIRequestCreateAdSet setDailyMinSpendTarget (Long dailyMinSpendTarget) {
      this.setParam("daily_min_spend_target", dailyMinSpendTarget);
      return this;
    }
    public APIRequestCreateAdSet setDailyMinSpendTarget (String dailyMinSpendTarget) {
      this.setParam("daily_min_spend_target", dailyMinSpendTarget);
      return this;
    }

    public APIRequestCreateAdSet setDailySpendCap (Long dailySpendCap) {
      this.setParam("daily_spend_cap", dailySpendCap);
      return this;
    }
    public APIRequestCreateAdSet setDailySpendCap (String dailySpendCap) {
      this.setParam("daily_spend_cap", dailySpendCap);
      return this;
    }

    public APIRequestCreateAdSet setDateFormat (String dateFormat) {
      this.setParam("date_format", dateFormat);
      return this;
    }

    public APIRequestCreateAdSet setDestinationType (AdSet.EnumDestinationType destinationType) {
      this.setParam("destination_type", destinationType);
      return this;
    }
    public APIRequestCreateAdSet setDestinationType (String destinationType) {
      this.setParam("destination_type", destinationType);
      return this;
    }

    public APIRequestCreateAdSet setEndTime (String endTime) {
      this.setParam("end_time", endTime);
      return this;
    }

    public APIRequestCreateAdSet setExecutionOptions (List<AdSet.EnumExecutionOptions> executionOptions) {
      this.setParam("execution_options", executionOptions);
      return this;
    }
    public APIRequestCreateAdSet setExecutionOptions (String executionOptions) {
      this.setParam("execution_options", executionOptions);
      return this;
    }

    public APIRequestCreateAdSet setFrequencyControlSpecs (List<Object> frequencyControlSpecs) {
      this.setParam("frequency_control_specs", frequencyControlSpecs);
      return this;
    }
    public APIRequestCreateAdSet setFrequencyControlSpecs (String frequencyControlSpecs) {
      this.setParam("frequency_control_specs", frequencyControlSpecs);
      return this;
    }

    public APIRequestCreateAdSet setFullFunnelExplorationMode (AdSet.EnumFullFunnelExplorationMode fullFunnelExplorationMode) {
      this.setParam("full_funnel_exploration_mode", fullFunnelExplorationMode);
      return this;
    }
    public APIRequestCreateAdSet setFullFunnelExplorationMode (String fullFunnelExplorationMode) {
      this.setParam("full_funnel_exploration_mode", fullFunnelExplorationMode);
      return this;
    }

    public APIRequestCreateAdSet setIsDynamicCreative (Boolean isDynamicCreative) {
      this.setParam("is_dynamic_creative", isDynamicCreative);
      return this;
    }
    public APIRequestCreateAdSet setIsDynamicCreative (String isDynamicCreative) {
      this.setParam("is_dynamic_creative", isDynamicCreative);
      return this;
    }

    public APIRequestCreateAdSet setLifetimeBudget (Long lifetimeBudget) {
      this.setParam("lifetime_budget", lifetimeBudget);
      return this;
    }
    public APIRequestCreateAdSet setLifetimeBudget (String lifetimeBudget) {
      this.setParam("lifetime_budget", lifetimeBudget);
      return this;
    }

    public APIRequestCreateAdSet setLifetimeImps (Long lifetimeImps) {
      this.setParam("lifetime_imps", lifetimeImps);
      return this;
    }
    public APIRequestCreateAdSet setLifetimeImps (String lifetimeImps) {
      this.setParam("lifetime_imps", lifetimeImps);
      return this;
    }

    public APIRequestCreateAdSet setLifetimeMinSpendTarget (Long lifetimeMinSpendTarget) {
      this.setParam("lifetime_min_spend_target", lifetimeMinSpendTarget);
      return this;
    }
    public APIRequestCreateAdSet setLifetimeMinSpendTarget (String lifetimeMinSpendTarget) {
      this.setParam("lifetime_min_spend_target", lifetimeMinSpendTarget);
      return this;
    }

    public APIRequestCreateAdSet setLifetimeSpendCap (Long lifetimeSpendCap) {
      this.setParam("lifetime_spend_cap", lifetimeSpendCap);
      return this;
    }
    public APIRequestCreateAdSet setLifetimeSpendCap (String lifetimeSpendCap) {
      this.setParam("lifetime_spend_cap", lifetimeSpendCap);
      return this;
    }

    public APIRequestCreateAdSet setLineNumber (Long lineNumber) {
      this.setParam("line_number", lineNumber);
      return this;
    }
    public APIRequestCreateAdSet setLineNumber (String lineNumber) {
      this.setParam("line_number", lineNumber);
      return this;
    }

    public APIRequestCreateAdSet setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdSet setOptimizationGoal (AdSet.EnumOptimizationGoal optimizationGoal) {
      this.setParam("optimization_goal", optimizationGoal);
      return this;
    }
    public APIRequestCreateAdSet setOptimizationGoal (String optimizationGoal) {
      this.setParam("optimization_goal", optimizationGoal);
      return this;
    }

    public APIRequestCreateAdSet setOptimizationSubEvent (AdSet.EnumOptimizationSubEvent optimizationSubEvent) {
      this.setParam("optimization_sub_event", optimizationSubEvent);
      return this;
    }
    public APIRequestCreateAdSet setOptimizationSubEvent (String optimizationSubEvent) {
      this.setParam("optimization_sub_event", optimizationSubEvent);
      return this;
    }

    public APIRequestCreateAdSet setPacingType (List<String> pacingType) {
      this.setParam("pacing_type", pacingType);
      return this;
    }
    public APIRequestCreateAdSet setPacingType (String pacingType) {
      this.setParam("pacing_type", pacingType);
      return this;
    }

    public APIRequestCreateAdSet setPromotedObject (Object promotedObject) {
      this.setParam("promoted_object", promotedObject);
      return this;
    }
    public APIRequestCreateAdSet setPromotedObject (String promotedObject) {
      this.setParam("promoted_object", promotedObject);
      return this;
    }

    public APIRequestCreateAdSet setRbPredictionId (String rbPredictionId) {
      this.setParam("rb_prediction_id", rbPredictionId);
      return this;
    }

    public APIRequestCreateAdSet setRfPredictionId (String rfPredictionId) {
      this.setParam("rf_prediction_id", rfPredictionId);
      return this;
    }

    public APIRequestCreateAdSet setSourceAdsetId (String sourceAdsetId) {
      this.setParam("source_adset_id", sourceAdsetId);
      return this;
    }

    public APIRequestCreateAdSet setStartTime (String startTime) {
      this.setParam("start_time", startTime);
      return this;
    }

    public APIRequestCreateAdSet setStatus (AdSet.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestCreateAdSet setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestCreateAdSet setTargeting (Targeting targeting) {
      this.setParam("targeting", targeting);
      return this;
    }
    public APIRequestCreateAdSet setTargeting (String targeting) {
      this.setParam("targeting", targeting);
      return this;
    }

    public APIRequestCreateAdSet setTimeBasedAdRotationIdBlocks (List<List<Long>> timeBasedAdRotationIdBlocks) {
      this.setParam("time_based_ad_rotation_id_blocks", timeBasedAdRotationIdBlocks);
      return this;
    }
    public APIRequestCreateAdSet setTimeBasedAdRotationIdBlocks (String timeBasedAdRotationIdBlocks) {
      this.setParam("time_based_ad_rotation_id_blocks", timeBasedAdRotationIdBlocks);
      return this;
    }

    public APIRequestCreateAdSet setTimeBasedAdRotationIntervals (List<Long> timeBasedAdRotationIntervals) {
      this.setParam("time_based_ad_rotation_intervals", timeBasedAdRotationIntervals);
      return this;
    }
    public APIRequestCreateAdSet setTimeBasedAdRotationIntervals (String timeBasedAdRotationIntervals) {
      this.setParam("time_based_ad_rotation_intervals", timeBasedAdRotationIntervals);
      return this;
    }

    public APIRequestCreateAdSet setTimeStart (String timeStart) {
      this.setParam("time_start", timeStart);
      return this;
    }

    public APIRequestCreateAdSet setTimeStop (String timeStop) {
      this.setParam("time_stop", timeStop);
      return this;
    }

    public APIRequestCreateAdSet setToplineId (String toplineId) {
      this.setParam("topline_id", toplineId);
      return this;
    }

    public APIRequestCreateAdSet setUpstreamEvents (Map<String, String> upstreamEvents) {
      this.setParam("upstream_events", upstreamEvents);
      return this;
    }
    public APIRequestCreateAdSet setUpstreamEvents (String upstreamEvents) {
      this.setParam("upstream_events", upstreamEvents);
      return this;
    }

    public APIRequestCreateAdSet requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdSet requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdSet requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdSet requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdSet requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdSet requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdStudies extends APIRequest<AdStudy> {

    APINodeList<AdStudy> lastResponse = null;
    @Override
    public APINodeList<AdStudy> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "business",
      "canceled_time",
      "cooldown_start_time",
      "created_by",
      "created_time",
      "description",
      "end_time",
      "id",
      "name",
      "observation_end_time",
      "results_first_available_date",
      "start_time",
      "type",
      "updated_by",
      "updated_time",
    };

    @Override
    public APINodeList<AdStudy> parseResponse(String response, String header) throws APIException {
      return AdStudy.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdStudy> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdStudy> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdStudy>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdStudy>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdStudy>>() {
           public APINodeList<AdStudy> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdStudies.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdStudies(String nodeId, APIContext context) {
      super(context, nodeId, "/ad_studies", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdStudies setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdStudies setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdStudies requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdStudies requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdStudies requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdStudies requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdStudies requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdStudies requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdStudies requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAdStudies requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAdStudies requestCanceledTimeField () {
      return this.requestCanceledTimeField(true);
    }
    public APIRequestGetAdStudies requestCanceledTimeField (boolean value) {
      this.requestField("canceled_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestCooldownStartTimeField () {
      return this.requestCooldownStartTimeField(true);
    }
    public APIRequestGetAdStudies requestCooldownStartTimeField (boolean value) {
      this.requestField("cooldown_start_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetAdStudies requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetAdStudies requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdStudies requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAdStudies requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAdStudies requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetAdStudies requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdStudies requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdStudies requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdStudies requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdStudies requestObservationEndTimeField () {
      return this.requestObservationEndTimeField(true);
    }
    public APIRequestGetAdStudies requestObservationEndTimeField (boolean value) {
      this.requestField("observation_end_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestResultsFirstAvailableDateField () {
      return this.requestResultsFirstAvailableDateField(true);
    }
    public APIRequestGetAdStudies requestResultsFirstAvailableDateField (boolean value) {
      this.requestField("results_first_available_date", value);
      return this;
    }
    public APIRequestGetAdStudies requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetAdStudies requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetAdStudies requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetAdStudies requestUpdatedByField () {
      return this.requestUpdatedByField(true);
    }
    public APIRequestGetAdStudies requestUpdatedByField (boolean value) {
      this.requestField("updated_by", value);
      return this;
    }
    public APIRequestGetAdStudies requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdStudies requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestGetAdContracts extends APIRequest<AdContract> {

    APINodeList<AdContract> lastResponse = null;
    @Override
    public APINodeList<AdContract> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "account_mgr_fbid",
      "account_mgr_name",
      "adops_person_name",
      "advertiser_address_fbid",
      "advertiser_fbid",
      "advertiser_name",
      "agency_discount",
      "agency_name",
      "bill_to_address_fbid",
      "bill_to_fbid",
      "campaign_name",
      "created_by",
      "created_date",
      "customer_io",
      "io_number",
      "io_terms",
      "io_type",
      "last_updated_by",
      "last_updated_date",
      "max_end_date",
      "mdc_fbid",
      "media_plan_number",
      "min_start_date",
      "msa_contract",
      "payment_terms",
      "rev_hold_flag",
      "rev_hold_released_by",
      "rev_hold_released_on",
      "salesrep_fbid",
      "salesrep_name",
      "sold_to_address_fbid",
      "sold_to_fbid",
      "status",
      "subvertical",
      "thirdparty_billed",
      "thirdparty_password",
      "thirdparty_uid",
      "thirdparty_url",
      "vat_country",
      "version",
      "vertical",
    };

    @Override
    public APINodeList<AdContract> parseResponse(String response, String header) throws APIException {
      return AdContract.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdContract> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdContract> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdContract>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdContract>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdContract>>() {
           public APINodeList<AdContract> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdContracts.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdContracts(String nodeId, APIContext context) {
      super(context, nodeId, "/adcontracts", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdContracts setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdContracts setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdContracts requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdContracts requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdContracts requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdContracts requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdContracts requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdContracts requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdContracts requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdContracts requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdContracts requestAccountMgrFbidField () {
      return this.requestAccountMgrFbidField(true);
    }
    public APIRequestGetAdContracts requestAccountMgrFbidField (boolean value) {
      this.requestField("account_mgr_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestAccountMgrNameField () {
      return this.requestAccountMgrNameField(true);
    }
    public APIRequestGetAdContracts requestAccountMgrNameField (boolean value) {
      this.requestField("account_mgr_name", value);
      return this;
    }
    public APIRequestGetAdContracts requestAdopsPersonNameField () {
      return this.requestAdopsPersonNameField(true);
    }
    public APIRequestGetAdContracts requestAdopsPersonNameField (boolean value) {
      this.requestField("adops_person_name", value);
      return this;
    }
    public APIRequestGetAdContracts requestAdvertiserAddressFbidField () {
      return this.requestAdvertiserAddressFbidField(true);
    }
    public APIRequestGetAdContracts requestAdvertiserAddressFbidField (boolean value) {
      this.requestField("advertiser_address_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestAdvertiserFbidField () {
      return this.requestAdvertiserFbidField(true);
    }
    public APIRequestGetAdContracts requestAdvertiserFbidField (boolean value) {
      this.requestField("advertiser_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestAdvertiserNameField () {
      return this.requestAdvertiserNameField(true);
    }
    public APIRequestGetAdContracts requestAdvertiserNameField (boolean value) {
      this.requestField("advertiser_name", value);
      return this;
    }
    public APIRequestGetAdContracts requestAgencyDiscountField () {
      return this.requestAgencyDiscountField(true);
    }
    public APIRequestGetAdContracts requestAgencyDiscountField (boolean value) {
      this.requestField("agency_discount", value);
      return this;
    }
    public APIRequestGetAdContracts requestAgencyNameField () {
      return this.requestAgencyNameField(true);
    }
    public APIRequestGetAdContracts requestAgencyNameField (boolean value) {
      this.requestField("agency_name", value);
      return this;
    }
    public APIRequestGetAdContracts requestBillToAddressFbidField () {
      return this.requestBillToAddressFbidField(true);
    }
    public APIRequestGetAdContracts requestBillToAddressFbidField (boolean value) {
      this.requestField("bill_to_address_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestBillToFbidField () {
      return this.requestBillToFbidField(true);
    }
    public APIRequestGetAdContracts requestBillToFbidField (boolean value) {
      this.requestField("bill_to_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestCampaignNameField () {
      return this.requestCampaignNameField(true);
    }
    public APIRequestGetAdContracts requestCampaignNameField (boolean value) {
      this.requestField("campaign_name", value);
      return this;
    }
    public APIRequestGetAdContracts requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetAdContracts requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetAdContracts requestCreatedDateField () {
      return this.requestCreatedDateField(true);
    }
    public APIRequestGetAdContracts requestCreatedDateField (boolean value) {
      this.requestField("created_date", value);
      return this;
    }
    public APIRequestGetAdContracts requestCustomerIoField () {
      return this.requestCustomerIoField(true);
    }
    public APIRequestGetAdContracts requestCustomerIoField (boolean value) {
      this.requestField("customer_io", value);
      return this;
    }
    public APIRequestGetAdContracts requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGetAdContracts requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGetAdContracts requestIoTermsField () {
      return this.requestIoTermsField(true);
    }
    public APIRequestGetAdContracts requestIoTermsField (boolean value) {
      this.requestField("io_terms", value);
      return this;
    }
    public APIRequestGetAdContracts requestIoTypeField () {
      return this.requestIoTypeField(true);
    }
    public APIRequestGetAdContracts requestIoTypeField (boolean value) {
      this.requestField("io_type", value);
      return this;
    }
    public APIRequestGetAdContracts requestLastUpdatedByField () {
      return this.requestLastUpdatedByField(true);
    }
    public APIRequestGetAdContracts requestLastUpdatedByField (boolean value) {
      this.requestField("last_updated_by", value);
      return this;
    }
    public APIRequestGetAdContracts requestLastUpdatedDateField () {
      return this.requestLastUpdatedDateField(true);
    }
    public APIRequestGetAdContracts requestLastUpdatedDateField (boolean value) {
      this.requestField("last_updated_date", value);
      return this;
    }
    public APIRequestGetAdContracts requestMaxEndDateField () {
      return this.requestMaxEndDateField(true);
    }
    public APIRequestGetAdContracts requestMaxEndDateField (boolean value) {
      this.requestField("max_end_date", value);
      return this;
    }
    public APIRequestGetAdContracts requestMdcFbidField () {
      return this.requestMdcFbidField(true);
    }
    public APIRequestGetAdContracts requestMdcFbidField (boolean value) {
      this.requestField("mdc_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestMediaPlanNumberField () {
      return this.requestMediaPlanNumberField(true);
    }
    public APIRequestGetAdContracts requestMediaPlanNumberField (boolean value) {
      this.requestField("media_plan_number", value);
      return this;
    }
    public APIRequestGetAdContracts requestMinStartDateField () {
      return this.requestMinStartDateField(true);
    }
    public APIRequestGetAdContracts requestMinStartDateField (boolean value) {
      this.requestField("min_start_date", value);
      return this;
    }
    public APIRequestGetAdContracts requestMsaContractField () {
      return this.requestMsaContractField(true);
    }
    public APIRequestGetAdContracts requestMsaContractField (boolean value) {
      this.requestField("msa_contract", value);
      return this;
    }
    public APIRequestGetAdContracts requestPaymentTermsField () {
      return this.requestPaymentTermsField(true);
    }
    public APIRequestGetAdContracts requestPaymentTermsField (boolean value) {
      this.requestField("payment_terms", value);
      return this;
    }
    public APIRequestGetAdContracts requestRevHoldFlagField () {
      return this.requestRevHoldFlagField(true);
    }
    public APIRequestGetAdContracts requestRevHoldFlagField (boolean value) {
      this.requestField("rev_hold_flag", value);
      return this;
    }
    public APIRequestGetAdContracts requestRevHoldReleasedByField () {
      return this.requestRevHoldReleasedByField(true);
    }
    public APIRequestGetAdContracts requestRevHoldReleasedByField (boolean value) {
      this.requestField("rev_hold_released_by", value);
      return this;
    }
    public APIRequestGetAdContracts requestRevHoldReleasedOnField () {
      return this.requestRevHoldReleasedOnField(true);
    }
    public APIRequestGetAdContracts requestRevHoldReleasedOnField (boolean value) {
      this.requestField("rev_hold_released_on", value);
      return this;
    }
    public APIRequestGetAdContracts requestSalesrepFbidField () {
      return this.requestSalesrepFbidField(true);
    }
    public APIRequestGetAdContracts requestSalesrepFbidField (boolean value) {
      this.requestField("salesrep_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestSalesrepNameField () {
      return this.requestSalesrepNameField(true);
    }
    public APIRequestGetAdContracts requestSalesrepNameField (boolean value) {
      this.requestField("salesrep_name", value);
      return this;
    }
    public APIRequestGetAdContracts requestSoldToAddressFbidField () {
      return this.requestSoldToAddressFbidField(true);
    }
    public APIRequestGetAdContracts requestSoldToAddressFbidField (boolean value) {
      this.requestField("sold_to_address_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestSoldToFbidField () {
      return this.requestSoldToFbidField(true);
    }
    public APIRequestGetAdContracts requestSoldToFbidField (boolean value) {
      this.requestField("sold_to_fbid", value);
      return this;
    }
    public APIRequestGetAdContracts requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdContracts requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdContracts requestSubverticalField () {
      return this.requestSubverticalField(true);
    }
    public APIRequestGetAdContracts requestSubverticalField (boolean value) {
      this.requestField("subvertical", value);
      return this;
    }
    public APIRequestGetAdContracts requestThirdpartyBilledField () {
      return this.requestThirdpartyBilledField(true);
    }
    public APIRequestGetAdContracts requestThirdpartyBilledField (boolean value) {
      this.requestField("thirdparty_billed", value);
      return this;
    }
    public APIRequestGetAdContracts requestThirdpartyPasswordField () {
      return this.requestThirdpartyPasswordField(true);
    }
    public APIRequestGetAdContracts requestThirdpartyPasswordField (boolean value) {
      this.requestField("thirdparty_password", value);
      return this;
    }
    public APIRequestGetAdContracts requestThirdpartyUidField () {
      return this.requestThirdpartyUidField(true);
    }
    public APIRequestGetAdContracts requestThirdpartyUidField (boolean value) {
      this.requestField("thirdparty_uid", value);
      return this;
    }
    public APIRequestGetAdContracts requestThirdpartyUrlField () {
      return this.requestThirdpartyUrlField(true);
    }
    public APIRequestGetAdContracts requestThirdpartyUrlField (boolean value) {
      this.requestField("thirdparty_url", value);
      return this;
    }
    public APIRequestGetAdContracts requestVatCountryField () {
      return this.requestVatCountryField(true);
    }
    public APIRequestGetAdContracts requestVatCountryField (boolean value) {
      this.requestField("vat_country", value);
      return this;
    }
    public APIRequestGetAdContracts requestVersionField () {
      return this.requestVersionField(true);
    }
    public APIRequestGetAdContracts requestVersionField (boolean value) {
      this.requestField("version", value);
      return this;
    }
    public APIRequestGetAdContracts requestVerticalField () {
      return this.requestVerticalField(true);
    }
    public APIRequestGetAdContracts requestVerticalField (boolean value) {
      this.requestField("vertical", value);
      return this;
    }
  }

  public static class APIRequestGetAdCreatives extends APIRequest<AdCreative> {

    APINodeList<AdCreative> lastResponse = null;
    @Override
    public APINodeList<AdCreative> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "actor_id",
      "adlabels",
      "applink_treatment",
      "asset_feed_spec",
      "authorization_category",
      "auto_update",
      "body",
      "branded_content_sponsor_page_id",
      "bundle_folder_id",
      "call_to_action_type",
      "categorization_criteria",
      "category_media_source",
      "destination_set_id",
      "dynamic_ad_voice",
      "effective_authorization_category",
      "effective_instagram_story_id",
      "effective_object_story_id",
      "enable_direct_install",
      "enable_launch_instant_app",
      "id",
      "image_crops",
      "image_hash",
      "image_url",
      "instagram_actor_id",
      "instagram_permalink_url",
      "instagram_story_id",
      "interactive_components_spec",
      "link_deep_link_url",
      "link_og_id",
      "link_url",
      "messenger_sponsored_message",
      "name",
      "object_id",
      "object_store_url",
      "object_story_id",
      "object_story_spec",
      "object_type",
      "object_url",
      "place_page_set_id",
      "platform_customizations",
      "playable_asset_id",
      "portrait_customizations",
      "product_set_id",
      "recommender_settings",
      "status",
      "template_url",
      "template_url_spec",
      "thumbnail_url",
      "title",
      "url_tags",
      "use_page_actor_override",
      "video_id",
    };

    @Override
    public APINodeList<AdCreative> parseResponse(String response, String header) throws APIException {
      return AdCreative.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdCreative> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdCreative> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdCreative>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdCreative>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdCreative>>() {
           public APINodeList<AdCreative> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdCreatives.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdCreatives(String nodeId, APIContext context) {
      super(context, nodeId, "/adcreatives", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdCreatives setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdCreatives setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdCreatives requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdCreatives requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdCreatives requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdCreatives requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdCreatives requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdCreatives requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdCreatives requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdCreatives requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestActorIdField () {
      return this.requestActorIdField(true);
    }
    public APIRequestGetAdCreatives requestActorIdField (boolean value) {
      this.requestField("actor_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetAdCreatives requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetAdCreatives requestApplinkTreatmentField () {
      return this.requestApplinkTreatmentField(true);
    }
    public APIRequestGetAdCreatives requestApplinkTreatmentField (boolean value) {
      this.requestField("applink_treatment", value);
      return this;
    }
    public APIRequestGetAdCreatives requestAssetFeedSpecField () {
      return this.requestAssetFeedSpecField(true);
    }
    public APIRequestGetAdCreatives requestAssetFeedSpecField (boolean value) {
      this.requestField("asset_feed_spec", value);
      return this;
    }
    public APIRequestGetAdCreatives requestAuthorizationCategoryField () {
      return this.requestAuthorizationCategoryField(true);
    }
    public APIRequestGetAdCreatives requestAuthorizationCategoryField (boolean value) {
      this.requestField("authorization_category", value);
      return this;
    }
    public APIRequestGetAdCreatives requestAutoUpdateField () {
      return this.requestAutoUpdateField(true);
    }
    public APIRequestGetAdCreatives requestAutoUpdateField (boolean value) {
      this.requestField("auto_update", value);
      return this;
    }
    public APIRequestGetAdCreatives requestBodyField () {
      return this.requestBodyField(true);
    }
    public APIRequestGetAdCreatives requestBodyField (boolean value) {
      this.requestField("body", value);
      return this;
    }
    public APIRequestGetAdCreatives requestBrandedContentSponsorPageIdField () {
      return this.requestBrandedContentSponsorPageIdField(true);
    }
    public APIRequestGetAdCreatives requestBrandedContentSponsorPageIdField (boolean value) {
      this.requestField("branded_content_sponsor_page_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestBundleFolderIdField () {
      return this.requestBundleFolderIdField(true);
    }
    public APIRequestGetAdCreatives requestBundleFolderIdField (boolean value) {
      this.requestField("bundle_folder_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestCallToActionTypeField () {
      return this.requestCallToActionTypeField(true);
    }
    public APIRequestGetAdCreatives requestCallToActionTypeField (boolean value) {
      this.requestField("call_to_action_type", value);
      return this;
    }
    public APIRequestGetAdCreatives requestCategorizationCriteriaField () {
      return this.requestCategorizationCriteriaField(true);
    }
    public APIRequestGetAdCreatives requestCategorizationCriteriaField (boolean value) {
      this.requestField("categorization_criteria", value);
      return this;
    }
    public APIRequestGetAdCreatives requestCategoryMediaSourceField () {
      return this.requestCategoryMediaSourceField(true);
    }
    public APIRequestGetAdCreatives requestCategoryMediaSourceField (boolean value) {
      this.requestField("category_media_source", value);
      return this;
    }
    public APIRequestGetAdCreatives requestDestinationSetIdField () {
      return this.requestDestinationSetIdField(true);
    }
    public APIRequestGetAdCreatives requestDestinationSetIdField (boolean value) {
      this.requestField("destination_set_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestDynamicAdVoiceField () {
      return this.requestDynamicAdVoiceField(true);
    }
    public APIRequestGetAdCreatives requestDynamicAdVoiceField (boolean value) {
      this.requestField("dynamic_ad_voice", value);
      return this;
    }
    public APIRequestGetAdCreatives requestEffectiveAuthorizationCategoryField () {
      return this.requestEffectiveAuthorizationCategoryField(true);
    }
    public APIRequestGetAdCreatives requestEffectiveAuthorizationCategoryField (boolean value) {
      this.requestField("effective_authorization_category", value);
      return this;
    }
    public APIRequestGetAdCreatives requestEffectiveInstagramStoryIdField () {
      return this.requestEffectiveInstagramStoryIdField(true);
    }
    public APIRequestGetAdCreatives requestEffectiveInstagramStoryIdField (boolean value) {
      this.requestField("effective_instagram_story_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestEffectiveObjectStoryIdField () {
      return this.requestEffectiveObjectStoryIdField(true);
    }
    public APIRequestGetAdCreatives requestEffectiveObjectStoryIdField (boolean value) {
      this.requestField("effective_object_story_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestEnableDirectInstallField () {
      return this.requestEnableDirectInstallField(true);
    }
    public APIRequestGetAdCreatives requestEnableDirectInstallField (boolean value) {
      this.requestField("enable_direct_install", value);
      return this;
    }
    public APIRequestGetAdCreatives requestEnableLaunchInstantAppField () {
      return this.requestEnableLaunchInstantAppField(true);
    }
    public APIRequestGetAdCreatives requestEnableLaunchInstantAppField (boolean value) {
      this.requestField("enable_launch_instant_app", value);
      return this;
    }
    public APIRequestGetAdCreatives requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdCreatives requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestImageCropsField () {
      return this.requestImageCropsField(true);
    }
    public APIRequestGetAdCreatives requestImageCropsField (boolean value) {
      this.requestField("image_crops", value);
      return this;
    }
    public APIRequestGetAdCreatives requestImageHashField () {
      return this.requestImageHashField(true);
    }
    public APIRequestGetAdCreatives requestImageHashField (boolean value) {
      this.requestField("image_hash", value);
      return this;
    }
    public APIRequestGetAdCreatives requestImageUrlField () {
      return this.requestImageUrlField(true);
    }
    public APIRequestGetAdCreatives requestImageUrlField (boolean value) {
      this.requestField("image_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestInstagramActorIdField () {
      return this.requestInstagramActorIdField(true);
    }
    public APIRequestGetAdCreatives requestInstagramActorIdField (boolean value) {
      this.requestField("instagram_actor_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestInstagramPermalinkUrlField () {
      return this.requestInstagramPermalinkUrlField(true);
    }
    public APIRequestGetAdCreatives requestInstagramPermalinkUrlField (boolean value) {
      this.requestField("instagram_permalink_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestInstagramStoryIdField () {
      return this.requestInstagramStoryIdField(true);
    }
    public APIRequestGetAdCreatives requestInstagramStoryIdField (boolean value) {
      this.requestField("instagram_story_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestInteractiveComponentsSpecField () {
      return this.requestInteractiveComponentsSpecField(true);
    }
    public APIRequestGetAdCreatives requestInteractiveComponentsSpecField (boolean value) {
      this.requestField("interactive_components_spec", value);
      return this;
    }
    public APIRequestGetAdCreatives requestLinkDeepLinkUrlField () {
      return this.requestLinkDeepLinkUrlField(true);
    }
    public APIRequestGetAdCreatives requestLinkDeepLinkUrlField (boolean value) {
      this.requestField("link_deep_link_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestLinkOgIdField () {
      return this.requestLinkOgIdField(true);
    }
    public APIRequestGetAdCreatives requestLinkOgIdField (boolean value) {
      this.requestField("link_og_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestLinkUrlField () {
      return this.requestLinkUrlField(true);
    }
    public APIRequestGetAdCreatives requestLinkUrlField (boolean value) {
      this.requestField("link_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestMessengerSponsoredMessageField () {
      return this.requestMessengerSponsoredMessageField(true);
    }
    public APIRequestGetAdCreatives requestMessengerSponsoredMessageField (boolean value) {
      this.requestField("messenger_sponsored_message", value);
      return this;
    }
    public APIRequestGetAdCreatives requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdCreatives requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdCreatives requestObjectIdField () {
      return this.requestObjectIdField(true);
    }
    public APIRequestGetAdCreatives requestObjectIdField (boolean value) {
      this.requestField("object_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestObjectStoreUrlField () {
      return this.requestObjectStoreUrlField(true);
    }
    public APIRequestGetAdCreatives requestObjectStoreUrlField (boolean value) {
      this.requestField("object_store_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestObjectStoryIdField () {
      return this.requestObjectStoryIdField(true);
    }
    public APIRequestGetAdCreatives requestObjectStoryIdField (boolean value) {
      this.requestField("object_story_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestObjectStorySpecField () {
      return this.requestObjectStorySpecField(true);
    }
    public APIRequestGetAdCreatives requestObjectStorySpecField (boolean value) {
      this.requestField("object_story_spec", value);
      return this;
    }
    public APIRequestGetAdCreatives requestObjectTypeField () {
      return this.requestObjectTypeField(true);
    }
    public APIRequestGetAdCreatives requestObjectTypeField (boolean value) {
      this.requestField("object_type", value);
      return this;
    }
    public APIRequestGetAdCreatives requestObjectUrlField () {
      return this.requestObjectUrlField(true);
    }
    public APIRequestGetAdCreatives requestObjectUrlField (boolean value) {
      this.requestField("object_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestPlacePageSetIdField () {
      return this.requestPlacePageSetIdField(true);
    }
    public APIRequestGetAdCreatives requestPlacePageSetIdField (boolean value) {
      this.requestField("place_page_set_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestPlatformCustomizationsField () {
      return this.requestPlatformCustomizationsField(true);
    }
    public APIRequestGetAdCreatives requestPlatformCustomizationsField (boolean value) {
      this.requestField("platform_customizations", value);
      return this;
    }
    public APIRequestGetAdCreatives requestPlayableAssetIdField () {
      return this.requestPlayableAssetIdField(true);
    }
    public APIRequestGetAdCreatives requestPlayableAssetIdField (boolean value) {
      this.requestField("playable_asset_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestPortraitCustomizationsField () {
      return this.requestPortraitCustomizationsField(true);
    }
    public APIRequestGetAdCreatives requestPortraitCustomizationsField (boolean value) {
      this.requestField("portrait_customizations", value);
      return this;
    }
    public APIRequestGetAdCreatives requestProductSetIdField () {
      return this.requestProductSetIdField(true);
    }
    public APIRequestGetAdCreatives requestProductSetIdField (boolean value) {
      this.requestField("product_set_id", value);
      return this;
    }
    public APIRequestGetAdCreatives requestRecommenderSettingsField () {
      return this.requestRecommenderSettingsField(true);
    }
    public APIRequestGetAdCreatives requestRecommenderSettingsField (boolean value) {
      this.requestField("recommender_settings", value);
      return this;
    }
    public APIRequestGetAdCreatives requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdCreatives requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdCreatives requestTemplateUrlField () {
      return this.requestTemplateUrlField(true);
    }
    public APIRequestGetAdCreatives requestTemplateUrlField (boolean value) {
      this.requestField("template_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestTemplateUrlSpecField () {
      return this.requestTemplateUrlSpecField(true);
    }
    public APIRequestGetAdCreatives requestTemplateUrlSpecField (boolean value) {
      this.requestField("template_url_spec", value);
      return this;
    }
    public APIRequestGetAdCreatives requestThumbnailUrlField () {
      return this.requestThumbnailUrlField(true);
    }
    public APIRequestGetAdCreatives requestThumbnailUrlField (boolean value) {
      this.requestField("thumbnail_url", value);
      return this;
    }
    public APIRequestGetAdCreatives requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGetAdCreatives requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGetAdCreatives requestUrlTagsField () {
      return this.requestUrlTagsField(true);
    }
    public APIRequestGetAdCreatives requestUrlTagsField (boolean value) {
      this.requestField("url_tags", value);
      return this;
    }
    public APIRequestGetAdCreatives requestUsePageActorOverrideField () {
      return this.requestUsePageActorOverrideField(true);
    }
    public APIRequestGetAdCreatives requestUsePageActorOverrideField (boolean value) {
      this.requestField("use_page_actor_override", value);
      return this;
    }
    public APIRequestGetAdCreatives requestVideoIdField () {
      return this.requestVideoIdField(true);
    }
    public APIRequestGetAdCreatives requestVideoIdField (boolean value) {
      this.requestField("video_id", value);
      return this;
    }
  }

  public static class APIRequestCreateAdCreative extends APIRequest<AdCreative> {

    AdCreative lastResponse = null;
    @Override
    public AdCreative getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "actor_id",
      "adlabels",
      "applink_treatment",
      "asset_feed_spec",
      "authorization_category",
      "body",
      "branded_content_sponsor_page_id",
      "bundle_folder_id",
      "call_to_action",
      "categorization_criteria",
      "category_media_source",
      "destination_set_id",
      "dynamic_ad_voice",
      "enable_launch_instant_app",
      "image_crops",
      "image_file",
      "image_hash",
      "image_url",
      "instagram_actor_id",
      "instagram_permalink_url",
      "interactive_components_spec",
      "is_dco_internal",
      "link_og_id",
      "link_url",
      "messenger_sponsored_message",
      "name",
      "object_id",
      "object_story_id",
      "object_story_spec",
      "object_type",
      "object_url",
      "platform_customizations",
      "playable_asset_id",
      "portrait_customizations",
      "product_set_id",
      "recommender_settings",
      "template_url",
      "template_url_spec",
      "thumbnail_url",
      "title",
      "url_tags",
      "use_page_actor_override",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdCreative parseResponse(String response, String header) throws APIException {
      return AdCreative.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdCreative execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdCreative execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdCreative> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdCreative> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdCreative>() {
           public AdCreative apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdCreative.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdCreative(String nodeId, APIContext context) {
      super(context, nodeId, "/adcreatives", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdCreative setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdCreative setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdCreative setActorId (Long actorId) {
      this.setParam("actor_id", actorId);
      return this;
    }
    public APIRequestCreateAdCreative setActorId (String actorId) {
      this.setParam("actor_id", actorId);
      return this;
    }

    public APIRequestCreateAdCreative setAdlabels (List<Object> adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }
    public APIRequestCreateAdCreative setAdlabels (String adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }

    public APIRequestCreateAdCreative setApplinkTreatment (AdCreative.EnumApplinkTreatment applinkTreatment) {
      this.setParam("applink_treatment", applinkTreatment);
      return this;
    }
    public APIRequestCreateAdCreative setApplinkTreatment (String applinkTreatment) {
      this.setParam("applink_treatment", applinkTreatment);
      return this;
    }

    public APIRequestCreateAdCreative setAssetFeedSpec (Object assetFeedSpec) {
      this.setParam("asset_feed_spec", assetFeedSpec);
      return this;
    }
    public APIRequestCreateAdCreative setAssetFeedSpec (String assetFeedSpec) {
      this.setParam("asset_feed_spec", assetFeedSpec);
      return this;
    }

    public APIRequestCreateAdCreative setAuthorizationCategory (AdCreative.EnumAuthorizationCategory authorizationCategory) {
      this.setParam("authorization_category", authorizationCategory);
      return this;
    }
    public APIRequestCreateAdCreative setAuthorizationCategory (String authorizationCategory) {
      this.setParam("authorization_category", authorizationCategory);
      return this;
    }

    public APIRequestCreateAdCreative setBody (String body) {
      this.setParam("body", body);
      return this;
    }

    public APIRequestCreateAdCreative setBrandedContentSponsorPageId (String brandedContentSponsorPageId) {
      this.setParam("branded_content_sponsor_page_id", brandedContentSponsorPageId);
      return this;
    }

    public APIRequestCreateAdCreative setBundleFolderId (String bundleFolderId) {
      this.setParam("bundle_folder_id", bundleFolderId);
      return this;
    }

    public APIRequestCreateAdCreative setCallToAction (Object callToAction) {
      this.setParam("call_to_action", callToAction);
      return this;
    }
    public APIRequestCreateAdCreative setCallToAction (String callToAction) {
      this.setParam("call_to_action", callToAction);
      return this;
    }

    public APIRequestCreateAdCreative setCategorizationCriteria (AdCreative.EnumCategorizationCriteria categorizationCriteria) {
      this.setParam("categorization_criteria", categorizationCriteria);
      return this;
    }
    public APIRequestCreateAdCreative setCategorizationCriteria (String categorizationCriteria) {
      this.setParam("categorization_criteria", categorizationCriteria);
      return this;
    }

    public APIRequestCreateAdCreative setCategoryMediaSource (AdCreative.EnumCategoryMediaSource categoryMediaSource) {
      this.setParam("category_media_source", categoryMediaSource);
      return this;
    }
    public APIRequestCreateAdCreative setCategoryMediaSource (String categoryMediaSource) {
      this.setParam("category_media_source", categoryMediaSource);
      return this;
    }

    public APIRequestCreateAdCreative setDestinationSetId (String destinationSetId) {
      this.setParam("destination_set_id", destinationSetId);
      return this;
    }

    public APIRequestCreateAdCreative setDynamicAdVoice (AdCreative.EnumDynamicAdVoice dynamicAdVoice) {
      this.setParam("dynamic_ad_voice", dynamicAdVoice);
      return this;
    }
    public APIRequestCreateAdCreative setDynamicAdVoice (String dynamicAdVoice) {
      this.setParam("dynamic_ad_voice", dynamicAdVoice);
      return this;
    }

    public APIRequestCreateAdCreative setEnableLaunchInstantApp (Boolean enableLaunchInstantApp) {
      this.setParam("enable_launch_instant_app", enableLaunchInstantApp);
      return this;
    }
    public APIRequestCreateAdCreative setEnableLaunchInstantApp (String enableLaunchInstantApp) {
      this.setParam("enable_launch_instant_app", enableLaunchInstantApp);
      return this;
    }

    public APIRequestCreateAdCreative setImageCrops (Map<String, String> imageCrops) {
      this.setParam("image_crops", imageCrops);
      return this;
    }
    public APIRequestCreateAdCreative setImageCrops (String imageCrops) {
      this.setParam("image_crops", imageCrops);
      return this;
    }

    public APIRequestCreateAdCreative setImageFile (String imageFile) {
      this.setParam("image_file", imageFile);
      return this;
    }

    public APIRequestCreateAdCreative setImageHash (String imageHash) {
      this.setParam("image_hash", imageHash);
      return this;
    }

    public APIRequestCreateAdCreative setImageUrl (String imageUrl) {
      this.setParam("image_url", imageUrl);
      return this;
    }

    public APIRequestCreateAdCreative setInstagramActorId (String instagramActorId) {
      this.setParam("instagram_actor_id", instagramActorId);
      return this;
    }

    public APIRequestCreateAdCreative setInstagramPermalinkUrl (String instagramPermalinkUrl) {
      this.setParam("instagram_permalink_url", instagramPermalinkUrl);
      return this;
    }

    public APIRequestCreateAdCreative setInteractiveComponentsSpec (Map<String, String> interactiveComponentsSpec) {
      this.setParam("interactive_components_spec", interactiveComponentsSpec);
      return this;
    }
    public APIRequestCreateAdCreative setInteractiveComponentsSpec (String interactiveComponentsSpec) {
      this.setParam("interactive_components_spec", interactiveComponentsSpec);
      return this;
    }

    public APIRequestCreateAdCreative setIsDcoInternal (Boolean isDcoInternal) {
      this.setParam("is_dco_internal", isDcoInternal);
      return this;
    }
    public APIRequestCreateAdCreative setIsDcoInternal (String isDcoInternal) {
      this.setParam("is_dco_internal", isDcoInternal);
      return this;
    }

    public APIRequestCreateAdCreative setLinkOgId (String linkOgId) {
      this.setParam("link_og_id", linkOgId);
      return this;
    }

    public APIRequestCreateAdCreative setLinkUrl (String linkUrl) {
      this.setParam("link_url", linkUrl);
      return this;
    }

    public APIRequestCreateAdCreative setMessengerSponsoredMessage (String messengerSponsoredMessage) {
      this.setParam("messenger_sponsored_message", messengerSponsoredMessage);
      return this;
    }

    public APIRequestCreateAdCreative setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdCreative setObjectId (Long objectId) {
      this.setParam("object_id", objectId);
      return this;
    }
    public APIRequestCreateAdCreative setObjectId (String objectId) {
      this.setParam("object_id", objectId);
      return this;
    }

    public APIRequestCreateAdCreative setObjectStoryId (String objectStoryId) {
      this.setParam("object_story_id", objectStoryId);
      return this;
    }

    public APIRequestCreateAdCreative setObjectStorySpec (AdCreativeObjectStorySpec objectStorySpec) {
      this.setParam("object_story_spec", objectStorySpec);
      return this;
    }
    public APIRequestCreateAdCreative setObjectStorySpec (String objectStorySpec) {
      this.setParam("object_story_spec", objectStorySpec);
      return this;
    }

    public APIRequestCreateAdCreative setObjectType (String objectType) {
      this.setParam("object_type", objectType);
      return this;
    }

    public APIRequestCreateAdCreative setObjectUrl (String objectUrl) {
      this.setParam("object_url", objectUrl);
      return this;
    }

    public APIRequestCreateAdCreative setPlatformCustomizations (Object platformCustomizations) {
      this.setParam("platform_customizations", platformCustomizations);
      return this;
    }
    public APIRequestCreateAdCreative setPlatformCustomizations (String platformCustomizations) {
      this.setParam("platform_customizations", platformCustomizations);
      return this;
    }

    public APIRequestCreateAdCreative setPlayableAssetId (String playableAssetId) {
      this.setParam("playable_asset_id", playableAssetId);
      return this;
    }

    public APIRequestCreateAdCreative setPortraitCustomizations (Map<String, String> portraitCustomizations) {
      this.setParam("portrait_customizations", portraitCustomizations);
      return this;
    }
    public APIRequestCreateAdCreative setPortraitCustomizations (String portraitCustomizations) {
      this.setParam("portrait_customizations", portraitCustomizations);
      return this;
    }

    public APIRequestCreateAdCreative setProductSetId (String productSetId) {
      this.setParam("product_set_id", productSetId);
      return this;
    }

    public APIRequestCreateAdCreative setRecommenderSettings (Map<String, String> recommenderSettings) {
      this.setParam("recommender_settings", recommenderSettings);
      return this;
    }
    public APIRequestCreateAdCreative setRecommenderSettings (String recommenderSettings) {
      this.setParam("recommender_settings", recommenderSettings);
      return this;
    }

    public APIRequestCreateAdCreative setTemplateUrl (String templateUrl) {
      this.setParam("template_url", templateUrl);
      return this;
    }

    public APIRequestCreateAdCreative setTemplateUrlSpec (Object templateUrlSpec) {
      this.setParam("template_url_spec", templateUrlSpec);
      return this;
    }
    public APIRequestCreateAdCreative setTemplateUrlSpec (String templateUrlSpec) {
      this.setParam("template_url_spec", templateUrlSpec);
      return this;
    }

    public APIRequestCreateAdCreative setThumbnailUrl (String thumbnailUrl) {
      this.setParam("thumbnail_url", thumbnailUrl);
      return this;
    }

    public APIRequestCreateAdCreative setTitle (String title) {
      this.setParam("title", title);
      return this;
    }

    public APIRequestCreateAdCreative setUrlTags (String urlTags) {
      this.setParam("url_tags", urlTags);
      return this;
    }

    public APIRequestCreateAdCreative setUsePageActorOverride (Boolean usePageActorOverride) {
      this.setParam("use_page_actor_override", usePageActorOverride);
      return this;
    }
    public APIRequestCreateAdCreative setUsePageActorOverride (String usePageActorOverride) {
      this.setParam("use_page_actor_override", usePageActorOverride);
      return this;
    }

    public APIRequestCreateAdCreative requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdCreative requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdCreative requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdCreative requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdCreative requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdCreative requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdCreativesByLabels extends APIRequest<AdCreative> {

    APINodeList<AdCreative> lastResponse = null;
    @Override
    public APINodeList<AdCreative> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_label_ids",
      "operator",
    };

    public static final String[] FIELDS = {
      "account_id",
      "actor_id",
      "adlabels",
      "applink_treatment",
      "asset_feed_spec",
      "authorization_category",
      "auto_update",
      "body",
      "branded_content_sponsor_page_id",
      "bundle_folder_id",
      "call_to_action_type",
      "categorization_criteria",
      "category_media_source",
      "destination_set_id",
      "dynamic_ad_voice",
      "effective_authorization_category",
      "effective_instagram_story_id",
      "effective_object_story_id",
      "enable_direct_install",
      "enable_launch_instant_app",
      "id",
      "image_crops",
      "image_hash",
      "image_url",
      "instagram_actor_id",
      "instagram_permalink_url",
      "instagram_story_id",
      "interactive_components_spec",
      "link_deep_link_url",
      "link_og_id",
      "link_url",
      "messenger_sponsored_message",
      "name",
      "object_id",
      "object_store_url",
      "object_story_id",
      "object_story_spec",
      "object_type",
      "object_url",
      "place_page_set_id",
      "platform_customizations",
      "playable_asset_id",
      "portrait_customizations",
      "product_set_id",
      "recommender_settings",
      "status",
      "template_url",
      "template_url_spec",
      "thumbnail_url",
      "title",
      "url_tags",
      "use_page_actor_override",
      "video_id",
    };

    @Override
    public APINodeList<AdCreative> parseResponse(String response, String header) throws APIException {
      return AdCreative.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdCreative> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdCreative> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdCreative>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdCreative>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdCreative>>() {
           public APINodeList<AdCreative> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdCreativesByLabels.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdCreativesByLabels(String nodeId, APIContext context) {
      super(context, nodeId, "/adcreativesbylabels", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdCreativesByLabels setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdCreativesByLabels setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdCreativesByLabels setAdLabelIds (List<String> adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }
    public APIRequestGetAdCreativesByLabels setAdLabelIds (String adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }

    public APIRequestGetAdCreativesByLabels setOperator (AdCreative.EnumOperator operator) {
      this.setParam("operator", operator);
      return this;
    }
    public APIRequestGetAdCreativesByLabels setOperator (String operator) {
      this.setParam("operator", operator);
      return this;
    }

    public APIRequestGetAdCreativesByLabels requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdCreativesByLabels requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdCreativesByLabels requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdCreativesByLabels requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdCreativesByLabels requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdCreativesByLabels requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdCreativesByLabels requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestActorIdField () {
      return this.requestActorIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestActorIdField (boolean value) {
      this.requestField("actor_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetAdCreativesByLabels requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestApplinkTreatmentField () {
      return this.requestApplinkTreatmentField(true);
    }
    public APIRequestGetAdCreativesByLabels requestApplinkTreatmentField (boolean value) {
      this.requestField("applink_treatment", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestAssetFeedSpecField () {
      return this.requestAssetFeedSpecField(true);
    }
    public APIRequestGetAdCreativesByLabels requestAssetFeedSpecField (boolean value) {
      this.requestField("asset_feed_spec", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestAuthorizationCategoryField () {
      return this.requestAuthorizationCategoryField(true);
    }
    public APIRequestGetAdCreativesByLabels requestAuthorizationCategoryField (boolean value) {
      this.requestField("authorization_category", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestAutoUpdateField () {
      return this.requestAutoUpdateField(true);
    }
    public APIRequestGetAdCreativesByLabels requestAutoUpdateField (boolean value) {
      this.requestField("auto_update", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestBodyField () {
      return this.requestBodyField(true);
    }
    public APIRequestGetAdCreativesByLabels requestBodyField (boolean value) {
      this.requestField("body", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestBrandedContentSponsorPageIdField () {
      return this.requestBrandedContentSponsorPageIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestBrandedContentSponsorPageIdField (boolean value) {
      this.requestField("branded_content_sponsor_page_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestBundleFolderIdField () {
      return this.requestBundleFolderIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestBundleFolderIdField (boolean value) {
      this.requestField("bundle_folder_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestCallToActionTypeField () {
      return this.requestCallToActionTypeField(true);
    }
    public APIRequestGetAdCreativesByLabels requestCallToActionTypeField (boolean value) {
      this.requestField("call_to_action_type", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestCategorizationCriteriaField () {
      return this.requestCategorizationCriteriaField(true);
    }
    public APIRequestGetAdCreativesByLabels requestCategorizationCriteriaField (boolean value) {
      this.requestField("categorization_criteria", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestCategoryMediaSourceField () {
      return this.requestCategoryMediaSourceField(true);
    }
    public APIRequestGetAdCreativesByLabels requestCategoryMediaSourceField (boolean value) {
      this.requestField("category_media_source", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestDestinationSetIdField () {
      return this.requestDestinationSetIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestDestinationSetIdField (boolean value) {
      this.requestField("destination_set_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestDynamicAdVoiceField () {
      return this.requestDynamicAdVoiceField(true);
    }
    public APIRequestGetAdCreativesByLabels requestDynamicAdVoiceField (boolean value) {
      this.requestField("dynamic_ad_voice", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestEffectiveAuthorizationCategoryField () {
      return this.requestEffectiveAuthorizationCategoryField(true);
    }
    public APIRequestGetAdCreativesByLabels requestEffectiveAuthorizationCategoryField (boolean value) {
      this.requestField("effective_authorization_category", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestEffectiveInstagramStoryIdField () {
      return this.requestEffectiveInstagramStoryIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestEffectiveInstagramStoryIdField (boolean value) {
      this.requestField("effective_instagram_story_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestEffectiveObjectStoryIdField () {
      return this.requestEffectiveObjectStoryIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestEffectiveObjectStoryIdField (boolean value) {
      this.requestField("effective_object_story_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestEnableDirectInstallField () {
      return this.requestEnableDirectInstallField(true);
    }
    public APIRequestGetAdCreativesByLabels requestEnableDirectInstallField (boolean value) {
      this.requestField("enable_direct_install", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestEnableLaunchInstantAppField () {
      return this.requestEnableLaunchInstantAppField(true);
    }
    public APIRequestGetAdCreativesByLabels requestEnableLaunchInstantAppField (boolean value) {
      this.requestField("enable_launch_instant_app", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestImageCropsField () {
      return this.requestImageCropsField(true);
    }
    public APIRequestGetAdCreativesByLabels requestImageCropsField (boolean value) {
      this.requestField("image_crops", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestImageHashField () {
      return this.requestImageHashField(true);
    }
    public APIRequestGetAdCreativesByLabels requestImageHashField (boolean value) {
      this.requestField("image_hash", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestImageUrlField () {
      return this.requestImageUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestImageUrlField (boolean value) {
      this.requestField("image_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestInstagramActorIdField () {
      return this.requestInstagramActorIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestInstagramActorIdField (boolean value) {
      this.requestField("instagram_actor_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestInstagramPermalinkUrlField () {
      return this.requestInstagramPermalinkUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestInstagramPermalinkUrlField (boolean value) {
      this.requestField("instagram_permalink_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestInstagramStoryIdField () {
      return this.requestInstagramStoryIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestInstagramStoryIdField (boolean value) {
      this.requestField("instagram_story_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestInteractiveComponentsSpecField () {
      return this.requestInteractiveComponentsSpecField(true);
    }
    public APIRequestGetAdCreativesByLabels requestInteractiveComponentsSpecField (boolean value) {
      this.requestField("interactive_components_spec", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestLinkDeepLinkUrlField () {
      return this.requestLinkDeepLinkUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestLinkDeepLinkUrlField (boolean value) {
      this.requestField("link_deep_link_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestLinkOgIdField () {
      return this.requestLinkOgIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestLinkOgIdField (boolean value) {
      this.requestField("link_og_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestLinkUrlField () {
      return this.requestLinkUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestLinkUrlField (boolean value) {
      this.requestField("link_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestMessengerSponsoredMessageField () {
      return this.requestMessengerSponsoredMessageField(true);
    }
    public APIRequestGetAdCreativesByLabels requestMessengerSponsoredMessageField (boolean value) {
      this.requestField("messenger_sponsored_message", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdCreativesByLabels requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestObjectIdField () {
      return this.requestObjectIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestObjectIdField (boolean value) {
      this.requestField("object_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestObjectStoreUrlField () {
      return this.requestObjectStoreUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestObjectStoreUrlField (boolean value) {
      this.requestField("object_store_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestObjectStoryIdField () {
      return this.requestObjectStoryIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestObjectStoryIdField (boolean value) {
      this.requestField("object_story_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestObjectStorySpecField () {
      return this.requestObjectStorySpecField(true);
    }
    public APIRequestGetAdCreativesByLabels requestObjectStorySpecField (boolean value) {
      this.requestField("object_story_spec", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestObjectTypeField () {
      return this.requestObjectTypeField(true);
    }
    public APIRequestGetAdCreativesByLabels requestObjectTypeField (boolean value) {
      this.requestField("object_type", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestObjectUrlField () {
      return this.requestObjectUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestObjectUrlField (boolean value) {
      this.requestField("object_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestPlacePageSetIdField () {
      return this.requestPlacePageSetIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestPlacePageSetIdField (boolean value) {
      this.requestField("place_page_set_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestPlatformCustomizationsField () {
      return this.requestPlatformCustomizationsField(true);
    }
    public APIRequestGetAdCreativesByLabels requestPlatformCustomizationsField (boolean value) {
      this.requestField("platform_customizations", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestPlayableAssetIdField () {
      return this.requestPlayableAssetIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestPlayableAssetIdField (boolean value) {
      this.requestField("playable_asset_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestPortraitCustomizationsField () {
      return this.requestPortraitCustomizationsField(true);
    }
    public APIRequestGetAdCreativesByLabels requestPortraitCustomizationsField (boolean value) {
      this.requestField("portrait_customizations", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestProductSetIdField () {
      return this.requestProductSetIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestProductSetIdField (boolean value) {
      this.requestField("product_set_id", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestRecommenderSettingsField () {
      return this.requestRecommenderSettingsField(true);
    }
    public APIRequestGetAdCreativesByLabels requestRecommenderSettingsField (boolean value) {
      this.requestField("recommender_settings", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdCreativesByLabels requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestTemplateUrlField () {
      return this.requestTemplateUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestTemplateUrlField (boolean value) {
      this.requestField("template_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestTemplateUrlSpecField () {
      return this.requestTemplateUrlSpecField(true);
    }
    public APIRequestGetAdCreativesByLabels requestTemplateUrlSpecField (boolean value) {
      this.requestField("template_url_spec", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestThumbnailUrlField () {
      return this.requestThumbnailUrlField(true);
    }
    public APIRequestGetAdCreativesByLabels requestThumbnailUrlField (boolean value) {
      this.requestField("thumbnail_url", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGetAdCreativesByLabels requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestUrlTagsField () {
      return this.requestUrlTagsField(true);
    }
    public APIRequestGetAdCreativesByLabels requestUrlTagsField (boolean value) {
      this.requestField("url_tags", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestUsePageActorOverrideField () {
      return this.requestUsePageActorOverrideField(true);
    }
    public APIRequestGetAdCreativesByLabels requestUsePageActorOverrideField (boolean value) {
      this.requestField("use_page_actor_override", value);
      return this;
    }
    public APIRequestGetAdCreativesByLabels requestVideoIdField () {
      return this.requestVideoIdField(true);
    }
    public APIRequestGetAdCreativesByLabels requestVideoIdField (boolean value) {
      this.requestField("video_id", value);
      return this;
    }
  }

  public static class APIRequestDeleteAdImages extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "hash",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAdImages.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAdImages(String nodeId, APIContext context) {
      super(context, nodeId, "/adimages", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAdImages setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAdImages setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAdImages setHash (String hash) {
      this.setParam("hash", hash);
      return this;
    }

    public APIRequestDeleteAdImages requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAdImages requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdImages requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAdImages requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdImages requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAdImages requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdImages extends APIRequest<AdImage> {

    APINodeList<AdImage> lastResponse = null;
    @Override
    public APINodeList<AdImage> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "biz_tag_id",
      "business_id",
      "hashes",
      "minheight",
      "minwidth",
      "name",
    };

    public static final String[] FIELDS = {
      "account_id",
      "created_time",
      "creatives",
      "hash",
      "height",
      "id",
      "is_associated_creatives_in_adgroups",
      "name",
      "original_height",
      "original_width",
      "permalink_url",
      "status",
      "updated_time",
      "url",
      "url_128",
      "width",
    };

    @Override
    public APINodeList<AdImage> parseResponse(String response, String header) throws APIException {
      return AdImage.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdImage> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdImage> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdImage>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdImage>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdImage>>() {
           public APINodeList<AdImage> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdImages.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdImages(String nodeId, APIContext context) {
      super(context, nodeId, "/adimages", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdImages setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdImages setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdImages setBizTagId (Long bizTagId) {
      this.setParam("biz_tag_id", bizTagId);
      return this;
    }
    public APIRequestGetAdImages setBizTagId (String bizTagId) {
      this.setParam("biz_tag_id", bizTagId);
      return this;
    }

    public APIRequestGetAdImages setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetAdImages setHashes (List<String> hashes) {
      this.setParam("hashes", hashes);
      return this;
    }
    public APIRequestGetAdImages setHashes (String hashes) {
      this.setParam("hashes", hashes);
      return this;
    }

    public APIRequestGetAdImages setMinheight (Long minheight) {
      this.setParam("minheight", minheight);
      return this;
    }
    public APIRequestGetAdImages setMinheight (String minheight) {
      this.setParam("minheight", minheight);
      return this;
    }

    public APIRequestGetAdImages setMinwidth (Long minwidth) {
      this.setParam("minwidth", minwidth);
      return this;
    }
    public APIRequestGetAdImages setMinwidth (String minwidth) {
      this.setParam("minwidth", minwidth);
      return this;
    }

    public APIRequestGetAdImages setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestGetAdImages requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdImages requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdImages requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdImages requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdImages requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdImages requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdImages requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdImages requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdImages requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdImages requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdImages requestCreativesField () {
      return this.requestCreativesField(true);
    }
    public APIRequestGetAdImages requestCreativesField (boolean value) {
      this.requestField("creatives", value);
      return this;
    }
    public APIRequestGetAdImages requestHashField () {
      return this.requestHashField(true);
    }
    public APIRequestGetAdImages requestHashField (boolean value) {
      this.requestField("hash", value);
      return this;
    }
    public APIRequestGetAdImages requestHeightField () {
      return this.requestHeightField(true);
    }
    public APIRequestGetAdImages requestHeightField (boolean value) {
      this.requestField("height", value);
      return this;
    }
    public APIRequestGetAdImages requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdImages requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdImages requestIsAssociatedCreativesInAdgroupsField () {
      return this.requestIsAssociatedCreativesInAdgroupsField(true);
    }
    public APIRequestGetAdImages requestIsAssociatedCreativesInAdgroupsField (boolean value) {
      this.requestField("is_associated_creatives_in_adgroups", value);
      return this;
    }
    public APIRequestGetAdImages requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdImages requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdImages requestOriginalHeightField () {
      return this.requestOriginalHeightField(true);
    }
    public APIRequestGetAdImages requestOriginalHeightField (boolean value) {
      this.requestField("original_height", value);
      return this;
    }
    public APIRequestGetAdImages requestOriginalWidthField () {
      return this.requestOriginalWidthField(true);
    }
    public APIRequestGetAdImages requestOriginalWidthField (boolean value) {
      this.requestField("original_width", value);
      return this;
    }
    public APIRequestGetAdImages requestPermalinkUrlField () {
      return this.requestPermalinkUrlField(true);
    }
    public APIRequestGetAdImages requestPermalinkUrlField (boolean value) {
      this.requestField("permalink_url", value);
      return this;
    }
    public APIRequestGetAdImages requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdImages requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdImages requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdImages requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetAdImages requestUrlField () {
      return this.requestUrlField(true);
    }
    public APIRequestGetAdImages requestUrlField (boolean value) {
      this.requestField("url", value);
      return this;
    }
    public APIRequestGetAdImages requestUrl128Field () {
      return this.requestUrl128Field(true);
    }
    public APIRequestGetAdImages requestUrl128Field (boolean value) {
      this.requestField("url_128", value);
      return this;
    }
    public APIRequestGetAdImages requestWidthField () {
      return this.requestWidthField(true);
    }
    public APIRequestGetAdImages requestWidthField (boolean value) {
      this.requestField("width", value);
      return this;
    }
  }

  public static class APIRequestCreateAdImage extends APIRequest<AdImage> {

    AdImage lastResponse = null;
    @Override
    public AdImage getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "copy_from",
      "file",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdImage parseResponse(String response, String header) throws APIException {
      return AdImage.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdImage execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdImage execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdImage> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdImage> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdImage>() {
           public AdImage apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdImage.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdImage(String nodeId, APIContext context) {
      super(context, nodeId, "/adimages", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdImage setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdImage setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }

    public APIRequestCreateAdImage addUploadFile (String uploadName, File file) {
      this.setParam(uploadName, file);
      return this;
    }

    public APIRequestCreateAdImage setUseVideoEndpoint(boolean useVideoEndpoint) {
      this.useVideoEndpoint = useVideoEndpoint;
      return this;
    }

    public APIRequestCreateAdImage setCopyFrom (Object copyFrom) {
      this.setParam("copy_from", copyFrom);
      return this;
    }
    public APIRequestCreateAdImage setCopyFrom (String copyFrom) {
      this.setParam("copy_from", copyFrom);
      return this;
    }

    public APIRequestCreateAdImage requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdImage requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdImage requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdImage requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdImage requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdImage requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdLabels extends APIRequest<AdLabel> {

    APINodeList<AdLabel> lastResponse = null;
    @Override
    public APINodeList<AdLabel> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account",
      "created_time",
      "id",
      "name",
      "updated_time",
    };

    @Override
    public APINodeList<AdLabel> parseResponse(String response, String header) throws APIException {
      return AdLabel.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdLabel> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdLabel> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdLabel>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdLabel>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdLabel>>() {
           public APINodeList<AdLabel> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdLabels.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdLabels(String nodeId, APIContext context) {
      super(context, nodeId, "/adlabels", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdLabels setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdLabels setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdLabels requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdLabels requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdLabels requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdLabels requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdLabels requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdLabels requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdLabels requestAccountField () {
      return this.requestAccountField(true);
    }
    public APIRequestGetAdLabels requestAccountField (boolean value) {
      this.requestField("account", value);
      return this;
    }
    public APIRequestGetAdLabels requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdLabels requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdLabels requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdLabels requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdLabels requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdLabels requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdLabels requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdLabels requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateAdLabel extends APIRequest<AdLabel> {

    AdLabel lastResponse = null;
    @Override
    public AdLabel getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "name",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdLabel parseResponse(String response, String header) throws APIException {
      return AdLabel.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdLabel execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdLabel execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdLabel> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdLabel> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdLabel>() {
           public AdLabel apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdLabel.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdLabel(String nodeId, APIContext context) {
      super(context, nodeId, "/adlabels", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdLabel setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdLabel setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdLabel setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdLabel requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdLabel requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdLabel requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdLabel requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdLabel requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdLabel requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdPlayables extends APIRequest<PlayableContent> {

    APINodeList<PlayableContent> lastResponse = null;
    @Override
    public APINodeList<PlayableContent> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "id",
      "name",
      "owner",
    };

    @Override
    public APINodeList<PlayableContent> parseResponse(String response, String header) throws APIException {
      return PlayableContent.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<PlayableContent> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<PlayableContent> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<PlayableContent>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<PlayableContent>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<PlayableContent>>() {
           public APINodeList<PlayableContent> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdPlayables.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdPlayables(String nodeId, APIContext context) {
      super(context, nodeId, "/adplayables", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdPlayables setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdPlayables setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdPlayables requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdPlayables requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdPlayables requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdPlayables requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdPlayables requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdPlayables requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdPlayables requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdPlayables requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdPlayables requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdPlayables requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdPlayables requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetAdPlayables requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
  }

  public static class APIRequestCreateAdPlayable extends APIRequest<PlayableContent> {

    PlayableContent lastResponse = null;
    @Override
    public PlayableContent getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "app_id",
      "name",
      "source",
      "source_url",
      "source_zip",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public PlayableContent parseResponse(String response, String header) throws APIException {
      return PlayableContent.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public PlayableContent execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public PlayableContent execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<PlayableContent> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<PlayableContent> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, PlayableContent>() {
           public PlayableContent apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdPlayable.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdPlayable(String nodeId, APIContext context) {
      super(context, nodeId, "/adplayables", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdPlayable setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdPlayable setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdPlayable setAppId (String appId) {
      this.setParam("app_id", appId);
      return this;
    }

    public APIRequestCreateAdPlayable setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdPlayable setSource (File source) {
      this.setParam("source", source);
      return this;
    }
    public APIRequestCreateAdPlayable setSource (String source) {
      this.setParam("source", source);
      return this;
    }

    public APIRequestCreateAdPlayable setSourceUrl (String sourceUrl) {
      this.setParam("source_url", sourceUrl);
      return this;
    }

    public APIRequestCreateAdPlayable setSourceZip (File sourceZip) {
      this.setParam("source_zip", sourceZip);
      return this;
    }
    public APIRequestCreateAdPlayable setSourceZip (String sourceZip) {
      this.setParam("source_zip", sourceZip);
      return this;
    }

    public APIRequestCreateAdPlayable requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdPlayable requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdPlayable requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdPlayable requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdPlayable requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdPlayable requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeleteAdReportRuns extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAdReportRuns.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAdReportRuns(String nodeId, APIContext context) {
      super(context, nodeId, "/adreportruns", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAdReportRuns setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAdReportRuns setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAdReportRuns requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAdReportRuns requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdReportRuns requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAdReportRuns requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdReportRuns requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAdReportRuns requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdReportSchedules extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdReportSchedules.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdReportSchedules(String nodeId, APIContext context) {
      super(context, nodeId, "/adreportschedules", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdReportSchedules setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdReportSchedules setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdReportSchedules requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdReportSchedules requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdReportSchedules requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdReportSchedules requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdReportSchedules requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdReportSchedules requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateAdReportSchedule extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "actions_group_by",
      "breakdowns",
      "builtin_column_set",
      "creation_source",
      "custom_column_set_id",
      "data_columns",
      "date_interval",
      "date_preset",
      "emails",
      "export_columns",
      "filters",
      "format_version",
      "insights_section",
      "level",
      "name",
      "normalized_filter",
      "schedule_frequency",
      "sort",
      "sort_by",
      "sort_dir",
      "start_date",
      "status",
      "subscribers",
      "time_increment",
      "user_attribution_windows",
      "user_columns",
      "user_filter",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdReportSchedule.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdReportSchedule(String nodeId, APIContext context) {
      super(context, nodeId, "/adreportschedules", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdReportSchedule setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdReportSchedule setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdReportSchedule setActionsGroupBy (List<EnumActionsGroupBy> actionsGroupBy) {
      this.setParam("actions_group_by", actionsGroupBy);
      return this;
    }
    public APIRequestCreateAdReportSchedule setActionsGroupBy (String actionsGroupBy) {
      this.setParam("actions_group_by", actionsGroupBy);
      return this;
    }

    public APIRequestCreateAdReportSchedule setBreakdowns (List<String> breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }
    public APIRequestCreateAdReportSchedule setBreakdowns (String breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }

    public APIRequestCreateAdReportSchedule setBuiltinColumnSet (EnumBuiltinColumnSet builtinColumnSet) {
      this.setParam("builtin_column_set", builtinColumnSet);
      return this;
    }
    public APIRequestCreateAdReportSchedule setBuiltinColumnSet (String builtinColumnSet) {
      this.setParam("builtin_column_set", builtinColumnSet);
      return this;
    }

    public APIRequestCreateAdReportSchedule setCreationSource (EnumCreationSource creationSource) {
      this.setParam("creation_source", creationSource);
      return this;
    }
    public APIRequestCreateAdReportSchedule setCreationSource (String creationSource) {
      this.setParam("creation_source", creationSource);
      return this;
    }

    public APIRequestCreateAdReportSchedule setCustomColumnSetId (String customColumnSetId) {
      this.setParam("custom_column_set_id", customColumnSetId);
      return this;
    }

    public APIRequestCreateAdReportSchedule setDataColumns (List<String> dataColumns) {
      this.setParam("data_columns", dataColumns);
      return this;
    }
    public APIRequestCreateAdReportSchedule setDataColumns (String dataColumns) {
      this.setParam("data_columns", dataColumns);
      return this;
    }

    public APIRequestCreateAdReportSchedule setDateInterval (Object dateInterval) {
      this.setParam("date_interval", dateInterval);
      return this;
    }
    public APIRequestCreateAdReportSchedule setDateInterval (String dateInterval) {
      this.setParam("date_interval", dateInterval);
      return this;
    }

    public APIRequestCreateAdReportSchedule setDatePreset (EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestCreateAdReportSchedule setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestCreateAdReportSchedule setEmails (List<String> emails) {
      this.setParam("emails", emails);
      return this;
    }
    public APIRequestCreateAdReportSchedule setEmails (String emails) {
      this.setParam("emails", emails);
      return this;
    }

    public APIRequestCreateAdReportSchedule setExportColumns (Object exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }
    public APIRequestCreateAdReportSchedule setExportColumns (String exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }

    public APIRequestCreateAdReportSchedule setFilters (List<Object> filters) {
      this.setParam("filters", filters);
      return this;
    }
    public APIRequestCreateAdReportSchedule setFilters (String filters) {
      this.setParam("filters", filters);
      return this;
    }

    public APIRequestCreateAdReportSchedule setFormatVersion (Long formatVersion) {
      this.setParam("format_version", formatVersion);
      return this;
    }
    public APIRequestCreateAdReportSchedule setFormatVersion (String formatVersion) {
      this.setParam("format_version", formatVersion);
      return this;
    }

    public APIRequestCreateAdReportSchedule setInsightsSection (Object insightsSection) {
      this.setParam("insights_section", insightsSection);
      return this;
    }
    public APIRequestCreateAdReportSchedule setInsightsSection (String insightsSection) {
      this.setParam("insights_section", insightsSection);
      return this;
    }

    public APIRequestCreateAdReportSchedule setLevel (EnumLevel level) {
      this.setParam("level", level);
      return this;
    }
    public APIRequestCreateAdReportSchedule setLevel (String level) {
      this.setParam("level", level);
      return this;
    }

    public APIRequestCreateAdReportSchedule setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdReportSchedule setNormalizedFilter (List<Object> normalizedFilter) {
      this.setParam("normalized_filter", normalizedFilter);
      return this;
    }
    public APIRequestCreateAdReportSchedule setNormalizedFilter (String normalizedFilter) {
      this.setParam("normalized_filter", normalizedFilter);
      return this;
    }

    public APIRequestCreateAdReportSchedule setScheduleFrequency (EnumScheduleFrequency scheduleFrequency) {
      this.setParam("schedule_frequency", scheduleFrequency);
      return this;
    }
    public APIRequestCreateAdReportSchedule setScheduleFrequency (String scheduleFrequency) {
      this.setParam("schedule_frequency", scheduleFrequency);
      return this;
    }

    public APIRequestCreateAdReportSchedule setSort (List<Object> sort) {
      this.setParam("sort", sort);
      return this;
    }
    public APIRequestCreateAdReportSchedule setSort (String sort) {
      this.setParam("sort", sort);
      return this;
    }

    public APIRequestCreateAdReportSchedule setSortBy (String sortBy) {
      this.setParam("sort_by", sortBy);
      return this;
    }

    public APIRequestCreateAdReportSchedule setSortDir (String sortDir) {
      this.setParam("sort_dir", sortDir);
      return this;
    }

    public APIRequestCreateAdReportSchedule setStartDate (Object startDate) {
      this.setParam("start_date", startDate);
      return this;
    }
    public APIRequestCreateAdReportSchedule setStartDate (String startDate) {
      this.setParam("start_date", startDate);
      return this;
    }

    public APIRequestCreateAdReportSchedule setStatus (EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestCreateAdReportSchedule setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestCreateAdReportSchedule setSubscribers (List<Long> subscribers) {
      this.setParam("subscribers", subscribers);
      return this;
    }
    public APIRequestCreateAdReportSchedule setSubscribers (String subscribers) {
      this.setParam("subscribers", subscribers);
      return this;
    }

    public APIRequestCreateAdReportSchedule setTimeIncrement (String timeIncrement) {
      this.setParam("time_increment", timeIncrement);
      return this;
    }

    public APIRequestCreateAdReportSchedule setUserAttributionWindows (List<String> userAttributionWindows) {
      this.setParam("user_attribution_windows", userAttributionWindows);
      return this;
    }
    public APIRequestCreateAdReportSchedule setUserAttributionWindows (String userAttributionWindows) {
      this.setParam("user_attribution_windows", userAttributionWindows);
      return this;
    }

    public APIRequestCreateAdReportSchedule setUserColumns (List<String> userColumns) {
      this.setParam("user_columns", userColumns);
      return this;
    }
    public APIRequestCreateAdReportSchedule setUserColumns (String userColumns) {
      this.setParam("user_columns", userColumns);
      return this;
    }

    public APIRequestCreateAdReportSchedule setUserFilter (List<Object> userFilter) {
      this.setParam("user_filter", userFilter);
      return this;
    }
    public APIRequestCreateAdReportSchedule setUserFilter (String userFilter) {
      this.setParam("user_filter", userFilter);
      return this;
    }

    public APIRequestCreateAdReportSchedule requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdReportSchedule requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdReportSchedule requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdReportSchedule requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdReportSchedule requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdReportSchedule requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateAdReportSpec extends APIRequest<AdReportSpec> {

    AdReportSpec lastResponse = null;
    @Override
    public AdReportSpec getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "actions_group_by",
      "business_id",
      "bypass_async",
      "creation_source",
      "data_columns",
      "date_preset",
      "export_columns",
      "filters",
      "format",
      "format_version",
      "insights_section",
      "limit",
      "name",
      "report_run_id",
      "report_schedule_id",
      "sort_by",
      "sort_dir",
      "time_increment",
      "time_interval",
      "time_ranges",
      "user_report",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdReportSpec parseResponse(String response, String header) throws APIException {
      return AdReportSpec.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdReportSpec execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdReportSpec execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdReportSpec> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdReportSpec> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdReportSpec>() {
           public AdReportSpec apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdReportSpec.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdReportSpec(String nodeId, APIContext context) {
      super(context, nodeId, "/adreportspecs", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdReportSpec setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdReportSpec setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdReportSpec setActionsGroupBy (List<AdReportSpec.EnumActionsGroupBy> actionsGroupBy) {
      this.setParam("actions_group_by", actionsGroupBy);
      return this;
    }
    public APIRequestCreateAdReportSpec setActionsGroupBy (String actionsGroupBy) {
      this.setParam("actions_group_by", actionsGroupBy);
      return this;
    }

    public APIRequestCreateAdReportSpec setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestCreateAdReportSpec setBypassAsync (Boolean bypassAsync) {
      this.setParam("bypass_async", bypassAsync);
      return this;
    }
    public APIRequestCreateAdReportSpec setBypassAsync (String bypassAsync) {
      this.setParam("bypass_async", bypassAsync);
      return this;
    }

    public APIRequestCreateAdReportSpec setCreationSource (AdReportSpec.EnumCreationSource creationSource) {
      this.setParam("creation_source", creationSource);
      return this;
    }
    public APIRequestCreateAdReportSpec setCreationSource (String creationSource) {
      this.setParam("creation_source", creationSource);
      return this;
    }

    public APIRequestCreateAdReportSpec setDataColumns (List<String> dataColumns) {
      this.setParam("data_columns", dataColumns);
      return this;
    }
    public APIRequestCreateAdReportSpec setDataColumns (String dataColumns) {
      this.setParam("data_columns", dataColumns);
      return this;
    }

    public APIRequestCreateAdReportSpec setDatePreset (AdReportSpec.EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestCreateAdReportSpec setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestCreateAdReportSpec setExportColumns (Object exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }
    public APIRequestCreateAdReportSpec setExportColumns (String exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }

    public APIRequestCreateAdReportSpec setFilters (List<Object> filters) {
      this.setParam("filters", filters);
      return this;
    }
    public APIRequestCreateAdReportSpec setFilters (String filters) {
      this.setParam("filters", filters);
      return this;
    }

    public APIRequestCreateAdReportSpec setFormat (AdReportSpec.EnumFormat format) {
      this.setParam("format", format);
      return this;
    }
    public APIRequestCreateAdReportSpec setFormat (String format) {
      this.setParam("format", format);
      return this;
    }

    public APIRequestCreateAdReportSpec setFormatVersion (Long formatVersion) {
      this.setParam("format_version", formatVersion);
      return this;
    }
    public APIRequestCreateAdReportSpec setFormatVersion (String formatVersion) {
      this.setParam("format_version", formatVersion);
      return this;
    }

    public APIRequestCreateAdReportSpec setInsightsSection (Object insightsSection) {
      this.setParam("insights_section", insightsSection);
      return this;
    }
    public APIRequestCreateAdReportSpec setInsightsSection (String insightsSection) {
      this.setParam("insights_section", insightsSection);
      return this;
    }

    public APIRequestCreateAdReportSpec setLimit (Long limit) {
      this.setParam("limit", limit);
      return this;
    }
    public APIRequestCreateAdReportSpec setLimit (String limit) {
      this.setParam("limit", limit);
      return this;
    }

    public APIRequestCreateAdReportSpec setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdReportSpec setReportRunId (String reportRunId) {
      this.setParam("report_run_id", reportRunId);
      return this;
    }

    public APIRequestCreateAdReportSpec setReportScheduleId (String reportScheduleId) {
      this.setParam("report_schedule_id", reportScheduleId);
      return this;
    }

    public APIRequestCreateAdReportSpec setSortBy (String sortBy) {
      this.setParam("sort_by", sortBy);
      return this;
    }

    public APIRequestCreateAdReportSpec setSortDir (String sortDir) {
      this.setParam("sort_dir", sortDir);
      return this;
    }

    public APIRequestCreateAdReportSpec setTimeIncrement (String timeIncrement) {
      this.setParam("time_increment", timeIncrement);
      return this;
    }

    public APIRequestCreateAdReportSpec setTimeInterval (Object timeInterval) {
      this.setParam("time_interval", timeInterval);
      return this;
    }
    public APIRequestCreateAdReportSpec setTimeInterval (String timeInterval) {
      this.setParam("time_interval", timeInterval);
      return this;
    }

    public APIRequestCreateAdReportSpec setTimeRanges (JsonArray timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }
    public APIRequestCreateAdReportSpec setTimeRanges (String timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }

    public APIRequestCreateAdReportSpec setUserReport (Boolean userReport) {
      this.setParam("user_report", userReport);
      return this;
    }
    public APIRequestCreateAdReportSpec setUserReport (String userReport) {
      this.setParam("user_report", userReport);
      return this;
    }

    public APIRequestCreateAdReportSpec requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdReportSpec requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdReportSpec requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdReportSpec requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdReportSpec requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdReportSpec requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdRulesHistory extends APIRequest<AdAccountAdRulesHistory> {

    APINodeList<AdAccountAdRulesHistory> lastResponse = null;
    @Override
    public APINodeList<AdAccountAdRulesHistory> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action",
      "evaluation_type",
      "hide_no_changes",
      "object_id",
    };

    public static final String[] FIELDS = {
      "evaluation_spec",
      "exception_code",
      "exception_message",
      "execution_spec",
      "is_manual",
      "results",
      "rule_id",
      "schedule_spec",
      "timestamp",
    };

    @Override
    public APINodeList<AdAccountAdRulesHistory> parseResponse(String response, String header) throws APIException {
      return AdAccountAdRulesHistory.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountAdRulesHistory> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountAdRulesHistory> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountAdRulesHistory>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountAdRulesHistory>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountAdRulesHistory>>() {
           public APINodeList<AdAccountAdRulesHistory> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdRulesHistory.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdRulesHistory(String nodeId, APIContext context) {
      super(context, nodeId, "/adrules_history", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdRulesHistory setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdRulesHistory setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdRulesHistory setAction (AdAccountAdRulesHistory.EnumAction action) {
      this.setParam("action", action);
      return this;
    }
    public APIRequestGetAdRulesHistory setAction (String action) {
      this.setParam("action", action);
      return this;
    }

    public APIRequestGetAdRulesHistory setEvaluationType (AdAccountAdRulesHistory.EnumEvaluationType evaluationType) {
      this.setParam("evaluation_type", evaluationType);
      return this;
    }
    public APIRequestGetAdRulesHistory setEvaluationType (String evaluationType) {
      this.setParam("evaluation_type", evaluationType);
      return this;
    }

    public APIRequestGetAdRulesHistory setHideNoChanges (Boolean hideNoChanges) {
      this.setParam("hide_no_changes", hideNoChanges);
      return this;
    }
    public APIRequestGetAdRulesHistory setHideNoChanges (String hideNoChanges) {
      this.setParam("hide_no_changes", hideNoChanges);
      return this;
    }

    public APIRequestGetAdRulesHistory setObjectId (String objectId) {
      this.setParam("object_id", objectId);
      return this;
    }

    public APIRequestGetAdRulesHistory requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdRulesHistory requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdRulesHistory requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdRulesHistory requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdRulesHistory requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdRulesHistory requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdRulesHistory requestEvaluationSpecField () {
      return this.requestEvaluationSpecField(true);
    }
    public APIRequestGetAdRulesHistory requestEvaluationSpecField (boolean value) {
      this.requestField("evaluation_spec", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestExceptionCodeField () {
      return this.requestExceptionCodeField(true);
    }
    public APIRequestGetAdRulesHistory requestExceptionCodeField (boolean value) {
      this.requestField("exception_code", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestExceptionMessageField () {
      return this.requestExceptionMessageField(true);
    }
    public APIRequestGetAdRulesHistory requestExceptionMessageField (boolean value) {
      this.requestField("exception_message", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestExecutionSpecField () {
      return this.requestExecutionSpecField(true);
    }
    public APIRequestGetAdRulesHistory requestExecutionSpecField (boolean value) {
      this.requestField("execution_spec", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestIsManualField () {
      return this.requestIsManualField(true);
    }
    public APIRequestGetAdRulesHistory requestIsManualField (boolean value) {
      this.requestField("is_manual", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestResultsField () {
      return this.requestResultsField(true);
    }
    public APIRequestGetAdRulesHistory requestResultsField (boolean value) {
      this.requestField("results", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestRuleIdField () {
      return this.requestRuleIdField(true);
    }
    public APIRequestGetAdRulesHistory requestRuleIdField (boolean value) {
      this.requestField("rule_id", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestScheduleSpecField () {
      return this.requestScheduleSpecField(true);
    }
    public APIRequestGetAdRulesHistory requestScheduleSpecField (boolean value) {
      this.requestField("schedule_spec", value);
      return this;
    }
    public APIRequestGetAdRulesHistory requestTimestampField () {
      return this.requestTimestampField(true);
    }
    public APIRequestGetAdRulesHistory requestTimestampField (boolean value) {
      this.requestField("timestamp", value);
      return this;
    }
  }

  public static class APIRequestGetAdRulesLibrary extends APIRequest<AdRule> {

    APINodeList<AdRule> lastResponse = null;
    @Override
    public APINodeList<AdRule> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "created_by",
      "created_time",
      "evaluation_spec",
      "execution_spec",
      "id",
      "name",
      "schedule_spec",
      "status",
      "updated_time",
    };

    @Override
    public APINodeList<AdRule> parseResponse(String response, String header) throws APIException {
      return AdRule.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdRule> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdRule> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdRule>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdRule>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdRule>>() {
           public APINodeList<AdRule> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdRulesLibrary.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdRulesLibrary(String nodeId, APIContext context) {
      super(context, nodeId, "/adrules_library", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdRulesLibrary setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdRulesLibrary setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdRulesLibrary requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdRulesLibrary requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdRulesLibrary requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdRulesLibrary requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdRulesLibrary requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdRulesLibrary requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdRulesLibrary requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdRulesLibrary requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetAdRulesLibrary requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdRulesLibrary requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestEvaluationSpecField () {
      return this.requestEvaluationSpecField(true);
    }
    public APIRequestGetAdRulesLibrary requestEvaluationSpecField (boolean value) {
      this.requestField("evaluation_spec", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestExecutionSpecField () {
      return this.requestExecutionSpecField(true);
    }
    public APIRequestGetAdRulesLibrary requestExecutionSpecField (boolean value) {
      this.requestField("execution_spec", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdRulesLibrary requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdRulesLibrary requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestScheduleSpecField () {
      return this.requestScheduleSpecField(true);
    }
    public APIRequestGetAdRulesLibrary requestScheduleSpecField (boolean value) {
      this.requestField("schedule_spec", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdRulesLibrary requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdRulesLibrary requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdRulesLibrary requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateAdRulesLibrary extends APIRequest<AdRule> {

    AdRule lastResponse = null;
    @Override
    public AdRule getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "account_id",
      "evaluation_spec",
      "execution_spec",
      "name",
      "schedule_spec",
      "status",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdRule parseResponse(String response, String header) throws APIException {
      return AdRule.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdRule execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdRule execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdRule> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdRule> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdRule>() {
           public AdRule apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdRulesLibrary.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdRulesLibrary(String nodeId, APIContext context) {
      super(context, nodeId, "/adrules_library", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdRulesLibrary setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdRulesLibrary setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdRulesLibrary setAccountId (String accountId) {
      this.setParam("account_id", accountId);
      return this;
    }

    public APIRequestCreateAdRulesLibrary setEvaluationSpec (Object evaluationSpec) {
      this.setParam("evaluation_spec", evaluationSpec);
      return this;
    }
    public APIRequestCreateAdRulesLibrary setEvaluationSpec (String evaluationSpec) {
      this.setParam("evaluation_spec", evaluationSpec);
      return this;
    }

    public APIRequestCreateAdRulesLibrary setExecutionSpec (Object executionSpec) {
      this.setParam("execution_spec", executionSpec);
      return this;
    }
    public APIRequestCreateAdRulesLibrary setExecutionSpec (String executionSpec) {
      this.setParam("execution_spec", executionSpec);
      return this;
    }

    public APIRequestCreateAdRulesLibrary setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdRulesLibrary setScheduleSpec (Object scheduleSpec) {
      this.setParam("schedule_spec", scheduleSpec);
      return this;
    }
    public APIRequestCreateAdRulesLibrary setScheduleSpec (String scheduleSpec) {
      this.setParam("schedule_spec", scheduleSpec);
      return this;
    }

    public APIRequestCreateAdRulesLibrary setStatus (AdRule.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestCreateAdRulesLibrary setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestCreateAdRulesLibrary requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdRulesLibrary requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdRulesLibrary requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdRulesLibrary requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdRulesLibrary requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdRulesLibrary requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeleteAds extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "before_date",
      "delete_offset",
      "delete_strategy",
      "object_count",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAds.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAds(String nodeId, APIContext context) {
      super(context, nodeId, "/ads", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAds setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAds setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAds setBeforeDate (String beforeDate) {
      this.setParam("before_date", beforeDate);
      return this;
    }

    public APIRequestDeleteAds setDeleteOffset (Long deleteOffset) {
      this.setParam("delete_offset", deleteOffset);
      return this;
    }
    public APIRequestDeleteAds setDeleteOffset (String deleteOffset) {
      this.setParam("delete_offset", deleteOffset);
      return this;
    }

    public APIRequestDeleteAds setDeleteStrategy (EnumDeleteStrategy deleteStrategy) {
      this.setParam("delete_strategy", deleteStrategy);
      return this;
    }
    public APIRequestDeleteAds setDeleteStrategy (String deleteStrategy) {
      this.setParam("delete_strategy", deleteStrategy);
      return this;
    }

    public APIRequestDeleteAds setObjectCount (Long objectCount) {
      this.setParam("object_count", objectCount);
      return this;
    }
    public APIRequestDeleteAds setObjectCount (String objectCount) {
      this.setParam("object_count", objectCount);
      return this;
    }

    public APIRequestDeleteAds requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAds requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAds requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAds requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAds requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAds requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAds extends APIRequest<Ad> {

    APINodeList<Ad> lastResponse = null;
    @Override
    public APINodeList<Ad> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_draft_id",
      "date_preset",
      "effective_status",
      "include_deleted",
      "include_drafts",
      "time_range",
      "updated_since",
      "use_employee_draft",
    };

    public static final String[] FIELDS = {
      "account_id",
      "ad_review_feedback",
      "adlabels",
      "adset",
      "adset_id",
      "bid_amount",
      "bid_info",
      "bid_type",
      "campaign",
      "campaign_id",
      "configured_status",
      "conversion_specs",
      "created_time",
      "creative",
      "demolink_hash",
      "display_sequence",
      "effective_status",
      "engagement_audience",
      "failed_delivery_checks",
      "id",
      "issues_info",
      "last_updated_by_app_id",
      "name",
      "priority",
      "recommendations",
      "source_ad",
      "source_ad_id",
      "status",
      "targeting",
      "tracking_and_conversion_with_defaults",
      "tracking_specs",
      "updated_time",
    };

    @Override
    public APINodeList<Ad> parseResponse(String response, String header) throws APIException {
      return Ad.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Ad> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Ad> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Ad>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Ad>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Ad>>() {
           public APINodeList<Ad> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAds.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAds(String nodeId, APIContext context) {
      super(context, nodeId, "/ads", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAds setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAds setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAds setAdDraftId (String adDraftId) {
      this.setParam("ad_draft_id", adDraftId);
      return this;
    }

    public APIRequestGetAds setDatePreset (Ad.EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestGetAds setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestGetAds setEffectiveStatus (List<String> effectiveStatus) {
      this.setParam("effective_status", effectiveStatus);
      return this;
    }
    public APIRequestGetAds setEffectiveStatus (String effectiveStatus) {
      this.setParam("effective_status", effectiveStatus);
      return this;
    }

    public APIRequestGetAds setIncludeDeleted (Boolean includeDeleted) {
      this.setParam("include_deleted", includeDeleted);
      return this;
    }
    public APIRequestGetAds setIncludeDeleted (String includeDeleted) {
      this.setParam("include_deleted", includeDeleted);
      return this;
    }

    public APIRequestGetAds setIncludeDrafts (Boolean includeDrafts) {
      this.setParam("include_drafts", includeDrafts);
      return this;
    }
    public APIRequestGetAds setIncludeDrafts (String includeDrafts) {
      this.setParam("include_drafts", includeDrafts);
      return this;
    }

    public APIRequestGetAds setTimeRange (Object timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }
    public APIRequestGetAds setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGetAds setUpdatedSince (Long updatedSince) {
      this.setParam("updated_since", updatedSince);
      return this;
    }
    public APIRequestGetAds setUpdatedSince (String updatedSince) {
      this.setParam("updated_since", updatedSince);
      return this;
    }

    public APIRequestGetAds setUseEmployeeDraft (Boolean useEmployeeDraft) {
      this.setParam("use_employee_draft", useEmployeeDraft);
      return this;
    }
    public APIRequestGetAds setUseEmployeeDraft (String useEmployeeDraft) {
      this.setParam("use_employee_draft", useEmployeeDraft);
      return this;
    }

    public APIRequestGetAds requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAds requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAds requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAds requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAds requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAds requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAds requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAds requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAds requestAdReviewFeedbackField () {
      return this.requestAdReviewFeedbackField(true);
    }
    public APIRequestGetAds requestAdReviewFeedbackField (boolean value) {
      this.requestField("ad_review_feedback", value);
      return this;
    }
    public APIRequestGetAds requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetAds requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetAds requestAdsetField () {
      return this.requestAdsetField(true);
    }
    public APIRequestGetAds requestAdsetField (boolean value) {
      this.requestField("adset", value);
      return this;
    }
    public APIRequestGetAds requestAdsetIdField () {
      return this.requestAdsetIdField(true);
    }
    public APIRequestGetAds requestAdsetIdField (boolean value) {
      this.requestField("adset_id", value);
      return this;
    }
    public APIRequestGetAds requestBidAmountField () {
      return this.requestBidAmountField(true);
    }
    public APIRequestGetAds requestBidAmountField (boolean value) {
      this.requestField("bid_amount", value);
      return this;
    }
    public APIRequestGetAds requestBidInfoField () {
      return this.requestBidInfoField(true);
    }
    public APIRequestGetAds requestBidInfoField (boolean value) {
      this.requestField("bid_info", value);
      return this;
    }
    public APIRequestGetAds requestBidTypeField () {
      return this.requestBidTypeField(true);
    }
    public APIRequestGetAds requestBidTypeField (boolean value) {
      this.requestField("bid_type", value);
      return this;
    }
    public APIRequestGetAds requestCampaignField () {
      return this.requestCampaignField(true);
    }
    public APIRequestGetAds requestCampaignField (boolean value) {
      this.requestField("campaign", value);
      return this;
    }
    public APIRequestGetAds requestCampaignIdField () {
      return this.requestCampaignIdField(true);
    }
    public APIRequestGetAds requestCampaignIdField (boolean value) {
      this.requestField("campaign_id", value);
      return this;
    }
    public APIRequestGetAds requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetAds requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetAds requestConversionSpecsField () {
      return this.requestConversionSpecsField(true);
    }
    public APIRequestGetAds requestConversionSpecsField (boolean value) {
      this.requestField("conversion_specs", value);
      return this;
    }
    public APIRequestGetAds requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAds requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAds requestCreativeField () {
      return this.requestCreativeField(true);
    }
    public APIRequestGetAds requestCreativeField (boolean value) {
      this.requestField("creative", value);
      return this;
    }
    public APIRequestGetAds requestDemolinkHashField () {
      return this.requestDemolinkHashField(true);
    }
    public APIRequestGetAds requestDemolinkHashField (boolean value) {
      this.requestField("demolink_hash", value);
      return this;
    }
    public APIRequestGetAds requestDisplaySequenceField () {
      return this.requestDisplaySequenceField(true);
    }
    public APIRequestGetAds requestDisplaySequenceField (boolean value) {
      this.requestField("display_sequence", value);
      return this;
    }
    public APIRequestGetAds requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetAds requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetAds requestEngagementAudienceField () {
      return this.requestEngagementAudienceField(true);
    }
    public APIRequestGetAds requestEngagementAudienceField (boolean value) {
      this.requestField("engagement_audience", value);
      return this;
    }
    public APIRequestGetAds requestFailedDeliveryChecksField () {
      return this.requestFailedDeliveryChecksField(true);
    }
    public APIRequestGetAds requestFailedDeliveryChecksField (boolean value) {
      this.requestField("failed_delivery_checks", value);
      return this;
    }
    public APIRequestGetAds requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAds requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAds requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetAds requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetAds requestLastUpdatedByAppIdField () {
      return this.requestLastUpdatedByAppIdField(true);
    }
    public APIRequestGetAds requestLastUpdatedByAppIdField (boolean value) {
      this.requestField("last_updated_by_app_id", value);
      return this;
    }
    public APIRequestGetAds requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAds requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAds requestPriorityField () {
      return this.requestPriorityField(true);
    }
    public APIRequestGetAds requestPriorityField (boolean value) {
      this.requestField("priority", value);
      return this;
    }
    public APIRequestGetAds requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetAds requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetAds requestSourceAdField () {
      return this.requestSourceAdField(true);
    }
    public APIRequestGetAds requestSourceAdField (boolean value) {
      this.requestField("source_ad", value);
      return this;
    }
    public APIRequestGetAds requestSourceAdIdField () {
      return this.requestSourceAdIdField(true);
    }
    public APIRequestGetAds requestSourceAdIdField (boolean value) {
      this.requestField("source_ad_id", value);
      return this;
    }
    public APIRequestGetAds requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAds requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAds requestTargetingField () {
      return this.requestTargetingField(true);
    }
    public APIRequestGetAds requestTargetingField (boolean value) {
      this.requestField("targeting", value);
      return this;
    }
    public APIRequestGetAds requestTrackingAndConversionWithDefaultsField () {
      return this.requestTrackingAndConversionWithDefaultsField(true);
    }
    public APIRequestGetAds requestTrackingAndConversionWithDefaultsField (boolean value) {
      this.requestField("tracking_and_conversion_with_defaults", value);
      return this;
    }
    public APIRequestGetAds requestTrackingSpecsField () {
      return this.requestTrackingSpecsField(true);
    }
    public APIRequestGetAds requestTrackingSpecsField (boolean value) {
      this.requestField("tracking_specs", value);
      return this;
    }
    public APIRequestGetAds requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAds requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateAd extends APIRequest<Ad> {

    Ad lastResponse = null;
    @Override
    public Ad getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "adlabels",
      "adset_id",
      "adset_spec",
      "audience_id",
      "bid_amount",
      "creative",
      "date_format",
      "display_sequence",
      "draft_adgroup_id",
      "engagement_audience",
      "execution_options",
      "include_demolink_hashes",
      "name",
      "priority",
      "source_ad_id",
      "status",
      "tracking_specs",
      "file",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public Ad parseResponse(String response, String header) throws APIException {
      return Ad.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public Ad execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public Ad execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<Ad> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<Ad> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, Ad>() {
           public Ad apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAd.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAd(String nodeId, APIContext context) {
      super(context, nodeId, "/ads", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAd setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAd setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }

    public APIRequestCreateAd addUploadFile (String uploadName, File file) {
      this.setParam(uploadName, file);
      return this;
    }

    public APIRequestCreateAd setUseVideoEndpoint(boolean useVideoEndpoint) {
      this.useVideoEndpoint = useVideoEndpoint;
      return this;
    }

    public APIRequestCreateAd setAdlabels (List<Object> adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }
    public APIRequestCreateAd setAdlabels (String adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }

    public APIRequestCreateAd setAdsetId (Long adsetId) {
      this.setParam("adset_id", adsetId);
      return this;
    }
    public APIRequestCreateAd setAdsetId (String adsetId) {
      this.setParam("adset_id", adsetId);
      return this;
    }

    public APIRequestCreateAd setAdsetSpec (AdSet adsetSpec) {
      this.setParam("adset_spec", adsetSpec);
      return this;
    }
    public APIRequestCreateAd setAdsetSpec (String adsetSpec) {
      this.setParam("adset_spec", adsetSpec);
      return this;
    }

    public APIRequestCreateAd setAudienceId (String audienceId) {
      this.setParam("audience_id", audienceId);
      return this;
    }

    public APIRequestCreateAd setBidAmount (Long bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }
    public APIRequestCreateAd setBidAmount (String bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }

    public APIRequestCreateAd setCreative (AdCreative creative) {
      this.setParam("creative", creative);
      return this;
    }
    public APIRequestCreateAd setCreative (String creative) {
      this.setParam("creative", creative);
      return this;
    }

    public APIRequestCreateAd setDateFormat (String dateFormat) {
      this.setParam("date_format", dateFormat);
      return this;
    }

    public APIRequestCreateAd setDisplaySequence (Long displaySequence) {
      this.setParam("display_sequence", displaySequence);
      return this;
    }
    public APIRequestCreateAd setDisplaySequence (String displaySequence) {
      this.setParam("display_sequence", displaySequence);
      return this;
    }

    public APIRequestCreateAd setDraftAdgroupId (String draftAdgroupId) {
      this.setParam("draft_adgroup_id", draftAdgroupId);
      return this;
    }

    public APIRequestCreateAd setEngagementAudience (Boolean engagementAudience) {
      this.setParam("engagement_audience", engagementAudience);
      return this;
    }
    public APIRequestCreateAd setEngagementAudience (String engagementAudience) {
      this.setParam("engagement_audience", engagementAudience);
      return this;
    }

    public APIRequestCreateAd setExecutionOptions (List<Ad.EnumExecutionOptions> executionOptions) {
      this.setParam("execution_options", executionOptions);
      return this;
    }
    public APIRequestCreateAd setExecutionOptions (String executionOptions) {
      this.setParam("execution_options", executionOptions);
      return this;
    }

    public APIRequestCreateAd setIncludeDemolinkHashes (Boolean includeDemolinkHashes) {
      this.setParam("include_demolink_hashes", includeDemolinkHashes);
      return this;
    }
    public APIRequestCreateAd setIncludeDemolinkHashes (String includeDemolinkHashes) {
      this.setParam("include_demolink_hashes", includeDemolinkHashes);
      return this;
    }

    public APIRequestCreateAd setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAd setPriority (Long priority) {
      this.setParam("priority", priority);
      return this;
    }
    public APIRequestCreateAd setPriority (String priority) {
      this.setParam("priority", priority);
      return this;
    }

    public APIRequestCreateAd setSourceAdId (String sourceAdId) {
      this.setParam("source_ad_id", sourceAdId);
      return this;
    }

    public APIRequestCreateAd setStatus (Ad.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestCreateAd setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestCreateAd setTrackingSpecs (Object trackingSpecs) {
      this.setParam("tracking_specs", trackingSpecs);
      return this;
    }
    public APIRequestCreateAd setTrackingSpecs (String trackingSpecs) {
      this.setParam("tracking_specs", trackingSpecs);
      return this;
    }

    public APIRequestCreateAd requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAd requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAd requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAd requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAd requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAd requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdsByLabels extends APIRequest<Ad> {

    APINodeList<Ad> lastResponse = null;
    @Override
    public APINodeList<Ad> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_label_ids",
      "operator",
    };

    public static final String[] FIELDS = {
      "account_id",
      "ad_review_feedback",
      "adlabels",
      "adset",
      "adset_id",
      "bid_amount",
      "bid_info",
      "bid_type",
      "campaign",
      "campaign_id",
      "configured_status",
      "conversion_specs",
      "created_time",
      "creative",
      "demolink_hash",
      "display_sequence",
      "effective_status",
      "engagement_audience",
      "failed_delivery_checks",
      "id",
      "issues_info",
      "last_updated_by_app_id",
      "name",
      "priority",
      "recommendations",
      "source_ad",
      "source_ad_id",
      "status",
      "targeting",
      "tracking_and_conversion_with_defaults",
      "tracking_specs",
      "updated_time",
    };

    @Override
    public APINodeList<Ad> parseResponse(String response, String header) throws APIException {
      return Ad.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Ad> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Ad> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Ad>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Ad>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Ad>>() {
           public APINodeList<Ad> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdsByLabels.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdsByLabels(String nodeId, APIContext context) {
      super(context, nodeId, "/adsbylabels", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdsByLabels setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdsByLabels setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdsByLabels setAdLabelIds (List<String> adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }
    public APIRequestGetAdsByLabels setAdLabelIds (String adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }

    public APIRequestGetAdsByLabels setOperator (Ad.EnumOperator operator) {
      this.setParam("operator", operator);
      return this;
    }
    public APIRequestGetAdsByLabels setOperator (String operator) {
      this.setParam("operator", operator);
      return this;
    }

    public APIRequestGetAdsByLabels requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdsByLabels requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdsByLabels requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdsByLabels requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdsByLabels requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdsByLabels requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdsByLabels requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdsByLabels requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestAdReviewFeedbackField () {
      return this.requestAdReviewFeedbackField(true);
    }
    public APIRequestGetAdsByLabels requestAdReviewFeedbackField (boolean value) {
      this.requestField("ad_review_feedback", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetAdsByLabels requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestAdsetField () {
      return this.requestAdsetField(true);
    }
    public APIRequestGetAdsByLabels requestAdsetField (boolean value) {
      this.requestField("adset", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestAdsetIdField () {
      return this.requestAdsetIdField(true);
    }
    public APIRequestGetAdsByLabels requestAdsetIdField (boolean value) {
      this.requestField("adset_id", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestBidAmountField () {
      return this.requestBidAmountField(true);
    }
    public APIRequestGetAdsByLabels requestBidAmountField (boolean value) {
      this.requestField("bid_amount", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestBidInfoField () {
      return this.requestBidInfoField(true);
    }
    public APIRequestGetAdsByLabels requestBidInfoField (boolean value) {
      this.requestField("bid_info", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestBidTypeField () {
      return this.requestBidTypeField(true);
    }
    public APIRequestGetAdsByLabels requestBidTypeField (boolean value) {
      this.requestField("bid_type", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestCampaignField () {
      return this.requestCampaignField(true);
    }
    public APIRequestGetAdsByLabels requestCampaignField (boolean value) {
      this.requestField("campaign", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestCampaignIdField () {
      return this.requestCampaignIdField(true);
    }
    public APIRequestGetAdsByLabels requestCampaignIdField (boolean value) {
      this.requestField("campaign_id", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetAdsByLabels requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestConversionSpecsField () {
      return this.requestConversionSpecsField(true);
    }
    public APIRequestGetAdsByLabels requestConversionSpecsField (boolean value) {
      this.requestField("conversion_specs", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdsByLabels requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestCreativeField () {
      return this.requestCreativeField(true);
    }
    public APIRequestGetAdsByLabels requestCreativeField (boolean value) {
      this.requestField("creative", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestDemolinkHashField () {
      return this.requestDemolinkHashField(true);
    }
    public APIRequestGetAdsByLabels requestDemolinkHashField (boolean value) {
      this.requestField("demolink_hash", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestDisplaySequenceField () {
      return this.requestDisplaySequenceField(true);
    }
    public APIRequestGetAdsByLabels requestDisplaySequenceField (boolean value) {
      this.requestField("display_sequence", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetAdsByLabels requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestEngagementAudienceField () {
      return this.requestEngagementAudienceField(true);
    }
    public APIRequestGetAdsByLabels requestEngagementAudienceField (boolean value) {
      this.requestField("engagement_audience", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestFailedDeliveryChecksField () {
      return this.requestFailedDeliveryChecksField(true);
    }
    public APIRequestGetAdsByLabels requestFailedDeliveryChecksField (boolean value) {
      this.requestField("failed_delivery_checks", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdsByLabels requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetAdsByLabels requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestLastUpdatedByAppIdField () {
      return this.requestLastUpdatedByAppIdField(true);
    }
    public APIRequestGetAdsByLabels requestLastUpdatedByAppIdField (boolean value) {
      this.requestField("last_updated_by_app_id", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdsByLabels requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestPriorityField () {
      return this.requestPriorityField(true);
    }
    public APIRequestGetAdsByLabels requestPriorityField (boolean value) {
      this.requestField("priority", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetAdsByLabels requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestSourceAdField () {
      return this.requestSourceAdField(true);
    }
    public APIRequestGetAdsByLabels requestSourceAdField (boolean value) {
      this.requestField("source_ad", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestSourceAdIdField () {
      return this.requestSourceAdIdField(true);
    }
    public APIRequestGetAdsByLabels requestSourceAdIdField (boolean value) {
      this.requestField("source_ad_id", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdsByLabels requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestTargetingField () {
      return this.requestTargetingField(true);
    }
    public APIRequestGetAdsByLabels requestTargetingField (boolean value) {
      this.requestField("targeting", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestTrackingAndConversionWithDefaultsField () {
      return this.requestTrackingAndConversionWithDefaultsField(true);
    }
    public APIRequestGetAdsByLabels requestTrackingAndConversionWithDefaultsField (boolean value) {
      this.requestField("tracking_and_conversion_with_defaults", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestTrackingSpecsField () {
      return this.requestTrackingSpecsField(true);
    }
    public APIRequestGetAdsByLabels requestTrackingSpecsField (boolean value) {
      this.requestField("tracking_specs", value);
      return this;
    }
    public APIRequestGetAdsByLabels requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdsByLabels requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestDeleteAdSets extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "before_date",
      "delete_offset",
      "delete_strategy",
      "object_count",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAdSets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAdSets(String nodeId, APIContext context) {
      super(context, nodeId, "/adsets", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAdSets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAdSets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAdSets setBeforeDate (String beforeDate) {
      this.setParam("before_date", beforeDate);
      return this;
    }

    public APIRequestDeleteAdSets setDeleteOffset (Long deleteOffset) {
      this.setParam("delete_offset", deleteOffset);
      return this;
    }
    public APIRequestDeleteAdSets setDeleteOffset (String deleteOffset) {
      this.setParam("delete_offset", deleteOffset);
      return this;
    }

    public APIRequestDeleteAdSets setDeleteStrategy (EnumDeleteStrategy deleteStrategy) {
      this.setParam("delete_strategy", deleteStrategy);
      return this;
    }
    public APIRequestDeleteAdSets setDeleteStrategy (String deleteStrategy) {
      this.setParam("delete_strategy", deleteStrategy);
      return this;
    }

    public APIRequestDeleteAdSets setObjectCount (Long objectCount) {
      this.setParam("object_count", objectCount);
      return this;
    }
    public APIRequestDeleteAdSets setObjectCount (String objectCount) {
      this.setParam("object_count", objectCount);
      return this;
    }

    public APIRequestDeleteAdSets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAdSets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdSets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAdSets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdSets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAdSets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdSets extends APIRequest<AdSet> {

    APINodeList<AdSet> lastResponse = null;
    @Override
    public APINodeList<AdSet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_draft_id",
      "date_preset",
      "effective_status",
      "include_deleted",
      "include_drafts",
      "is_completed",
      "time_range",
      "use_employee_draft",
    };

    public static final String[] FIELDS = {
      "account_id",
      "ad_keywords",
      "adlabels",
      "adset_schedule",
      "asset_feed_id",
      "attribution_spec",
      "best_creative",
      "bid_adjustments",
      "bid_amount",
      "bid_constraints",
      "bid_info",
      "bid_strategy",
      "billing_event",
      "budget_remaining",
      "campaign",
      "campaign_id",
      "configured_status",
      "created_time",
      "creative_sequence",
      "daily_budget",
      "daily_min_spend_target",
      "daily_spend_cap",
      "destination_type",
      "effective_status",
      "end_time",
      "frequency_control_specs",
      "full_funnel_exploration_mode",
      "id",
      "instagram_actor_id",
      "is_dynamic_creative",
      "issues_info",
      "lifetime_budget",
      "lifetime_imps",
      "lifetime_min_spend_target",
      "lifetime_spend_cap",
      "name",
      "optimization_goal",
      "optimization_sub_event",
      "pacing_type",
      "promoted_object",
      "recommendations",
      "recurring_budget_semantics",
      "review_feedback",
      "rf_prediction_id",
      "source_adset",
      "source_adset_id",
      "start_time",
      "status",
      "targeting",
      "time_based_ad_rotation_id_blocks",
      "time_based_ad_rotation_intervals",
      "updated_time",
      "use_new_app_click",
    };

    @Override
    public APINodeList<AdSet> parseResponse(String response, String header) throws APIException {
      return AdSet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdSet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdSet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdSet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdSet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdSet>>() {
           public APINodeList<AdSet> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdSets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdSets(String nodeId, APIContext context) {
      super(context, nodeId, "/adsets", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdSets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdSets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdSets setAdDraftId (String adDraftId) {
      this.setParam("ad_draft_id", adDraftId);
      return this;
    }

    public APIRequestGetAdSets setDatePreset (AdSet.EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestGetAdSets setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestGetAdSets setEffectiveStatus (List<AdSet.EnumEffectiveStatus> effectiveStatus) {
      this.setParam("effective_status", effectiveStatus);
      return this;
    }
    public APIRequestGetAdSets setEffectiveStatus (String effectiveStatus) {
      this.setParam("effective_status", effectiveStatus);
      return this;
    }

    public APIRequestGetAdSets setIncludeDeleted (Boolean includeDeleted) {
      this.setParam("include_deleted", includeDeleted);
      return this;
    }
    public APIRequestGetAdSets setIncludeDeleted (String includeDeleted) {
      this.setParam("include_deleted", includeDeleted);
      return this;
    }

    public APIRequestGetAdSets setIncludeDrafts (Boolean includeDrafts) {
      this.setParam("include_drafts", includeDrafts);
      return this;
    }
    public APIRequestGetAdSets setIncludeDrafts (String includeDrafts) {
      this.setParam("include_drafts", includeDrafts);
      return this;
    }

    public APIRequestGetAdSets setIsCompleted (Boolean isCompleted) {
      this.setParam("is_completed", isCompleted);
      return this;
    }
    public APIRequestGetAdSets setIsCompleted (String isCompleted) {
      this.setParam("is_completed", isCompleted);
      return this;
    }

    public APIRequestGetAdSets setTimeRange (Object timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }
    public APIRequestGetAdSets setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGetAdSets setUseEmployeeDraft (Boolean useEmployeeDraft) {
      this.setParam("use_employee_draft", useEmployeeDraft);
      return this;
    }
    public APIRequestGetAdSets setUseEmployeeDraft (String useEmployeeDraft) {
      this.setParam("use_employee_draft", useEmployeeDraft);
      return this;
    }

    public APIRequestGetAdSets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdSets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdSets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdSets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdSets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdSets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdSets requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdSets requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdSets requestAdKeywordsField () {
      return this.requestAdKeywordsField(true);
    }
    public APIRequestGetAdSets requestAdKeywordsField (boolean value) {
      this.requestField("ad_keywords", value);
      return this;
    }
    public APIRequestGetAdSets requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetAdSets requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetAdSets requestAdsetScheduleField () {
      return this.requestAdsetScheduleField(true);
    }
    public APIRequestGetAdSets requestAdsetScheduleField (boolean value) {
      this.requestField("adset_schedule", value);
      return this;
    }
    public APIRequestGetAdSets requestAssetFeedIdField () {
      return this.requestAssetFeedIdField(true);
    }
    public APIRequestGetAdSets requestAssetFeedIdField (boolean value) {
      this.requestField("asset_feed_id", value);
      return this;
    }
    public APIRequestGetAdSets requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGetAdSets requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGetAdSets requestBestCreativeField () {
      return this.requestBestCreativeField(true);
    }
    public APIRequestGetAdSets requestBestCreativeField (boolean value) {
      this.requestField("best_creative", value);
      return this;
    }
    public APIRequestGetAdSets requestBidAdjustmentsField () {
      return this.requestBidAdjustmentsField(true);
    }
    public APIRequestGetAdSets requestBidAdjustmentsField (boolean value) {
      this.requestField("bid_adjustments", value);
      return this;
    }
    public APIRequestGetAdSets requestBidAmountField () {
      return this.requestBidAmountField(true);
    }
    public APIRequestGetAdSets requestBidAmountField (boolean value) {
      this.requestField("bid_amount", value);
      return this;
    }
    public APIRequestGetAdSets requestBidConstraintsField () {
      return this.requestBidConstraintsField(true);
    }
    public APIRequestGetAdSets requestBidConstraintsField (boolean value) {
      this.requestField("bid_constraints", value);
      return this;
    }
    public APIRequestGetAdSets requestBidInfoField () {
      return this.requestBidInfoField(true);
    }
    public APIRequestGetAdSets requestBidInfoField (boolean value) {
      this.requestField("bid_info", value);
      return this;
    }
    public APIRequestGetAdSets requestBidStrategyField () {
      return this.requestBidStrategyField(true);
    }
    public APIRequestGetAdSets requestBidStrategyField (boolean value) {
      this.requestField("bid_strategy", value);
      return this;
    }
    public APIRequestGetAdSets requestBillingEventField () {
      return this.requestBillingEventField(true);
    }
    public APIRequestGetAdSets requestBillingEventField (boolean value) {
      this.requestField("billing_event", value);
      return this;
    }
    public APIRequestGetAdSets requestBudgetRemainingField () {
      return this.requestBudgetRemainingField(true);
    }
    public APIRequestGetAdSets requestBudgetRemainingField (boolean value) {
      this.requestField("budget_remaining", value);
      return this;
    }
    public APIRequestGetAdSets requestCampaignField () {
      return this.requestCampaignField(true);
    }
    public APIRequestGetAdSets requestCampaignField (boolean value) {
      this.requestField("campaign", value);
      return this;
    }
    public APIRequestGetAdSets requestCampaignIdField () {
      return this.requestCampaignIdField(true);
    }
    public APIRequestGetAdSets requestCampaignIdField (boolean value) {
      this.requestField("campaign_id", value);
      return this;
    }
    public APIRequestGetAdSets requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetAdSets requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetAdSets requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdSets requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdSets requestCreativeSequenceField () {
      return this.requestCreativeSequenceField(true);
    }
    public APIRequestGetAdSets requestCreativeSequenceField (boolean value) {
      this.requestField("creative_sequence", value);
      return this;
    }
    public APIRequestGetAdSets requestDailyBudgetField () {
      return this.requestDailyBudgetField(true);
    }
    public APIRequestGetAdSets requestDailyBudgetField (boolean value) {
      this.requestField("daily_budget", value);
      return this;
    }
    public APIRequestGetAdSets requestDailyMinSpendTargetField () {
      return this.requestDailyMinSpendTargetField(true);
    }
    public APIRequestGetAdSets requestDailyMinSpendTargetField (boolean value) {
      this.requestField("daily_min_spend_target", value);
      return this;
    }
    public APIRequestGetAdSets requestDailySpendCapField () {
      return this.requestDailySpendCapField(true);
    }
    public APIRequestGetAdSets requestDailySpendCapField (boolean value) {
      this.requestField("daily_spend_cap", value);
      return this;
    }
    public APIRequestGetAdSets requestDestinationTypeField () {
      return this.requestDestinationTypeField(true);
    }
    public APIRequestGetAdSets requestDestinationTypeField (boolean value) {
      this.requestField("destination_type", value);
      return this;
    }
    public APIRequestGetAdSets requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetAdSets requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetAdSets requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetAdSets requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetAdSets requestFrequencyControlSpecsField () {
      return this.requestFrequencyControlSpecsField(true);
    }
    public APIRequestGetAdSets requestFrequencyControlSpecsField (boolean value) {
      this.requestField("frequency_control_specs", value);
      return this;
    }
    public APIRequestGetAdSets requestFullFunnelExplorationModeField () {
      return this.requestFullFunnelExplorationModeField(true);
    }
    public APIRequestGetAdSets requestFullFunnelExplorationModeField (boolean value) {
      this.requestField("full_funnel_exploration_mode", value);
      return this;
    }
    public APIRequestGetAdSets requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdSets requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdSets requestInstagramActorIdField () {
      return this.requestInstagramActorIdField(true);
    }
    public APIRequestGetAdSets requestInstagramActorIdField (boolean value) {
      this.requestField("instagram_actor_id", value);
      return this;
    }
    public APIRequestGetAdSets requestIsDynamicCreativeField () {
      return this.requestIsDynamicCreativeField(true);
    }
    public APIRequestGetAdSets requestIsDynamicCreativeField (boolean value) {
      this.requestField("is_dynamic_creative", value);
      return this;
    }
    public APIRequestGetAdSets requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetAdSets requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetAdSets requestLifetimeBudgetField () {
      return this.requestLifetimeBudgetField(true);
    }
    public APIRequestGetAdSets requestLifetimeBudgetField (boolean value) {
      this.requestField("lifetime_budget", value);
      return this;
    }
    public APIRequestGetAdSets requestLifetimeImpsField () {
      return this.requestLifetimeImpsField(true);
    }
    public APIRequestGetAdSets requestLifetimeImpsField (boolean value) {
      this.requestField("lifetime_imps", value);
      return this;
    }
    public APIRequestGetAdSets requestLifetimeMinSpendTargetField () {
      return this.requestLifetimeMinSpendTargetField(true);
    }
    public APIRequestGetAdSets requestLifetimeMinSpendTargetField (boolean value) {
      this.requestField("lifetime_min_spend_target", value);
      return this;
    }
    public APIRequestGetAdSets requestLifetimeSpendCapField () {
      return this.requestLifetimeSpendCapField(true);
    }
    public APIRequestGetAdSets requestLifetimeSpendCapField (boolean value) {
      this.requestField("lifetime_spend_cap", value);
      return this;
    }
    public APIRequestGetAdSets requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdSets requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdSets requestOptimizationGoalField () {
      return this.requestOptimizationGoalField(true);
    }
    public APIRequestGetAdSets requestOptimizationGoalField (boolean value) {
      this.requestField("optimization_goal", value);
      return this;
    }
    public APIRequestGetAdSets requestOptimizationSubEventField () {
      return this.requestOptimizationSubEventField(true);
    }
    public APIRequestGetAdSets requestOptimizationSubEventField (boolean value) {
      this.requestField("optimization_sub_event", value);
      return this;
    }
    public APIRequestGetAdSets requestPacingTypeField () {
      return this.requestPacingTypeField(true);
    }
    public APIRequestGetAdSets requestPacingTypeField (boolean value) {
      this.requestField("pacing_type", value);
      return this;
    }
    public APIRequestGetAdSets requestPromotedObjectField () {
      return this.requestPromotedObjectField(true);
    }
    public APIRequestGetAdSets requestPromotedObjectField (boolean value) {
      this.requestField("promoted_object", value);
      return this;
    }
    public APIRequestGetAdSets requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetAdSets requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetAdSets requestRecurringBudgetSemanticsField () {
      return this.requestRecurringBudgetSemanticsField(true);
    }
    public APIRequestGetAdSets requestRecurringBudgetSemanticsField (boolean value) {
      this.requestField("recurring_budget_semantics", value);
      return this;
    }
    public APIRequestGetAdSets requestReviewFeedbackField () {
      return this.requestReviewFeedbackField(true);
    }
    public APIRequestGetAdSets requestReviewFeedbackField (boolean value) {
      this.requestField("review_feedback", value);
      return this;
    }
    public APIRequestGetAdSets requestRfPredictionIdField () {
      return this.requestRfPredictionIdField(true);
    }
    public APIRequestGetAdSets requestRfPredictionIdField (boolean value) {
      this.requestField("rf_prediction_id", value);
      return this;
    }
    public APIRequestGetAdSets requestSourceAdsetField () {
      return this.requestSourceAdsetField(true);
    }
    public APIRequestGetAdSets requestSourceAdsetField (boolean value) {
      this.requestField("source_adset", value);
      return this;
    }
    public APIRequestGetAdSets requestSourceAdsetIdField () {
      return this.requestSourceAdsetIdField(true);
    }
    public APIRequestGetAdSets requestSourceAdsetIdField (boolean value) {
      this.requestField("source_adset_id", value);
      return this;
    }
    public APIRequestGetAdSets requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetAdSets requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetAdSets requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdSets requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdSets requestTargetingField () {
      return this.requestTargetingField(true);
    }
    public APIRequestGetAdSets requestTargetingField (boolean value) {
      this.requestField("targeting", value);
      return this;
    }
    public APIRequestGetAdSets requestTimeBasedAdRotationIdBlocksField () {
      return this.requestTimeBasedAdRotationIdBlocksField(true);
    }
    public APIRequestGetAdSets requestTimeBasedAdRotationIdBlocksField (boolean value) {
      this.requestField("time_based_ad_rotation_id_blocks", value);
      return this;
    }
    public APIRequestGetAdSets requestTimeBasedAdRotationIntervalsField () {
      return this.requestTimeBasedAdRotationIntervalsField(true);
    }
    public APIRequestGetAdSets requestTimeBasedAdRotationIntervalsField (boolean value) {
      this.requestField("time_based_ad_rotation_intervals", value);
      return this;
    }
    public APIRequestGetAdSets requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdSets requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetAdSets requestUseNewAppClickField () {
      return this.requestUseNewAppClickField(true);
    }
    public APIRequestGetAdSets requestUseNewAppClickField (boolean value) {
      this.requestField("use_new_app_click", value);
      return this;
    }
  }

  public static class APIRequestGetAdSetsByLabels extends APIRequest<AdSet> {

    APINodeList<AdSet> lastResponse = null;
    @Override
    public APINodeList<AdSet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_label_ids",
      "operator",
    };

    public static final String[] FIELDS = {
      "account_id",
      "ad_keywords",
      "adlabels",
      "adset_schedule",
      "asset_feed_id",
      "attribution_spec",
      "best_creative",
      "bid_adjustments",
      "bid_amount",
      "bid_constraints",
      "bid_info",
      "bid_strategy",
      "billing_event",
      "budget_remaining",
      "campaign",
      "campaign_id",
      "configured_status",
      "created_time",
      "creative_sequence",
      "daily_budget",
      "daily_min_spend_target",
      "daily_spend_cap",
      "destination_type",
      "effective_status",
      "end_time",
      "frequency_control_specs",
      "full_funnel_exploration_mode",
      "id",
      "instagram_actor_id",
      "is_dynamic_creative",
      "issues_info",
      "lifetime_budget",
      "lifetime_imps",
      "lifetime_min_spend_target",
      "lifetime_spend_cap",
      "name",
      "optimization_goal",
      "optimization_sub_event",
      "pacing_type",
      "promoted_object",
      "recommendations",
      "recurring_budget_semantics",
      "review_feedback",
      "rf_prediction_id",
      "source_adset",
      "source_adset_id",
      "start_time",
      "status",
      "targeting",
      "time_based_ad_rotation_id_blocks",
      "time_based_ad_rotation_intervals",
      "updated_time",
      "use_new_app_click",
    };

    @Override
    public APINodeList<AdSet> parseResponse(String response, String header) throws APIException {
      return AdSet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdSet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdSet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdSet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdSet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdSet>>() {
           public APINodeList<AdSet> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdSetsByLabels.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdSetsByLabels(String nodeId, APIContext context) {
      super(context, nodeId, "/adsetsbylabels", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdSetsByLabels setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdSetsByLabels setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdSetsByLabels setAdLabelIds (List<String> adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }
    public APIRequestGetAdSetsByLabels setAdLabelIds (String adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }

    public APIRequestGetAdSetsByLabels setOperator (AdSet.EnumOperator operator) {
      this.setParam("operator", operator);
      return this;
    }
    public APIRequestGetAdSetsByLabels setOperator (String operator) {
      this.setParam("operator", operator);
      return this;
    }

    public APIRequestGetAdSetsByLabels requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdSetsByLabels requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdSetsByLabels requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdSetsByLabels requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdSetsByLabels requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdSetsByLabels requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdSetsByLabels requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestAdKeywordsField () {
      return this.requestAdKeywordsField(true);
    }
    public APIRequestGetAdSetsByLabels requestAdKeywordsField (boolean value) {
      this.requestField("ad_keywords", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetAdSetsByLabels requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestAdsetScheduleField () {
      return this.requestAdsetScheduleField(true);
    }
    public APIRequestGetAdSetsByLabels requestAdsetScheduleField (boolean value) {
      this.requestField("adset_schedule", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestAssetFeedIdField () {
      return this.requestAssetFeedIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestAssetFeedIdField (boolean value) {
      this.requestField("asset_feed_id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGetAdSetsByLabels requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBestCreativeField () {
      return this.requestBestCreativeField(true);
    }
    public APIRequestGetAdSetsByLabels requestBestCreativeField (boolean value) {
      this.requestField("best_creative", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBidAdjustmentsField () {
      return this.requestBidAdjustmentsField(true);
    }
    public APIRequestGetAdSetsByLabels requestBidAdjustmentsField (boolean value) {
      this.requestField("bid_adjustments", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBidAmountField () {
      return this.requestBidAmountField(true);
    }
    public APIRequestGetAdSetsByLabels requestBidAmountField (boolean value) {
      this.requestField("bid_amount", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBidConstraintsField () {
      return this.requestBidConstraintsField(true);
    }
    public APIRequestGetAdSetsByLabels requestBidConstraintsField (boolean value) {
      this.requestField("bid_constraints", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBidInfoField () {
      return this.requestBidInfoField(true);
    }
    public APIRequestGetAdSetsByLabels requestBidInfoField (boolean value) {
      this.requestField("bid_info", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBidStrategyField () {
      return this.requestBidStrategyField(true);
    }
    public APIRequestGetAdSetsByLabels requestBidStrategyField (boolean value) {
      this.requestField("bid_strategy", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBillingEventField () {
      return this.requestBillingEventField(true);
    }
    public APIRequestGetAdSetsByLabels requestBillingEventField (boolean value) {
      this.requestField("billing_event", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestBudgetRemainingField () {
      return this.requestBudgetRemainingField(true);
    }
    public APIRequestGetAdSetsByLabels requestBudgetRemainingField (boolean value) {
      this.requestField("budget_remaining", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestCampaignField () {
      return this.requestCampaignField(true);
    }
    public APIRequestGetAdSetsByLabels requestCampaignField (boolean value) {
      this.requestField("campaign", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestCampaignIdField () {
      return this.requestCampaignIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestCampaignIdField (boolean value) {
      this.requestField("campaign_id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetAdSetsByLabels requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdSetsByLabels requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestCreativeSequenceField () {
      return this.requestCreativeSequenceField(true);
    }
    public APIRequestGetAdSetsByLabels requestCreativeSequenceField (boolean value) {
      this.requestField("creative_sequence", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestDailyBudgetField () {
      return this.requestDailyBudgetField(true);
    }
    public APIRequestGetAdSetsByLabels requestDailyBudgetField (boolean value) {
      this.requestField("daily_budget", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestDailyMinSpendTargetField () {
      return this.requestDailyMinSpendTargetField(true);
    }
    public APIRequestGetAdSetsByLabels requestDailyMinSpendTargetField (boolean value) {
      this.requestField("daily_min_spend_target", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestDailySpendCapField () {
      return this.requestDailySpendCapField(true);
    }
    public APIRequestGetAdSetsByLabels requestDailySpendCapField (boolean value) {
      this.requestField("daily_spend_cap", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestDestinationTypeField () {
      return this.requestDestinationTypeField(true);
    }
    public APIRequestGetAdSetsByLabels requestDestinationTypeField (boolean value) {
      this.requestField("destination_type", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetAdSetsByLabels requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetAdSetsByLabels requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestFrequencyControlSpecsField () {
      return this.requestFrequencyControlSpecsField(true);
    }
    public APIRequestGetAdSetsByLabels requestFrequencyControlSpecsField (boolean value) {
      this.requestField("frequency_control_specs", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestFullFunnelExplorationModeField () {
      return this.requestFullFunnelExplorationModeField(true);
    }
    public APIRequestGetAdSetsByLabels requestFullFunnelExplorationModeField (boolean value) {
      this.requestField("full_funnel_exploration_mode", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestInstagramActorIdField () {
      return this.requestInstagramActorIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestInstagramActorIdField (boolean value) {
      this.requestField("instagram_actor_id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestIsDynamicCreativeField () {
      return this.requestIsDynamicCreativeField(true);
    }
    public APIRequestGetAdSetsByLabels requestIsDynamicCreativeField (boolean value) {
      this.requestField("is_dynamic_creative", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetAdSetsByLabels requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestLifetimeBudgetField () {
      return this.requestLifetimeBudgetField(true);
    }
    public APIRequestGetAdSetsByLabels requestLifetimeBudgetField (boolean value) {
      this.requestField("lifetime_budget", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestLifetimeImpsField () {
      return this.requestLifetimeImpsField(true);
    }
    public APIRequestGetAdSetsByLabels requestLifetimeImpsField (boolean value) {
      this.requestField("lifetime_imps", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestLifetimeMinSpendTargetField () {
      return this.requestLifetimeMinSpendTargetField(true);
    }
    public APIRequestGetAdSetsByLabels requestLifetimeMinSpendTargetField (boolean value) {
      this.requestField("lifetime_min_spend_target", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestLifetimeSpendCapField () {
      return this.requestLifetimeSpendCapField(true);
    }
    public APIRequestGetAdSetsByLabels requestLifetimeSpendCapField (boolean value) {
      this.requestField("lifetime_spend_cap", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdSetsByLabels requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestOptimizationGoalField () {
      return this.requestOptimizationGoalField(true);
    }
    public APIRequestGetAdSetsByLabels requestOptimizationGoalField (boolean value) {
      this.requestField("optimization_goal", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestOptimizationSubEventField () {
      return this.requestOptimizationSubEventField(true);
    }
    public APIRequestGetAdSetsByLabels requestOptimizationSubEventField (boolean value) {
      this.requestField("optimization_sub_event", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestPacingTypeField () {
      return this.requestPacingTypeField(true);
    }
    public APIRequestGetAdSetsByLabels requestPacingTypeField (boolean value) {
      this.requestField("pacing_type", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestPromotedObjectField () {
      return this.requestPromotedObjectField(true);
    }
    public APIRequestGetAdSetsByLabels requestPromotedObjectField (boolean value) {
      this.requestField("promoted_object", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetAdSetsByLabels requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestRecurringBudgetSemanticsField () {
      return this.requestRecurringBudgetSemanticsField(true);
    }
    public APIRequestGetAdSetsByLabels requestRecurringBudgetSemanticsField (boolean value) {
      this.requestField("recurring_budget_semantics", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestReviewFeedbackField () {
      return this.requestReviewFeedbackField(true);
    }
    public APIRequestGetAdSetsByLabels requestReviewFeedbackField (boolean value) {
      this.requestField("review_feedback", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestRfPredictionIdField () {
      return this.requestRfPredictionIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestRfPredictionIdField (boolean value) {
      this.requestField("rf_prediction_id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestSourceAdsetField () {
      return this.requestSourceAdsetField(true);
    }
    public APIRequestGetAdSetsByLabels requestSourceAdsetField (boolean value) {
      this.requestField("source_adset", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestSourceAdsetIdField () {
      return this.requestSourceAdsetIdField(true);
    }
    public APIRequestGetAdSetsByLabels requestSourceAdsetIdField (boolean value) {
      this.requestField("source_adset_id", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetAdSetsByLabels requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdSetsByLabels requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestTargetingField () {
      return this.requestTargetingField(true);
    }
    public APIRequestGetAdSetsByLabels requestTargetingField (boolean value) {
      this.requestField("targeting", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestTimeBasedAdRotationIdBlocksField () {
      return this.requestTimeBasedAdRotationIdBlocksField(true);
    }
    public APIRequestGetAdSetsByLabels requestTimeBasedAdRotationIdBlocksField (boolean value) {
      this.requestField("time_based_ad_rotation_id_blocks", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestTimeBasedAdRotationIntervalsField () {
      return this.requestTimeBasedAdRotationIntervalsField(true);
    }
    public APIRequestGetAdSetsByLabels requestTimeBasedAdRotationIntervalsField (boolean value) {
      this.requestField("time_based_ad_rotation_intervals", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdSetsByLabels requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetAdSetsByLabels requestUseNewAppClickField () {
      return this.requestUseNewAppClickField(true);
    }
    public APIRequestGetAdSetsByLabels requestUseNewAppClickField (boolean value) {
      this.requestField("use_new_app_click", value);
      return this;
    }
  }

  public static class APIRequestGetAdsPixels extends APIRequest<AdsPixel> {

    APINodeList<AdsPixel> lastResponse = null;
    @Override
    public APINodeList<AdsPixel> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "sort_by",
    };

    public static final String[] FIELDS = {
      "automatic_matching_fields",
      "can_proxy",
      "code",
      "creation_time",
      "creator",
      "data_use_setting",
      "enable_automatic_matching",
      "first_party_cookie_status",
      "id",
      "is_created_by_business",
      "last_fired_time",
      "name",
      "owner_ad_account",
      "owner_business",
    };

    @Override
    public APINodeList<AdsPixel> parseResponse(String response, String header) throws APIException {
      return AdsPixel.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdsPixel> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdsPixel> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdsPixel>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdsPixel>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdsPixel>>() {
           public APINodeList<AdsPixel> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdsPixels.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdsPixels(String nodeId, APIContext context) {
      super(context, nodeId, "/adspixels", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdsPixels setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdsPixels setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdsPixels setSortBy (AdsPixel.EnumSortBy sortBy) {
      this.setParam("sort_by", sortBy);
      return this;
    }
    public APIRequestGetAdsPixels setSortBy (String sortBy) {
      this.setParam("sort_by", sortBy);
      return this;
    }

    public APIRequestGetAdsPixels requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdsPixels requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdsPixels requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdsPixels requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdsPixels requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdsPixels requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdsPixels requestAutomaticMatchingFieldsField () {
      return this.requestAutomaticMatchingFieldsField(true);
    }
    public APIRequestGetAdsPixels requestAutomaticMatchingFieldsField (boolean value) {
      this.requestField("automatic_matching_fields", value);
      return this;
    }
    public APIRequestGetAdsPixels requestCanProxyField () {
      return this.requestCanProxyField(true);
    }
    public APIRequestGetAdsPixels requestCanProxyField (boolean value) {
      this.requestField("can_proxy", value);
      return this;
    }
    public APIRequestGetAdsPixels requestCodeField () {
      return this.requestCodeField(true);
    }
    public APIRequestGetAdsPixels requestCodeField (boolean value) {
      this.requestField("code", value);
      return this;
    }
    public APIRequestGetAdsPixels requestCreationTimeField () {
      return this.requestCreationTimeField(true);
    }
    public APIRequestGetAdsPixels requestCreationTimeField (boolean value) {
      this.requestField("creation_time", value);
      return this;
    }
    public APIRequestGetAdsPixels requestCreatorField () {
      return this.requestCreatorField(true);
    }
    public APIRequestGetAdsPixels requestCreatorField (boolean value) {
      this.requestField("creator", value);
      return this;
    }
    public APIRequestGetAdsPixels requestDataUseSettingField () {
      return this.requestDataUseSettingField(true);
    }
    public APIRequestGetAdsPixels requestDataUseSettingField (boolean value) {
      this.requestField("data_use_setting", value);
      return this;
    }
    public APIRequestGetAdsPixels requestEnableAutomaticMatchingField () {
      return this.requestEnableAutomaticMatchingField(true);
    }
    public APIRequestGetAdsPixels requestEnableAutomaticMatchingField (boolean value) {
      this.requestField("enable_automatic_matching", value);
      return this;
    }
    public APIRequestGetAdsPixels requestFirstPartyCookieStatusField () {
      return this.requestFirstPartyCookieStatusField(true);
    }
    public APIRequestGetAdsPixels requestFirstPartyCookieStatusField (boolean value) {
      this.requestField("first_party_cookie_status", value);
      return this;
    }
    public APIRequestGetAdsPixels requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdsPixels requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdsPixels requestIsCreatedByBusinessField () {
      return this.requestIsCreatedByBusinessField(true);
    }
    public APIRequestGetAdsPixels requestIsCreatedByBusinessField (boolean value) {
      this.requestField("is_created_by_business", value);
      return this;
    }
    public APIRequestGetAdsPixels requestLastFiredTimeField () {
      return this.requestLastFiredTimeField(true);
    }
    public APIRequestGetAdsPixels requestLastFiredTimeField (boolean value) {
      this.requestField("last_fired_time", value);
      return this;
    }
    public APIRequestGetAdsPixels requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdsPixels requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdsPixels requestOwnerAdAccountField () {
      return this.requestOwnerAdAccountField(true);
    }
    public APIRequestGetAdsPixels requestOwnerAdAccountField (boolean value) {
      this.requestField("owner_ad_account", value);
      return this;
    }
    public APIRequestGetAdsPixels requestOwnerBusinessField () {
      return this.requestOwnerBusinessField(true);
    }
    public APIRequestGetAdsPixels requestOwnerBusinessField (boolean value) {
      this.requestField("owner_business", value);
      return this;
    }
  }

  public static class APIRequestCreateAdsPixel extends APIRequest<AdsPixel> {

    AdsPixel lastResponse = null;
    @Override
    public AdsPixel getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "name",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdsPixel parseResponse(String response, String header) throws APIException {
      return AdsPixel.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdsPixel execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdsPixel execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdsPixel> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdsPixel> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdsPixel>() {
           public AdsPixel apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdsPixel.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdsPixel(String nodeId, APIContext context) {
      super(context, nodeId, "/adspixels", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAdsPixel setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdsPixel setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAdsPixel setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdsPixel requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdsPixel requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdsPixel requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdsPixel requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdsPixel requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdsPixel requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdToplineDetails extends APIRequest<AdToplineDetail> {

    APINodeList<AdToplineDetail> lastResponse = null;
    @Override
    public APINodeList<AdToplineDetail> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "active_status",
      "ad_account_id",
      "flight_end_date",
      "flight_start_date",
      "id",
      "io_number",
      "line_number",
      "price",
      "quantity",
      "sf_detail_line_id",
      "subline_id",
      "targets",
      "time_created",
      "time_updated",
      "topline_id",
    };

    @Override
    public APINodeList<AdToplineDetail> parseResponse(String response, String header) throws APIException {
      return AdToplineDetail.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdToplineDetail> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdToplineDetail> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdToplineDetail>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdToplineDetail>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdToplineDetail>>() {
           public APINodeList<AdToplineDetail> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdToplineDetails.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdToplineDetails(String nodeId, APIContext context) {
      super(context, nodeId, "/adtoplinedetails", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdToplineDetails setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdToplineDetails setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdToplineDetails requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdToplineDetails requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdToplineDetails requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdToplineDetails requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdToplineDetails requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdToplineDetails requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdToplineDetails requestActiveStatusField () {
      return this.requestActiveStatusField(true);
    }
    public APIRequestGetAdToplineDetails requestActiveStatusField (boolean value) {
      this.requestField("active_status", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestAdAccountIdField () {
      return this.requestAdAccountIdField(true);
    }
    public APIRequestGetAdToplineDetails requestAdAccountIdField (boolean value) {
      this.requestField("ad_account_id", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestFlightEndDateField () {
      return this.requestFlightEndDateField(true);
    }
    public APIRequestGetAdToplineDetails requestFlightEndDateField (boolean value) {
      this.requestField("flight_end_date", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestFlightStartDateField () {
      return this.requestFlightStartDateField(true);
    }
    public APIRequestGetAdToplineDetails requestFlightStartDateField (boolean value) {
      this.requestField("flight_start_date", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdToplineDetails requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGetAdToplineDetails requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestLineNumberField () {
      return this.requestLineNumberField(true);
    }
    public APIRequestGetAdToplineDetails requestLineNumberField (boolean value) {
      this.requestField("line_number", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestPriceField () {
      return this.requestPriceField(true);
    }
    public APIRequestGetAdToplineDetails requestPriceField (boolean value) {
      this.requestField("price", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestQuantityField () {
      return this.requestQuantityField(true);
    }
    public APIRequestGetAdToplineDetails requestQuantityField (boolean value) {
      this.requestField("quantity", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestSfDetailLineIdField () {
      return this.requestSfDetailLineIdField(true);
    }
    public APIRequestGetAdToplineDetails requestSfDetailLineIdField (boolean value) {
      this.requestField("sf_detail_line_id", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestSublineIdField () {
      return this.requestSublineIdField(true);
    }
    public APIRequestGetAdToplineDetails requestSublineIdField (boolean value) {
      this.requestField("subline_id", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestTargetsField () {
      return this.requestTargetsField(true);
    }
    public APIRequestGetAdToplineDetails requestTargetsField (boolean value) {
      this.requestField("targets", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestTimeCreatedField () {
      return this.requestTimeCreatedField(true);
    }
    public APIRequestGetAdToplineDetails requestTimeCreatedField (boolean value) {
      this.requestField("time_created", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestTimeUpdatedField () {
      return this.requestTimeUpdatedField(true);
    }
    public APIRequestGetAdToplineDetails requestTimeUpdatedField (boolean value) {
      this.requestField("time_updated", value);
      return this;
    }
    public APIRequestGetAdToplineDetails requestToplineIdField () {
      return this.requestToplineIdField(true);
    }
    public APIRequestGetAdToplineDetails requestToplineIdField (boolean value) {
      this.requestField("topline_id", value);
      return this;
    }
  }

  public static class APIRequestGetAdTopLines extends APIRequest<AdTopline> {

    APINodeList<AdTopline> lastResponse = null;
    @Override
    public APINodeList<AdTopline> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "client_approval_date",
      "created_by",
      "created_date",
      "description",
      "flight_end_date",
      "flight_start_date",
      "func_cap_amount",
      "func_cap_amount_with_offset",
      "func_line_amount",
      "func_line_amount_with_offset",
      "func_price",
      "func_price_with_offset",
      "gender",
      "id",
      "impressions",
      "io_number",
      "is_bonus_line",
      "keywords",
      "last_updated_by",
      "last_updated_date",
      "line_number",
      "line_position",
      "line_type",
      "location",
      "max_age",
      "max_budget",
      "min_age",
      "price_per_trp",
      "product_type",
      "rev_assurance_approval_date",
      "targets",
      "trp_updated_time",
      "trp_value",
      "uom",
    };

    @Override
    public APINodeList<AdTopline> parseResponse(String response, String header) throws APIException {
      return AdTopline.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdTopline> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdTopline> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdTopline>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdTopline>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdTopline>>() {
           public APINodeList<AdTopline> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdTopLines.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdTopLines(String nodeId, APIContext context) {
      super(context, nodeId, "/adtoplines", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdTopLines setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdTopLines setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdTopLines requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdTopLines requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdTopLines requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdTopLines requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdTopLines requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdTopLines requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdTopLines requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdTopLines requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdTopLines requestClientApprovalDateField () {
      return this.requestClientApprovalDateField(true);
    }
    public APIRequestGetAdTopLines requestClientApprovalDateField (boolean value) {
      this.requestField("client_approval_date", value);
      return this;
    }
    public APIRequestGetAdTopLines requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetAdTopLines requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetAdTopLines requestCreatedDateField () {
      return this.requestCreatedDateField(true);
    }
    public APIRequestGetAdTopLines requestCreatedDateField (boolean value) {
      this.requestField("created_date", value);
      return this;
    }
    public APIRequestGetAdTopLines requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAdTopLines requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFlightEndDateField () {
      return this.requestFlightEndDateField(true);
    }
    public APIRequestGetAdTopLines requestFlightEndDateField (boolean value) {
      this.requestField("flight_end_date", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFlightStartDateField () {
      return this.requestFlightStartDateField(true);
    }
    public APIRequestGetAdTopLines requestFlightStartDateField (boolean value) {
      this.requestField("flight_start_date", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFuncCapAmountField () {
      return this.requestFuncCapAmountField(true);
    }
    public APIRequestGetAdTopLines requestFuncCapAmountField (boolean value) {
      this.requestField("func_cap_amount", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFuncCapAmountWithOffsetField () {
      return this.requestFuncCapAmountWithOffsetField(true);
    }
    public APIRequestGetAdTopLines requestFuncCapAmountWithOffsetField (boolean value) {
      this.requestField("func_cap_amount_with_offset", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFuncLineAmountField () {
      return this.requestFuncLineAmountField(true);
    }
    public APIRequestGetAdTopLines requestFuncLineAmountField (boolean value) {
      this.requestField("func_line_amount", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFuncLineAmountWithOffsetField () {
      return this.requestFuncLineAmountWithOffsetField(true);
    }
    public APIRequestGetAdTopLines requestFuncLineAmountWithOffsetField (boolean value) {
      this.requestField("func_line_amount_with_offset", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFuncPriceField () {
      return this.requestFuncPriceField(true);
    }
    public APIRequestGetAdTopLines requestFuncPriceField (boolean value) {
      this.requestField("func_price", value);
      return this;
    }
    public APIRequestGetAdTopLines requestFuncPriceWithOffsetField () {
      return this.requestFuncPriceWithOffsetField(true);
    }
    public APIRequestGetAdTopLines requestFuncPriceWithOffsetField (boolean value) {
      this.requestField("func_price_with_offset", value);
      return this;
    }
    public APIRequestGetAdTopLines requestGenderField () {
      return this.requestGenderField(true);
    }
    public APIRequestGetAdTopLines requestGenderField (boolean value) {
      this.requestField("gender", value);
      return this;
    }
    public APIRequestGetAdTopLines requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdTopLines requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdTopLines requestImpressionsField () {
      return this.requestImpressionsField(true);
    }
    public APIRequestGetAdTopLines requestImpressionsField (boolean value) {
      this.requestField("impressions", value);
      return this;
    }
    public APIRequestGetAdTopLines requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGetAdTopLines requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGetAdTopLines requestIsBonusLineField () {
      return this.requestIsBonusLineField(true);
    }
    public APIRequestGetAdTopLines requestIsBonusLineField (boolean value) {
      this.requestField("is_bonus_line", value);
      return this;
    }
    public APIRequestGetAdTopLines requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetAdTopLines requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetAdTopLines requestLastUpdatedByField () {
      return this.requestLastUpdatedByField(true);
    }
    public APIRequestGetAdTopLines requestLastUpdatedByField (boolean value) {
      this.requestField("last_updated_by", value);
      return this;
    }
    public APIRequestGetAdTopLines requestLastUpdatedDateField () {
      return this.requestLastUpdatedDateField(true);
    }
    public APIRequestGetAdTopLines requestLastUpdatedDateField (boolean value) {
      this.requestField("last_updated_date", value);
      return this;
    }
    public APIRequestGetAdTopLines requestLineNumberField () {
      return this.requestLineNumberField(true);
    }
    public APIRequestGetAdTopLines requestLineNumberField (boolean value) {
      this.requestField("line_number", value);
      return this;
    }
    public APIRequestGetAdTopLines requestLinePositionField () {
      return this.requestLinePositionField(true);
    }
    public APIRequestGetAdTopLines requestLinePositionField (boolean value) {
      this.requestField("line_position", value);
      return this;
    }
    public APIRequestGetAdTopLines requestLineTypeField () {
      return this.requestLineTypeField(true);
    }
    public APIRequestGetAdTopLines requestLineTypeField (boolean value) {
      this.requestField("line_type", value);
      return this;
    }
    public APIRequestGetAdTopLines requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetAdTopLines requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetAdTopLines requestMaxAgeField () {
      return this.requestMaxAgeField(true);
    }
    public APIRequestGetAdTopLines requestMaxAgeField (boolean value) {
      this.requestField("max_age", value);
      return this;
    }
    public APIRequestGetAdTopLines requestMaxBudgetField () {
      return this.requestMaxBudgetField(true);
    }
    public APIRequestGetAdTopLines requestMaxBudgetField (boolean value) {
      this.requestField("max_budget", value);
      return this;
    }
    public APIRequestGetAdTopLines requestMinAgeField () {
      return this.requestMinAgeField(true);
    }
    public APIRequestGetAdTopLines requestMinAgeField (boolean value) {
      this.requestField("min_age", value);
      return this;
    }
    public APIRequestGetAdTopLines requestPricePerTrpField () {
      return this.requestPricePerTrpField(true);
    }
    public APIRequestGetAdTopLines requestPricePerTrpField (boolean value) {
      this.requestField("price_per_trp", value);
      return this;
    }
    public APIRequestGetAdTopLines requestProductTypeField () {
      return this.requestProductTypeField(true);
    }
    public APIRequestGetAdTopLines requestProductTypeField (boolean value) {
      this.requestField("product_type", value);
      return this;
    }
    public APIRequestGetAdTopLines requestRevAssuranceApprovalDateField () {
      return this.requestRevAssuranceApprovalDateField(true);
    }
    public APIRequestGetAdTopLines requestRevAssuranceApprovalDateField (boolean value) {
      this.requestField("rev_assurance_approval_date", value);
      return this;
    }
    public APIRequestGetAdTopLines requestTargetsField () {
      return this.requestTargetsField(true);
    }
    public APIRequestGetAdTopLines requestTargetsField (boolean value) {
      this.requestField("targets", value);
      return this;
    }
    public APIRequestGetAdTopLines requestTrpUpdatedTimeField () {
      return this.requestTrpUpdatedTimeField(true);
    }
    public APIRequestGetAdTopLines requestTrpUpdatedTimeField (boolean value) {
      this.requestField("trp_updated_time", value);
      return this;
    }
    public APIRequestGetAdTopLines requestTrpValueField () {
      return this.requestTrpValueField(true);
    }
    public APIRequestGetAdTopLines requestTrpValueField (boolean value) {
      this.requestField("trp_value", value);
      return this;
    }
    public APIRequestGetAdTopLines requestUomField () {
      return this.requestUomField(true);
    }
    public APIRequestGetAdTopLines requestUomField (boolean value) {
      this.requestField("uom", value);
      return this;
    }
  }

  public static class APIRequestGetAdvertisableApplications extends APIRequest<Application> {

    APINodeList<Application> lastResponse = null;
    @Override
    public APINodeList<Application> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "app_id",
      "business_id",
    };

    public static final String[] FIELDS = {
      "an_ad_space_limit",
      "an_platforms",
      "android_key_hash",
      "android_sdk_error_categories",
      "app_domains",
      "app_events_feature_bitmask",
      "app_events_session_timeout",
      "app_install_tracked",
      "app_name",
      "app_signals_binding_ios",
      "app_type",
      "auth_dialog_data_help_url",
      "auth_dialog_headline",
      "auth_dialog_perms_explanation",
      "auth_referral_default_activity_privacy",
      "auth_referral_enabled",
      "auth_referral_extended_perms",
      "auth_referral_friend_perms",
      "auth_referral_response_type",
      "auth_referral_user_perms",
      "auto_event_mapping_android",
      "auto_event_mapping_ios",
      "auto_event_setup_enabled",
      "canvas_fluid_height",
      "canvas_fluid_width",
      "canvas_url",
      "category",
      "client_config",
      "company",
      "configured_ios_sso",
      "contact_email",
      "created_time",
      "creator_uid",
      "daily_active_users",
      "daily_active_users_rank",
      "deauth_callback_url",
      "default_share_mode",
      "description",
      "financial_id",
      "gdpv4_chrome_custom_tabs_enabled",
      "gdpv4_enabled",
      "gdpv4_nux_content",
      "gdpv4_nux_enabled",
      "has_messenger_product",
      "hosting_url",
      "icon_url",
      "id",
      "ios_bundle_id",
      "ios_sdk_dialog_flows",
      "ios_sdk_error_categories",
      "ios_sfvc_attr",
      "ios_supports_native_proxy_auth_flow",
      "ios_supports_system_auth",
      "ipad_app_store_id",
      "iphone_app_store_id",
      "is_viewer_admin",
      "latest_sdk_version",
      "link",
      "logging_token",
      "login_secret",
      "logo_url",
      "migrations",
      "mobile_profile_section_url",
      "mobile_web_url",
      "monthly_active_users",
      "monthly_active_users_rank",
      "name",
      "namespace",
      "object_store_urls",
      "page_tab_default_name",
      "page_tab_url",
      "photo_url",
      "privacy_policy_url",
      "profile_section_url",
      "property_id",
      "real_time_mode_devices",
      "restrictions",
      "restrictive_data_filter_rules",
      "sdk_update_message",
      "seamless_login",
      "secure_canvas_url",
      "secure_page_tab_url",
      "server_ip_whitelist",
      "smart_login_bookmark_icon_url",
      "smart_login_menu_icon_url",
      "social_discovery",
      "subcategory",
      "supported_platforms",
      "supports_apprequests_fast_app_switch",
      "supports_attribution",
      "supports_implicit_sdk_logging",
      "suppress_native_ios_gdp",
      "terms_of_service_url",
      "url_scheme_suffix",
      "user_support_email",
      "user_support_url",
      "website_url",
      "weekly_active_users",
    };

    @Override
    public APINodeList<Application> parseResponse(String response, String header) throws APIException {
      return Application.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Application> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Application> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Application>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Application>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Application>>() {
           public APINodeList<Application> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdvertisableApplications.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdvertisableApplications(String nodeId, APIContext context) {
      super(context, nodeId, "/advertisable_applications", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdvertisableApplications setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdvertisableApplications setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdvertisableApplications setAppId (String appId) {
      this.setParam("app_id", appId);
      return this;
    }

    public APIRequestGetAdvertisableApplications setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetAdvertisableApplications requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdvertisableApplications requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdvertisableApplications requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdvertisableApplications requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdvertisableApplications requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdvertisableApplications requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdvertisableApplications requestAnAdSpaceLimitField () {
      return this.requestAnAdSpaceLimitField(true);
    }
    public APIRequestGetAdvertisableApplications requestAnAdSpaceLimitField (boolean value) {
      this.requestField("an_ad_space_limit", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAnPlatformsField () {
      return this.requestAnPlatformsField(true);
    }
    public APIRequestGetAdvertisableApplications requestAnPlatformsField (boolean value) {
      this.requestField("an_platforms", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAndroidKeyHashField () {
      return this.requestAndroidKeyHashField(true);
    }
    public APIRequestGetAdvertisableApplications requestAndroidKeyHashField (boolean value) {
      this.requestField("android_key_hash", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAndroidSdkErrorCategoriesField () {
      return this.requestAndroidSdkErrorCategoriesField(true);
    }
    public APIRequestGetAdvertisableApplications requestAndroidSdkErrorCategoriesField (boolean value) {
      this.requestField("android_sdk_error_categories", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppDomainsField () {
      return this.requestAppDomainsField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppDomainsField (boolean value) {
      this.requestField("app_domains", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppEventsFeatureBitmaskField () {
      return this.requestAppEventsFeatureBitmaskField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppEventsFeatureBitmaskField (boolean value) {
      this.requestField("app_events_feature_bitmask", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppEventsSessionTimeoutField () {
      return this.requestAppEventsSessionTimeoutField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppEventsSessionTimeoutField (boolean value) {
      this.requestField("app_events_session_timeout", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppInstallTrackedField () {
      return this.requestAppInstallTrackedField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppInstallTrackedField (boolean value) {
      this.requestField("app_install_tracked", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppNameField () {
      return this.requestAppNameField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppNameField (boolean value) {
      this.requestField("app_name", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppSignalsBindingIosField () {
      return this.requestAppSignalsBindingIosField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppSignalsBindingIosField (boolean value) {
      this.requestField("app_signals_binding_ios", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAppTypeField () {
      return this.requestAppTypeField(true);
    }
    public APIRequestGetAdvertisableApplications requestAppTypeField (boolean value) {
      this.requestField("app_type", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthDialogDataHelpUrlField () {
      return this.requestAuthDialogDataHelpUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthDialogDataHelpUrlField (boolean value) {
      this.requestField("auth_dialog_data_help_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthDialogHeadlineField () {
      return this.requestAuthDialogHeadlineField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthDialogHeadlineField (boolean value) {
      this.requestField("auth_dialog_headline", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthDialogPermsExplanationField () {
      return this.requestAuthDialogPermsExplanationField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthDialogPermsExplanationField (boolean value) {
      this.requestField("auth_dialog_perms_explanation", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralDefaultActivityPrivacyField () {
      return this.requestAuthReferralDefaultActivityPrivacyField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralDefaultActivityPrivacyField (boolean value) {
      this.requestField("auth_referral_default_activity_privacy", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralEnabledField () {
      return this.requestAuthReferralEnabledField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralEnabledField (boolean value) {
      this.requestField("auth_referral_enabled", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralExtendedPermsField () {
      return this.requestAuthReferralExtendedPermsField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralExtendedPermsField (boolean value) {
      this.requestField("auth_referral_extended_perms", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralFriendPermsField () {
      return this.requestAuthReferralFriendPermsField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralFriendPermsField (boolean value) {
      this.requestField("auth_referral_friend_perms", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralResponseTypeField () {
      return this.requestAuthReferralResponseTypeField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralResponseTypeField (boolean value) {
      this.requestField("auth_referral_response_type", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralUserPermsField () {
      return this.requestAuthReferralUserPermsField(true);
    }
    public APIRequestGetAdvertisableApplications requestAuthReferralUserPermsField (boolean value) {
      this.requestField("auth_referral_user_perms", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAutoEventMappingAndroidField () {
      return this.requestAutoEventMappingAndroidField(true);
    }
    public APIRequestGetAdvertisableApplications requestAutoEventMappingAndroidField (boolean value) {
      this.requestField("auto_event_mapping_android", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAutoEventMappingIosField () {
      return this.requestAutoEventMappingIosField(true);
    }
    public APIRequestGetAdvertisableApplications requestAutoEventMappingIosField (boolean value) {
      this.requestField("auto_event_mapping_ios", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestAutoEventSetupEnabledField () {
      return this.requestAutoEventSetupEnabledField(true);
    }
    public APIRequestGetAdvertisableApplications requestAutoEventSetupEnabledField (boolean value) {
      this.requestField("auto_event_setup_enabled", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCanvasFluidHeightField () {
      return this.requestCanvasFluidHeightField(true);
    }
    public APIRequestGetAdvertisableApplications requestCanvasFluidHeightField (boolean value) {
      this.requestField("canvas_fluid_height", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCanvasFluidWidthField () {
      return this.requestCanvasFluidWidthField(true);
    }
    public APIRequestGetAdvertisableApplications requestCanvasFluidWidthField (boolean value) {
      this.requestField("canvas_fluid_width", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCanvasUrlField () {
      return this.requestCanvasUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestCanvasUrlField (boolean value) {
      this.requestField("canvas_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetAdvertisableApplications requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestClientConfigField () {
      return this.requestClientConfigField(true);
    }
    public APIRequestGetAdvertisableApplications requestClientConfigField (boolean value) {
      this.requestField("client_config", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCompanyField () {
      return this.requestCompanyField(true);
    }
    public APIRequestGetAdvertisableApplications requestCompanyField (boolean value) {
      this.requestField("company", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestConfiguredIosSsoField () {
      return this.requestConfiguredIosSsoField(true);
    }
    public APIRequestGetAdvertisableApplications requestConfiguredIosSsoField (boolean value) {
      this.requestField("configured_ios_sso", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestContactEmailField () {
      return this.requestContactEmailField(true);
    }
    public APIRequestGetAdvertisableApplications requestContactEmailField (boolean value) {
      this.requestField("contact_email", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdvertisableApplications requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestCreatorUidField () {
      return this.requestCreatorUidField(true);
    }
    public APIRequestGetAdvertisableApplications requestCreatorUidField (boolean value) {
      this.requestField("creator_uid", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestDailyActiveUsersField () {
      return this.requestDailyActiveUsersField(true);
    }
    public APIRequestGetAdvertisableApplications requestDailyActiveUsersField (boolean value) {
      this.requestField("daily_active_users", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestDailyActiveUsersRankField () {
      return this.requestDailyActiveUsersRankField(true);
    }
    public APIRequestGetAdvertisableApplications requestDailyActiveUsersRankField (boolean value) {
      this.requestField("daily_active_users_rank", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestDeauthCallbackUrlField () {
      return this.requestDeauthCallbackUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestDeauthCallbackUrlField (boolean value) {
      this.requestField("deauth_callback_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestDefaultShareModeField () {
      return this.requestDefaultShareModeField(true);
    }
    public APIRequestGetAdvertisableApplications requestDefaultShareModeField (boolean value) {
      this.requestField("default_share_mode", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAdvertisableApplications requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestFinancialIdField () {
      return this.requestFinancialIdField(true);
    }
    public APIRequestGetAdvertisableApplications requestFinancialIdField (boolean value) {
      this.requestField("financial_id", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestGdpv4ChromeCustomTabsEnabledField () {
      return this.requestGdpv4ChromeCustomTabsEnabledField(true);
    }
    public APIRequestGetAdvertisableApplications requestGdpv4ChromeCustomTabsEnabledField (boolean value) {
      this.requestField("gdpv4_chrome_custom_tabs_enabled", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestGdpv4EnabledField () {
      return this.requestGdpv4EnabledField(true);
    }
    public APIRequestGetAdvertisableApplications requestGdpv4EnabledField (boolean value) {
      this.requestField("gdpv4_enabled", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestGdpv4NuxContentField () {
      return this.requestGdpv4NuxContentField(true);
    }
    public APIRequestGetAdvertisableApplications requestGdpv4NuxContentField (boolean value) {
      this.requestField("gdpv4_nux_content", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestGdpv4NuxEnabledField () {
      return this.requestGdpv4NuxEnabledField(true);
    }
    public APIRequestGetAdvertisableApplications requestGdpv4NuxEnabledField (boolean value) {
      this.requestField("gdpv4_nux_enabled", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestHasMessengerProductField () {
      return this.requestHasMessengerProductField(true);
    }
    public APIRequestGetAdvertisableApplications requestHasMessengerProductField (boolean value) {
      this.requestField("has_messenger_product", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestHostingUrlField () {
      return this.requestHostingUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestHostingUrlField (boolean value) {
      this.requestField("hosting_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIconUrlField () {
      return this.requestIconUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestIconUrlField (boolean value) {
      this.requestField("icon_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdvertisableApplications requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIosBundleIdField () {
      return this.requestIosBundleIdField(true);
    }
    public APIRequestGetAdvertisableApplications requestIosBundleIdField (boolean value) {
      this.requestField("ios_bundle_id", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIosSdkDialogFlowsField () {
      return this.requestIosSdkDialogFlowsField(true);
    }
    public APIRequestGetAdvertisableApplications requestIosSdkDialogFlowsField (boolean value) {
      this.requestField("ios_sdk_dialog_flows", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIosSdkErrorCategoriesField () {
      return this.requestIosSdkErrorCategoriesField(true);
    }
    public APIRequestGetAdvertisableApplications requestIosSdkErrorCategoriesField (boolean value) {
      this.requestField("ios_sdk_error_categories", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIosSfvcAttrField () {
      return this.requestIosSfvcAttrField(true);
    }
    public APIRequestGetAdvertisableApplications requestIosSfvcAttrField (boolean value) {
      this.requestField("ios_sfvc_attr", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIosSupportsNativeProxyAuthFlowField () {
      return this.requestIosSupportsNativeProxyAuthFlowField(true);
    }
    public APIRequestGetAdvertisableApplications requestIosSupportsNativeProxyAuthFlowField (boolean value) {
      this.requestField("ios_supports_native_proxy_auth_flow", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIosSupportsSystemAuthField () {
      return this.requestIosSupportsSystemAuthField(true);
    }
    public APIRequestGetAdvertisableApplications requestIosSupportsSystemAuthField (boolean value) {
      this.requestField("ios_supports_system_auth", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIpadAppStoreIdField () {
      return this.requestIpadAppStoreIdField(true);
    }
    public APIRequestGetAdvertisableApplications requestIpadAppStoreIdField (boolean value) {
      this.requestField("ipad_app_store_id", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIphoneAppStoreIdField () {
      return this.requestIphoneAppStoreIdField(true);
    }
    public APIRequestGetAdvertisableApplications requestIphoneAppStoreIdField (boolean value) {
      this.requestField("iphone_app_store_id", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestIsViewerAdminField () {
      return this.requestIsViewerAdminField(true);
    }
    public APIRequestGetAdvertisableApplications requestIsViewerAdminField (boolean value) {
      this.requestField("is_viewer_admin", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestLatestSdkVersionField () {
      return this.requestLatestSdkVersionField(true);
    }
    public APIRequestGetAdvertisableApplications requestLatestSdkVersionField (boolean value) {
      this.requestField("latest_sdk_version", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetAdvertisableApplications requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestLoggingTokenField () {
      return this.requestLoggingTokenField(true);
    }
    public APIRequestGetAdvertisableApplications requestLoggingTokenField (boolean value) {
      this.requestField("logging_token", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestLoginSecretField () {
      return this.requestLoginSecretField(true);
    }
    public APIRequestGetAdvertisableApplications requestLoginSecretField (boolean value) {
      this.requestField("login_secret", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestLogoUrlField () {
      return this.requestLogoUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestLogoUrlField (boolean value) {
      this.requestField("logo_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestMigrationsField () {
      return this.requestMigrationsField(true);
    }
    public APIRequestGetAdvertisableApplications requestMigrationsField (boolean value) {
      this.requestField("migrations", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestMobileProfileSectionUrlField () {
      return this.requestMobileProfileSectionUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestMobileProfileSectionUrlField (boolean value) {
      this.requestField("mobile_profile_section_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestMobileWebUrlField () {
      return this.requestMobileWebUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestMobileWebUrlField (boolean value) {
      this.requestField("mobile_web_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestMonthlyActiveUsersField () {
      return this.requestMonthlyActiveUsersField(true);
    }
    public APIRequestGetAdvertisableApplications requestMonthlyActiveUsersField (boolean value) {
      this.requestField("monthly_active_users", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestMonthlyActiveUsersRankField () {
      return this.requestMonthlyActiveUsersRankField(true);
    }
    public APIRequestGetAdvertisableApplications requestMonthlyActiveUsersRankField (boolean value) {
      this.requestField("monthly_active_users_rank", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdvertisableApplications requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestNamespaceField () {
      return this.requestNamespaceField(true);
    }
    public APIRequestGetAdvertisableApplications requestNamespaceField (boolean value) {
      this.requestField("namespace", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestObjectStoreUrlsField () {
      return this.requestObjectStoreUrlsField(true);
    }
    public APIRequestGetAdvertisableApplications requestObjectStoreUrlsField (boolean value) {
      this.requestField("object_store_urls", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestPageTabDefaultNameField () {
      return this.requestPageTabDefaultNameField(true);
    }
    public APIRequestGetAdvertisableApplications requestPageTabDefaultNameField (boolean value) {
      this.requestField("page_tab_default_name", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestPageTabUrlField () {
      return this.requestPageTabUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestPageTabUrlField (boolean value) {
      this.requestField("page_tab_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestPhotoUrlField () {
      return this.requestPhotoUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestPhotoUrlField (boolean value) {
      this.requestField("photo_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestPrivacyPolicyUrlField () {
      return this.requestPrivacyPolicyUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestPrivacyPolicyUrlField (boolean value) {
      this.requestField("privacy_policy_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestProfileSectionUrlField () {
      return this.requestProfileSectionUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestProfileSectionUrlField (boolean value) {
      this.requestField("profile_section_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestPropertyIdField () {
      return this.requestPropertyIdField(true);
    }
    public APIRequestGetAdvertisableApplications requestPropertyIdField (boolean value) {
      this.requestField("property_id", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestRealTimeModeDevicesField () {
      return this.requestRealTimeModeDevicesField(true);
    }
    public APIRequestGetAdvertisableApplications requestRealTimeModeDevicesField (boolean value) {
      this.requestField("real_time_mode_devices", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestRestrictionsField () {
      return this.requestRestrictionsField(true);
    }
    public APIRequestGetAdvertisableApplications requestRestrictionsField (boolean value) {
      this.requestField("restrictions", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestRestrictiveDataFilterRulesField () {
      return this.requestRestrictiveDataFilterRulesField(true);
    }
    public APIRequestGetAdvertisableApplications requestRestrictiveDataFilterRulesField (boolean value) {
      this.requestField("restrictive_data_filter_rules", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSdkUpdateMessageField () {
      return this.requestSdkUpdateMessageField(true);
    }
    public APIRequestGetAdvertisableApplications requestSdkUpdateMessageField (boolean value) {
      this.requestField("sdk_update_message", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSeamlessLoginField () {
      return this.requestSeamlessLoginField(true);
    }
    public APIRequestGetAdvertisableApplications requestSeamlessLoginField (boolean value) {
      this.requestField("seamless_login", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSecureCanvasUrlField () {
      return this.requestSecureCanvasUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestSecureCanvasUrlField (boolean value) {
      this.requestField("secure_canvas_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSecurePageTabUrlField () {
      return this.requestSecurePageTabUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestSecurePageTabUrlField (boolean value) {
      this.requestField("secure_page_tab_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestServerIpWhitelistField () {
      return this.requestServerIpWhitelistField(true);
    }
    public APIRequestGetAdvertisableApplications requestServerIpWhitelistField (boolean value) {
      this.requestField("server_ip_whitelist", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSmartLoginBookmarkIconUrlField () {
      return this.requestSmartLoginBookmarkIconUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestSmartLoginBookmarkIconUrlField (boolean value) {
      this.requestField("smart_login_bookmark_icon_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSmartLoginMenuIconUrlField () {
      return this.requestSmartLoginMenuIconUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestSmartLoginMenuIconUrlField (boolean value) {
      this.requestField("smart_login_menu_icon_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSocialDiscoveryField () {
      return this.requestSocialDiscoveryField(true);
    }
    public APIRequestGetAdvertisableApplications requestSocialDiscoveryField (boolean value) {
      this.requestField("social_discovery", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSubcategoryField () {
      return this.requestSubcategoryField(true);
    }
    public APIRequestGetAdvertisableApplications requestSubcategoryField (boolean value) {
      this.requestField("subcategory", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSupportedPlatformsField () {
      return this.requestSupportedPlatformsField(true);
    }
    public APIRequestGetAdvertisableApplications requestSupportedPlatformsField (boolean value) {
      this.requestField("supported_platforms", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSupportsApprequestsFastAppSwitchField () {
      return this.requestSupportsApprequestsFastAppSwitchField(true);
    }
    public APIRequestGetAdvertisableApplications requestSupportsApprequestsFastAppSwitchField (boolean value) {
      this.requestField("supports_apprequests_fast_app_switch", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSupportsAttributionField () {
      return this.requestSupportsAttributionField(true);
    }
    public APIRequestGetAdvertisableApplications requestSupportsAttributionField (boolean value) {
      this.requestField("supports_attribution", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSupportsImplicitSdkLoggingField () {
      return this.requestSupportsImplicitSdkLoggingField(true);
    }
    public APIRequestGetAdvertisableApplications requestSupportsImplicitSdkLoggingField (boolean value) {
      this.requestField("supports_implicit_sdk_logging", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestSuppressNativeIosGdpField () {
      return this.requestSuppressNativeIosGdpField(true);
    }
    public APIRequestGetAdvertisableApplications requestSuppressNativeIosGdpField (boolean value) {
      this.requestField("suppress_native_ios_gdp", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestTermsOfServiceUrlField () {
      return this.requestTermsOfServiceUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestTermsOfServiceUrlField (boolean value) {
      this.requestField("terms_of_service_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestUrlSchemeSuffixField () {
      return this.requestUrlSchemeSuffixField(true);
    }
    public APIRequestGetAdvertisableApplications requestUrlSchemeSuffixField (boolean value) {
      this.requestField("url_scheme_suffix", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestUserSupportEmailField () {
      return this.requestUserSupportEmailField(true);
    }
    public APIRequestGetAdvertisableApplications requestUserSupportEmailField (boolean value) {
      this.requestField("user_support_email", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestUserSupportUrlField () {
      return this.requestUserSupportUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestUserSupportUrlField (boolean value) {
      this.requestField("user_support_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestWebsiteUrlField () {
      return this.requestWebsiteUrlField(true);
    }
    public APIRequestGetAdvertisableApplications requestWebsiteUrlField (boolean value) {
      this.requestField("website_url", value);
      return this;
    }
    public APIRequestGetAdvertisableApplications requestWeeklyActiveUsersField () {
      return this.requestWeeklyActiveUsersField(true);
    }
    public APIRequestGetAdvertisableApplications requestWeeklyActiveUsersField (boolean value) {
      this.requestField("weekly_active_users", value);
      return this;
    }
  }

  public static class APIRequestDeleteAdVideos extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "video_id",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAdVideos.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAdVideos(String nodeId, APIContext context) {
      super(context, nodeId, "/advideos", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAdVideos setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAdVideos setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAdVideos setVideoId (String videoId) {
      this.setParam("video_id", videoId);
      return this;
    }

    public APIRequestDeleteAdVideos requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAdVideos requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdVideos requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAdVideos requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAdVideos requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAdVideos requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdVideos extends APIRequest<AdVideo> {

    APINodeList<AdVideo> lastResponse = null;
    @Override
    public APINodeList<AdVideo> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "max_aspect_ratio",
      "maxheight",
      "maxlength",
      "maxwidth",
      "min_aspect_ratio",
      "minheight",
      "minlength",
      "minwidth",
      "title",
    };

    public static final String[] FIELDS = {
      "ad_breaks",
      "backdated_time",
      "backdated_time_granularity",
      "content_category",
      "content_tags",
      "created_time",
      "custom_labels",
      "description",
      "embed_html",
      "embeddable",
      "event",
      "expiration",
      "format",
      "from",
      "icon",
      "id",
      "is_crosspost_video",
      "is_crossposting_eligible",
      "is_episode",
      "is_instagram_eligible",
      "length",
      "live_audience_count",
      "live_status",
      "permalink_url",
      "picture",
      "place",
      "premiere_living_room_status",
      "privacy",
      "published",
      "scheduled_publish_time",
      "source",
      "spherical",
      "status",
      "title",
      "tv_banner_ad",
      "universal_video_id",
      "updated_time",
    };

    @Override
    public APINodeList<AdVideo> parseResponse(String response, String header) throws APIException {
      return AdVideo.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdVideo> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdVideo> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdVideo>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdVideo>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdVideo>>() {
           public APINodeList<AdVideo> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdVideos.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdVideos(String nodeId, APIContext context) {
      super(context, nodeId, "/advideos", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdVideos setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdVideos setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdVideos setMaxAspectRatio (Double maxAspectRatio) {
      this.setParam("max_aspect_ratio", maxAspectRatio);
      return this;
    }
    public APIRequestGetAdVideos setMaxAspectRatio (String maxAspectRatio) {
      this.setParam("max_aspect_ratio", maxAspectRatio);
      return this;
    }

    public APIRequestGetAdVideos setMaxheight (Long maxheight) {
      this.setParam("maxheight", maxheight);
      return this;
    }
    public APIRequestGetAdVideos setMaxheight (String maxheight) {
      this.setParam("maxheight", maxheight);
      return this;
    }

    public APIRequestGetAdVideos setMaxlength (Long maxlength) {
      this.setParam("maxlength", maxlength);
      return this;
    }
    public APIRequestGetAdVideos setMaxlength (String maxlength) {
      this.setParam("maxlength", maxlength);
      return this;
    }

    public APIRequestGetAdVideos setMaxwidth (Long maxwidth) {
      this.setParam("maxwidth", maxwidth);
      return this;
    }
    public APIRequestGetAdVideos setMaxwidth (String maxwidth) {
      this.setParam("maxwidth", maxwidth);
      return this;
    }

    public APIRequestGetAdVideos setMinAspectRatio (Double minAspectRatio) {
      this.setParam("min_aspect_ratio", minAspectRatio);
      return this;
    }
    public APIRequestGetAdVideos setMinAspectRatio (String minAspectRatio) {
      this.setParam("min_aspect_ratio", minAspectRatio);
      return this;
    }

    public APIRequestGetAdVideos setMinheight (Long minheight) {
      this.setParam("minheight", minheight);
      return this;
    }
    public APIRequestGetAdVideos setMinheight (String minheight) {
      this.setParam("minheight", minheight);
      return this;
    }

    public APIRequestGetAdVideos setMinlength (Long minlength) {
      this.setParam("minlength", minlength);
      return this;
    }
    public APIRequestGetAdVideos setMinlength (String minlength) {
      this.setParam("minlength", minlength);
      return this;
    }

    public APIRequestGetAdVideos setMinwidth (Long minwidth) {
      this.setParam("minwidth", minwidth);
      return this;
    }
    public APIRequestGetAdVideos setMinwidth (String minwidth) {
      this.setParam("minwidth", minwidth);
      return this;
    }

    public APIRequestGetAdVideos setTitle (String title) {
      this.setParam("title", title);
      return this;
    }

    public APIRequestGetAdVideos requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdVideos requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdVideos requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdVideos requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdVideos requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdVideos requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdVideos requestAdBreaksField () {
      return this.requestAdBreaksField(true);
    }
    public APIRequestGetAdVideos requestAdBreaksField (boolean value) {
      this.requestField("ad_breaks", value);
      return this;
    }
    public APIRequestGetAdVideos requestBackdatedTimeField () {
      return this.requestBackdatedTimeField(true);
    }
    public APIRequestGetAdVideos requestBackdatedTimeField (boolean value) {
      this.requestField("backdated_time", value);
      return this;
    }
    public APIRequestGetAdVideos requestBackdatedTimeGranularityField () {
      return this.requestBackdatedTimeGranularityField(true);
    }
    public APIRequestGetAdVideos requestBackdatedTimeGranularityField (boolean value) {
      this.requestField("backdated_time_granularity", value);
      return this;
    }
    public APIRequestGetAdVideos requestContentCategoryField () {
      return this.requestContentCategoryField(true);
    }
    public APIRequestGetAdVideos requestContentCategoryField (boolean value) {
      this.requestField("content_category", value);
      return this;
    }
    public APIRequestGetAdVideos requestContentTagsField () {
      return this.requestContentTagsField(true);
    }
    public APIRequestGetAdVideos requestContentTagsField (boolean value) {
      this.requestField("content_tags", value);
      return this;
    }
    public APIRequestGetAdVideos requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdVideos requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdVideos requestCustomLabelsField () {
      return this.requestCustomLabelsField(true);
    }
    public APIRequestGetAdVideos requestCustomLabelsField (boolean value) {
      this.requestField("custom_labels", value);
      return this;
    }
    public APIRequestGetAdVideos requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAdVideos requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAdVideos requestEmbedHtmlField () {
      return this.requestEmbedHtmlField(true);
    }
    public APIRequestGetAdVideos requestEmbedHtmlField (boolean value) {
      this.requestField("embed_html", value);
      return this;
    }
    public APIRequestGetAdVideos requestEmbeddableField () {
      return this.requestEmbeddableField(true);
    }
    public APIRequestGetAdVideos requestEmbeddableField (boolean value) {
      this.requestField("embeddable", value);
      return this;
    }
    public APIRequestGetAdVideos requestEventField () {
      return this.requestEventField(true);
    }
    public APIRequestGetAdVideos requestEventField (boolean value) {
      this.requestField("event", value);
      return this;
    }
    public APIRequestGetAdVideos requestExpirationField () {
      return this.requestExpirationField(true);
    }
    public APIRequestGetAdVideos requestExpirationField (boolean value) {
      this.requestField("expiration", value);
      return this;
    }
    public APIRequestGetAdVideos requestFormatField () {
      return this.requestFormatField(true);
    }
    public APIRequestGetAdVideos requestFormatField (boolean value) {
      this.requestField("format", value);
      return this;
    }
    public APIRequestGetAdVideos requestFromField () {
      return this.requestFromField(true);
    }
    public APIRequestGetAdVideos requestFromField (boolean value) {
      this.requestField("from", value);
      return this;
    }
    public APIRequestGetAdVideos requestIconField () {
      return this.requestIconField(true);
    }
    public APIRequestGetAdVideos requestIconField (boolean value) {
      this.requestField("icon", value);
      return this;
    }
    public APIRequestGetAdVideos requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdVideos requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdVideos requestIsCrosspostVideoField () {
      return this.requestIsCrosspostVideoField(true);
    }
    public APIRequestGetAdVideos requestIsCrosspostVideoField (boolean value) {
      this.requestField("is_crosspost_video", value);
      return this;
    }
    public APIRequestGetAdVideos requestIsCrosspostingEligibleField () {
      return this.requestIsCrosspostingEligibleField(true);
    }
    public APIRequestGetAdVideos requestIsCrosspostingEligibleField (boolean value) {
      this.requestField("is_crossposting_eligible", value);
      return this;
    }
    public APIRequestGetAdVideos requestIsEpisodeField () {
      return this.requestIsEpisodeField(true);
    }
    public APIRequestGetAdVideos requestIsEpisodeField (boolean value) {
      this.requestField("is_episode", value);
      return this;
    }
    public APIRequestGetAdVideos requestIsInstagramEligibleField () {
      return this.requestIsInstagramEligibleField(true);
    }
    public APIRequestGetAdVideos requestIsInstagramEligibleField (boolean value) {
      this.requestField("is_instagram_eligible", value);
      return this;
    }
    public APIRequestGetAdVideos requestLengthField () {
      return this.requestLengthField(true);
    }
    public APIRequestGetAdVideos requestLengthField (boolean value) {
      this.requestField("length", value);
      return this;
    }
    public APIRequestGetAdVideos requestLiveAudienceCountField () {
      return this.requestLiveAudienceCountField(true);
    }
    public APIRequestGetAdVideos requestLiveAudienceCountField (boolean value) {
      this.requestField("live_audience_count", value);
      return this;
    }
    public APIRequestGetAdVideos requestLiveStatusField () {
      return this.requestLiveStatusField(true);
    }
    public APIRequestGetAdVideos requestLiveStatusField (boolean value) {
      this.requestField("live_status", value);
      return this;
    }
    public APIRequestGetAdVideos requestPermalinkUrlField () {
      return this.requestPermalinkUrlField(true);
    }
    public APIRequestGetAdVideos requestPermalinkUrlField (boolean value) {
      this.requestField("permalink_url", value);
      return this;
    }
    public APIRequestGetAdVideos requestPictureField () {
      return this.requestPictureField(true);
    }
    public APIRequestGetAdVideos requestPictureField (boolean value) {
      this.requestField("picture", value);
      return this;
    }
    public APIRequestGetAdVideos requestPlaceField () {
      return this.requestPlaceField(true);
    }
    public APIRequestGetAdVideos requestPlaceField (boolean value) {
      this.requestField("place", value);
      return this;
    }
    public APIRequestGetAdVideos requestPremiereLivingRoomStatusField () {
      return this.requestPremiereLivingRoomStatusField(true);
    }
    public APIRequestGetAdVideos requestPremiereLivingRoomStatusField (boolean value) {
      this.requestField("premiere_living_room_status", value);
      return this;
    }
    public APIRequestGetAdVideos requestPrivacyField () {
      return this.requestPrivacyField(true);
    }
    public APIRequestGetAdVideos requestPrivacyField (boolean value) {
      this.requestField("privacy", value);
      return this;
    }
    public APIRequestGetAdVideos requestPublishedField () {
      return this.requestPublishedField(true);
    }
    public APIRequestGetAdVideos requestPublishedField (boolean value) {
      this.requestField("published", value);
      return this;
    }
    public APIRequestGetAdVideos requestScheduledPublishTimeField () {
      return this.requestScheduledPublishTimeField(true);
    }
    public APIRequestGetAdVideos requestScheduledPublishTimeField (boolean value) {
      this.requestField("scheduled_publish_time", value);
      return this;
    }
    public APIRequestGetAdVideos requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetAdVideos requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetAdVideos requestSphericalField () {
      return this.requestSphericalField(true);
    }
    public APIRequestGetAdVideos requestSphericalField (boolean value) {
      this.requestField("spherical", value);
      return this;
    }
    public APIRequestGetAdVideos requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAdVideos requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAdVideos requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGetAdVideos requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGetAdVideos requestTvBannerAdField () {
      return this.requestTvBannerAdField(true);
    }
    public APIRequestGetAdVideos requestTvBannerAdField (boolean value) {
      this.requestField("tv_banner_ad", value);
      return this;
    }
    public APIRequestGetAdVideos requestUniversalVideoIdField () {
      return this.requestUniversalVideoIdField(true);
    }
    public APIRequestGetAdVideos requestUniversalVideoIdField (boolean value) {
      this.requestField("universal_video_id", value);
      return this;
    }
    public APIRequestGetAdVideos requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdVideos requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateAdVideo extends APIRequest<AdVideo> {

    AdVideo lastResponse = null;
    @Override
    public AdVideo getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "adaptive_type",
      "animated_effect_id",
      "application_id",
      "asked_fun_fact_prompt_id",
      "attribution_app_id",
      "audio_story_wave_animation_handle",
      "chunk_session_id",
      "composer_entry_picker",
      "composer_entry_point",
      "composer_entry_time",
      "composer_session_events_log",
      "composer_session_id",
      "composer_source_surface",
      "composer_type",
      "container_type",
      "content_category",
      "description",
      "embeddable",
      "end_offset",
      "fbuploader_video_file_chunk",
      "file_size",
      "file_url",
      "fisheye_video_cropped",
      "formatting",
      "fov",
      "front_z_rotation",
      "fun_fact_prompt_id",
      "fun_fact_toastee_id",
      "guide",
      "guide_enabled",
      "has_nickname",
      "holiday_card",
      "initial_heading",
      "initial_pitch",
      "instant_game_entry_point_data",
      "is_boost_intended",
      "is_group_linking_post",
      "is_voice_clip",
      "location_source_id",
      "name",
      "offer_like_post_id",
      "og_action_type_id",
      "og_icon_id",
      "og_object_id",
      "og_phrase",
      "og_suggestion_mechanism",
      "original_fov",
      "original_projection_type",
      "publish_event_id",
      "react_mode_metadata",
      "referenced_sticker_id",
      "replace_video_id",
      "sales_promo_id",
      "slideshow_spec",
      "spherical",
      "start_offset",
      "swap_mode",
      "text_format_metadata",
      "throwback_camera_roll_media",
      "thumb",
      "time_since_original_post",
      "title",
      "transcode_setting_properties",
      "unpublished_content_type",
      "upload_phase",
      "upload_session_id",
      "upload_setting_properties",
      "video_file_chunk",
      "video_start_time_ms",
      "waterfall_id",
      "file",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdVideo parseResponse(String response, String header) throws APIException {
      return AdVideo.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdVideo execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdVideo execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdVideo> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdVideo> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdVideo>() {
           public AdVideo apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAdVideo.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAdVideo(String nodeId, APIContext context) {
      super(context, nodeId, "/advideos", "POST", Arrays.asList(PARAMS));
      this.setUseVideoEndpoint(true);
    }

    @Override
    public APIRequestCreateAdVideo setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAdVideo setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }

    public APIRequestCreateAdVideo addUploadFile (String uploadName, File file) {
      this.setParam(uploadName, file);
      return this;
    }

    public APIRequestCreateAdVideo setUseVideoEndpoint(boolean useVideoEndpoint) {
      this.useVideoEndpoint = useVideoEndpoint;
      return this;
    }

    public APIRequestCreateAdVideo setAdaptiveType (String adaptiveType) {
      this.setParam("adaptive_type", adaptiveType);
      return this;
    }

    public APIRequestCreateAdVideo setAnimatedEffectId (Long animatedEffectId) {
      this.setParam("animated_effect_id", animatedEffectId);
      return this;
    }
    public APIRequestCreateAdVideo setAnimatedEffectId (String animatedEffectId) {
      this.setParam("animated_effect_id", animatedEffectId);
      return this;
    }

    public APIRequestCreateAdVideo setApplicationId (String applicationId) {
      this.setParam("application_id", applicationId);
      return this;
    }

    public APIRequestCreateAdVideo setAskedFunFactPromptId (Long askedFunFactPromptId) {
      this.setParam("asked_fun_fact_prompt_id", askedFunFactPromptId);
      return this;
    }
    public APIRequestCreateAdVideo setAskedFunFactPromptId (String askedFunFactPromptId) {
      this.setParam("asked_fun_fact_prompt_id", askedFunFactPromptId);
      return this;
    }

    public APIRequestCreateAdVideo setAttributionAppId (String attributionAppId) {
      this.setParam("attribution_app_id", attributionAppId);
      return this;
    }

    public APIRequestCreateAdVideo setAudioStoryWaveAnimationHandle (String audioStoryWaveAnimationHandle) {
      this.setParam("audio_story_wave_animation_handle", audioStoryWaveAnimationHandle);
      return this;
    }

    public APIRequestCreateAdVideo setChunkSessionId (String chunkSessionId) {
      this.setParam("chunk_session_id", chunkSessionId);
      return this;
    }

    public APIRequestCreateAdVideo setComposerEntryPicker (String composerEntryPicker) {
      this.setParam("composer_entry_picker", composerEntryPicker);
      return this;
    }

    public APIRequestCreateAdVideo setComposerEntryPoint (String composerEntryPoint) {
      this.setParam("composer_entry_point", composerEntryPoint);
      return this;
    }

    public APIRequestCreateAdVideo setComposerEntryTime (Long composerEntryTime) {
      this.setParam("composer_entry_time", composerEntryTime);
      return this;
    }
    public APIRequestCreateAdVideo setComposerEntryTime (String composerEntryTime) {
      this.setParam("composer_entry_time", composerEntryTime);
      return this;
    }

    public APIRequestCreateAdVideo setComposerSessionEventsLog (String composerSessionEventsLog) {
      this.setParam("composer_session_events_log", composerSessionEventsLog);
      return this;
    }

    public APIRequestCreateAdVideo setComposerSessionId (String composerSessionId) {
      this.setParam("composer_session_id", composerSessionId);
      return this;
    }

    public APIRequestCreateAdVideo setComposerSourceSurface (String composerSourceSurface) {
      this.setParam("composer_source_surface", composerSourceSurface);
      return this;
    }

    public APIRequestCreateAdVideo setComposerType (String composerType) {
      this.setParam("composer_type", composerType);
      return this;
    }

    public APIRequestCreateAdVideo setContainerType (AdVideo.EnumContainerType containerType) {
      this.setParam("container_type", containerType);
      return this;
    }
    public APIRequestCreateAdVideo setContainerType (String containerType) {
      this.setParam("container_type", containerType);
      return this;
    }

    public APIRequestCreateAdVideo setContentCategory (AdVideo.EnumContentCategory contentCategory) {
      this.setParam("content_category", contentCategory);
      return this;
    }
    public APIRequestCreateAdVideo setContentCategory (String contentCategory) {
      this.setParam("content_category", contentCategory);
      return this;
    }

    public APIRequestCreateAdVideo setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateAdVideo setEmbeddable (Boolean embeddable) {
      this.setParam("embeddable", embeddable);
      return this;
    }
    public APIRequestCreateAdVideo setEmbeddable (String embeddable) {
      this.setParam("embeddable", embeddable);
      return this;
    }

    public APIRequestCreateAdVideo setEndOffset (Long endOffset) {
      this.setParam("end_offset", endOffset);
      return this;
    }
    public APIRequestCreateAdVideo setEndOffset (String endOffset) {
      this.setParam("end_offset", endOffset);
      return this;
    }

    public APIRequestCreateAdVideo setFbuploaderVideoFileChunk (String fbuploaderVideoFileChunk) {
      this.setParam("fbuploader_video_file_chunk", fbuploaderVideoFileChunk);
      return this;
    }

    public APIRequestCreateAdVideo setFileSize (Long fileSize) {
      this.setParam("file_size", fileSize);
      return this;
    }
    public APIRequestCreateAdVideo setFileSize (String fileSize) {
      this.setParam("file_size", fileSize);
      return this;
    }

    public APIRequestCreateAdVideo setFileUrl (String fileUrl) {
      this.setParam("file_url", fileUrl);
      return this;
    }

    public APIRequestCreateAdVideo setFisheyeVideoCropped (Boolean fisheyeVideoCropped) {
      this.setParam("fisheye_video_cropped", fisheyeVideoCropped);
      return this;
    }
    public APIRequestCreateAdVideo setFisheyeVideoCropped (String fisheyeVideoCropped) {
      this.setParam("fisheye_video_cropped", fisheyeVideoCropped);
      return this;
    }

    public APIRequestCreateAdVideo setFormatting (AdVideo.EnumFormatting formatting) {
      this.setParam("formatting", formatting);
      return this;
    }
    public APIRequestCreateAdVideo setFormatting (String formatting) {
      this.setParam("formatting", formatting);
      return this;
    }

    public APIRequestCreateAdVideo setFov (Long fov) {
      this.setParam("fov", fov);
      return this;
    }
    public APIRequestCreateAdVideo setFov (String fov) {
      this.setParam("fov", fov);
      return this;
    }

    public APIRequestCreateAdVideo setFrontZRotation (Double frontZRotation) {
      this.setParam("front_z_rotation", frontZRotation);
      return this;
    }
    public APIRequestCreateAdVideo setFrontZRotation (String frontZRotation) {
      this.setParam("front_z_rotation", frontZRotation);
      return this;
    }

    public APIRequestCreateAdVideo setFunFactPromptId (Long funFactPromptId) {
      this.setParam("fun_fact_prompt_id", funFactPromptId);
      return this;
    }
    public APIRequestCreateAdVideo setFunFactPromptId (String funFactPromptId) {
      this.setParam("fun_fact_prompt_id", funFactPromptId);
      return this;
    }

    public APIRequestCreateAdVideo setFunFactToasteeId (Long funFactToasteeId) {
      this.setParam("fun_fact_toastee_id", funFactToasteeId);
      return this;
    }
    public APIRequestCreateAdVideo setFunFactToasteeId (String funFactToasteeId) {
      this.setParam("fun_fact_toastee_id", funFactToasteeId);
      return this;
    }

    public APIRequestCreateAdVideo setGuide (List<List<Long>> guide) {
      this.setParam("guide", guide);
      return this;
    }
    public APIRequestCreateAdVideo setGuide (String guide) {
      this.setParam("guide", guide);
      return this;
    }

    public APIRequestCreateAdVideo setGuideEnabled (Boolean guideEnabled) {
      this.setParam("guide_enabled", guideEnabled);
      return this;
    }
    public APIRequestCreateAdVideo setGuideEnabled (String guideEnabled) {
      this.setParam("guide_enabled", guideEnabled);
      return this;
    }

    public APIRequestCreateAdVideo setHasNickname (Boolean hasNickname) {
      this.setParam("has_nickname", hasNickname);
      return this;
    }
    public APIRequestCreateAdVideo setHasNickname (String hasNickname) {
      this.setParam("has_nickname", hasNickname);
      return this;
    }

    public APIRequestCreateAdVideo setHolidayCard (String holidayCard) {
      this.setParam("holiday_card", holidayCard);
      return this;
    }

    public APIRequestCreateAdVideo setInitialHeading (Long initialHeading) {
      this.setParam("initial_heading", initialHeading);
      return this;
    }
    public APIRequestCreateAdVideo setInitialHeading (String initialHeading) {
      this.setParam("initial_heading", initialHeading);
      return this;
    }

    public APIRequestCreateAdVideo setInitialPitch (Long initialPitch) {
      this.setParam("initial_pitch", initialPitch);
      return this;
    }
    public APIRequestCreateAdVideo setInitialPitch (String initialPitch) {
      this.setParam("initial_pitch", initialPitch);
      return this;
    }

    public APIRequestCreateAdVideo setInstantGameEntryPointData (String instantGameEntryPointData) {
      this.setParam("instant_game_entry_point_data", instantGameEntryPointData);
      return this;
    }

    public APIRequestCreateAdVideo setIsBoostIntended (Boolean isBoostIntended) {
      this.setParam("is_boost_intended", isBoostIntended);
      return this;
    }
    public APIRequestCreateAdVideo setIsBoostIntended (String isBoostIntended) {
      this.setParam("is_boost_intended", isBoostIntended);
      return this;
    }

    public APIRequestCreateAdVideo setIsGroupLinkingPost (Boolean isGroupLinkingPost) {
      this.setParam("is_group_linking_post", isGroupLinkingPost);
      return this;
    }
    public APIRequestCreateAdVideo setIsGroupLinkingPost (String isGroupLinkingPost) {
      this.setParam("is_group_linking_post", isGroupLinkingPost);
      return this;
    }

    public APIRequestCreateAdVideo setIsVoiceClip (Boolean isVoiceClip) {
      this.setParam("is_voice_clip", isVoiceClip);
      return this;
    }
    public APIRequestCreateAdVideo setIsVoiceClip (String isVoiceClip) {
      this.setParam("is_voice_clip", isVoiceClip);
      return this;
    }

    public APIRequestCreateAdVideo setLocationSourceId (String locationSourceId) {
      this.setParam("location_source_id", locationSourceId);
      return this;
    }

    public APIRequestCreateAdVideo setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAdVideo setOfferLikePostId (Long offerLikePostId) {
      this.setParam("offer_like_post_id", offerLikePostId);
      return this;
    }
    public APIRequestCreateAdVideo setOfferLikePostId (String offerLikePostId) {
      this.setParam("offer_like_post_id", offerLikePostId);
      return this;
    }

    public APIRequestCreateAdVideo setOgActionTypeId (String ogActionTypeId) {
      this.setParam("og_action_type_id", ogActionTypeId);
      return this;
    }

    public APIRequestCreateAdVideo setOgIconId (String ogIconId) {
      this.setParam("og_icon_id", ogIconId);
      return this;
    }

    public APIRequestCreateAdVideo setOgObjectId (String ogObjectId) {
      this.setParam("og_object_id", ogObjectId);
      return this;
    }

    public APIRequestCreateAdVideo setOgPhrase (String ogPhrase) {
      this.setParam("og_phrase", ogPhrase);
      return this;
    }

    public APIRequestCreateAdVideo setOgSuggestionMechanism (String ogSuggestionMechanism) {
      this.setParam("og_suggestion_mechanism", ogSuggestionMechanism);
      return this;
    }

    public APIRequestCreateAdVideo setOriginalFov (Long originalFov) {
      this.setParam("original_fov", originalFov);
      return this;
    }
    public APIRequestCreateAdVideo setOriginalFov (String originalFov) {
      this.setParam("original_fov", originalFov);
      return this;
    }

    public APIRequestCreateAdVideo setOriginalProjectionType (AdVideo.EnumOriginalProjectionType originalProjectionType) {
      this.setParam("original_projection_type", originalProjectionType);
      return this;
    }
    public APIRequestCreateAdVideo setOriginalProjectionType (String originalProjectionType) {
      this.setParam("original_projection_type", originalProjectionType);
      return this;
    }

    public APIRequestCreateAdVideo setPublishEventId (Long publishEventId) {
      this.setParam("publish_event_id", publishEventId);
      return this;
    }
    public APIRequestCreateAdVideo setPublishEventId (String publishEventId) {
      this.setParam("publish_event_id", publishEventId);
      return this;
    }

    public APIRequestCreateAdVideo setReactModeMetadata (String reactModeMetadata) {
      this.setParam("react_mode_metadata", reactModeMetadata);
      return this;
    }

    public APIRequestCreateAdVideo setReferencedStickerId (String referencedStickerId) {
      this.setParam("referenced_sticker_id", referencedStickerId);
      return this;
    }

    public APIRequestCreateAdVideo setReplaceVideoId (String replaceVideoId) {
      this.setParam("replace_video_id", replaceVideoId);
      return this;
    }

    public APIRequestCreateAdVideo setSalesPromoId (Long salesPromoId) {
      this.setParam("sales_promo_id", salesPromoId);
      return this;
    }
    public APIRequestCreateAdVideo setSalesPromoId (String salesPromoId) {
      this.setParam("sales_promo_id", salesPromoId);
      return this;
    }

    public APIRequestCreateAdVideo setSlideshowSpec (Map<String, String> slideshowSpec) {
      this.setParam("slideshow_spec", slideshowSpec);
      return this;
    }
    public APIRequestCreateAdVideo setSlideshowSpec (String slideshowSpec) {
      this.setParam("slideshow_spec", slideshowSpec);
      return this;
    }

    public APIRequestCreateAdVideo setSpherical (Boolean spherical) {
      this.setParam("spherical", spherical);
      return this;
    }
    public APIRequestCreateAdVideo setSpherical (String spherical) {
      this.setParam("spherical", spherical);
      return this;
    }

    public APIRequestCreateAdVideo setStartOffset (Long startOffset) {
      this.setParam("start_offset", startOffset);
      return this;
    }
    public APIRequestCreateAdVideo setStartOffset (String startOffset) {
      this.setParam("start_offset", startOffset);
      return this;
    }

    public APIRequestCreateAdVideo setSwapMode (AdVideo.EnumSwapMode swapMode) {
      this.setParam("swap_mode", swapMode);
      return this;
    }
    public APIRequestCreateAdVideo setSwapMode (String swapMode) {
      this.setParam("swap_mode", swapMode);
      return this;
    }

    public APIRequestCreateAdVideo setTextFormatMetadata (String textFormatMetadata) {
      this.setParam("text_format_metadata", textFormatMetadata);
      return this;
    }

    public APIRequestCreateAdVideo setThrowbackCameraRollMedia (String throwbackCameraRollMedia) {
      this.setParam("throwback_camera_roll_media", throwbackCameraRollMedia);
      return this;
    }

    public APIRequestCreateAdVideo setThumb (File thumb) {
      this.setParam("thumb", thumb);
      return this;
    }
    public APIRequestCreateAdVideo setThumb (String thumb) {
      this.setParam("thumb", thumb);
      return this;
    }

    public APIRequestCreateAdVideo setTimeSinceOriginalPost (Long timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }
    public APIRequestCreateAdVideo setTimeSinceOriginalPost (String timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }

    public APIRequestCreateAdVideo setTitle (String title) {
      this.setParam("title", title);
      return this;
    }

    public APIRequestCreateAdVideo setTranscodeSettingProperties (String transcodeSettingProperties) {
      this.setParam("transcode_setting_properties", transcodeSettingProperties);
      return this;
    }

    public APIRequestCreateAdVideo setUnpublishedContentType (AdVideo.EnumUnpublishedContentType unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }
    public APIRequestCreateAdVideo setUnpublishedContentType (String unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }

    public APIRequestCreateAdVideo setUploadPhase (AdVideo.EnumUploadPhase uploadPhase) {
      this.setParam("upload_phase", uploadPhase);
      return this;
    }
    public APIRequestCreateAdVideo setUploadPhase (String uploadPhase) {
      this.setParam("upload_phase", uploadPhase);
      return this;
    }

    public APIRequestCreateAdVideo setUploadSessionId (String uploadSessionId) {
      this.setParam("upload_session_id", uploadSessionId);
      return this;
    }

    public APIRequestCreateAdVideo setUploadSettingProperties (String uploadSettingProperties) {
      this.setParam("upload_setting_properties", uploadSettingProperties);
      return this;
    }

    public APIRequestCreateAdVideo setVideoFileChunk (String videoFileChunk) {
      this.setParam("video_file_chunk", videoFileChunk);
      return this;
    }
    public APIRequestCreateAdVideo setVideoFileChunk (File videoFileChunk) {
      this.setParam("video_file_chunk", videoFileChunk);
      return this;
    }

    public APIRequestCreateAdVideo setVideoFileChunk (byte[] videoFileChunk) {
      this.setParam("video_file_chunk", videoFileChunk);
      return this;
    }

    public APIRequestCreateAdVideo setVideoStartTimeMs (Long videoStartTimeMs) {
      this.setParam("video_start_time_ms", videoStartTimeMs);
      return this;
    }
    public APIRequestCreateAdVideo setVideoStartTimeMs (String videoStartTimeMs) {
      this.setParam("video_start_time_ms", videoStartTimeMs);
      return this;
    }

    public APIRequestCreateAdVideo setWaterfallId (String waterfallId) {
      this.setParam("waterfall_id", waterfallId);
      return this;
    }

    public APIRequestCreateAdVideo requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAdVideo requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdVideo requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAdVideo requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAdVideo requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAdVideo requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeleteAgencies extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAgencies.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAgencies(String nodeId, APIContext context) {
      super(context, nodeId, "/agencies", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAgencies setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAgencies setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAgencies setBusiness (String business) {
      this.setParam("business", business);
      return this;
    }

    public APIRequestDeleteAgencies requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAgencies requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAgencies requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAgencies requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAgencies requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAgencies requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAgencies extends APIRequest<Business> {

    APINodeList<Business> lastResponse = null;
    @Override
    public APINodeList<Business> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "block_offline_analytics",
      "created_by",
      "created_time",
      "extended_updated_time",
      "id",
      "is_hidden",
      "is_instagram_enabled_in_fb_analytics",
      "link",
      "name",
      "primary_page",
      "profile_picture_uri",
      "timezone_id",
      "two_factor_type",
      "updated_by",
      "updated_time",
      "verification_status",
      "vertical",
      "vertical_id",
    };

    @Override
    public APINodeList<Business> parseResponse(String response, String header) throws APIException {
      return Business.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Business> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Business> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Business>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Business>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Business>>() {
           public APINodeList<Business> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAgencies.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAgencies(String nodeId, APIContext context) {
      super(context, nodeId, "/agencies", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAgencies setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAgencies setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAgencies requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAgencies requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAgencies requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAgencies requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAgencies requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAgencies requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAgencies requestBlockOfflineAnalyticsField () {
      return this.requestBlockOfflineAnalyticsField(true);
    }
    public APIRequestGetAgencies requestBlockOfflineAnalyticsField (boolean value) {
      this.requestField("block_offline_analytics", value);
      return this;
    }
    public APIRequestGetAgencies requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetAgencies requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetAgencies requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAgencies requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAgencies requestExtendedUpdatedTimeField () {
      return this.requestExtendedUpdatedTimeField(true);
    }
    public APIRequestGetAgencies requestExtendedUpdatedTimeField (boolean value) {
      this.requestField("extended_updated_time", value);
      return this;
    }
    public APIRequestGetAgencies requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAgencies requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAgencies requestIsHiddenField () {
      return this.requestIsHiddenField(true);
    }
    public APIRequestGetAgencies requestIsHiddenField (boolean value) {
      this.requestField("is_hidden", value);
      return this;
    }
    public APIRequestGetAgencies requestIsInstagramEnabledInFbAnalyticsField () {
      return this.requestIsInstagramEnabledInFbAnalyticsField(true);
    }
    public APIRequestGetAgencies requestIsInstagramEnabledInFbAnalyticsField (boolean value) {
      this.requestField("is_instagram_enabled_in_fb_analytics", value);
      return this;
    }
    public APIRequestGetAgencies requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetAgencies requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetAgencies requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAgencies requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAgencies requestPrimaryPageField () {
      return this.requestPrimaryPageField(true);
    }
    public APIRequestGetAgencies requestPrimaryPageField (boolean value) {
      this.requestField("primary_page", value);
      return this;
    }
    public APIRequestGetAgencies requestProfilePictureUriField () {
      return this.requestProfilePictureUriField(true);
    }
    public APIRequestGetAgencies requestProfilePictureUriField (boolean value) {
      this.requestField("profile_picture_uri", value);
      return this;
    }
    public APIRequestGetAgencies requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGetAgencies requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGetAgencies requestTwoFactorTypeField () {
      return this.requestTwoFactorTypeField(true);
    }
    public APIRequestGetAgencies requestTwoFactorTypeField (boolean value) {
      this.requestField("two_factor_type", value);
      return this;
    }
    public APIRequestGetAgencies requestUpdatedByField () {
      return this.requestUpdatedByField(true);
    }
    public APIRequestGetAgencies requestUpdatedByField (boolean value) {
      this.requestField("updated_by", value);
      return this;
    }
    public APIRequestGetAgencies requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAgencies requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetAgencies requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetAgencies requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetAgencies requestVerticalField () {
      return this.requestVerticalField(true);
    }
    public APIRequestGetAgencies requestVerticalField (boolean value) {
      this.requestField("vertical", value);
      return this;
    }
    public APIRequestGetAgencies requestVerticalIdField () {
      return this.requestVerticalIdField(true);
    }
    public APIRequestGetAgencies requestVerticalIdField (boolean value) {
      this.requestField("vertical_id", value);
      return this;
    }
  }

  public static class APIRequestCreateAgency extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business",
      "permitted_tasks",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAgency.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAgency(String nodeId, APIContext context) {
      super(context, nodeId, "/agencies", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAgency setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAgency setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAgency setBusiness (String business) {
      this.setParam("business", business);
      return this;
    }

    public APIRequestCreateAgency setPermittedTasks (List<AdAccount.EnumPermittedTasks> permittedTasks) {
      this.setParam("permitted_tasks", permittedTasks);
      return this;
    }
    public APIRequestCreateAgency setPermittedTasks (String permittedTasks) {
      this.setParam("permitted_tasks", permittedTasks);
      return this;
    }

    public APIRequestCreateAgency requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAgency requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAgency requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAgency requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAgency requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAgency requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetApplications extends APIRequest<Application> {

    APINodeList<Application> lastResponse = null;
    @Override
    public APINodeList<Application> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "an_ad_space_limit",
      "an_platforms",
      "android_key_hash",
      "android_sdk_error_categories",
      "app_domains",
      "app_events_feature_bitmask",
      "app_events_session_timeout",
      "app_install_tracked",
      "app_name",
      "app_signals_binding_ios",
      "app_type",
      "auth_dialog_data_help_url",
      "auth_dialog_headline",
      "auth_dialog_perms_explanation",
      "auth_referral_default_activity_privacy",
      "auth_referral_enabled",
      "auth_referral_extended_perms",
      "auth_referral_friend_perms",
      "auth_referral_response_type",
      "auth_referral_user_perms",
      "auto_event_mapping_android",
      "auto_event_mapping_ios",
      "auto_event_setup_enabled",
      "canvas_fluid_height",
      "canvas_fluid_width",
      "canvas_url",
      "category",
      "client_config",
      "company",
      "configured_ios_sso",
      "contact_email",
      "created_time",
      "creator_uid",
      "daily_active_users",
      "daily_active_users_rank",
      "deauth_callback_url",
      "default_share_mode",
      "description",
      "financial_id",
      "gdpv4_chrome_custom_tabs_enabled",
      "gdpv4_enabled",
      "gdpv4_nux_content",
      "gdpv4_nux_enabled",
      "has_messenger_product",
      "hosting_url",
      "icon_url",
      "id",
      "ios_bundle_id",
      "ios_sdk_dialog_flows",
      "ios_sdk_error_categories",
      "ios_sfvc_attr",
      "ios_supports_native_proxy_auth_flow",
      "ios_supports_system_auth",
      "ipad_app_store_id",
      "iphone_app_store_id",
      "is_viewer_admin",
      "latest_sdk_version",
      "link",
      "logging_token",
      "login_secret",
      "logo_url",
      "migrations",
      "mobile_profile_section_url",
      "mobile_web_url",
      "monthly_active_users",
      "monthly_active_users_rank",
      "name",
      "namespace",
      "object_store_urls",
      "page_tab_default_name",
      "page_tab_url",
      "photo_url",
      "privacy_policy_url",
      "profile_section_url",
      "property_id",
      "real_time_mode_devices",
      "restrictions",
      "restrictive_data_filter_rules",
      "sdk_update_message",
      "seamless_login",
      "secure_canvas_url",
      "secure_page_tab_url",
      "server_ip_whitelist",
      "smart_login_bookmark_icon_url",
      "smart_login_menu_icon_url",
      "social_discovery",
      "subcategory",
      "supported_platforms",
      "supports_apprequests_fast_app_switch",
      "supports_attribution",
      "supports_implicit_sdk_logging",
      "suppress_native_ios_gdp",
      "terms_of_service_url",
      "url_scheme_suffix",
      "user_support_email",
      "user_support_url",
      "website_url",
      "weekly_active_users",
    };

    @Override
    public APINodeList<Application> parseResponse(String response, String header) throws APIException {
      return Application.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Application> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Application> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Application>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Application>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Application>>() {
           public APINodeList<Application> apply(ResponseWrapper result) {
             try {
               return APIRequestGetApplications.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetApplications(String nodeId, APIContext context) {
      super(context, nodeId, "/applications", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetApplications setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetApplications setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetApplications requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetApplications requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetApplications requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetApplications requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetApplications requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetApplications requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetApplications requestAnAdSpaceLimitField () {
      return this.requestAnAdSpaceLimitField(true);
    }
    public APIRequestGetApplications requestAnAdSpaceLimitField (boolean value) {
      this.requestField("an_ad_space_limit", value);
      return this;
    }
    public APIRequestGetApplications requestAnPlatformsField () {
      return this.requestAnPlatformsField(true);
    }
    public APIRequestGetApplications requestAnPlatformsField (boolean value) {
      this.requestField("an_platforms", value);
      return this;
    }
    public APIRequestGetApplications requestAndroidKeyHashField () {
      return this.requestAndroidKeyHashField(true);
    }
    public APIRequestGetApplications requestAndroidKeyHashField (boolean value) {
      this.requestField("android_key_hash", value);
      return this;
    }
    public APIRequestGetApplications requestAndroidSdkErrorCategoriesField () {
      return this.requestAndroidSdkErrorCategoriesField(true);
    }
    public APIRequestGetApplications requestAndroidSdkErrorCategoriesField (boolean value) {
      this.requestField("android_sdk_error_categories", value);
      return this;
    }
    public APIRequestGetApplications requestAppDomainsField () {
      return this.requestAppDomainsField(true);
    }
    public APIRequestGetApplications requestAppDomainsField (boolean value) {
      this.requestField("app_domains", value);
      return this;
    }
    public APIRequestGetApplications requestAppEventsFeatureBitmaskField () {
      return this.requestAppEventsFeatureBitmaskField(true);
    }
    public APIRequestGetApplications requestAppEventsFeatureBitmaskField (boolean value) {
      this.requestField("app_events_feature_bitmask", value);
      return this;
    }
    public APIRequestGetApplications requestAppEventsSessionTimeoutField () {
      return this.requestAppEventsSessionTimeoutField(true);
    }
    public APIRequestGetApplications requestAppEventsSessionTimeoutField (boolean value) {
      this.requestField("app_events_session_timeout", value);
      return this;
    }
    public APIRequestGetApplications requestAppInstallTrackedField () {
      return this.requestAppInstallTrackedField(true);
    }
    public APIRequestGetApplications requestAppInstallTrackedField (boolean value) {
      this.requestField("app_install_tracked", value);
      return this;
    }
    public APIRequestGetApplications requestAppNameField () {
      return this.requestAppNameField(true);
    }
    public APIRequestGetApplications requestAppNameField (boolean value) {
      this.requestField("app_name", value);
      return this;
    }
    public APIRequestGetApplications requestAppSignalsBindingIosField () {
      return this.requestAppSignalsBindingIosField(true);
    }
    public APIRequestGetApplications requestAppSignalsBindingIosField (boolean value) {
      this.requestField("app_signals_binding_ios", value);
      return this;
    }
    public APIRequestGetApplications requestAppTypeField () {
      return this.requestAppTypeField(true);
    }
    public APIRequestGetApplications requestAppTypeField (boolean value) {
      this.requestField("app_type", value);
      return this;
    }
    public APIRequestGetApplications requestAuthDialogDataHelpUrlField () {
      return this.requestAuthDialogDataHelpUrlField(true);
    }
    public APIRequestGetApplications requestAuthDialogDataHelpUrlField (boolean value) {
      this.requestField("auth_dialog_data_help_url", value);
      return this;
    }
    public APIRequestGetApplications requestAuthDialogHeadlineField () {
      return this.requestAuthDialogHeadlineField(true);
    }
    public APIRequestGetApplications requestAuthDialogHeadlineField (boolean value) {
      this.requestField("auth_dialog_headline", value);
      return this;
    }
    public APIRequestGetApplications requestAuthDialogPermsExplanationField () {
      return this.requestAuthDialogPermsExplanationField(true);
    }
    public APIRequestGetApplications requestAuthDialogPermsExplanationField (boolean value) {
      this.requestField("auth_dialog_perms_explanation", value);
      return this;
    }
    public APIRequestGetApplications requestAuthReferralDefaultActivityPrivacyField () {
      return this.requestAuthReferralDefaultActivityPrivacyField(true);
    }
    public APIRequestGetApplications requestAuthReferralDefaultActivityPrivacyField (boolean value) {
      this.requestField("auth_referral_default_activity_privacy", value);
      return this;
    }
    public APIRequestGetApplications requestAuthReferralEnabledField () {
      return this.requestAuthReferralEnabledField(true);
    }
    public APIRequestGetApplications requestAuthReferralEnabledField (boolean value) {
      this.requestField("auth_referral_enabled", value);
      return this;
    }
    public APIRequestGetApplications requestAuthReferralExtendedPermsField () {
      return this.requestAuthReferralExtendedPermsField(true);
    }
    public APIRequestGetApplications requestAuthReferralExtendedPermsField (boolean value) {
      this.requestField("auth_referral_extended_perms", value);
      return this;
    }
    public APIRequestGetApplications requestAuthReferralFriendPermsField () {
      return this.requestAuthReferralFriendPermsField(true);
    }
    public APIRequestGetApplications requestAuthReferralFriendPermsField (boolean value) {
      this.requestField("auth_referral_friend_perms", value);
      return this;
    }
    public APIRequestGetApplications requestAuthReferralResponseTypeField () {
      return this.requestAuthReferralResponseTypeField(true);
    }
    public APIRequestGetApplications requestAuthReferralResponseTypeField (boolean value) {
      this.requestField("auth_referral_response_type", value);
      return this;
    }
    public APIRequestGetApplications requestAuthReferralUserPermsField () {
      return this.requestAuthReferralUserPermsField(true);
    }
    public APIRequestGetApplications requestAuthReferralUserPermsField (boolean value) {
      this.requestField("auth_referral_user_perms", value);
      return this;
    }
    public APIRequestGetApplications requestAutoEventMappingAndroidField () {
      return this.requestAutoEventMappingAndroidField(true);
    }
    public APIRequestGetApplications requestAutoEventMappingAndroidField (boolean value) {
      this.requestField("auto_event_mapping_android", value);
      return this;
    }
    public APIRequestGetApplications requestAutoEventMappingIosField () {
      return this.requestAutoEventMappingIosField(true);
    }
    public APIRequestGetApplications requestAutoEventMappingIosField (boolean value) {
      this.requestField("auto_event_mapping_ios", value);
      return this;
    }
    public APIRequestGetApplications requestAutoEventSetupEnabledField () {
      return this.requestAutoEventSetupEnabledField(true);
    }
    public APIRequestGetApplications requestAutoEventSetupEnabledField (boolean value) {
      this.requestField("auto_event_setup_enabled", value);
      return this;
    }
    public APIRequestGetApplications requestCanvasFluidHeightField () {
      return this.requestCanvasFluidHeightField(true);
    }
    public APIRequestGetApplications requestCanvasFluidHeightField (boolean value) {
      this.requestField("canvas_fluid_height", value);
      return this;
    }
    public APIRequestGetApplications requestCanvasFluidWidthField () {
      return this.requestCanvasFluidWidthField(true);
    }
    public APIRequestGetApplications requestCanvasFluidWidthField (boolean value) {
      this.requestField("canvas_fluid_width", value);
      return this;
    }
    public APIRequestGetApplications requestCanvasUrlField () {
      return this.requestCanvasUrlField(true);
    }
    public APIRequestGetApplications requestCanvasUrlField (boolean value) {
      this.requestField("canvas_url", value);
      return this;
    }
    public APIRequestGetApplications requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetApplications requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetApplications requestClientConfigField () {
      return this.requestClientConfigField(true);
    }
    public APIRequestGetApplications requestClientConfigField (boolean value) {
      this.requestField("client_config", value);
      return this;
    }
    public APIRequestGetApplications requestCompanyField () {
      return this.requestCompanyField(true);
    }
    public APIRequestGetApplications requestCompanyField (boolean value) {
      this.requestField("company", value);
      return this;
    }
    public APIRequestGetApplications requestConfiguredIosSsoField () {
      return this.requestConfiguredIosSsoField(true);
    }
    public APIRequestGetApplications requestConfiguredIosSsoField (boolean value) {
      this.requestField("configured_ios_sso", value);
      return this;
    }
    public APIRequestGetApplications requestContactEmailField () {
      return this.requestContactEmailField(true);
    }
    public APIRequestGetApplications requestContactEmailField (boolean value) {
      this.requestField("contact_email", value);
      return this;
    }
    public APIRequestGetApplications requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetApplications requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetApplications requestCreatorUidField () {
      return this.requestCreatorUidField(true);
    }
    public APIRequestGetApplications requestCreatorUidField (boolean value) {
      this.requestField("creator_uid", value);
      return this;
    }
    public APIRequestGetApplications requestDailyActiveUsersField () {
      return this.requestDailyActiveUsersField(true);
    }
    public APIRequestGetApplications requestDailyActiveUsersField (boolean value) {
      this.requestField("daily_active_users", value);
      return this;
    }
    public APIRequestGetApplications requestDailyActiveUsersRankField () {
      return this.requestDailyActiveUsersRankField(true);
    }
    public APIRequestGetApplications requestDailyActiveUsersRankField (boolean value) {
      this.requestField("daily_active_users_rank", value);
      return this;
    }
    public APIRequestGetApplications requestDeauthCallbackUrlField () {
      return this.requestDeauthCallbackUrlField(true);
    }
    public APIRequestGetApplications requestDeauthCallbackUrlField (boolean value) {
      this.requestField("deauth_callback_url", value);
      return this;
    }
    public APIRequestGetApplications requestDefaultShareModeField () {
      return this.requestDefaultShareModeField(true);
    }
    public APIRequestGetApplications requestDefaultShareModeField (boolean value) {
      this.requestField("default_share_mode", value);
      return this;
    }
    public APIRequestGetApplications requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetApplications requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetApplications requestFinancialIdField () {
      return this.requestFinancialIdField(true);
    }
    public APIRequestGetApplications requestFinancialIdField (boolean value) {
      this.requestField("financial_id", value);
      return this;
    }
    public APIRequestGetApplications requestGdpv4ChromeCustomTabsEnabledField () {
      return this.requestGdpv4ChromeCustomTabsEnabledField(true);
    }
    public APIRequestGetApplications requestGdpv4ChromeCustomTabsEnabledField (boolean value) {
      this.requestField("gdpv4_chrome_custom_tabs_enabled", value);
      return this;
    }
    public APIRequestGetApplications requestGdpv4EnabledField () {
      return this.requestGdpv4EnabledField(true);
    }
    public APIRequestGetApplications requestGdpv4EnabledField (boolean value) {
      this.requestField("gdpv4_enabled", value);
      return this;
    }
    public APIRequestGetApplications requestGdpv4NuxContentField () {
      return this.requestGdpv4NuxContentField(true);
    }
    public APIRequestGetApplications requestGdpv4NuxContentField (boolean value) {
      this.requestField("gdpv4_nux_content", value);
      return this;
    }
    public APIRequestGetApplications requestGdpv4NuxEnabledField () {
      return this.requestGdpv4NuxEnabledField(true);
    }
    public APIRequestGetApplications requestGdpv4NuxEnabledField (boolean value) {
      this.requestField("gdpv4_nux_enabled", value);
      return this;
    }
    public APIRequestGetApplications requestHasMessengerProductField () {
      return this.requestHasMessengerProductField(true);
    }
    public APIRequestGetApplications requestHasMessengerProductField (boolean value) {
      this.requestField("has_messenger_product", value);
      return this;
    }
    public APIRequestGetApplications requestHostingUrlField () {
      return this.requestHostingUrlField(true);
    }
    public APIRequestGetApplications requestHostingUrlField (boolean value) {
      this.requestField("hosting_url", value);
      return this;
    }
    public APIRequestGetApplications requestIconUrlField () {
      return this.requestIconUrlField(true);
    }
    public APIRequestGetApplications requestIconUrlField (boolean value) {
      this.requestField("icon_url", value);
      return this;
    }
    public APIRequestGetApplications requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetApplications requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetApplications requestIosBundleIdField () {
      return this.requestIosBundleIdField(true);
    }
    public APIRequestGetApplications requestIosBundleIdField (boolean value) {
      this.requestField("ios_bundle_id", value);
      return this;
    }
    public APIRequestGetApplications requestIosSdkDialogFlowsField () {
      return this.requestIosSdkDialogFlowsField(true);
    }
    public APIRequestGetApplications requestIosSdkDialogFlowsField (boolean value) {
      this.requestField("ios_sdk_dialog_flows", value);
      return this;
    }
    public APIRequestGetApplications requestIosSdkErrorCategoriesField () {
      return this.requestIosSdkErrorCategoriesField(true);
    }
    public APIRequestGetApplications requestIosSdkErrorCategoriesField (boolean value) {
      this.requestField("ios_sdk_error_categories", value);
      return this;
    }
    public APIRequestGetApplications requestIosSfvcAttrField () {
      return this.requestIosSfvcAttrField(true);
    }
    public APIRequestGetApplications requestIosSfvcAttrField (boolean value) {
      this.requestField("ios_sfvc_attr", value);
      return this;
    }
    public APIRequestGetApplications requestIosSupportsNativeProxyAuthFlowField () {
      return this.requestIosSupportsNativeProxyAuthFlowField(true);
    }
    public APIRequestGetApplications requestIosSupportsNativeProxyAuthFlowField (boolean value) {
      this.requestField("ios_supports_native_proxy_auth_flow", value);
      return this;
    }
    public APIRequestGetApplications requestIosSupportsSystemAuthField () {
      return this.requestIosSupportsSystemAuthField(true);
    }
    public APIRequestGetApplications requestIosSupportsSystemAuthField (boolean value) {
      this.requestField("ios_supports_system_auth", value);
      return this;
    }
    public APIRequestGetApplications requestIpadAppStoreIdField () {
      return this.requestIpadAppStoreIdField(true);
    }
    public APIRequestGetApplications requestIpadAppStoreIdField (boolean value) {
      this.requestField("ipad_app_store_id", value);
      return this;
    }
    public APIRequestGetApplications requestIphoneAppStoreIdField () {
      return this.requestIphoneAppStoreIdField(true);
    }
    public APIRequestGetApplications requestIphoneAppStoreIdField (boolean value) {
      this.requestField("iphone_app_store_id", value);
      return this;
    }
    public APIRequestGetApplications requestIsViewerAdminField () {
      return this.requestIsViewerAdminField(true);
    }
    public APIRequestGetApplications requestIsViewerAdminField (boolean value) {
      this.requestField("is_viewer_admin", value);
      return this;
    }
    public APIRequestGetApplications requestLatestSdkVersionField () {
      return this.requestLatestSdkVersionField(true);
    }
    public APIRequestGetApplications requestLatestSdkVersionField (boolean value) {
      this.requestField("latest_sdk_version", value);
      return this;
    }
    public APIRequestGetApplications requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetApplications requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetApplications requestLoggingTokenField () {
      return this.requestLoggingTokenField(true);
    }
    public APIRequestGetApplications requestLoggingTokenField (boolean value) {
      this.requestField("logging_token", value);
      return this;
    }
    public APIRequestGetApplications requestLoginSecretField () {
      return this.requestLoginSecretField(true);
    }
    public APIRequestGetApplications requestLoginSecretField (boolean value) {
      this.requestField("login_secret", value);
      return this;
    }
    public APIRequestGetApplications requestLogoUrlField () {
      return this.requestLogoUrlField(true);
    }
    public APIRequestGetApplications requestLogoUrlField (boolean value) {
      this.requestField("logo_url", value);
      return this;
    }
    public APIRequestGetApplications requestMigrationsField () {
      return this.requestMigrationsField(true);
    }
    public APIRequestGetApplications requestMigrationsField (boolean value) {
      this.requestField("migrations", value);
      return this;
    }
    public APIRequestGetApplications requestMobileProfileSectionUrlField () {
      return this.requestMobileProfileSectionUrlField(true);
    }
    public APIRequestGetApplications requestMobileProfileSectionUrlField (boolean value) {
      this.requestField("mobile_profile_section_url", value);
      return this;
    }
    public APIRequestGetApplications requestMobileWebUrlField () {
      return this.requestMobileWebUrlField(true);
    }
    public APIRequestGetApplications requestMobileWebUrlField (boolean value) {
      this.requestField("mobile_web_url", value);
      return this;
    }
    public APIRequestGetApplications requestMonthlyActiveUsersField () {
      return this.requestMonthlyActiveUsersField(true);
    }
    public APIRequestGetApplications requestMonthlyActiveUsersField (boolean value) {
      this.requestField("monthly_active_users", value);
      return this;
    }
    public APIRequestGetApplications requestMonthlyActiveUsersRankField () {
      return this.requestMonthlyActiveUsersRankField(true);
    }
    public APIRequestGetApplications requestMonthlyActiveUsersRankField (boolean value) {
      this.requestField("monthly_active_users_rank", value);
      return this;
    }
    public APIRequestGetApplications requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetApplications requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetApplications requestNamespaceField () {
      return this.requestNamespaceField(true);
    }
    public APIRequestGetApplications requestNamespaceField (boolean value) {
      this.requestField("namespace", value);
      return this;
    }
    public APIRequestGetApplications requestObjectStoreUrlsField () {
      return this.requestObjectStoreUrlsField(true);
    }
    public APIRequestGetApplications requestObjectStoreUrlsField (boolean value) {
      this.requestField("object_store_urls", value);
      return this;
    }
    public APIRequestGetApplications requestPageTabDefaultNameField () {
      return this.requestPageTabDefaultNameField(true);
    }
    public APIRequestGetApplications requestPageTabDefaultNameField (boolean value) {
      this.requestField("page_tab_default_name", value);
      return this;
    }
    public APIRequestGetApplications requestPageTabUrlField () {
      return this.requestPageTabUrlField(true);
    }
    public APIRequestGetApplications requestPageTabUrlField (boolean value) {
      this.requestField("page_tab_url", value);
      return this;
    }
    public APIRequestGetApplications requestPhotoUrlField () {
      return this.requestPhotoUrlField(true);
    }
    public APIRequestGetApplications requestPhotoUrlField (boolean value) {
      this.requestField("photo_url", value);
      return this;
    }
    public APIRequestGetApplications requestPrivacyPolicyUrlField () {
      return this.requestPrivacyPolicyUrlField(true);
    }
    public APIRequestGetApplications requestPrivacyPolicyUrlField (boolean value) {
      this.requestField("privacy_policy_url", value);
      return this;
    }
    public APIRequestGetApplications requestProfileSectionUrlField () {
      return this.requestProfileSectionUrlField(true);
    }
    public APIRequestGetApplications requestProfileSectionUrlField (boolean value) {
      this.requestField("profile_section_url", value);
      return this;
    }
    public APIRequestGetApplications requestPropertyIdField () {
      return this.requestPropertyIdField(true);
    }
    public APIRequestGetApplications requestPropertyIdField (boolean value) {
      this.requestField("property_id", value);
      return this;
    }
    public APIRequestGetApplications requestRealTimeModeDevicesField () {
      return this.requestRealTimeModeDevicesField(true);
    }
    public APIRequestGetApplications requestRealTimeModeDevicesField (boolean value) {
      this.requestField("real_time_mode_devices", value);
      return this;
    }
    public APIRequestGetApplications requestRestrictionsField () {
      return this.requestRestrictionsField(true);
    }
    public APIRequestGetApplications requestRestrictionsField (boolean value) {
      this.requestField("restrictions", value);
      return this;
    }
    public APIRequestGetApplications requestRestrictiveDataFilterRulesField () {
      return this.requestRestrictiveDataFilterRulesField(true);
    }
    public APIRequestGetApplications requestRestrictiveDataFilterRulesField (boolean value) {
      this.requestField("restrictive_data_filter_rules", value);
      return this;
    }
    public APIRequestGetApplications requestSdkUpdateMessageField () {
      return this.requestSdkUpdateMessageField(true);
    }
    public APIRequestGetApplications requestSdkUpdateMessageField (boolean value) {
      this.requestField("sdk_update_message", value);
      return this;
    }
    public APIRequestGetApplications requestSeamlessLoginField () {
      return this.requestSeamlessLoginField(true);
    }
    public APIRequestGetApplications requestSeamlessLoginField (boolean value) {
      this.requestField("seamless_login", value);
      return this;
    }
    public APIRequestGetApplications requestSecureCanvasUrlField () {
      return this.requestSecureCanvasUrlField(true);
    }
    public APIRequestGetApplications requestSecureCanvasUrlField (boolean value) {
      this.requestField("secure_canvas_url", value);
      return this;
    }
    public APIRequestGetApplications requestSecurePageTabUrlField () {
      return this.requestSecurePageTabUrlField(true);
    }
    public APIRequestGetApplications requestSecurePageTabUrlField (boolean value) {
      this.requestField("secure_page_tab_url", value);
      return this;
    }
    public APIRequestGetApplications requestServerIpWhitelistField () {
      return this.requestServerIpWhitelistField(true);
    }
    public APIRequestGetApplications requestServerIpWhitelistField (boolean value) {
      this.requestField("server_ip_whitelist", value);
      return this;
    }
    public APIRequestGetApplications requestSmartLoginBookmarkIconUrlField () {
      return this.requestSmartLoginBookmarkIconUrlField(true);
    }
    public APIRequestGetApplications requestSmartLoginBookmarkIconUrlField (boolean value) {
      this.requestField("smart_login_bookmark_icon_url", value);
      return this;
    }
    public APIRequestGetApplications requestSmartLoginMenuIconUrlField () {
      return this.requestSmartLoginMenuIconUrlField(true);
    }
    public APIRequestGetApplications requestSmartLoginMenuIconUrlField (boolean value) {
      this.requestField("smart_login_menu_icon_url", value);
      return this;
    }
    public APIRequestGetApplications requestSocialDiscoveryField () {
      return this.requestSocialDiscoveryField(true);
    }
    public APIRequestGetApplications requestSocialDiscoveryField (boolean value) {
      this.requestField("social_discovery", value);
      return this;
    }
    public APIRequestGetApplications requestSubcategoryField () {
      return this.requestSubcategoryField(true);
    }
    public APIRequestGetApplications requestSubcategoryField (boolean value) {
      this.requestField("subcategory", value);
      return this;
    }
    public APIRequestGetApplications requestSupportedPlatformsField () {
      return this.requestSupportedPlatformsField(true);
    }
    public APIRequestGetApplications requestSupportedPlatformsField (boolean value) {
      this.requestField("supported_platforms", value);
      return this;
    }
    public APIRequestGetApplications requestSupportsApprequestsFastAppSwitchField () {
      return this.requestSupportsApprequestsFastAppSwitchField(true);
    }
    public APIRequestGetApplications requestSupportsApprequestsFastAppSwitchField (boolean value) {
      this.requestField("supports_apprequests_fast_app_switch", value);
      return this;
    }
    public APIRequestGetApplications requestSupportsAttributionField () {
      return this.requestSupportsAttributionField(true);
    }
    public APIRequestGetApplications requestSupportsAttributionField (boolean value) {
      this.requestField("supports_attribution", value);
      return this;
    }
    public APIRequestGetApplications requestSupportsImplicitSdkLoggingField () {
      return this.requestSupportsImplicitSdkLoggingField(true);
    }
    public APIRequestGetApplications requestSupportsImplicitSdkLoggingField (boolean value) {
      this.requestField("supports_implicit_sdk_logging", value);
      return this;
    }
    public APIRequestGetApplications requestSuppressNativeIosGdpField () {
      return this.requestSuppressNativeIosGdpField(true);
    }
    public APIRequestGetApplications requestSuppressNativeIosGdpField (boolean value) {
      this.requestField("suppress_native_ios_gdp", value);
      return this;
    }
    public APIRequestGetApplications requestTermsOfServiceUrlField () {
      return this.requestTermsOfServiceUrlField(true);
    }
    public APIRequestGetApplications requestTermsOfServiceUrlField (boolean value) {
      this.requestField("terms_of_service_url", value);
      return this;
    }
    public APIRequestGetApplications requestUrlSchemeSuffixField () {
      return this.requestUrlSchemeSuffixField(true);
    }
    public APIRequestGetApplications requestUrlSchemeSuffixField (boolean value) {
      this.requestField("url_scheme_suffix", value);
      return this;
    }
    public APIRequestGetApplications requestUserSupportEmailField () {
      return this.requestUserSupportEmailField(true);
    }
    public APIRequestGetApplications requestUserSupportEmailField (boolean value) {
      this.requestField("user_support_email", value);
      return this;
    }
    public APIRequestGetApplications requestUserSupportUrlField () {
      return this.requestUserSupportUrlField(true);
    }
    public APIRequestGetApplications requestUserSupportUrlField (boolean value) {
      this.requestField("user_support_url", value);
      return this;
    }
    public APIRequestGetApplications requestWebsiteUrlField () {
      return this.requestWebsiteUrlField(true);
    }
    public APIRequestGetApplications requestWebsiteUrlField (boolean value) {
      this.requestField("website_url", value);
      return this;
    }
    public APIRequestGetApplications requestWeeklyActiveUsersField () {
      return this.requestWeeklyActiveUsersField(true);
    }
    public APIRequestGetApplications requestWeeklyActiveUsersField (boolean value) {
      this.requestField("weekly_active_users", value);
      return this;
    }
  }

  public static class APIRequestDeleteAssignedUsers extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "user",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAssignedUsers.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAssignedUsers(String nodeId, APIContext context) {
      super(context, nodeId, "/assigned_users", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAssignedUsers setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAssignedUsers setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAssignedUsers setUser (Long user) {
      this.setParam("user", user);
      return this;
    }
    public APIRequestDeleteAssignedUsers setUser (String user) {
      this.setParam("user", user);
      return this;
    }

    public APIRequestDeleteAssignedUsers requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAssignedUsers requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAssignedUsers requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAssignedUsers requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAssignedUsers requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAssignedUsers requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAssignedUsers extends APIRequest<AssignedUser> {

    APINodeList<AssignedUser> lastResponse = null;
    @Override
    public APINodeList<AssignedUser> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business",
    };

    public static final String[] FIELDS = {
      "business",
      "id",
      "name",
      "user_type",
    };

    @Override
    public APINodeList<AssignedUser> parseResponse(String response, String header) throws APIException {
      return AssignedUser.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AssignedUser> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AssignedUser> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AssignedUser>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AssignedUser>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AssignedUser>>() {
           public APINodeList<AssignedUser> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAssignedUsers.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAssignedUsers(String nodeId, APIContext context) {
      super(context, nodeId, "/assigned_users", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAssignedUsers setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAssignedUsers setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAssignedUsers setBusiness (String business) {
      this.setParam("business", business);
      return this;
    }

    public APIRequestGetAssignedUsers requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAssignedUsers requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedUsers requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAssignedUsers requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedUsers requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAssignedUsers requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAssignedUsers requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAssignedUsers requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAssignedUsers requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAssignedUsers requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAssignedUsers requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAssignedUsers requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAssignedUsers requestUserTypeField () {
      return this.requestUserTypeField(true);
    }
    public APIRequestGetAssignedUsers requestUserTypeField (boolean value) {
      this.requestField("user_type", value);
      return this;
    }
  }

  public static class APIRequestCreateAssignedUser extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "tasks",
      "user",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAssignedUser.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAssignedUser(String nodeId, APIContext context) {
      super(context, nodeId, "/assigned_users", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAssignedUser setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAssignedUser setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAssignedUser setTasks (List<AdAccount.EnumTasks> tasks) {
      this.setParam("tasks", tasks);
      return this;
    }
    public APIRequestCreateAssignedUser setTasks (String tasks) {
      this.setParam("tasks", tasks);
      return this;
    }

    public APIRequestCreateAssignedUser setUser (Long user) {
      this.setParam("user", user);
      return this;
    }
    public APIRequestCreateAssignedUser setUser (String user) {
      this.setParam("user", user);
      return this;
    }

    public APIRequestCreateAssignedUser requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAssignedUser requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAssignedUser requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAssignedUser requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAssignedUser requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAssignedUser requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateAsyncBatchRequest extends APIRequest<Campaign> {

    Campaign lastResponse = null;
    @Override
    public Campaign getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "adbatch",
      "name",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public Campaign parseResponse(String response, String header) throws APIException {
      return Campaign.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public Campaign execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public Campaign execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<Campaign> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<Campaign> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, Campaign>() {
           public Campaign apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAsyncBatchRequest.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAsyncBatchRequest(String nodeId, APIContext context) {
      super(context, nodeId, "/async_batch_requests", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAsyncBatchRequest setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAsyncBatchRequest setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAsyncBatchRequest setAdbatch (List<Object> adbatch) {
      this.setParam("adbatch", adbatch);
      return this;
    }
    public APIRequestCreateAsyncBatchRequest setAdbatch (String adbatch) {
      this.setParam("adbatch", adbatch);
      return this;
    }

    public APIRequestCreateAsyncBatchRequest setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAsyncBatchRequest requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAsyncBatchRequest requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAsyncBatchRequest requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAsyncBatchRequest requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAsyncBatchRequest requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAsyncBatchRequest requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAsyncRequests extends APIRequest<AsyncRequest> {

    APINodeList<AsyncRequest> lastResponse = null;
    @Override
    public APINodeList<AsyncRequest> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "status",
      "type",
    };

    public static final String[] FIELDS = {
      "id",
      "result",
      "status",
      "type",
    };

    @Override
    public APINodeList<AsyncRequest> parseResponse(String response, String header) throws APIException {
      return AsyncRequest.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AsyncRequest> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AsyncRequest> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AsyncRequest>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AsyncRequest>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AsyncRequest>>() {
           public APINodeList<AsyncRequest> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAsyncRequests.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAsyncRequests(String nodeId, APIContext context) {
      super(context, nodeId, "/async_requests", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAsyncRequests setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAsyncRequests setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAsyncRequests setStatus (AsyncRequest.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestGetAsyncRequests setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestGetAsyncRequests setType (AsyncRequest.EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestGetAsyncRequests setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestGetAsyncRequests requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAsyncRequests requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAsyncRequests requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAsyncRequests requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAsyncRequests requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAsyncRequests requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAsyncRequests requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAsyncRequests requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAsyncRequests requestResultField () {
      return this.requestResultField(true);
    }
    public APIRequestGetAsyncRequests requestResultField (boolean value) {
      this.requestField("result", value);
      return this;
    }
    public APIRequestGetAsyncRequests requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetAsyncRequests requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetAsyncRequests requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetAsyncRequests requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
  }

  public static class APIRequestGetAsyncAdRequestSets extends APIRequest<AdAsyncRequestSet> {

    APINodeList<AdAsyncRequestSet> lastResponse = null;
    @Override
    public APINodeList<AdAsyncRequestSet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "is_completed",
    };

    public static final String[] FIELDS = {
      "canceled_count",
      "created_time",
      "error_count",
      "id",
      "in_progress_count",
      "initial_count",
      "is_completed",
      "name",
      "notification_mode",
      "notification_result",
      "notification_status",
      "notification_uri",
      "owner_id",
      "success_count",
      "total_count",
      "updated_time",
    };

    @Override
    public APINodeList<AdAsyncRequestSet> parseResponse(String response, String header) throws APIException {
      return AdAsyncRequestSet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAsyncRequestSet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAsyncRequestSet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAsyncRequestSet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAsyncRequestSet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAsyncRequestSet>>() {
           public APINodeList<AdAsyncRequestSet> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAsyncAdRequestSets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAsyncAdRequestSets(String nodeId, APIContext context) {
      super(context, nodeId, "/asyncadrequestsets", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAsyncAdRequestSets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAsyncAdRequestSets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAsyncAdRequestSets setIsCompleted (Boolean isCompleted) {
      this.setParam("is_completed", isCompleted);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets setIsCompleted (String isCompleted) {
      this.setParam("is_completed", isCompleted);
      return this;
    }

    public APIRequestGetAsyncAdRequestSets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAsyncAdRequestSets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAsyncAdRequestSets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAsyncAdRequestSets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAsyncAdRequestSets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAsyncAdRequestSets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAsyncAdRequestSets requestCanceledCountField () {
      return this.requestCanceledCountField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestCanceledCountField (boolean value) {
      this.requestField("canceled_count", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestErrorCountField () {
      return this.requestErrorCountField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestErrorCountField (boolean value) {
      this.requestField("error_count", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestInProgressCountField () {
      return this.requestInProgressCountField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestInProgressCountField (boolean value) {
      this.requestField("in_progress_count", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestInitialCountField () {
      return this.requestInitialCountField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestInitialCountField (boolean value) {
      this.requestField("initial_count", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestIsCompletedField () {
      return this.requestIsCompletedField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestIsCompletedField (boolean value) {
      this.requestField("is_completed", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationModeField () {
      return this.requestNotificationModeField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationModeField (boolean value) {
      this.requestField("notification_mode", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationResultField () {
      return this.requestNotificationResultField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationResultField (boolean value) {
      this.requestField("notification_result", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationStatusField () {
      return this.requestNotificationStatusField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationStatusField (boolean value) {
      this.requestField("notification_status", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationUriField () {
      return this.requestNotificationUriField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestNotificationUriField (boolean value) {
      this.requestField("notification_uri", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestOwnerIdField () {
      return this.requestOwnerIdField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestOwnerIdField (boolean value) {
      this.requestField("owner_id", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestSuccessCountField () {
      return this.requestSuccessCountField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestSuccessCountField (boolean value) {
      this.requestField("success_count", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestTotalCountField () {
      return this.requestTotalCountField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestTotalCountField (boolean value) {
      this.requestField("total_count", value);
      return this;
    }
    public APIRequestGetAsyncAdRequestSets requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAsyncAdRequestSets requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateAsyncAdRequestSet extends APIRequest<AdAsyncRequestSet> {

    AdAsyncRequestSet lastResponse = null;
    @Override
    public AdAsyncRequestSet getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_specs",
      "name",
      "notification_mode",
      "notification_uri",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAsyncRequestSet parseResponse(String response, String header) throws APIException {
      return AdAsyncRequestSet.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAsyncRequestSet execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAsyncRequestSet execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAsyncRequestSet> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAsyncRequestSet> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAsyncRequestSet>() {
           public AdAsyncRequestSet apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAsyncAdRequestSet.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAsyncAdRequestSet(String nodeId, APIContext context) {
      super(context, nodeId, "/asyncadrequestsets", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAsyncAdRequestSet setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAsyncAdRequestSet setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAsyncAdRequestSet setAdSpecs (List<Map<String, String>> adSpecs) {
      this.setParam("ad_specs", adSpecs);
      return this;
    }
    public APIRequestCreateAsyncAdRequestSet setAdSpecs (String adSpecs) {
      this.setParam("ad_specs", adSpecs);
      return this;
    }

    public APIRequestCreateAsyncAdRequestSet setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAsyncAdRequestSet setNotificationMode (AdAsyncRequestSet.EnumNotificationMode notificationMode) {
      this.setParam("notification_mode", notificationMode);
      return this;
    }
    public APIRequestCreateAsyncAdRequestSet setNotificationMode (String notificationMode) {
      this.setParam("notification_mode", notificationMode);
      return this;
    }

    public APIRequestCreateAsyncAdRequestSet setNotificationUri (String notificationUri) {
      this.setParam("notification_uri", notificationUri);
      return this;
    }

    public APIRequestCreateAsyncAdRequestSet requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAsyncAdRequestSet requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAsyncAdRequestSet requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAsyncAdRequestSet requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAsyncAdRequestSet requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAsyncAdRequestSet requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateAudienceReplace extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "payload",
      "session",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAudienceReplace.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAudienceReplace(String nodeId, APIContext context) {
      super(context, nodeId, "/audiencereplace", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAudienceReplace setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAudienceReplace setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAudienceReplace setPayload (Object payload) {
      this.setParam("payload", payload);
      return this;
    }
    public APIRequestCreateAudienceReplace setPayload (String payload) {
      this.setParam("payload", payload);
      return this;
    }

    public APIRequestCreateAudienceReplace setSession (Object session) {
      this.setParam("session", session);
      return this;
    }
    public APIRequestCreateAudienceReplace setSession (String session) {
      this.setParam("session", session);
      return this;
    }

    public APIRequestCreateAudienceReplace requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAudienceReplace requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAudienceReplace requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAudienceReplace requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAudienceReplace requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAudienceReplace requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateBatchReplace extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "payload",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateBatchReplace.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateBatchReplace(String nodeId, APIContext context) {
      super(context, nodeId, "/batchreplace", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateBatchReplace setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateBatchReplace setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateBatchReplace setPayload (List<String> payload) {
      this.setParam("payload", payload);
      return this;
    }
    public APIRequestCreateBatchReplace setPayload (String payload) {
      this.setParam("payload", payload);
      return this;
    }

    public APIRequestCreateBatchReplace requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateBatchReplace requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBatchReplace requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateBatchReplace requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBatchReplace requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateBatchReplace requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateBatchUpload extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "payload",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateBatchUpload.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateBatchUpload(String nodeId, APIContext context) {
      super(context, nodeId, "/batchupload", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateBatchUpload setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateBatchUpload setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateBatchUpload setPayload (List<String> payload) {
      this.setParam("payload", payload);
      return this;
    }
    public APIRequestCreateBatchUpload setPayload (String payload) {
      this.setParam("payload", payload);
      return this;
    }

    public APIRequestCreateBatchUpload requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateBatchUpload requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBatchUpload requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateBatchUpload requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBatchUpload requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateBatchUpload requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateBlockListDraft extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "publisher_urls_file",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateBlockListDraft.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateBlockListDraft(String nodeId, APIContext context) {
      super(context, nodeId, "/block_list_drafts", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateBlockListDraft setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateBlockListDraft setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateBlockListDraft setPublisherUrlsFile (File publisherUrlsFile) {
      this.setParam("publisher_urls_file", publisherUrlsFile);
      return this;
    }
    public APIRequestCreateBlockListDraft setPublisherUrlsFile (String publisherUrlsFile) {
      this.setParam("publisher_urls_file", publisherUrlsFile);
      return this;
    }

    public APIRequestCreateBlockListDraft requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateBlockListDraft requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBlockListDraft requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateBlockListDraft requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBlockListDraft requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateBlockListDraft requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateBrandAudience extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "description",
      "name",
      "target_size",
      "targeting",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateBrandAudience.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateBrandAudience(String nodeId, APIContext context) {
      super(context, nodeId, "/brand_audiences", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateBrandAudience setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateBrandAudience setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateBrandAudience setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateBrandAudience setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateBrandAudience setTargetSize (Long targetSize) {
      this.setParam("target_size", targetSize);
      return this;
    }
    public APIRequestCreateBrandAudience setTargetSize (String targetSize) {
      this.setParam("target_size", targetSize);
      return this;
    }

    public APIRequestCreateBrandAudience setTargeting (Object targeting) {
      this.setParam("targeting", targeting);
      return this;
    }
    public APIRequestCreateBrandAudience setTargeting (String targeting) {
      this.setParam("targeting", targeting);
      return this;
    }

    public APIRequestCreateBrandAudience requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateBrandAudience requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBrandAudience requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateBrandAudience requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateBrandAudience requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateBrandAudience requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetBroadTargetingCategories extends APIRequest<BroadTargetingCategories> {

    APINodeList<BroadTargetingCategories> lastResponse = null;
    @Override
    public APINodeList<BroadTargetingCategories> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "custom_categories_only",
    };

    public static final String[] FIELDS = {
      "category_description",
      "id",
      "name",
      "parent_category",
      "path",
      "size",
      "source",
      "type",
      "type_name",
      "untranslated_name",
      "untranslated_parent_name",
    };

    @Override
    public APINodeList<BroadTargetingCategories> parseResponse(String response, String header) throws APIException {
      return BroadTargetingCategories.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<BroadTargetingCategories> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<BroadTargetingCategories> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<BroadTargetingCategories>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<BroadTargetingCategories>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<BroadTargetingCategories>>() {
           public APINodeList<BroadTargetingCategories> apply(ResponseWrapper result) {
             try {
               return APIRequestGetBroadTargetingCategories.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetBroadTargetingCategories(String nodeId, APIContext context) {
      super(context, nodeId, "/broadtargetingcategories", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetBroadTargetingCategories setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetBroadTargetingCategories setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetBroadTargetingCategories setCustomCategoriesOnly (Boolean customCategoriesOnly) {
      this.setParam("custom_categories_only", customCategoriesOnly);
      return this;
    }
    public APIRequestGetBroadTargetingCategories setCustomCategoriesOnly (String customCategoriesOnly) {
      this.setParam("custom_categories_only", customCategoriesOnly);
      return this;
    }

    public APIRequestGetBroadTargetingCategories requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetBroadTargetingCategories requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBroadTargetingCategories requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetBroadTargetingCategories requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBroadTargetingCategories requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetBroadTargetingCategories requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetBroadTargetingCategories requestCategoryDescriptionField () {
      return this.requestCategoryDescriptionField(true);
    }
    public APIRequestGetBroadTargetingCategories requestCategoryDescriptionField (boolean value) {
      this.requestField("category_description", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetBroadTargetingCategories requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetBroadTargetingCategories requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestParentCategoryField () {
      return this.requestParentCategoryField(true);
    }
    public APIRequestGetBroadTargetingCategories requestParentCategoryField (boolean value) {
      this.requestField("parent_category", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestPathField () {
      return this.requestPathField(true);
    }
    public APIRequestGetBroadTargetingCategories requestPathField (boolean value) {
      this.requestField("path", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestSizeField () {
      return this.requestSizeField(true);
    }
    public APIRequestGetBroadTargetingCategories requestSizeField (boolean value) {
      this.requestField("size", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetBroadTargetingCategories requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetBroadTargetingCategories requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestTypeNameField () {
      return this.requestTypeNameField(true);
    }
    public APIRequestGetBroadTargetingCategories requestTypeNameField (boolean value) {
      this.requestField("type_name", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestUntranslatedNameField () {
      return this.requestUntranslatedNameField(true);
    }
    public APIRequestGetBroadTargetingCategories requestUntranslatedNameField (boolean value) {
      this.requestField("untranslated_name", value);
      return this;
    }
    public APIRequestGetBroadTargetingCategories requestUntranslatedParentNameField () {
      return this.requestUntranslatedParentNameField(true);
    }
    public APIRequestGetBroadTargetingCategories requestUntranslatedParentNameField (boolean value) {
      this.requestField("untranslated_parent_name", value);
      return this;
    }
  }

  public static class APIRequestGetBusinessProjects extends APIRequest<BusinessProject> {

    APINodeList<BusinessProject> lastResponse = null;
    @Override
    public APINodeList<BusinessProject> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business",
    };

    public static final String[] FIELDS = {
      "business",
      "created_time",
      "creator",
      "id",
      "name",
    };

    @Override
    public APINodeList<BusinessProject> parseResponse(String response, String header) throws APIException {
      return BusinessProject.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<BusinessProject> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<BusinessProject> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<BusinessProject>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<BusinessProject>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<BusinessProject>>() {
           public APINodeList<BusinessProject> apply(ResponseWrapper result) {
             try {
               return APIRequestGetBusinessProjects.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetBusinessProjects(String nodeId, APIContext context) {
      super(context, nodeId, "/businessprojects", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetBusinessProjects setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetBusinessProjects setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetBusinessProjects setBusiness (String business) {
      this.setParam("business", business);
      return this;
    }

    public APIRequestGetBusinessProjects requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetBusinessProjects requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBusinessProjects requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetBusinessProjects requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBusinessProjects requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetBusinessProjects requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetBusinessProjects requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetBusinessProjects requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetBusinessProjects requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetBusinessProjects requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetBusinessProjects requestCreatorField () {
      return this.requestCreatorField(true);
    }
    public APIRequestGetBusinessProjects requestCreatorField (boolean value) {
      this.requestField("creator", value);
      return this;
    }
    public APIRequestGetBusinessProjects requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetBusinessProjects requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetBusinessProjects requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetBusinessProjects requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
  }

  public static class APIRequestDeleteCampaigns extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "before_date",
      "delete_offset",
      "delete_strategy",
      "object_count",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteCampaigns.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteCampaigns(String nodeId, APIContext context) {
      super(context, nodeId, "/campaigns", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteCampaigns setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteCampaigns setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteCampaigns setBeforeDate (String beforeDate) {
      this.setParam("before_date", beforeDate);
      return this;
    }

    public APIRequestDeleteCampaigns setDeleteOffset (Long deleteOffset) {
      this.setParam("delete_offset", deleteOffset);
      return this;
    }
    public APIRequestDeleteCampaigns setDeleteOffset (String deleteOffset) {
      this.setParam("delete_offset", deleteOffset);
      return this;
    }

    public APIRequestDeleteCampaigns setDeleteStrategy (EnumDeleteStrategy deleteStrategy) {
      this.setParam("delete_strategy", deleteStrategy);
      return this;
    }
    public APIRequestDeleteCampaigns setDeleteStrategy (String deleteStrategy) {
      this.setParam("delete_strategy", deleteStrategy);
      return this;
    }

    public APIRequestDeleteCampaigns setObjectCount (Long objectCount) {
      this.setParam("object_count", objectCount);
      return this;
    }
    public APIRequestDeleteCampaigns setObjectCount (String objectCount) {
      this.setParam("object_count", objectCount);
      return this;
    }

    public APIRequestDeleteCampaigns requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteCampaigns requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteCampaigns requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteCampaigns requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteCampaigns requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteCampaigns requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetCampaigns extends APIRequest<Campaign> {

    APINodeList<Campaign> lastResponse = null;
    @Override
    public APINodeList<Campaign> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "date_preset",
      "effective_status",
      "include_drafts",
      "is_completed",
      "time_range",
      "use_employee_draft",
    };

    public static final String[] FIELDS = {
      "account_id",
      "adlabels",
      "bid_strategy",
      "boosted_object_id",
      "brand_lift_studies",
      "budget_rebalance_flag",
      "budget_remaining",
      "buying_type",
      "can_create_brand_lift_study",
      "can_use_spend_cap",
      "configured_status",
      "created_time",
      "daily_budget",
      "effective_status",
      "id",
      "issues_info",
      "last_budget_toggling_time",
      "lifetime_budget",
      "name",
      "objective",
      "pacing_type",
      "promoted_object",
      "recommendations",
      "source_campaign",
      "source_campaign_id",
      "spend_cap",
      "start_time",
      "status",
      "stop_time",
      "topline_id",
      "updated_time",
    };

    @Override
    public APINodeList<Campaign> parseResponse(String response, String header) throws APIException {
      return Campaign.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Campaign> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Campaign> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Campaign>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Campaign>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Campaign>>() {
           public APINodeList<Campaign> apply(ResponseWrapper result) {
             try {
               return APIRequestGetCampaigns.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetCampaigns(String nodeId, APIContext context) {
      super(context, nodeId, "/campaigns", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetCampaigns setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetCampaigns setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetCampaigns setDatePreset (Campaign.EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestGetCampaigns setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestGetCampaigns setEffectiveStatus (List<Campaign.EnumEffectiveStatus> effectiveStatus) {
      this.setParam("effective_status", effectiveStatus);
      return this;
    }
    public APIRequestGetCampaigns setEffectiveStatus (String effectiveStatus) {
      this.setParam("effective_status", effectiveStatus);
      return this;
    }

    public APIRequestGetCampaigns setIncludeDrafts (Boolean includeDrafts) {
      this.setParam("include_drafts", includeDrafts);
      return this;
    }
    public APIRequestGetCampaigns setIncludeDrafts (String includeDrafts) {
      this.setParam("include_drafts", includeDrafts);
      return this;
    }

    public APIRequestGetCampaigns setIsCompleted (Boolean isCompleted) {
      this.setParam("is_completed", isCompleted);
      return this;
    }
    public APIRequestGetCampaigns setIsCompleted (String isCompleted) {
      this.setParam("is_completed", isCompleted);
      return this;
    }

    public APIRequestGetCampaigns setTimeRange (Object timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }
    public APIRequestGetCampaigns setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGetCampaigns setUseEmployeeDraft (Boolean useEmployeeDraft) {
      this.setParam("use_employee_draft", useEmployeeDraft);
      return this;
    }
    public APIRequestGetCampaigns setUseEmployeeDraft (String useEmployeeDraft) {
      this.setParam("use_employee_draft", useEmployeeDraft);
      return this;
    }

    public APIRequestGetCampaigns requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetCampaigns requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCampaigns requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetCampaigns requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCampaigns requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetCampaigns requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetCampaigns requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetCampaigns requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetCampaigns requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetCampaigns requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetCampaigns requestBidStrategyField () {
      return this.requestBidStrategyField(true);
    }
    public APIRequestGetCampaigns requestBidStrategyField (boolean value) {
      this.requestField("bid_strategy", value);
      return this;
    }
    public APIRequestGetCampaigns requestBoostedObjectIdField () {
      return this.requestBoostedObjectIdField(true);
    }
    public APIRequestGetCampaigns requestBoostedObjectIdField (boolean value) {
      this.requestField("boosted_object_id", value);
      return this;
    }
    public APIRequestGetCampaigns requestBrandLiftStudiesField () {
      return this.requestBrandLiftStudiesField(true);
    }
    public APIRequestGetCampaigns requestBrandLiftStudiesField (boolean value) {
      this.requestField("brand_lift_studies", value);
      return this;
    }
    public APIRequestGetCampaigns requestBudgetRebalanceFlagField () {
      return this.requestBudgetRebalanceFlagField(true);
    }
    public APIRequestGetCampaigns requestBudgetRebalanceFlagField (boolean value) {
      this.requestField("budget_rebalance_flag", value);
      return this;
    }
    public APIRequestGetCampaigns requestBudgetRemainingField () {
      return this.requestBudgetRemainingField(true);
    }
    public APIRequestGetCampaigns requestBudgetRemainingField (boolean value) {
      this.requestField("budget_remaining", value);
      return this;
    }
    public APIRequestGetCampaigns requestBuyingTypeField () {
      return this.requestBuyingTypeField(true);
    }
    public APIRequestGetCampaigns requestBuyingTypeField (boolean value) {
      this.requestField("buying_type", value);
      return this;
    }
    public APIRequestGetCampaigns requestCanCreateBrandLiftStudyField () {
      return this.requestCanCreateBrandLiftStudyField(true);
    }
    public APIRequestGetCampaigns requestCanCreateBrandLiftStudyField (boolean value) {
      this.requestField("can_create_brand_lift_study", value);
      return this;
    }
    public APIRequestGetCampaigns requestCanUseSpendCapField () {
      return this.requestCanUseSpendCapField(true);
    }
    public APIRequestGetCampaigns requestCanUseSpendCapField (boolean value) {
      this.requestField("can_use_spend_cap", value);
      return this;
    }
    public APIRequestGetCampaigns requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetCampaigns requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetCampaigns requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetCampaigns requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetCampaigns requestDailyBudgetField () {
      return this.requestDailyBudgetField(true);
    }
    public APIRequestGetCampaigns requestDailyBudgetField (boolean value) {
      this.requestField("daily_budget", value);
      return this;
    }
    public APIRequestGetCampaigns requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetCampaigns requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetCampaigns requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetCampaigns requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetCampaigns requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetCampaigns requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetCampaigns requestLastBudgetTogglingTimeField () {
      return this.requestLastBudgetTogglingTimeField(true);
    }
    public APIRequestGetCampaigns requestLastBudgetTogglingTimeField (boolean value) {
      this.requestField("last_budget_toggling_time", value);
      return this;
    }
    public APIRequestGetCampaigns requestLifetimeBudgetField () {
      return this.requestLifetimeBudgetField(true);
    }
    public APIRequestGetCampaigns requestLifetimeBudgetField (boolean value) {
      this.requestField("lifetime_budget", value);
      return this;
    }
    public APIRequestGetCampaigns requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetCampaigns requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetCampaigns requestObjectiveField () {
      return this.requestObjectiveField(true);
    }
    public APIRequestGetCampaigns requestObjectiveField (boolean value) {
      this.requestField("objective", value);
      return this;
    }
    public APIRequestGetCampaigns requestPacingTypeField () {
      return this.requestPacingTypeField(true);
    }
    public APIRequestGetCampaigns requestPacingTypeField (boolean value) {
      this.requestField("pacing_type", value);
      return this;
    }
    public APIRequestGetCampaigns requestPromotedObjectField () {
      return this.requestPromotedObjectField(true);
    }
    public APIRequestGetCampaigns requestPromotedObjectField (boolean value) {
      this.requestField("promoted_object", value);
      return this;
    }
    public APIRequestGetCampaigns requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetCampaigns requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetCampaigns requestSourceCampaignField () {
      return this.requestSourceCampaignField(true);
    }
    public APIRequestGetCampaigns requestSourceCampaignField (boolean value) {
      this.requestField("source_campaign", value);
      return this;
    }
    public APIRequestGetCampaigns requestSourceCampaignIdField () {
      return this.requestSourceCampaignIdField(true);
    }
    public APIRequestGetCampaigns requestSourceCampaignIdField (boolean value) {
      this.requestField("source_campaign_id", value);
      return this;
    }
    public APIRequestGetCampaigns requestSpendCapField () {
      return this.requestSpendCapField(true);
    }
    public APIRequestGetCampaigns requestSpendCapField (boolean value) {
      this.requestField("spend_cap", value);
      return this;
    }
    public APIRequestGetCampaigns requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetCampaigns requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetCampaigns requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetCampaigns requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetCampaigns requestStopTimeField () {
      return this.requestStopTimeField(true);
    }
    public APIRequestGetCampaigns requestStopTimeField (boolean value) {
      this.requestField("stop_time", value);
      return this;
    }
    public APIRequestGetCampaigns requestToplineIdField () {
      return this.requestToplineIdField(true);
    }
    public APIRequestGetCampaigns requestToplineIdField (boolean value) {
      this.requestField("topline_id", value);
      return this;
    }
    public APIRequestGetCampaigns requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetCampaigns requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateCampaign extends APIRequest<Campaign> {

    Campaign lastResponse = null;
    @Override
    public Campaign getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "adlabels",
      "bid_strategy",
      "budget_rebalance_flag",
      "buying_type",
      "daily_budget",
      "execution_options",
      "iterative_split_test_configs",
      "lifetime_budget",
      "name",
      "objective",
      "pacing_type",
      "promoted_object",
      "source_campaign_id",
      "spend_cap",
      "status",
      "topline_id",
      "upstream_events",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public Campaign parseResponse(String response, String header) throws APIException {
      return Campaign.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public Campaign execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public Campaign execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<Campaign> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<Campaign> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, Campaign>() {
           public Campaign apply(ResponseWrapper result) {
             try {
               return APIRequestCreateCampaign.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateCampaign(String nodeId, APIContext context) {
      super(context, nodeId, "/campaigns", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateCampaign setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateCampaign setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateCampaign setAdlabels (List<Object> adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }
    public APIRequestCreateCampaign setAdlabels (String adlabels) {
      this.setParam("adlabels", adlabels);
      return this;
    }

    public APIRequestCreateCampaign setBidStrategy (Campaign.EnumBidStrategy bidStrategy) {
      this.setParam("bid_strategy", bidStrategy);
      return this;
    }
    public APIRequestCreateCampaign setBidStrategy (String bidStrategy) {
      this.setParam("bid_strategy", bidStrategy);
      return this;
    }

    public APIRequestCreateCampaign setBudgetRebalanceFlag (Boolean budgetRebalanceFlag) {
      this.setParam("budget_rebalance_flag", budgetRebalanceFlag);
      return this;
    }
    public APIRequestCreateCampaign setBudgetRebalanceFlag (String budgetRebalanceFlag) {
      this.setParam("budget_rebalance_flag", budgetRebalanceFlag);
      return this;
    }

    public APIRequestCreateCampaign setBuyingType (String buyingType) {
      this.setParam("buying_type", buyingType);
      return this;
    }

    public APIRequestCreateCampaign setDailyBudget (Long dailyBudget) {
      this.setParam("daily_budget", dailyBudget);
      return this;
    }
    public APIRequestCreateCampaign setDailyBudget (String dailyBudget) {
      this.setParam("daily_budget", dailyBudget);
      return this;
    }

    public APIRequestCreateCampaign setExecutionOptions (List<Campaign.EnumExecutionOptions> executionOptions) {
      this.setParam("execution_options", executionOptions);
      return this;
    }
    public APIRequestCreateCampaign setExecutionOptions (String executionOptions) {
      this.setParam("execution_options", executionOptions);
      return this;
    }

    public APIRequestCreateCampaign setIterativeSplitTestConfigs (List<Object> iterativeSplitTestConfigs) {
      this.setParam("iterative_split_test_configs", iterativeSplitTestConfigs);
      return this;
    }
    public APIRequestCreateCampaign setIterativeSplitTestConfigs (String iterativeSplitTestConfigs) {
      this.setParam("iterative_split_test_configs", iterativeSplitTestConfigs);
      return this;
    }

    public APIRequestCreateCampaign setLifetimeBudget (Long lifetimeBudget) {
      this.setParam("lifetime_budget", lifetimeBudget);
      return this;
    }
    public APIRequestCreateCampaign setLifetimeBudget (String lifetimeBudget) {
      this.setParam("lifetime_budget", lifetimeBudget);
      return this;
    }

    public APIRequestCreateCampaign setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateCampaign setObjective (Campaign.EnumObjective objective) {
      this.setParam("objective", objective);
      return this;
    }
    public APIRequestCreateCampaign setObjective (String objective) {
      this.setParam("objective", objective);
      return this;
    }

    public APIRequestCreateCampaign setPacingType (List<String> pacingType) {
      this.setParam("pacing_type", pacingType);
      return this;
    }
    public APIRequestCreateCampaign setPacingType (String pacingType) {
      this.setParam("pacing_type", pacingType);
      return this;
    }

    public APIRequestCreateCampaign setPromotedObject (Object promotedObject) {
      this.setParam("promoted_object", promotedObject);
      return this;
    }
    public APIRequestCreateCampaign setPromotedObject (String promotedObject) {
      this.setParam("promoted_object", promotedObject);
      return this;
    }

    public APIRequestCreateCampaign setSourceCampaignId (String sourceCampaignId) {
      this.setParam("source_campaign_id", sourceCampaignId);
      return this;
    }

    public APIRequestCreateCampaign setSpendCap (Long spendCap) {
      this.setParam("spend_cap", spendCap);
      return this;
    }
    public APIRequestCreateCampaign setSpendCap (String spendCap) {
      this.setParam("spend_cap", spendCap);
      return this;
    }

    public APIRequestCreateCampaign setStatus (Campaign.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestCreateCampaign setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestCreateCampaign setToplineId (String toplineId) {
      this.setParam("topline_id", toplineId);
      return this;
    }

    public APIRequestCreateCampaign setUpstreamEvents (Map<String, String> upstreamEvents) {
      this.setParam("upstream_events", upstreamEvents);
      return this;
    }
    public APIRequestCreateCampaign setUpstreamEvents (String upstreamEvents) {
      this.setParam("upstream_events", upstreamEvents);
      return this;
    }

    public APIRequestCreateCampaign requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateCampaign requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCampaign requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateCampaign requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCampaign requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateCampaign requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetCampaignsByLabels extends APIRequest<Campaign> {

    APINodeList<Campaign> lastResponse = null;
    @Override
    public APINodeList<Campaign> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_label_ids",
      "operator",
    };

    public static final String[] FIELDS = {
      "account_id",
      "adlabels",
      "bid_strategy",
      "boosted_object_id",
      "brand_lift_studies",
      "budget_rebalance_flag",
      "budget_remaining",
      "buying_type",
      "can_create_brand_lift_study",
      "can_use_spend_cap",
      "configured_status",
      "created_time",
      "daily_budget",
      "effective_status",
      "id",
      "issues_info",
      "last_budget_toggling_time",
      "lifetime_budget",
      "name",
      "objective",
      "pacing_type",
      "promoted_object",
      "recommendations",
      "source_campaign",
      "source_campaign_id",
      "spend_cap",
      "start_time",
      "status",
      "stop_time",
      "topline_id",
      "updated_time",
    };

    @Override
    public APINodeList<Campaign> parseResponse(String response, String header) throws APIException {
      return Campaign.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Campaign> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Campaign> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Campaign>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Campaign>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Campaign>>() {
           public APINodeList<Campaign> apply(ResponseWrapper result) {
             try {
               return APIRequestGetCampaignsByLabels.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetCampaignsByLabels(String nodeId, APIContext context) {
      super(context, nodeId, "/campaignsbylabels", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetCampaignsByLabels setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetCampaignsByLabels setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetCampaignsByLabels setAdLabelIds (List<String> adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }
    public APIRequestGetCampaignsByLabels setAdLabelIds (String adLabelIds) {
      this.setParam("ad_label_ids", adLabelIds);
      return this;
    }

    public APIRequestGetCampaignsByLabels setOperator (Campaign.EnumOperator operator) {
      this.setParam("operator", operator);
      return this;
    }
    public APIRequestGetCampaignsByLabels setOperator (String operator) {
      this.setParam("operator", operator);
      return this;
    }

    public APIRequestGetCampaignsByLabels requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetCampaignsByLabels requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCampaignsByLabels requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetCampaignsByLabels requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCampaignsByLabels requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetCampaignsByLabels requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetCampaignsByLabels requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetCampaignsByLabels requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetCampaignsByLabels requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestBidStrategyField () {
      return this.requestBidStrategyField(true);
    }
    public APIRequestGetCampaignsByLabels requestBidStrategyField (boolean value) {
      this.requestField("bid_strategy", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestBoostedObjectIdField () {
      return this.requestBoostedObjectIdField(true);
    }
    public APIRequestGetCampaignsByLabels requestBoostedObjectIdField (boolean value) {
      this.requestField("boosted_object_id", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestBrandLiftStudiesField () {
      return this.requestBrandLiftStudiesField(true);
    }
    public APIRequestGetCampaignsByLabels requestBrandLiftStudiesField (boolean value) {
      this.requestField("brand_lift_studies", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestBudgetRebalanceFlagField () {
      return this.requestBudgetRebalanceFlagField(true);
    }
    public APIRequestGetCampaignsByLabels requestBudgetRebalanceFlagField (boolean value) {
      this.requestField("budget_rebalance_flag", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestBudgetRemainingField () {
      return this.requestBudgetRemainingField(true);
    }
    public APIRequestGetCampaignsByLabels requestBudgetRemainingField (boolean value) {
      this.requestField("budget_remaining", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestBuyingTypeField () {
      return this.requestBuyingTypeField(true);
    }
    public APIRequestGetCampaignsByLabels requestBuyingTypeField (boolean value) {
      this.requestField("buying_type", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestCanCreateBrandLiftStudyField () {
      return this.requestCanCreateBrandLiftStudyField(true);
    }
    public APIRequestGetCampaignsByLabels requestCanCreateBrandLiftStudyField (boolean value) {
      this.requestField("can_create_brand_lift_study", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestCanUseSpendCapField () {
      return this.requestCanUseSpendCapField(true);
    }
    public APIRequestGetCampaignsByLabels requestCanUseSpendCapField (boolean value) {
      this.requestField("can_use_spend_cap", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetCampaignsByLabels requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetCampaignsByLabels requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestDailyBudgetField () {
      return this.requestDailyBudgetField(true);
    }
    public APIRequestGetCampaignsByLabels requestDailyBudgetField (boolean value) {
      this.requestField("daily_budget", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetCampaignsByLabels requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetCampaignsByLabels requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetCampaignsByLabels requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestLastBudgetTogglingTimeField () {
      return this.requestLastBudgetTogglingTimeField(true);
    }
    public APIRequestGetCampaignsByLabels requestLastBudgetTogglingTimeField (boolean value) {
      this.requestField("last_budget_toggling_time", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestLifetimeBudgetField () {
      return this.requestLifetimeBudgetField(true);
    }
    public APIRequestGetCampaignsByLabels requestLifetimeBudgetField (boolean value) {
      this.requestField("lifetime_budget", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetCampaignsByLabels requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestObjectiveField () {
      return this.requestObjectiveField(true);
    }
    public APIRequestGetCampaignsByLabels requestObjectiveField (boolean value) {
      this.requestField("objective", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestPacingTypeField () {
      return this.requestPacingTypeField(true);
    }
    public APIRequestGetCampaignsByLabels requestPacingTypeField (boolean value) {
      this.requestField("pacing_type", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestPromotedObjectField () {
      return this.requestPromotedObjectField(true);
    }
    public APIRequestGetCampaignsByLabels requestPromotedObjectField (boolean value) {
      this.requestField("promoted_object", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetCampaignsByLabels requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestSourceCampaignField () {
      return this.requestSourceCampaignField(true);
    }
    public APIRequestGetCampaignsByLabels requestSourceCampaignField (boolean value) {
      this.requestField("source_campaign", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestSourceCampaignIdField () {
      return this.requestSourceCampaignIdField(true);
    }
    public APIRequestGetCampaignsByLabels requestSourceCampaignIdField (boolean value) {
      this.requestField("source_campaign_id", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestSpendCapField () {
      return this.requestSpendCapField(true);
    }
    public APIRequestGetCampaignsByLabels requestSpendCapField (boolean value) {
      this.requestField("spend_cap", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetCampaignsByLabels requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetCampaignsByLabels requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestStopTimeField () {
      return this.requestStopTimeField(true);
    }
    public APIRequestGetCampaignsByLabels requestStopTimeField (boolean value) {
      this.requestField("stop_time", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestToplineIdField () {
      return this.requestToplineIdField(true);
    }
    public APIRequestGetCampaignsByLabels requestToplineIdField (boolean value) {
      this.requestField("topline_id", value);
      return this;
    }
    public APIRequestGetCampaignsByLabels requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetCampaignsByLabels requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestGetCustomAudiences extends APIRequest<CustomAudience> {

    APINodeList<CustomAudience> lastResponse = null;
    @Override
    public APINodeList<CustomAudience> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business_id",
      "fields",
      "filtering",
      "pixel_id",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<CustomAudience> parseResponse(String response, String header) throws APIException {
      return CustomAudience.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<CustomAudience> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<CustomAudience> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<CustomAudience>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<CustomAudience>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<CustomAudience>>() {
           public APINodeList<CustomAudience> apply(ResponseWrapper result) {
             try {
               return APIRequestGetCustomAudiences.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetCustomAudiences(String nodeId, APIContext context) {
      super(context, nodeId, "/customaudiences", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetCustomAudiences setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetCustomAudiences setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetCustomAudiences setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetCustomAudiences setFields (List<String> fields) {
      this.setParam("fields", fields);
      return this;
    }
    public APIRequestGetCustomAudiences setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGetCustomAudiences setFiltering (List<Object> filtering) {
      this.setParam("filtering", filtering);
      return this;
    }
    public APIRequestGetCustomAudiences setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestGetCustomAudiences setPixelId (String pixelId) {
      this.setParam("pixel_id", pixelId);
      return this;
    }

    public APIRequestGetCustomAudiences requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetCustomAudiences requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCustomAudiences requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetCustomAudiences requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCustomAudiences requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetCustomAudiences requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateCustomAudience extends APIRequest<CustomAudience> {

    CustomAudience lastResponse = null;
    @Override
    public CustomAudience getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "accountID",
      "additionalMetadata",
      "allowed_domains",
      "associated_audience_id",
      "claim_objective",
      "content_type",
      "countries",
      "creation_params",
      "customer_file_source",
      "dataset_id",
      "description",
      "details",
      "enable_fetch_or_create",
      "event_source_group",
      "event_sources",
      "exclusions",
      "expectedSize",
      "gender",
      "inclusions",
      "isPrivate",
      "is_household",
      "is_household_exclusion",
      "is_snapshot",
      "is_value_based",
      "list_of_accounts",
      "lookalike_spec",
      "maxAge",
      "minAge",
      "name",
      "opt_out_link",
      "origin_audience_id",
      "parent_audience_id",
      "partnerID",
      "partner_reference_key",
      "pixel_id",
      "prefill",
      "product_set_id",
      "regulated_audience_spec",
      "retention_days",
      "rev_share_policy_id",
      "rule",
      "rule_aggregation",
      "seed_audience",
      "source",
      "study_spec",
      "subtype",
      "tags",
      "video_group_ids",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public CustomAudience parseResponse(String response, String header) throws APIException {
      return CustomAudience.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public CustomAudience execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public CustomAudience execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<CustomAudience> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<CustomAudience> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, CustomAudience>() {
           public CustomAudience apply(ResponseWrapper result) {
             try {
               return APIRequestCreateCustomAudience.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateCustomAudience(String nodeId, APIContext context) {
      super(context, nodeId, "/customaudiences", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateCustomAudience setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateCustomAudience setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateCustomAudience setAccountid (String accountid) {
      this.setParam("accountID", accountid);
      return this;
    }

    public APIRequestCreateCustomAudience setAdditionalmetadata (String additionalmetadata) {
      this.setParam("additionalMetadata", additionalmetadata);
      return this;
    }

    public APIRequestCreateCustomAudience setAllowedDomains (List<String> allowedDomains) {
      this.setParam("allowed_domains", allowedDomains);
      return this;
    }
    public APIRequestCreateCustomAudience setAllowedDomains (String allowedDomains) {
      this.setParam("allowed_domains", allowedDomains);
      return this;
    }

    public APIRequestCreateCustomAudience setAssociatedAudienceId (Long associatedAudienceId) {
      this.setParam("associated_audience_id", associatedAudienceId);
      return this;
    }
    public APIRequestCreateCustomAudience setAssociatedAudienceId (String associatedAudienceId) {
      this.setParam("associated_audience_id", associatedAudienceId);
      return this;
    }

    public APIRequestCreateCustomAudience setClaimObjective (CustomAudience.EnumClaimObjective claimObjective) {
      this.setParam("claim_objective", claimObjective);
      return this;
    }
    public APIRequestCreateCustomAudience setClaimObjective (String claimObjective) {
      this.setParam("claim_objective", claimObjective);
      return this;
    }

    public APIRequestCreateCustomAudience setContentType (CustomAudience.EnumContentType contentType) {
      this.setParam("content_type", contentType);
      return this;
    }
    public APIRequestCreateCustomAudience setContentType (String contentType) {
      this.setParam("content_type", contentType);
      return this;
    }

    public APIRequestCreateCustomAudience setCountries (String countries) {
      this.setParam("countries", countries);
      return this;
    }

    public APIRequestCreateCustomAudience setCreationParams (Map<String, String> creationParams) {
      this.setParam("creation_params", creationParams);
      return this;
    }
    public APIRequestCreateCustomAudience setCreationParams (String creationParams) {
      this.setParam("creation_params", creationParams);
      return this;
    }

    public APIRequestCreateCustomAudience setCustomerFileSource (CustomAudience.EnumCustomerFileSource customerFileSource) {
      this.setParam("customer_file_source", customerFileSource);
      return this;
    }
    public APIRequestCreateCustomAudience setCustomerFileSource (String customerFileSource) {
      this.setParam("customer_file_source", customerFileSource);
      return this;
    }

    public APIRequestCreateCustomAudience setDatasetId (String datasetId) {
      this.setParam("dataset_id", datasetId);
      return this;
    }

    public APIRequestCreateCustomAudience setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateCustomAudience setDetails (String details) {
      this.setParam("details", details);
      return this;
    }

    public APIRequestCreateCustomAudience setEnableFetchOrCreate (Boolean enableFetchOrCreate) {
      this.setParam("enable_fetch_or_create", enableFetchOrCreate);
      return this;
    }
    public APIRequestCreateCustomAudience setEnableFetchOrCreate (String enableFetchOrCreate) {
      this.setParam("enable_fetch_or_create", enableFetchOrCreate);
      return this;
    }

    public APIRequestCreateCustomAudience setEventSourceGroup (String eventSourceGroup) {
      this.setParam("event_source_group", eventSourceGroup);
      return this;
    }

    public APIRequestCreateCustomAudience setEventSources (List<Map<String, String>> eventSources) {
      this.setParam("event_sources", eventSources);
      return this;
    }
    public APIRequestCreateCustomAudience setEventSources (String eventSources) {
      this.setParam("event_sources", eventSources);
      return this;
    }

    public APIRequestCreateCustomAudience setExclusions (List<Object> exclusions) {
      this.setParam("exclusions", exclusions);
      return this;
    }
    public APIRequestCreateCustomAudience setExclusions (String exclusions) {
      this.setParam("exclusions", exclusions);
      return this;
    }

    public APIRequestCreateCustomAudience setExpectedsize (Long expectedsize) {
      this.setParam("expectedSize", expectedsize);
      return this;
    }
    public APIRequestCreateCustomAudience setExpectedsize (String expectedsize) {
      this.setParam("expectedSize", expectedsize);
      return this;
    }

    public APIRequestCreateCustomAudience setGender (String gender) {
      this.setParam("gender", gender);
      return this;
    }

    public APIRequestCreateCustomAudience setInclusions (List<Object> inclusions) {
      this.setParam("inclusions", inclusions);
      return this;
    }
    public APIRequestCreateCustomAudience setInclusions (String inclusions) {
      this.setParam("inclusions", inclusions);
      return this;
    }

    public APIRequestCreateCustomAudience setIsprivate (Boolean isprivate) {
      this.setParam("isPrivate", isprivate);
      return this;
    }
    public APIRequestCreateCustomAudience setIsprivate (String isprivate) {
      this.setParam("isPrivate", isprivate);
      return this;
    }

    public APIRequestCreateCustomAudience setIsHousehold (Boolean isHousehold) {
      this.setParam("is_household", isHousehold);
      return this;
    }
    public APIRequestCreateCustomAudience setIsHousehold (String isHousehold) {
      this.setParam("is_household", isHousehold);
      return this;
    }

    public APIRequestCreateCustomAudience setIsHouseholdExclusion (Boolean isHouseholdExclusion) {
      this.setParam("is_household_exclusion", isHouseholdExclusion);
      return this;
    }
    public APIRequestCreateCustomAudience setIsHouseholdExclusion (String isHouseholdExclusion) {
      this.setParam("is_household_exclusion", isHouseholdExclusion);
      return this;
    }

    public APIRequestCreateCustomAudience setIsSnapshot (Boolean isSnapshot) {
      this.setParam("is_snapshot", isSnapshot);
      return this;
    }
    public APIRequestCreateCustomAudience setIsSnapshot (String isSnapshot) {
      this.setParam("is_snapshot", isSnapshot);
      return this;
    }

    public APIRequestCreateCustomAudience setIsValueBased (Boolean isValueBased) {
      this.setParam("is_value_based", isValueBased);
      return this;
    }
    public APIRequestCreateCustomAudience setIsValueBased (String isValueBased) {
      this.setParam("is_value_based", isValueBased);
      return this;
    }

    public APIRequestCreateCustomAudience setListOfAccounts (List<Long> listOfAccounts) {
      this.setParam("list_of_accounts", listOfAccounts);
      return this;
    }
    public APIRequestCreateCustomAudience setListOfAccounts (String listOfAccounts) {
      this.setParam("list_of_accounts", listOfAccounts);
      return this;
    }

    public APIRequestCreateCustomAudience setLookalikeSpec (String lookalikeSpec) {
      this.setParam("lookalike_spec", lookalikeSpec);
      return this;
    }

    public APIRequestCreateCustomAudience setMaxage (Long maxage) {
      this.setParam("maxAge", maxage);
      return this;
    }
    public APIRequestCreateCustomAudience setMaxage (String maxage) {
      this.setParam("maxAge", maxage);
      return this;
    }

    public APIRequestCreateCustomAudience setMinage (Long minage) {
      this.setParam("minAge", minage);
      return this;
    }
    public APIRequestCreateCustomAudience setMinage (String minage) {
      this.setParam("minAge", minage);
      return this;
    }

    public APIRequestCreateCustomAudience setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateCustomAudience setOptOutLink (String optOutLink) {
      this.setParam("opt_out_link", optOutLink);
      return this;
    }

    public APIRequestCreateCustomAudience setOriginAudienceId (String originAudienceId) {
      this.setParam("origin_audience_id", originAudienceId);
      return this;
    }

    public APIRequestCreateCustomAudience setParentAudienceId (Long parentAudienceId) {
      this.setParam("parent_audience_id", parentAudienceId);
      return this;
    }
    public APIRequestCreateCustomAudience setParentAudienceId (String parentAudienceId) {
      this.setParam("parent_audience_id", parentAudienceId);
      return this;
    }

    public APIRequestCreateCustomAudience setPartnerid (String partnerid) {
      this.setParam("partnerID", partnerid);
      return this;
    }

    public APIRequestCreateCustomAudience setPartnerReferenceKey (String partnerReferenceKey) {
      this.setParam("partner_reference_key", partnerReferenceKey);
      return this;
    }

    public APIRequestCreateCustomAudience setPixelId (String pixelId) {
      this.setParam("pixel_id", pixelId);
      return this;
    }

    public APIRequestCreateCustomAudience setPrefill (Boolean prefill) {
      this.setParam("prefill", prefill);
      return this;
    }
    public APIRequestCreateCustomAudience setPrefill (String prefill) {
      this.setParam("prefill", prefill);
      return this;
    }

    public APIRequestCreateCustomAudience setProductSetId (String productSetId) {
      this.setParam("product_set_id", productSetId);
      return this;
    }

    public APIRequestCreateCustomAudience setRegulatedAudienceSpec (String regulatedAudienceSpec) {
      this.setParam("regulated_audience_spec", regulatedAudienceSpec);
      return this;
    }

    public APIRequestCreateCustomAudience setRetentionDays (Long retentionDays) {
      this.setParam("retention_days", retentionDays);
      return this;
    }
    public APIRequestCreateCustomAudience setRetentionDays (String retentionDays) {
      this.setParam("retention_days", retentionDays);
      return this;
    }

    public APIRequestCreateCustomAudience setRevSharePolicyId (Long revSharePolicyId) {
      this.setParam("rev_share_policy_id", revSharePolicyId);
      return this;
    }
    public APIRequestCreateCustomAudience setRevSharePolicyId (String revSharePolicyId) {
      this.setParam("rev_share_policy_id", revSharePolicyId);
      return this;
    }

    public APIRequestCreateCustomAudience setRule (String rule) {
      this.setParam("rule", rule);
      return this;
    }

    public APIRequestCreateCustomAudience setRuleAggregation (String ruleAggregation) {
      this.setParam("rule_aggregation", ruleAggregation);
      return this;
    }

    public APIRequestCreateCustomAudience setSeedAudience (Long seedAudience) {
      this.setParam("seed_audience", seedAudience);
      return this;
    }
    public APIRequestCreateCustomAudience setSeedAudience (String seedAudience) {
      this.setParam("seed_audience", seedAudience);
      return this;
    }

    public APIRequestCreateCustomAudience setSource (String source) {
      this.setParam("source", source);
      return this;
    }

    public APIRequestCreateCustomAudience setStudySpec (Map<String, String> studySpec) {
      this.setParam("study_spec", studySpec);
      return this;
    }
    public APIRequestCreateCustomAudience setStudySpec (String studySpec) {
      this.setParam("study_spec", studySpec);
      return this;
    }

    public APIRequestCreateCustomAudience setSubtype (CustomAudience.EnumSubtype subtype) {
      this.setParam("subtype", subtype);
      return this;
    }
    public APIRequestCreateCustomAudience setSubtype (String subtype) {
      this.setParam("subtype", subtype);
      return this;
    }

    public APIRequestCreateCustomAudience setTags (List<String> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreateCustomAudience setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreateCustomAudience setVideoGroupIds (List<String> videoGroupIds) {
      this.setParam("video_group_ids", videoGroupIds);
      return this;
    }
    public APIRequestCreateCustomAudience setVideoGroupIds (String videoGroupIds) {
      this.setParam("video_group_ids", videoGroupIds);
      return this;
    }

    public APIRequestCreateCustomAudience requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateCustomAudience requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCustomAudience requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateCustomAudience requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCustomAudience requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateCustomAudience requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetCustomAudiencesTos extends APIRequest<CustomAudiencesTOS> {

    APINodeList<CustomAudiencesTOS> lastResponse = null;
    @Override
    public APINodeList<CustomAudiencesTOS> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "content",
      "id",
      "type",
    };

    @Override
    public APINodeList<CustomAudiencesTOS> parseResponse(String response, String header) throws APIException {
      return CustomAudiencesTOS.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<CustomAudiencesTOS> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<CustomAudiencesTOS> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<CustomAudiencesTOS>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<CustomAudiencesTOS>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<CustomAudiencesTOS>>() {
           public APINodeList<CustomAudiencesTOS> apply(ResponseWrapper result) {
             try {
               return APIRequestGetCustomAudiencesTos.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetCustomAudiencesTos(String nodeId, APIContext context) {
      super(context, nodeId, "/customaudiencestos", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetCustomAudiencesTos setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetCustomAudiencesTos setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetCustomAudiencesTos requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetCustomAudiencesTos requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCustomAudiencesTos requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetCustomAudiencesTos requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCustomAudiencesTos requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetCustomAudiencesTos requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetCustomAudiencesTos requestContentField () {
      return this.requestContentField(true);
    }
    public APIRequestGetCustomAudiencesTos requestContentField (boolean value) {
      this.requestField("content", value);
      return this;
    }
    public APIRequestGetCustomAudiencesTos requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetCustomAudiencesTos requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetCustomAudiencesTos requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetCustomAudiencesTos requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
  }

  public static class APIRequestCreateCustomAudiencesTo extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business_id",
      "tos_id",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateCustomAudiencesTo.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateCustomAudiencesTo(String nodeId, APIContext context) {
      super(context, nodeId, "/customaudiencestos", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateCustomAudiencesTo setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateCustomAudiencesTo setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateCustomAudiencesTo setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestCreateCustomAudiencesTo setTosId (String tosId) {
      this.setParam("tos_id", tosId);
      return this;
    }

    public APIRequestCreateCustomAudiencesTo requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateCustomAudiencesTo requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCustomAudiencesTo requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateCustomAudiencesTo requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCustomAudiencesTo requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateCustomAudiencesTo requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetCustomConversions extends APIRequest<CustomConversion> {

    APINodeList<CustomConversion> lastResponse = null;
    @Override
    public APINodeList<CustomConversion> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "aggregation_rule",
      "business",
      "creation_time",
      "custom_event_type",
      "data_sources",
      "default_conversion_value",
      "description",
      "event_source_type",
      "first_fired_time",
      "id",
      "is_archived",
      "is_unavailable",
      "last_fired_time",
      "name",
      "offline_conversion_data_set",
      "pixel",
      "retention_days",
      "rule",
    };

    @Override
    public APINodeList<CustomConversion> parseResponse(String response, String header) throws APIException {
      return CustomConversion.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<CustomConversion> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<CustomConversion> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<CustomConversion>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<CustomConversion>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<CustomConversion>>() {
           public APINodeList<CustomConversion> apply(ResponseWrapper result) {
             try {
               return APIRequestGetCustomConversions.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetCustomConversions(String nodeId, APIContext context) {
      super(context, nodeId, "/customconversions", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetCustomConversions setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetCustomConversions setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetCustomConversions requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetCustomConversions requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCustomConversions requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetCustomConversions requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetCustomConversions requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetCustomConversions requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetCustomConversions requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetCustomConversions requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetCustomConversions requestAggregationRuleField () {
      return this.requestAggregationRuleField(true);
    }
    public APIRequestGetCustomConversions requestAggregationRuleField (boolean value) {
      this.requestField("aggregation_rule", value);
      return this;
    }
    public APIRequestGetCustomConversions requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetCustomConversions requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetCustomConversions requestCreationTimeField () {
      return this.requestCreationTimeField(true);
    }
    public APIRequestGetCustomConversions requestCreationTimeField (boolean value) {
      this.requestField("creation_time", value);
      return this;
    }
    public APIRequestGetCustomConversions requestCustomEventTypeField () {
      return this.requestCustomEventTypeField(true);
    }
    public APIRequestGetCustomConversions requestCustomEventTypeField (boolean value) {
      this.requestField("custom_event_type", value);
      return this;
    }
    public APIRequestGetCustomConversions requestDataSourcesField () {
      return this.requestDataSourcesField(true);
    }
    public APIRequestGetCustomConversions requestDataSourcesField (boolean value) {
      this.requestField("data_sources", value);
      return this;
    }
    public APIRequestGetCustomConversions requestDefaultConversionValueField () {
      return this.requestDefaultConversionValueField(true);
    }
    public APIRequestGetCustomConversions requestDefaultConversionValueField (boolean value) {
      this.requestField("default_conversion_value", value);
      return this;
    }
    public APIRequestGetCustomConversions requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetCustomConversions requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetCustomConversions requestEventSourceTypeField () {
      return this.requestEventSourceTypeField(true);
    }
    public APIRequestGetCustomConversions requestEventSourceTypeField (boolean value) {
      this.requestField("event_source_type", value);
      return this;
    }
    public APIRequestGetCustomConversions requestFirstFiredTimeField () {
      return this.requestFirstFiredTimeField(true);
    }
    public APIRequestGetCustomConversions requestFirstFiredTimeField (boolean value) {
      this.requestField("first_fired_time", value);
      return this;
    }
    public APIRequestGetCustomConversions requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetCustomConversions requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetCustomConversions requestIsArchivedField () {
      return this.requestIsArchivedField(true);
    }
    public APIRequestGetCustomConversions requestIsArchivedField (boolean value) {
      this.requestField("is_archived", value);
      return this;
    }
    public APIRequestGetCustomConversions requestIsUnavailableField () {
      return this.requestIsUnavailableField(true);
    }
    public APIRequestGetCustomConversions requestIsUnavailableField (boolean value) {
      this.requestField("is_unavailable", value);
      return this;
    }
    public APIRequestGetCustomConversions requestLastFiredTimeField () {
      return this.requestLastFiredTimeField(true);
    }
    public APIRequestGetCustomConversions requestLastFiredTimeField (boolean value) {
      this.requestField("last_fired_time", value);
      return this;
    }
    public APIRequestGetCustomConversions requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetCustomConversions requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetCustomConversions requestOfflineConversionDataSetField () {
      return this.requestOfflineConversionDataSetField(true);
    }
    public APIRequestGetCustomConversions requestOfflineConversionDataSetField (boolean value) {
      this.requestField("offline_conversion_data_set", value);
      return this;
    }
    public APIRequestGetCustomConversions requestPixelField () {
      return this.requestPixelField(true);
    }
    public APIRequestGetCustomConversions requestPixelField (boolean value) {
      this.requestField("pixel", value);
      return this;
    }
    public APIRequestGetCustomConversions requestRetentionDaysField () {
      return this.requestRetentionDaysField(true);
    }
    public APIRequestGetCustomConversions requestRetentionDaysField (boolean value) {
      this.requestField("retention_days", value);
      return this;
    }
    public APIRequestGetCustomConversions requestRuleField () {
      return this.requestRuleField(true);
    }
    public APIRequestGetCustomConversions requestRuleField (boolean value) {
      this.requestField("rule", value);
      return this;
    }
  }

  public static class APIRequestCreateCustomConversion extends APIRequest<CustomConversion> {

    CustomConversion lastResponse = null;
    @Override
    public CustomConversion getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "advanced_rule",
      "custom_event_type",
      "default_conversion_value",
      "description",
      "event_source_id",
      "name",
      "rule",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public CustomConversion parseResponse(String response, String header) throws APIException {
      return CustomConversion.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public CustomConversion execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public CustomConversion execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<CustomConversion> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<CustomConversion> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, CustomConversion>() {
           public CustomConversion apply(ResponseWrapper result) {
             try {
               return APIRequestCreateCustomConversion.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateCustomConversion(String nodeId, APIContext context) {
      super(context, nodeId, "/customconversions", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateCustomConversion setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateCustomConversion setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateCustomConversion setAdvancedRule (String advancedRule) {
      this.setParam("advanced_rule", advancedRule);
      return this;
    }

    public APIRequestCreateCustomConversion setCustomEventType (CustomConversion.EnumCustomEventType customEventType) {
      this.setParam("custom_event_type", customEventType);
      return this;
    }
    public APIRequestCreateCustomConversion setCustomEventType (String customEventType) {
      this.setParam("custom_event_type", customEventType);
      return this;
    }

    public APIRequestCreateCustomConversion setDefaultConversionValue (Double defaultConversionValue) {
      this.setParam("default_conversion_value", defaultConversionValue);
      return this;
    }
    public APIRequestCreateCustomConversion setDefaultConversionValue (String defaultConversionValue) {
      this.setParam("default_conversion_value", defaultConversionValue);
      return this;
    }

    public APIRequestCreateCustomConversion setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateCustomConversion setEventSourceId (String eventSourceId) {
      this.setParam("event_source_id", eventSourceId);
      return this;
    }

    public APIRequestCreateCustomConversion setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateCustomConversion setRule (String rule) {
      this.setParam("rule", rule);
      return this;
    }

    public APIRequestCreateCustomConversion requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateCustomConversion requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCustomConversion requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateCustomConversion requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateCustomConversion requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateCustomConversion requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateDeactivate extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateDeactivate.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateDeactivate(String nodeId, APIContext context) {
      super(context, nodeId, "/deactivate", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateDeactivate setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateDeactivate setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateDeactivate requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateDeactivate requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateDeactivate requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateDeactivate requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateDeactivate requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateDeactivate requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetDeliveryEstimate extends APIRequest<AdAccountDeliveryEstimate> {

    APINodeList<AdAccountDeliveryEstimate> lastResponse = null;
    @Override
    public APINodeList<AdAccountDeliveryEstimate> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "optimization_goal",
      "promoted_object",
      "targeting_spec",
    };

    public static final String[] FIELDS = {
      "daily_outcomes_curve",
      "estimate_dau",
      "estimate_mau",
      "estimate_ready",
    };

    @Override
    public APINodeList<AdAccountDeliveryEstimate> parseResponse(String response, String header) throws APIException {
      return AdAccountDeliveryEstimate.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountDeliveryEstimate> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountDeliveryEstimate> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountDeliveryEstimate>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountDeliveryEstimate>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountDeliveryEstimate>>() {
           public APINodeList<AdAccountDeliveryEstimate> apply(ResponseWrapper result) {
             try {
               return APIRequestGetDeliveryEstimate.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetDeliveryEstimate(String nodeId, APIContext context) {
      super(context, nodeId, "/delivery_estimate", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetDeliveryEstimate setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetDeliveryEstimate setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetDeliveryEstimate setOptimizationGoal (AdAccountDeliveryEstimate.EnumOptimizationGoal optimizationGoal) {
      this.setParam("optimization_goal", optimizationGoal);
      return this;
    }
    public APIRequestGetDeliveryEstimate setOptimizationGoal (String optimizationGoal) {
      this.setParam("optimization_goal", optimizationGoal);
      return this;
    }

    public APIRequestGetDeliveryEstimate setPromotedObject (Object promotedObject) {
      this.setParam("promoted_object", promotedObject);
      return this;
    }
    public APIRequestGetDeliveryEstimate setPromotedObject (String promotedObject) {
      this.setParam("promoted_object", promotedObject);
      return this;
    }

    public APIRequestGetDeliveryEstimate setTargetingSpec (Targeting targetingSpec) {
      this.setParam("targeting_spec", targetingSpec);
      return this;
    }
    public APIRequestGetDeliveryEstimate setTargetingSpec (String targetingSpec) {
      this.setParam("targeting_spec", targetingSpec);
      return this;
    }

    public APIRequestGetDeliveryEstimate requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetDeliveryEstimate requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetDeliveryEstimate requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetDeliveryEstimate requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetDeliveryEstimate requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetDeliveryEstimate requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetDeliveryEstimate requestDailyOutcomesCurveField () {
      return this.requestDailyOutcomesCurveField(true);
    }
    public APIRequestGetDeliveryEstimate requestDailyOutcomesCurveField (boolean value) {
      this.requestField("daily_outcomes_curve", value);
      return this;
    }
    public APIRequestGetDeliveryEstimate requestEstimateDauField () {
      return this.requestEstimateDauField(true);
    }
    public APIRequestGetDeliveryEstimate requestEstimateDauField (boolean value) {
      this.requestField("estimate_dau", value);
      return this;
    }
    public APIRequestGetDeliveryEstimate requestEstimateMauField () {
      return this.requestEstimateMauField(true);
    }
    public APIRequestGetDeliveryEstimate requestEstimateMauField (boolean value) {
      this.requestField("estimate_mau", value);
      return this;
    }
    public APIRequestGetDeliveryEstimate requestEstimateReadyField () {
      return this.requestEstimateReadyField(true);
    }
    public APIRequestGetDeliveryEstimate requestEstimateReadyField (boolean value) {
      this.requestField("estimate_ready", value);
      return this;
    }
  }

  public static class APIRequestGetDeprecatedTargetingAdSets extends APIRequest<AdSet> {

    APINodeList<AdSet> lastResponse = null;
    @Override
    public APINodeList<AdSet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "type",
    };

    public static final String[] FIELDS = {
      "account_id",
      "ad_keywords",
      "adlabels",
      "adset_schedule",
      "asset_feed_id",
      "attribution_spec",
      "best_creative",
      "bid_adjustments",
      "bid_amount",
      "bid_constraints",
      "bid_info",
      "bid_strategy",
      "billing_event",
      "budget_remaining",
      "campaign",
      "campaign_id",
      "configured_status",
      "created_time",
      "creative_sequence",
      "daily_budget",
      "daily_min_spend_target",
      "daily_spend_cap",
      "destination_type",
      "effective_status",
      "end_time",
      "frequency_control_specs",
      "full_funnel_exploration_mode",
      "id",
      "instagram_actor_id",
      "is_dynamic_creative",
      "issues_info",
      "lifetime_budget",
      "lifetime_imps",
      "lifetime_min_spend_target",
      "lifetime_spend_cap",
      "name",
      "optimization_goal",
      "optimization_sub_event",
      "pacing_type",
      "promoted_object",
      "recommendations",
      "recurring_budget_semantics",
      "review_feedback",
      "rf_prediction_id",
      "source_adset",
      "source_adset_id",
      "start_time",
      "status",
      "targeting",
      "time_based_ad_rotation_id_blocks",
      "time_based_ad_rotation_intervals",
      "updated_time",
      "use_new_app_click",
    };

    @Override
    public APINodeList<AdSet> parseResponse(String response, String header) throws APIException {
      return AdSet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdSet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdSet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdSet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdSet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdSet>>() {
           public APINodeList<AdSet> apply(ResponseWrapper result) {
             try {
               return APIRequestGetDeprecatedTargetingAdSets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetDeprecatedTargetingAdSets(String nodeId, APIContext context) {
      super(context, nodeId, "/deprecatedtargetingadsets", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetDeprecatedTargetingAdSets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetDeprecatedTargetingAdSets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetDeprecatedTargetingAdSets setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestGetDeprecatedTargetingAdSets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetDeprecatedTargetingAdSets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetDeprecatedTargetingAdSets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetDeprecatedTargetingAdSets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetDeprecatedTargetingAdSets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetDeprecatedTargetingAdSets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetDeprecatedTargetingAdSets requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAdKeywordsField () {
      return this.requestAdKeywordsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAdKeywordsField (boolean value) {
      this.requestField("ad_keywords", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAdlabelsField () {
      return this.requestAdlabelsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAdlabelsField (boolean value) {
      this.requestField("adlabels", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAdsetScheduleField () {
      return this.requestAdsetScheduleField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAdsetScheduleField (boolean value) {
      this.requestField("adset_schedule", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAssetFeedIdField () {
      return this.requestAssetFeedIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAssetFeedIdField (boolean value) {
      this.requestField("asset_feed_id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBestCreativeField () {
      return this.requestBestCreativeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBestCreativeField (boolean value) {
      this.requestField("best_creative", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidAdjustmentsField () {
      return this.requestBidAdjustmentsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidAdjustmentsField (boolean value) {
      this.requestField("bid_adjustments", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidAmountField () {
      return this.requestBidAmountField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidAmountField (boolean value) {
      this.requestField("bid_amount", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidConstraintsField () {
      return this.requestBidConstraintsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidConstraintsField (boolean value) {
      this.requestField("bid_constraints", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidInfoField () {
      return this.requestBidInfoField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidInfoField (boolean value) {
      this.requestField("bid_info", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidStrategyField () {
      return this.requestBidStrategyField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBidStrategyField (boolean value) {
      this.requestField("bid_strategy", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBillingEventField () {
      return this.requestBillingEventField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBillingEventField (boolean value) {
      this.requestField("billing_event", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBudgetRemainingField () {
      return this.requestBudgetRemainingField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestBudgetRemainingField (boolean value) {
      this.requestField("budget_remaining", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCampaignField () {
      return this.requestCampaignField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCampaignField (boolean value) {
      this.requestField("campaign", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCampaignIdField () {
      return this.requestCampaignIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCampaignIdField (boolean value) {
      this.requestField("campaign_id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestConfiguredStatusField () {
      return this.requestConfiguredStatusField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestConfiguredStatusField (boolean value) {
      this.requestField("configured_status", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCreativeSequenceField () {
      return this.requestCreativeSequenceField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestCreativeSequenceField (boolean value) {
      this.requestField("creative_sequence", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDailyBudgetField () {
      return this.requestDailyBudgetField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDailyBudgetField (boolean value) {
      this.requestField("daily_budget", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDailyMinSpendTargetField () {
      return this.requestDailyMinSpendTargetField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDailyMinSpendTargetField (boolean value) {
      this.requestField("daily_min_spend_target", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDailySpendCapField () {
      return this.requestDailySpendCapField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDailySpendCapField (boolean value) {
      this.requestField("daily_spend_cap", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDestinationTypeField () {
      return this.requestDestinationTypeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestDestinationTypeField (boolean value) {
      this.requestField("destination_type", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestEffectiveStatusField () {
      return this.requestEffectiveStatusField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestEffectiveStatusField (boolean value) {
      this.requestField("effective_status", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestFrequencyControlSpecsField () {
      return this.requestFrequencyControlSpecsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestFrequencyControlSpecsField (boolean value) {
      this.requestField("frequency_control_specs", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestFullFunnelExplorationModeField () {
      return this.requestFullFunnelExplorationModeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestFullFunnelExplorationModeField (boolean value) {
      this.requestField("full_funnel_exploration_mode", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestInstagramActorIdField () {
      return this.requestInstagramActorIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestInstagramActorIdField (boolean value) {
      this.requestField("instagram_actor_id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestIsDynamicCreativeField () {
      return this.requestIsDynamicCreativeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestIsDynamicCreativeField (boolean value) {
      this.requestField("is_dynamic_creative", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestIssuesInfoField () {
      return this.requestIssuesInfoField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestIssuesInfoField (boolean value) {
      this.requestField("issues_info", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeBudgetField () {
      return this.requestLifetimeBudgetField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeBudgetField (boolean value) {
      this.requestField("lifetime_budget", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeImpsField () {
      return this.requestLifetimeImpsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeImpsField (boolean value) {
      this.requestField("lifetime_imps", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeMinSpendTargetField () {
      return this.requestLifetimeMinSpendTargetField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeMinSpendTargetField (boolean value) {
      this.requestField("lifetime_min_spend_target", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeSpendCapField () {
      return this.requestLifetimeSpendCapField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestLifetimeSpendCapField (boolean value) {
      this.requestField("lifetime_spend_cap", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestOptimizationGoalField () {
      return this.requestOptimizationGoalField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestOptimizationGoalField (boolean value) {
      this.requestField("optimization_goal", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestOptimizationSubEventField () {
      return this.requestOptimizationSubEventField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestOptimizationSubEventField (boolean value) {
      this.requestField("optimization_sub_event", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestPacingTypeField () {
      return this.requestPacingTypeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestPacingTypeField (boolean value) {
      this.requestField("pacing_type", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestPromotedObjectField () {
      return this.requestPromotedObjectField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestPromotedObjectField (boolean value) {
      this.requestField("promoted_object", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestRecommendationsField () {
      return this.requestRecommendationsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestRecommendationsField (boolean value) {
      this.requestField("recommendations", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestRecurringBudgetSemanticsField () {
      return this.requestRecurringBudgetSemanticsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestRecurringBudgetSemanticsField (boolean value) {
      this.requestField("recurring_budget_semantics", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestReviewFeedbackField () {
      return this.requestReviewFeedbackField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestReviewFeedbackField (boolean value) {
      this.requestField("review_feedback", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestRfPredictionIdField () {
      return this.requestRfPredictionIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestRfPredictionIdField (boolean value) {
      this.requestField("rf_prediction_id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestSourceAdsetField () {
      return this.requestSourceAdsetField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestSourceAdsetField (boolean value) {
      this.requestField("source_adset", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestSourceAdsetIdField () {
      return this.requestSourceAdsetIdField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestSourceAdsetIdField (boolean value) {
      this.requestField("source_adset_id", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestTargetingField () {
      return this.requestTargetingField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestTargetingField (boolean value) {
      this.requestField("targeting", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestTimeBasedAdRotationIdBlocksField () {
      return this.requestTimeBasedAdRotationIdBlocksField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestTimeBasedAdRotationIdBlocksField (boolean value) {
      this.requestField("time_based_ad_rotation_id_blocks", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestTimeBasedAdRotationIntervalsField () {
      return this.requestTimeBasedAdRotationIntervalsField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestTimeBasedAdRotationIntervalsField (boolean value) {
      this.requestField("time_based_ad_rotation_intervals", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetDeprecatedTargetingAdSets requestUseNewAppClickField () {
      return this.requestUseNewAppClickField(true);
    }
    public APIRequestGetDeprecatedTargetingAdSets requestUseNewAppClickField (boolean value) {
      this.requestField("use_new_app_click", value);
      return this;
    }
  }

  public static class APIRequestGetGeneratePreviews extends APIRequest<AdPreview> {

    APINodeList<AdPreview> lastResponse = null;
    @Override
    public APINodeList<AdPreview> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "ad_format",
      "creative",
      "dynamic_asset_label",
      "dynamic_creative_spec",
      "dynamic_customization",
      "end_date",
      "height",
      "interactive",
      "locale",
      "place_page_id",
      "post",
      "product_item_ids",
      "render_type",
      "start_date",
      "width",
    };

    public static final String[] FIELDS = {
      "body",
    };

    @Override
    public APINodeList<AdPreview> parseResponse(String response, String header) throws APIException {
      return AdPreview.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdPreview> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdPreview> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdPreview>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdPreview>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdPreview>>() {
           public APINodeList<AdPreview> apply(ResponseWrapper result) {
             try {
               return APIRequestGetGeneratePreviews.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetGeneratePreviews(String nodeId, APIContext context) {
      super(context, nodeId, "/generatepreviews", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetGeneratePreviews setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetGeneratePreviews setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetGeneratePreviews setAdFormat (AdPreview.EnumAdFormat adFormat) {
      this.setParam("ad_format", adFormat);
      return this;
    }
    public APIRequestGetGeneratePreviews setAdFormat (String adFormat) {
      this.setParam("ad_format", adFormat);
      return this;
    }

    public APIRequestGetGeneratePreviews setCreative (AdCreative creative) {
      this.setParam("creative", creative);
      return this;
    }
    public APIRequestGetGeneratePreviews setCreative (String creative) {
      this.setParam("creative", creative);
      return this;
    }

    public APIRequestGetGeneratePreviews setDynamicAssetLabel (String dynamicAssetLabel) {
      this.setParam("dynamic_asset_label", dynamicAssetLabel);
      return this;
    }

    public APIRequestGetGeneratePreviews setDynamicCreativeSpec (Object dynamicCreativeSpec) {
      this.setParam("dynamic_creative_spec", dynamicCreativeSpec);
      return this;
    }
    public APIRequestGetGeneratePreviews setDynamicCreativeSpec (String dynamicCreativeSpec) {
      this.setParam("dynamic_creative_spec", dynamicCreativeSpec);
      return this;
    }

    public APIRequestGetGeneratePreviews setDynamicCustomization (Object dynamicCustomization) {
      this.setParam("dynamic_customization", dynamicCustomization);
      return this;
    }
    public APIRequestGetGeneratePreviews setDynamicCustomization (String dynamicCustomization) {
      this.setParam("dynamic_customization", dynamicCustomization);
      return this;
    }

    public APIRequestGetGeneratePreviews setEndDate (String endDate) {
      this.setParam("end_date", endDate);
      return this;
    }

    public APIRequestGetGeneratePreviews setHeight (Long height) {
      this.setParam("height", height);
      return this;
    }
    public APIRequestGetGeneratePreviews setHeight (String height) {
      this.setParam("height", height);
      return this;
    }

    public APIRequestGetGeneratePreviews setInteractive (Boolean interactive) {
      this.setParam("interactive", interactive);
      return this;
    }
    public APIRequestGetGeneratePreviews setInteractive (String interactive) {
      this.setParam("interactive", interactive);
      return this;
    }

    public APIRequestGetGeneratePreviews setLocale (String locale) {
      this.setParam("locale", locale);
      return this;
    }

    public APIRequestGetGeneratePreviews setPlacePageId (Long placePageId) {
      this.setParam("place_page_id", placePageId);
      return this;
    }
    public APIRequestGetGeneratePreviews setPlacePageId (String placePageId) {
      this.setParam("place_page_id", placePageId);
      return this;
    }

    public APIRequestGetGeneratePreviews setPost (Object post) {
      this.setParam("post", post);
      return this;
    }
    public APIRequestGetGeneratePreviews setPost (String post) {
      this.setParam("post", post);
      return this;
    }

    public APIRequestGetGeneratePreviews setProductItemIds (List<String> productItemIds) {
      this.setParam("product_item_ids", productItemIds);
      return this;
    }
    public APIRequestGetGeneratePreviews setProductItemIds (String productItemIds) {
      this.setParam("product_item_ids", productItemIds);
      return this;
    }

    public APIRequestGetGeneratePreviews setRenderType (AdPreview.EnumRenderType renderType) {
      this.setParam("render_type", renderType);
      return this;
    }
    public APIRequestGetGeneratePreviews setRenderType (String renderType) {
      this.setParam("render_type", renderType);
      return this;
    }

    public APIRequestGetGeneratePreviews setStartDate (String startDate) {
      this.setParam("start_date", startDate);
      return this;
    }

    public APIRequestGetGeneratePreviews setWidth (Long width) {
      this.setParam("width", width);
      return this;
    }
    public APIRequestGetGeneratePreviews setWidth (String width) {
      this.setParam("width", width);
      return this;
    }

    public APIRequestGetGeneratePreviews requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetGeneratePreviews requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetGeneratePreviews requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetGeneratePreviews requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetGeneratePreviews requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetGeneratePreviews requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetGeneratePreviews requestBodyField () {
      return this.requestBodyField(true);
    }
    public APIRequestGetGeneratePreviews requestBodyField (boolean value) {
      this.requestField("body", value);
      return this;
    }
  }

  public static class APIRequestGetImpactingAdStudies extends APIRequest<AdStudy> {

    APINodeList<AdStudy> lastResponse = null;
    @Override
    public APINodeList<AdStudy> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "business",
      "canceled_time",
      "cooldown_start_time",
      "created_by",
      "created_time",
      "description",
      "end_time",
      "id",
      "name",
      "observation_end_time",
      "results_first_available_date",
      "start_time",
      "type",
      "updated_by",
      "updated_time",
    };

    @Override
    public APINodeList<AdStudy> parseResponse(String response, String header) throws APIException {
      return AdStudy.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdStudy> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdStudy> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdStudy>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdStudy>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdStudy>>() {
           public APINodeList<AdStudy> apply(ResponseWrapper result) {
             try {
               return APIRequestGetImpactingAdStudies.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetImpactingAdStudies(String nodeId, APIContext context) {
      super(context, nodeId, "/impacting_ad_studies", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetImpactingAdStudies setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetImpactingAdStudies setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetImpactingAdStudies requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetImpactingAdStudies requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetImpactingAdStudies requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetImpactingAdStudies requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetImpactingAdStudies requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetImpactingAdStudies requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetImpactingAdStudies requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetImpactingAdStudies requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestCanceledTimeField () {
      return this.requestCanceledTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestCanceledTimeField (boolean value) {
      this.requestField("canceled_time", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestCooldownStartTimeField () {
      return this.requestCooldownStartTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestCooldownStartTimeField (boolean value) {
      this.requestField("cooldown_start_time", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetImpactingAdStudies requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetImpactingAdStudies requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetImpactingAdStudies requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetImpactingAdStudies requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestObservationEndTimeField () {
      return this.requestObservationEndTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestObservationEndTimeField (boolean value) {
      this.requestField("observation_end_time", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestResultsFirstAvailableDateField () {
      return this.requestResultsFirstAvailableDateField(true);
    }
    public APIRequestGetImpactingAdStudies requestResultsFirstAvailableDateField (boolean value) {
      this.requestField("results_first_available_date", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetImpactingAdStudies requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestUpdatedByField () {
      return this.requestUpdatedByField(true);
    }
    public APIRequestGetImpactingAdStudies requestUpdatedByField (boolean value) {
      this.requestField("updated_by", value);
      return this;
    }
    public APIRequestGetImpactingAdStudies requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetImpactingAdStudies requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestGetInsights extends APIRequest<AdsInsights> {

    APINodeList<AdsInsights> lastResponse = null;
    @Override
    public APINodeList<AdsInsights> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action_attribution_windows",
      "action_breakdowns",
      "action_report_time",
      "breakdowns",
      "date_preset",
      "default_summary",
      "export_columns",
      "export_format",
      "export_name",
      "fields",
      "filtering",
      "level",
      "product_id_limit",
      "sort",
      "summary",
      "summary_action_breakdowns",
      "time_increment",
      "time_range",
      "time_ranges",
      "use_account_attribution_setting",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<AdsInsights> parseResponse(String response, String header) throws APIException {
      return AdsInsights.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdsInsights> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdsInsights> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdsInsights>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdsInsights>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdsInsights>>() {
           public APINodeList<AdsInsights> apply(ResponseWrapper result) {
             try {
               return APIRequestGetInsights.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetInsights(String nodeId, APIContext context) {
      super(context, nodeId, "/insights", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetInsights setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetInsights setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetInsights setActionAttributionWindows (List<AdsInsights.EnumActionAttributionWindows> actionAttributionWindows) {
      this.setParam("action_attribution_windows", actionAttributionWindows);
      return this;
    }
    public APIRequestGetInsights setActionAttributionWindows (String actionAttributionWindows) {
      this.setParam("action_attribution_windows", actionAttributionWindows);
      return this;
    }

    public APIRequestGetInsights setActionBreakdowns (List<AdsInsights.EnumActionBreakdowns> actionBreakdowns) {
      this.setParam("action_breakdowns", actionBreakdowns);
      return this;
    }
    public APIRequestGetInsights setActionBreakdowns (String actionBreakdowns) {
      this.setParam("action_breakdowns", actionBreakdowns);
      return this;
    }

    public APIRequestGetInsights setActionReportTime (AdsInsights.EnumActionReportTime actionReportTime) {
      this.setParam("action_report_time", actionReportTime);
      return this;
    }
    public APIRequestGetInsights setActionReportTime (String actionReportTime) {
      this.setParam("action_report_time", actionReportTime);
      return this;
    }

    public APIRequestGetInsights setBreakdowns (List<AdsInsights.EnumBreakdowns> breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }
    public APIRequestGetInsights setBreakdowns (String breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }

    public APIRequestGetInsights setDatePreset (AdsInsights.EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestGetInsights setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestGetInsights setDefaultSummary (Boolean defaultSummary) {
      this.setParam("default_summary", defaultSummary);
      return this;
    }
    public APIRequestGetInsights setDefaultSummary (String defaultSummary) {
      this.setParam("default_summary", defaultSummary);
      return this;
    }

    public APIRequestGetInsights setExportColumns (List<String> exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }
    public APIRequestGetInsights setExportColumns (String exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }

    public APIRequestGetInsights setExportFormat (String exportFormat) {
      this.setParam("export_format", exportFormat);
      return this;
    }

    public APIRequestGetInsights setExportName (String exportName) {
      this.setParam("export_name", exportName);
      return this;
    }

    public APIRequestGetInsights setFields (List<String> fields) {
      this.setParam("fields", fields);
      return this;
    }
    public APIRequestGetInsights setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGetInsights setFiltering (List<Object> filtering) {
      this.setParam("filtering", filtering);
      return this;
    }
    public APIRequestGetInsights setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestGetInsights setLevel (AdsInsights.EnumLevel level) {
      this.setParam("level", level);
      return this;
    }
    public APIRequestGetInsights setLevel (String level) {
      this.setParam("level", level);
      return this;
    }

    public APIRequestGetInsights setProductIdLimit (Long productIdLimit) {
      this.setParam("product_id_limit", productIdLimit);
      return this;
    }
    public APIRequestGetInsights setProductIdLimit (String productIdLimit) {
      this.setParam("product_id_limit", productIdLimit);
      return this;
    }

    public APIRequestGetInsights setSort (List<String> sort) {
      this.setParam("sort", sort);
      return this;
    }
    public APIRequestGetInsights setSort (String sort) {
      this.setParam("sort", sort);
      return this;
    }

    public APIRequestGetInsights setSummary (List<String> summary) {
      this.setParam("summary", summary);
      return this;
    }
    public APIRequestGetInsights setSummary (String summary) {
      this.setParam("summary", summary);
      return this;
    }

    public APIRequestGetInsights setSummaryActionBreakdowns (List<AdsInsights.EnumSummaryActionBreakdowns> summaryActionBreakdowns) {
      this.setParam("summary_action_breakdowns", summaryActionBreakdowns);
      return this;
    }
    public APIRequestGetInsights setSummaryActionBreakdowns (String summaryActionBreakdowns) {
      this.setParam("summary_action_breakdowns", summaryActionBreakdowns);
      return this;
    }

    public APIRequestGetInsights setTimeIncrement (String timeIncrement) {
      this.setParam("time_increment", timeIncrement);
      return this;
    }

    public APIRequestGetInsights setTimeRange (Object timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }
    public APIRequestGetInsights setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGetInsights setTimeRanges (List<Object> timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }
    public APIRequestGetInsights setTimeRanges (String timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }

    public APIRequestGetInsights setUseAccountAttributionSetting (Boolean useAccountAttributionSetting) {
      this.setParam("use_account_attribution_setting", useAccountAttributionSetting);
      return this;
    }
    public APIRequestGetInsights setUseAccountAttributionSetting (String useAccountAttributionSetting) {
      this.setParam("use_account_attribution_setting", useAccountAttributionSetting);
      return this;
    }

    public APIRequestGetInsights requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetInsights requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetInsights requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetInsights requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetInsights requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetInsights requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetInsightsAsync extends APIRequest<AdReportRun> {

    AdReportRun lastResponse = null;
    @Override
    public AdReportRun getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action_attribution_windows",
      "action_breakdowns",
      "action_report_time",
      "breakdowns",
      "date_preset",
      "default_summary",
      "export_columns",
      "export_format",
      "export_name",
      "fields",
      "filtering",
      "level",
      "product_id_limit",
      "sort",
      "summary",
      "summary_action_breakdowns",
      "time_increment",
      "time_range",
      "time_ranges",
      "use_account_attribution_setting",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdReportRun parseResponse(String response, String header) throws APIException {
      return AdReportRun.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdReportRun execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdReportRun execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdReportRun> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdReportRun> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdReportRun>() {
           public AdReportRun apply(ResponseWrapper result) {
             try {
               return APIRequestGetInsightsAsync.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetInsightsAsync(String nodeId, APIContext context) {
      super(context, nodeId, "/insights", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetInsightsAsync setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetInsightsAsync setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetInsightsAsync setActionAttributionWindows (List<AdsInsights.EnumActionAttributionWindows> actionAttributionWindows) {
      this.setParam("action_attribution_windows", actionAttributionWindows);
      return this;
    }
    public APIRequestGetInsightsAsync setActionAttributionWindows (String actionAttributionWindows) {
      this.setParam("action_attribution_windows", actionAttributionWindows);
      return this;
    }

    public APIRequestGetInsightsAsync setActionBreakdowns (List<AdsInsights.EnumActionBreakdowns> actionBreakdowns) {
      this.setParam("action_breakdowns", actionBreakdowns);
      return this;
    }
    public APIRequestGetInsightsAsync setActionBreakdowns (String actionBreakdowns) {
      this.setParam("action_breakdowns", actionBreakdowns);
      return this;
    }

    public APIRequestGetInsightsAsync setActionReportTime (AdsInsights.EnumActionReportTime actionReportTime) {
      this.setParam("action_report_time", actionReportTime);
      return this;
    }
    public APIRequestGetInsightsAsync setActionReportTime (String actionReportTime) {
      this.setParam("action_report_time", actionReportTime);
      return this;
    }

    public APIRequestGetInsightsAsync setBreakdowns (List<AdsInsights.EnumBreakdowns> breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }
    public APIRequestGetInsightsAsync setBreakdowns (String breakdowns) {
      this.setParam("breakdowns", breakdowns);
      return this;
    }

    public APIRequestGetInsightsAsync setDatePreset (AdsInsights.EnumDatePreset datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }
    public APIRequestGetInsightsAsync setDatePreset (String datePreset) {
      this.setParam("date_preset", datePreset);
      return this;
    }

    public APIRequestGetInsightsAsync setDefaultSummary (Boolean defaultSummary) {
      this.setParam("default_summary", defaultSummary);
      return this;
    }
    public APIRequestGetInsightsAsync setDefaultSummary (String defaultSummary) {
      this.setParam("default_summary", defaultSummary);
      return this;
    }

    public APIRequestGetInsightsAsync setExportColumns (List<String> exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }
    public APIRequestGetInsightsAsync setExportColumns (String exportColumns) {
      this.setParam("export_columns", exportColumns);
      return this;
    }

    public APIRequestGetInsightsAsync setExportFormat (String exportFormat) {
      this.setParam("export_format", exportFormat);
      return this;
    }

    public APIRequestGetInsightsAsync setExportName (String exportName) {
      this.setParam("export_name", exportName);
      return this;
    }

    public APIRequestGetInsightsAsync setFields (List<String> fields) {
      this.setParam("fields", fields);
      return this;
    }
    public APIRequestGetInsightsAsync setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGetInsightsAsync setFiltering (List<Object> filtering) {
      this.setParam("filtering", filtering);
      return this;
    }
    public APIRequestGetInsightsAsync setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestGetInsightsAsync setLevel (AdsInsights.EnumLevel level) {
      this.setParam("level", level);
      return this;
    }
    public APIRequestGetInsightsAsync setLevel (String level) {
      this.setParam("level", level);
      return this;
    }

    public APIRequestGetInsightsAsync setProductIdLimit (Long productIdLimit) {
      this.setParam("product_id_limit", productIdLimit);
      return this;
    }
    public APIRequestGetInsightsAsync setProductIdLimit (String productIdLimit) {
      this.setParam("product_id_limit", productIdLimit);
      return this;
    }

    public APIRequestGetInsightsAsync setSort (List<String> sort) {
      this.setParam("sort", sort);
      return this;
    }
    public APIRequestGetInsightsAsync setSort (String sort) {
      this.setParam("sort", sort);
      return this;
    }

    public APIRequestGetInsightsAsync setSummary (List<String> summary) {
      this.setParam("summary", summary);
      return this;
    }
    public APIRequestGetInsightsAsync setSummary (String summary) {
      this.setParam("summary", summary);
      return this;
    }

    public APIRequestGetInsightsAsync setSummaryActionBreakdowns (List<AdsInsights.EnumSummaryActionBreakdowns> summaryActionBreakdowns) {
      this.setParam("summary_action_breakdowns", summaryActionBreakdowns);
      return this;
    }
    public APIRequestGetInsightsAsync setSummaryActionBreakdowns (String summaryActionBreakdowns) {
      this.setParam("summary_action_breakdowns", summaryActionBreakdowns);
      return this;
    }

    public APIRequestGetInsightsAsync setTimeIncrement (String timeIncrement) {
      this.setParam("time_increment", timeIncrement);
      return this;
    }

    public APIRequestGetInsightsAsync setTimeRange (Object timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }
    public APIRequestGetInsightsAsync setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGetInsightsAsync setTimeRanges (List<Object> timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }
    public APIRequestGetInsightsAsync setTimeRanges (String timeRanges) {
      this.setParam("time_ranges", timeRanges);
      return this;
    }

    public APIRequestGetInsightsAsync setUseAccountAttributionSetting (Boolean useAccountAttributionSetting) {
      this.setParam("use_account_attribution_setting", useAccountAttributionSetting);
      return this;
    }
    public APIRequestGetInsightsAsync setUseAccountAttributionSetting (String useAccountAttributionSetting) {
      this.setParam("use_account_attribution_setting", useAccountAttributionSetting);
      return this;
    }

    public APIRequestGetInsightsAsync requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetInsightsAsync requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetInsightsAsync requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetInsightsAsync requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetInsightsAsync requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetInsightsAsync requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetInstagramAccounts extends APIRequest<InstagramUser> {

    APINodeList<InstagramUser> lastResponse = null;
    @Override
    public APINodeList<InstagramUser> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "follow_count",
      "followed_by_count",
      "has_profile_picture",
      "id",
      "is_private",
      "is_published",
      "media_count",
      "profile_pic",
      "username",
    };

    @Override
    public APINodeList<InstagramUser> parseResponse(String response, String header) throws APIException {
      return InstagramUser.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<InstagramUser> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<InstagramUser> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<InstagramUser>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<InstagramUser>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<InstagramUser>>() {
           public APINodeList<InstagramUser> apply(ResponseWrapper result) {
             try {
               return APIRequestGetInstagramAccounts.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetInstagramAccounts(String nodeId, APIContext context) {
      super(context, nodeId, "/instagram_accounts", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetInstagramAccounts setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetInstagramAccounts setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetInstagramAccounts requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetInstagramAccounts requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetInstagramAccounts requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetInstagramAccounts requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetInstagramAccounts requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetInstagramAccounts requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetInstagramAccounts requestFollowCountField () {
      return this.requestFollowCountField(true);
    }
    public APIRequestGetInstagramAccounts requestFollowCountField (boolean value) {
      this.requestField("follow_count", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestFollowedByCountField () {
      return this.requestFollowedByCountField(true);
    }
    public APIRequestGetInstagramAccounts requestFollowedByCountField (boolean value) {
      this.requestField("followed_by_count", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestHasProfilePictureField () {
      return this.requestHasProfilePictureField(true);
    }
    public APIRequestGetInstagramAccounts requestHasProfilePictureField (boolean value) {
      this.requestField("has_profile_picture", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetInstagramAccounts requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestIsPrivateField () {
      return this.requestIsPrivateField(true);
    }
    public APIRequestGetInstagramAccounts requestIsPrivateField (boolean value) {
      this.requestField("is_private", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetInstagramAccounts requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestMediaCountField () {
      return this.requestMediaCountField(true);
    }
    public APIRequestGetInstagramAccounts requestMediaCountField (boolean value) {
      this.requestField("media_count", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestProfilePicField () {
      return this.requestProfilePicField(true);
    }
    public APIRequestGetInstagramAccounts requestProfilePicField (boolean value) {
      this.requestField("profile_pic", value);
      return this;
    }
    public APIRequestGetInstagramAccounts requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetInstagramAccounts requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
  }

  public static class APIRequestGetLeadGenForms extends APIRequest<LeadgenForm> {

    APINodeList<LeadgenForm> lastResponse = null;
    @Override
    public APINodeList<LeadgenForm> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "query",
    };

    public static final String[] FIELDS = {
      "allow_organic_lead",
      "block_display_for_non_targeted_viewer",
      "created_time",
      "creator",
      "creator_id",
      "cusomized_tcpa_content",
      "expired_leads_count",
      "extra_details",
      "follow_up_action_text",
      "follow_up_action_url",
      "id",
      "is_optimized_for_quality",
      "leadgen_export_csv_url",
      "leads_count",
      "locale",
      "messenger_welcome_message",
      "name",
      "organic_leads_count",
      "page",
      "page_id",
      "privacy_policy_url",
      "qualifiers",
      "question_page_custom_headline",
      "questions",
      "status",
      "tcpa_compliance",
      "tracking_parameters",
    };

    @Override
    public APINodeList<LeadgenForm> parseResponse(String response, String header) throws APIException {
      return LeadgenForm.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<LeadgenForm> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<LeadgenForm> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<LeadgenForm>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<LeadgenForm>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<LeadgenForm>>() {
           public APINodeList<LeadgenForm> apply(ResponseWrapper result) {
             try {
               return APIRequestGetLeadGenForms.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetLeadGenForms(String nodeId, APIContext context) {
      super(context, nodeId, "/leadgen_forms", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetLeadGenForms setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetLeadGenForms setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetLeadGenForms setQuery (String query) {
      this.setParam("query", query);
      return this;
    }

    public APIRequestGetLeadGenForms requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetLeadGenForms requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLeadGenForms requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetLeadGenForms requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLeadGenForms requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetLeadGenForms requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetLeadGenForms requestAllowOrganicLeadField () {
      return this.requestAllowOrganicLeadField(true);
    }
    public APIRequestGetLeadGenForms requestAllowOrganicLeadField (boolean value) {
      this.requestField("allow_organic_lead", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestBlockDisplayForNonTargetedViewerField () {
      return this.requestBlockDisplayForNonTargetedViewerField(true);
    }
    public APIRequestGetLeadGenForms requestBlockDisplayForNonTargetedViewerField (boolean value) {
      this.requestField("block_display_for_non_targeted_viewer", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetLeadGenForms requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestCreatorField () {
      return this.requestCreatorField(true);
    }
    public APIRequestGetLeadGenForms requestCreatorField (boolean value) {
      this.requestField("creator", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestCreatorIdField () {
      return this.requestCreatorIdField(true);
    }
    public APIRequestGetLeadGenForms requestCreatorIdField (boolean value) {
      this.requestField("creator_id", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestCusomizedTcpaContentField () {
      return this.requestCusomizedTcpaContentField(true);
    }
    public APIRequestGetLeadGenForms requestCusomizedTcpaContentField (boolean value) {
      this.requestField("cusomized_tcpa_content", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestExpiredLeadsCountField () {
      return this.requestExpiredLeadsCountField(true);
    }
    public APIRequestGetLeadGenForms requestExpiredLeadsCountField (boolean value) {
      this.requestField("expired_leads_count", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestExtraDetailsField () {
      return this.requestExtraDetailsField(true);
    }
    public APIRequestGetLeadGenForms requestExtraDetailsField (boolean value) {
      this.requestField("extra_details", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestFollowUpActionTextField () {
      return this.requestFollowUpActionTextField(true);
    }
    public APIRequestGetLeadGenForms requestFollowUpActionTextField (boolean value) {
      this.requestField("follow_up_action_text", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestFollowUpActionUrlField () {
      return this.requestFollowUpActionUrlField(true);
    }
    public APIRequestGetLeadGenForms requestFollowUpActionUrlField (boolean value) {
      this.requestField("follow_up_action_url", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetLeadGenForms requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestIsOptimizedForQualityField () {
      return this.requestIsOptimizedForQualityField(true);
    }
    public APIRequestGetLeadGenForms requestIsOptimizedForQualityField (boolean value) {
      this.requestField("is_optimized_for_quality", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestLeadgenExportCsvUrlField () {
      return this.requestLeadgenExportCsvUrlField(true);
    }
    public APIRequestGetLeadGenForms requestLeadgenExportCsvUrlField (boolean value) {
      this.requestField("leadgen_export_csv_url", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestLeadsCountField () {
      return this.requestLeadsCountField(true);
    }
    public APIRequestGetLeadGenForms requestLeadsCountField (boolean value) {
      this.requestField("leads_count", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestLocaleField () {
      return this.requestLocaleField(true);
    }
    public APIRequestGetLeadGenForms requestLocaleField (boolean value) {
      this.requestField("locale", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestMessengerWelcomeMessageField () {
      return this.requestMessengerWelcomeMessageField(true);
    }
    public APIRequestGetLeadGenForms requestMessengerWelcomeMessageField (boolean value) {
      this.requestField("messenger_welcome_message", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetLeadGenForms requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestOrganicLeadsCountField () {
      return this.requestOrganicLeadsCountField(true);
    }
    public APIRequestGetLeadGenForms requestOrganicLeadsCountField (boolean value) {
      this.requestField("organic_leads_count", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestPageField () {
      return this.requestPageField(true);
    }
    public APIRequestGetLeadGenForms requestPageField (boolean value) {
      this.requestField("page", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestPageIdField () {
      return this.requestPageIdField(true);
    }
    public APIRequestGetLeadGenForms requestPageIdField (boolean value) {
      this.requestField("page_id", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestPrivacyPolicyUrlField () {
      return this.requestPrivacyPolicyUrlField(true);
    }
    public APIRequestGetLeadGenForms requestPrivacyPolicyUrlField (boolean value) {
      this.requestField("privacy_policy_url", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestQualifiersField () {
      return this.requestQualifiersField(true);
    }
    public APIRequestGetLeadGenForms requestQualifiersField (boolean value) {
      this.requestField("qualifiers", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestQuestionPageCustomHeadlineField () {
      return this.requestQuestionPageCustomHeadlineField(true);
    }
    public APIRequestGetLeadGenForms requestQuestionPageCustomHeadlineField (boolean value) {
      this.requestField("question_page_custom_headline", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestQuestionsField () {
      return this.requestQuestionsField(true);
    }
    public APIRequestGetLeadGenForms requestQuestionsField (boolean value) {
      this.requestField("questions", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetLeadGenForms requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestTcpaComplianceField () {
      return this.requestTcpaComplianceField(true);
    }
    public APIRequestGetLeadGenForms requestTcpaComplianceField (boolean value) {
      this.requestField("tcpa_compliance", value);
      return this;
    }
    public APIRequestGetLeadGenForms requestTrackingParametersField () {
      return this.requestTrackingParametersField(true);
    }
    public APIRequestGetLeadGenForms requestTrackingParametersField (boolean value) {
      this.requestField("tracking_parameters", value);
      return this;
    }
  }

  public static class APIRequestGetMatchedSearchApplications extends APIRequest<AdAccountMatchedSearchApplicationsEdgeData> {

    APINodeList<AdAccountMatchedSearchApplicationsEdgeData> lastResponse = null;
    @Override
    public APINodeList<AdAccountMatchedSearchApplicationsEdgeData> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "allow_incomplete_app",
      "app_store",
      "app_store_country",
      "business_id",
      "query_term",
    };

    public static final String[] FIELDS = {
      "app_id",
      "icon_url",
      "name",
      "search_source_store",
      "store",
      "unique_id",
      "url",
    };

    @Override
    public APINodeList<AdAccountMatchedSearchApplicationsEdgeData> parseResponse(String response, String header) throws APIException {
      return AdAccountMatchedSearchApplicationsEdgeData.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountMatchedSearchApplicationsEdgeData> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountMatchedSearchApplicationsEdgeData> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountMatchedSearchApplicationsEdgeData>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountMatchedSearchApplicationsEdgeData>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountMatchedSearchApplicationsEdgeData>>() {
           public APINodeList<AdAccountMatchedSearchApplicationsEdgeData> apply(ResponseWrapper result) {
             try {
               return APIRequestGetMatchedSearchApplications.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetMatchedSearchApplications(String nodeId, APIContext context) {
      super(context, nodeId, "/matched_search_applications", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetMatchedSearchApplications setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetMatchedSearchApplications setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetMatchedSearchApplications setAllowIncompleteApp (Boolean allowIncompleteApp) {
      this.setParam("allow_incomplete_app", allowIncompleteApp);
      return this;
    }
    public APIRequestGetMatchedSearchApplications setAllowIncompleteApp (String allowIncompleteApp) {
      this.setParam("allow_incomplete_app", allowIncompleteApp);
      return this;
    }

    public APIRequestGetMatchedSearchApplications setAppStore (AdAccountMatchedSearchApplicationsEdgeData.EnumAppStore appStore) {
      this.setParam("app_store", appStore);
      return this;
    }
    public APIRequestGetMatchedSearchApplications setAppStore (String appStore) {
      this.setParam("app_store", appStore);
      return this;
    }

    public APIRequestGetMatchedSearchApplications setAppStoreCountry (String appStoreCountry) {
      this.setParam("app_store_country", appStoreCountry);
      return this;
    }

    public APIRequestGetMatchedSearchApplications setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetMatchedSearchApplications setQueryTerm (String queryTerm) {
      this.setParam("query_term", queryTerm);
      return this;
    }

    public APIRequestGetMatchedSearchApplications requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetMatchedSearchApplications requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMatchedSearchApplications requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetMatchedSearchApplications requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMatchedSearchApplications requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetMatchedSearchApplications requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetMatchedSearchApplications requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetMatchedSearchApplications requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetMatchedSearchApplications requestIconUrlField () {
      return this.requestIconUrlField(true);
    }
    public APIRequestGetMatchedSearchApplications requestIconUrlField (boolean value) {
      this.requestField("icon_url", value);
      return this;
    }
    public APIRequestGetMatchedSearchApplications requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetMatchedSearchApplications requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetMatchedSearchApplications requestSearchSourceStoreField () {
      return this.requestSearchSourceStoreField(true);
    }
    public APIRequestGetMatchedSearchApplications requestSearchSourceStoreField (boolean value) {
      this.requestField("search_source_store", value);
      return this;
    }
    public APIRequestGetMatchedSearchApplications requestStoreField () {
      return this.requestStoreField(true);
    }
    public APIRequestGetMatchedSearchApplications requestStoreField (boolean value) {
      this.requestField("store", value);
      return this;
    }
    public APIRequestGetMatchedSearchApplications requestUniqueIdField () {
      return this.requestUniqueIdField(true);
    }
    public APIRequestGetMatchedSearchApplications requestUniqueIdField (boolean value) {
      this.requestField("unique_id", value);
      return this;
    }
    public APIRequestGetMatchedSearchApplications requestUrlField () {
      return this.requestUrlField(true);
    }
    public APIRequestGetMatchedSearchApplications requestUrlField (boolean value) {
      this.requestField("url", value);
      return this;
    }
  }

  public static class APIRequestGetMaxBid extends APIRequest<AdAccountMaxBid> {

    APINodeList<AdAccountMaxBid> lastResponse = null;
    @Override
    public APINodeList<AdAccountMaxBid> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "max_bid",
    };

    @Override
    public APINodeList<AdAccountMaxBid> parseResponse(String response, String header) throws APIException {
      return AdAccountMaxBid.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountMaxBid> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountMaxBid> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountMaxBid>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountMaxBid>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountMaxBid>>() {
           public APINodeList<AdAccountMaxBid> apply(ResponseWrapper result) {
             try {
               return APIRequestGetMaxBid.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetMaxBid(String nodeId, APIContext context) {
      super(context, nodeId, "/max_bid", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetMaxBid setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetMaxBid setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetMaxBid requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetMaxBid requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMaxBid requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetMaxBid requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMaxBid requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetMaxBid requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetMaxBid requestMaxBidField () {
      return this.requestMaxBidField(true);
    }
    public APIRequestGetMaxBid requestMaxBidField (boolean value) {
      this.requestField("max_bid", value);
      return this;
    }
  }

  public static class APIRequestGetMinimumBudgets extends APIRequest<MinimumBudget> {

    APINodeList<MinimumBudget> lastResponse = null;
    @Override
    public APINodeList<MinimumBudget> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "bid_amount",
    };

    public static final String[] FIELDS = {
      "currency",
      "min_daily_budget_high_freq",
      "min_daily_budget_imp",
      "min_daily_budget_low_freq",
      "min_daily_budget_video_views",
    };

    @Override
    public APINodeList<MinimumBudget> parseResponse(String response, String header) throws APIException {
      return MinimumBudget.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<MinimumBudget> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<MinimumBudget> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<MinimumBudget>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<MinimumBudget>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<MinimumBudget>>() {
           public APINodeList<MinimumBudget> apply(ResponseWrapper result) {
             try {
               return APIRequestGetMinimumBudgets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetMinimumBudgets(String nodeId, APIContext context) {
      super(context, nodeId, "/minimum_budgets", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetMinimumBudgets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetMinimumBudgets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetMinimumBudgets setBidAmount (Long bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }
    public APIRequestGetMinimumBudgets setBidAmount (String bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }

    public APIRequestGetMinimumBudgets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetMinimumBudgets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMinimumBudgets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetMinimumBudgets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMinimumBudgets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetMinimumBudgets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetMinimumBudgets requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetMinimumBudgets requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetHighFreqField () {
      return this.requestMinDailyBudgetHighFreqField(true);
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetHighFreqField (boolean value) {
      this.requestField("min_daily_budget_high_freq", value);
      return this;
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetImpField () {
      return this.requestMinDailyBudgetImpField(true);
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetImpField (boolean value) {
      this.requestField("min_daily_budget_imp", value);
      return this;
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetLowFreqField () {
      return this.requestMinDailyBudgetLowFreqField(true);
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetLowFreqField (boolean value) {
      this.requestField("min_daily_budget_low_freq", value);
      return this;
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetVideoViewsField () {
      return this.requestMinDailyBudgetVideoViewsField(true);
    }
    public APIRequestGetMinimumBudgets requestMinDailyBudgetVideoViewsField (boolean value) {
      this.requestField("min_daily_budget_video_views", value);
      return this;
    }
  }

  public static class APIRequestGetOfflineConversionDataSets extends APIRequest<OfflineConversionDataSet> {

    APINodeList<OfflineConversionDataSet> lastResponse = null;
    @Override
    public APINodeList<OfflineConversionDataSet> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "business",
      "config",
      "creation_time",
      "description",
      "duplicate_entries",
      "enable_auto_assign_to_accounts",
      "event_stats",
      "event_time_max",
      "event_time_min",
      "id",
      "is_mta_use",
      "is_restricted_use",
      "last_upload_app",
      "last_upload_app_changed_time",
      "match_rate_approx",
      "matched_entries",
      "name",
      "usage",
      "valid_entries",
    };

    @Override
    public APINodeList<OfflineConversionDataSet> parseResponse(String response, String header) throws APIException {
      return OfflineConversionDataSet.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<OfflineConversionDataSet> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<OfflineConversionDataSet> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<OfflineConversionDataSet>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<OfflineConversionDataSet>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<OfflineConversionDataSet>>() {
           public APINodeList<OfflineConversionDataSet> apply(ResponseWrapper result) {
             try {
               return APIRequestGetOfflineConversionDataSets.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetOfflineConversionDataSets(String nodeId, APIContext context) {
      super(context, nodeId, "/offline_conversion_data_sets", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetOfflineConversionDataSets setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetOfflineConversionDataSets setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetOfflineConversionDataSets requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetOfflineConversionDataSets requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetOfflineConversionDataSets requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetOfflineConversionDataSets requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetOfflineConversionDataSets requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetOfflineConversionDataSets requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetOfflineConversionDataSets requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestConfigField () {
      return this.requestConfigField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestConfigField (boolean value) {
      this.requestField("config", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestCreationTimeField () {
      return this.requestCreationTimeField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestCreationTimeField (boolean value) {
      this.requestField("creation_time", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestDuplicateEntriesField () {
      return this.requestDuplicateEntriesField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestDuplicateEntriesField (boolean value) {
      this.requestField("duplicate_entries", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestEnableAutoAssignToAccountsField () {
      return this.requestEnableAutoAssignToAccountsField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestEnableAutoAssignToAccountsField (boolean value) {
      this.requestField("enable_auto_assign_to_accounts", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestEventStatsField () {
      return this.requestEventStatsField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestEventStatsField (boolean value) {
      this.requestField("event_stats", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestEventTimeMaxField () {
      return this.requestEventTimeMaxField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestEventTimeMaxField (boolean value) {
      this.requestField("event_time_max", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestEventTimeMinField () {
      return this.requestEventTimeMinField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestEventTimeMinField (boolean value) {
      this.requestField("event_time_min", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestIsMtaUseField () {
      return this.requestIsMtaUseField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestIsMtaUseField (boolean value) {
      this.requestField("is_mta_use", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestIsRestrictedUseField () {
      return this.requestIsRestrictedUseField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestIsRestrictedUseField (boolean value) {
      this.requestField("is_restricted_use", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestLastUploadAppField () {
      return this.requestLastUploadAppField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestLastUploadAppField (boolean value) {
      this.requestField("last_upload_app", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestLastUploadAppChangedTimeField () {
      return this.requestLastUploadAppChangedTimeField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestLastUploadAppChangedTimeField (boolean value) {
      this.requestField("last_upload_app_changed_time", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestMatchRateApproxField () {
      return this.requestMatchRateApproxField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestMatchRateApproxField (boolean value) {
      this.requestField("match_rate_approx", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestMatchedEntriesField () {
      return this.requestMatchedEntriesField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestMatchedEntriesField (boolean value) {
      this.requestField("matched_entries", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestUsageField () {
      return this.requestUsageField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestUsageField (boolean value) {
      this.requestField("usage", value);
      return this;
    }
    public APIRequestGetOfflineConversionDataSets requestValidEntriesField () {
      return this.requestValidEntriesField(true);
    }
    public APIRequestGetOfflineConversionDataSets requestValidEntriesField (boolean value) {
      this.requestField("valid_entries", value);
      return this;
    }
  }

  public static class APIRequestGetOnBehalfRequests extends APIRequest<BusinessOwnedObjectOnBehalfOfRequest> {

    APINodeList<BusinessOwnedObjectOnBehalfOfRequest> lastResponse = null;
    @Override
    public APINodeList<BusinessOwnedObjectOnBehalfOfRequest> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "status",
    };

    public static final String[] FIELDS = {
      "business_owned_object",
      "id",
      "receiving_business",
      "requesting_business",
      "status",
    };

    @Override
    public APINodeList<BusinessOwnedObjectOnBehalfOfRequest> parseResponse(String response, String header) throws APIException {
      return BusinessOwnedObjectOnBehalfOfRequest.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<BusinessOwnedObjectOnBehalfOfRequest> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<BusinessOwnedObjectOnBehalfOfRequest> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<BusinessOwnedObjectOnBehalfOfRequest>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<BusinessOwnedObjectOnBehalfOfRequest>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<BusinessOwnedObjectOnBehalfOfRequest>>() {
           public APINodeList<BusinessOwnedObjectOnBehalfOfRequest> apply(ResponseWrapper result) {
             try {
               return APIRequestGetOnBehalfRequests.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetOnBehalfRequests(String nodeId, APIContext context) {
      super(context, nodeId, "/onbehalf_requests", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetOnBehalfRequests setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetOnBehalfRequests setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetOnBehalfRequests setStatus (BusinessOwnedObjectOnBehalfOfRequest.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestGetOnBehalfRequests setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestGetOnBehalfRequests requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetOnBehalfRequests requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetOnBehalfRequests requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetOnBehalfRequests requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetOnBehalfRequests requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetOnBehalfRequests requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetOnBehalfRequests requestBusinessOwnedObjectField () {
      return this.requestBusinessOwnedObjectField(true);
    }
    public APIRequestGetOnBehalfRequests requestBusinessOwnedObjectField (boolean value) {
      this.requestField("business_owned_object", value);
      return this;
    }
    public APIRequestGetOnBehalfRequests requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetOnBehalfRequests requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetOnBehalfRequests requestReceivingBusinessField () {
      return this.requestReceivingBusinessField(true);
    }
    public APIRequestGetOnBehalfRequests requestReceivingBusinessField (boolean value) {
      this.requestField("receiving_business", value);
      return this;
    }
    public APIRequestGetOnBehalfRequests requestRequestingBusinessField () {
      return this.requestRequestingBusinessField(true);
    }
    public APIRequestGetOnBehalfRequests requestRequestingBusinessField (boolean value) {
      this.requestField("requesting_business", value);
      return this;
    }
    public APIRequestGetOnBehalfRequests requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetOnBehalfRequests requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
  }

  public static class APIRequestCreatePartnerRequest extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "account_ids",
      "category_ids",
      "type",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreatePartnerRequest.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreatePartnerRequest(String nodeId, APIContext context) {
      super(context, nodeId, "/partnerrequests", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreatePartnerRequest setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreatePartnerRequest setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreatePartnerRequest setAccountIds (List<Long> accountIds) {
      this.setParam("account_ids", accountIds);
      return this;
    }
    public APIRequestCreatePartnerRequest setAccountIds (String accountIds) {
      this.setParam("account_ids", accountIds);
      return this;
    }

    public APIRequestCreatePartnerRequest setCategoryIds (List<String> categoryIds) {
      this.setParam("category_ids", categoryIds);
      return this;
    }
    public APIRequestCreatePartnerRequest setCategoryIds (String categoryIds) {
      this.setParam("category_ids", categoryIds);
      return this;
    }

    public APIRequestCreatePartnerRequest setType (EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestCreatePartnerRequest setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestCreatePartnerRequest requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreatePartnerRequest requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePartnerRequest requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreatePartnerRequest requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePartnerRequest requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreatePartnerRequest requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateProductAudience extends APIRequest<CustomAudience> {

    CustomAudience lastResponse = null;
    @Override
    public CustomAudience getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "allowed_domains",
      "associated_audience_id",
      "claim_objective",
      "content_type",
      "creation_params",
      "description",
      "enable_fetch_or_create",
      "event_source_group",
      "event_sources",
      "exclusions",
      "inclusions",
      "is_household",
      "is_household_exclusion",
      "is_snapshot",
      "is_value_based",
      "name",
      "opt_out_link",
      "parent_audience_id",
      "product_set_id",
      "rev_share_policy_id",
      "seed_audience",
      "subtype",
      "tags",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public CustomAudience parseResponse(String response, String header) throws APIException {
      return CustomAudience.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public CustomAudience execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public CustomAudience execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<CustomAudience> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<CustomAudience> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, CustomAudience>() {
           public CustomAudience apply(ResponseWrapper result) {
             try {
               return APIRequestCreateProductAudience.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateProductAudience(String nodeId, APIContext context) {
      super(context, nodeId, "/product_audiences", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateProductAudience setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateProductAudience setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateProductAudience setAllowedDomains (List<String> allowedDomains) {
      this.setParam("allowed_domains", allowedDomains);
      return this;
    }
    public APIRequestCreateProductAudience setAllowedDomains (String allowedDomains) {
      this.setParam("allowed_domains", allowedDomains);
      return this;
    }

    public APIRequestCreateProductAudience setAssociatedAudienceId (Long associatedAudienceId) {
      this.setParam("associated_audience_id", associatedAudienceId);
      return this;
    }
    public APIRequestCreateProductAudience setAssociatedAudienceId (String associatedAudienceId) {
      this.setParam("associated_audience_id", associatedAudienceId);
      return this;
    }

    public APIRequestCreateProductAudience setClaimObjective (AdAccount.EnumClaimObjective claimObjective) {
      this.setParam("claim_objective", claimObjective);
      return this;
    }
    public APIRequestCreateProductAudience setClaimObjective (String claimObjective) {
      this.setParam("claim_objective", claimObjective);
      return this;
    }

    public APIRequestCreateProductAudience setContentType (AdAccount.EnumContentType contentType) {
      this.setParam("content_type", contentType);
      return this;
    }
    public APIRequestCreateProductAudience setContentType (String contentType) {
      this.setParam("content_type", contentType);
      return this;
    }

    public APIRequestCreateProductAudience setCreationParams (Map<String, String> creationParams) {
      this.setParam("creation_params", creationParams);
      return this;
    }
    public APIRequestCreateProductAudience setCreationParams (String creationParams) {
      this.setParam("creation_params", creationParams);
      return this;
    }

    public APIRequestCreateProductAudience setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateProductAudience setEnableFetchOrCreate (Boolean enableFetchOrCreate) {
      this.setParam("enable_fetch_or_create", enableFetchOrCreate);
      return this;
    }
    public APIRequestCreateProductAudience setEnableFetchOrCreate (String enableFetchOrCreate) {
      this.setParam("enable_fetch_or_create", enableFetchOrCreate);
      return this;
    }

    public APIRequestCreateProductAudience setEventSourceGroup (String eventSourceGroup) {
      this.setParam("event_source_group", eventSourceGroup);
      return this;
    }

    public APIRequestCreateProductAudience setEventSources (List<Map<String, String>> eventSources) {
      this.setParam("event_sources", eventSources);
      return this;
    }
    public APIRequestCreateProductAudience setEventSources (String eventSources) {
      this.setParam("event_sources", eventSources);
      return this;
    }

    public APIRequestCreateProductAudience setExclusions (List<Object> exclusions) {
      this.setParam("exclusions", exclusions);
      return this;
    }
    public APIRequestCreateProductAudience setExclusions (String exclusions) {
      this.setParam("exclusions", exclusions);
      return this;
    }

    public APIRequestCreateProductAudience setInclusions (List<Object> inclusions) {
      this.setParam("inclusions", inclusions);
      return this;
    }
    public APIRequestCreateProductAudience setInclusions (String inclusions) {
      this.setParam("inclusions", inclusions);
      return this;
    }

    public APIRequestCreateProductAudience setIsHousehold (Boolean isHousehold) {
      this.setParam("is_household", isHousehold);
      return this;
    }
    public APIRequestCreateProductAudience setIsHousehold (String isHousehold) {
      this.setParam("is_household", isHousehold);
      return this;
    }

    public APIRequestCreateProductAudience setIsHouseholdExclusion (Boolean isHouseholdExclusion) {
      this.setParam("is_household_exclusion", isHouseholdExclusion);
      return this;
    }
    public APIRequestCreateProductAudience setIsHouseholdExclusion (String isHouseholdExclusion) {
      this.setParam("is_household_exclusion", isHouseholdExclusion);
      return this;
    }

    public APIRequestCreateProductAudience setIsSnapshot (Boolean isSnapshot) {
      this.setParam("is_snapshot", isSnapshot);
      return this;
    }
    public APIRequestCreateProductAudience setIsSnapshot (String isSnapshot) {
      this.setParam("is_snapshot", isSnapshot);
      return this;
    }

    public APIRequestCreateProductAudience setIsValueBased (Boolean isValueBased) {
      this.setParam("is_value_based", isValueBased);
      return this;
    }
    public APIRequestCreateProductAudience setIsValueBased (String isValueBased) {
      this.setParam("is_value_based", isValueBased);
      return this;
    }

    public APIRequestCreateProductAudience setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateProductAudience setOptOutLink (String optOutLink) {
      this.setParam("opt_out_link", optOutLink);
      return this;
    }

    public APIRequestCreateProductAudience setParentAudienceId (Long parentAudienceId) {
      this.setParam("parent_audience_id", parentAudienceId);
      return this;
    }
    public APIRequestCreateProductAudience setParentAudienceId (String parentAudienceId) {
      this.setParam("parent_audience_id", parentAudienceId);
      return this;
    }

    public APIRequestCreateProductAudience setProductSetId (String productSetId) {
      this.setParam("product_set_id", productSetId);
      return this;
    }

    public APIRequestCreateProductAudience setRevSharePolicyId (Long revSharePolicyId) {
      this.setParam("rev_share_policy_id", revSharePolicyId);
      return this;
    }
    public APIRequestCreateProductAudience setRevSharePolicyId (String revSharePolicyId) {
      this.setParam("rev_share_policy_id", revSharePolicyId);
      return this;
    }

    public APIRequestCreateProductAudience setSeedAudience (Long seedAudience) {
      this.setParam("seed_audience", seedAudience);
      return this;
    }
    public APIRequestCreateProductAudience setSeedAudience (String seedAudience) {
      this.setParam("seed_audience", seedAudience);
      return this;
    }

    public APIRequestCreateProductAudience setSubtype (AdAccount.EnumSubtype subtype) {
      this.setParam("subtype", subtype);
      return this;
    }
    public APIRequestCreateProductAudience setSubtype (String subtype) {
      this.setParam("subtype", subtype);
      return this;
    }

    public APIRequestCreateProductAudience setTags (List<String> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreateProductAudience setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreateProductAudience requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateProductAudience requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateProductAudience requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateProductAudience requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateProductAudience requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateProductAudience requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetPromotePages extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPromotePages.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPromotePages(String nodeId, APIContext context) {
      super(context, nodeId, "/promote_pages", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPromotePages setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPromotePages setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPromotePages requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPromotePages requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPromotePages requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPromotePages requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPromotePages requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPromotePages requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPromotePages requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetPromotePages requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetPromotePages requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetPromotePages requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetPromotePages requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetPromotePages requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetPromotePages requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetPromotePages requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetPromotePages requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetPromotePages requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetPromotePages requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetPromotePages requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetPromotePages requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetPromotePages requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetPromotePages requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetPromotePages requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetPromotePages requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetPromotePages requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetPromotePages requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetPromotePages requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetPromotePages requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetPromotePages requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetPromotePages requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetPromotePages requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetPromotePages requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetPromotePages requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetPromotePages requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetPromotePages requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetPromotePages requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetPromotePages requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetPromotePages requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetPromotePages requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetPromotePages requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetPromotePages requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetPromotePages requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetPromotePages requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetPromotePages requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetPromotePages requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetPromotePages requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetPromotePages requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetPromotePages requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetPromotePages requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetPromotePages requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetPromotePages requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetPromotePages requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetPromotePages requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetPromotePages requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetPromotePages requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetPromotePages requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetPromotePages requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetPromotePages requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetPromotePages requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetPromotePages requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetPromotePages requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetPromotePages requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetPromotePages requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetPromotePages requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetPromotePages requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetPromotePages requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetPromotePages requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetPromotePages requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetPromotePages requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetPromotePages requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetPromotePages requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetPromotePages requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetPromotePages requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetPromotePages requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetPromotePages requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetPromotePages requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetPromotePages requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetPromotePages requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetPromotePages requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetPromotePages requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetPromotePages requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetPromotePages requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetPromotePages requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetPromotePages requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetPromotePages requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetPromotePages requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetPromotePages requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetPromotePages requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetPromotePages requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetPromotePages requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetPromotePages requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetPromotePages requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetPromotePages requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetPromotePages requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetPromotePages requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetPromotePages requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetPromotePages requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetPromotePages requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetPromotePages requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetPromotePages requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetPromotePages requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetPromotePages requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetPromotePages requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetPromotePages requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetPromotePages requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetPromotePages requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetPromotePages requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetPromotePages requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetPromotePages requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetPromotePages requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetPromotePages requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetPromotePages requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetPromotePages requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetPromotePages requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetPromotePages requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetPromotePages requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetPromotePages requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetPromotePages requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetPromotePages requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetPromotePages requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetPromotePages requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetPromotePages requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetPromotePages requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetPromotePages requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetPromotePages requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetPromotePages requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetPromotePages requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetPromotePages requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetPromotePages requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetPromotePages requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetPromotePages requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetPromotePages requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetPromotePages requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetPromotePages requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetPromotePages requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetPromotePages requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetPromotePages requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetPromotePages requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetPromotePages requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetPromotePages requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetPromotePages requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetPromotePages requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetPromotePages requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetPromotePages requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetPromotePages requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetPromotePages requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetPromotePages requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetPromotePages requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetPromotePages requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetPromotePages requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetPromotePages requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetPromotePages requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetPromotePages requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetPromotePages requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetPromotePages requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetPromotePages requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetPromotePages requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetPromotePages requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetPromotePages requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetPromotePages requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetPromotePages requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetPromotePages requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetPromotePages requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetPromotePages requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetPromotePages requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetPromotePages requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetPromotePages requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetPromotePages requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetPromotePages requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetPromotePages requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetPromotePages requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetPromotePages requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetPromotePages requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetPromotePages requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetPromotePages requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetPromotePages requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetPromotePages requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetPromotePages requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetPromotePages requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetPromotePages requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetPromotePages requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetPromotePages requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetPromotePages requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetPromotePages requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetPromotePages requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetPromotePages requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetPromotePages requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetPromotePages requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetPromotePages requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetPromotePages requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetPromotePages requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetPromotePages requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetPromotePages requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetPromotePages requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetPromotePages requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetPromotePages requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetPromotePages requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetPromotePages requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetPromotePages requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetPromotePages requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetPromotePages requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetPromotePages requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetPromotePages requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetPromotePages requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetPromotePages requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetPromotePages requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetPromotePages requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetPromotePages requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetPromotePages requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetPromotePages requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetPromotePages requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetPromotePages requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetPromotePages requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetPromotePages requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetPromotePages requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetPromotePages requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetPromotePages requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetPromotePages requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetPromotePages requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetPromotePages requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetPromotePages requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetPromotePages requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetPromotePages requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetPromotePages requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetPromotePages requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetPromotePages requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetPromotePages requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetPromotePages requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetPromotePages requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetPromotePages requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetPromotePages requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetPromotePages requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetPromotePages requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetPromotePages requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetPromotePages requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetPromotePages requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetPromotePages requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetPromotePages requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetPromotePages requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetPromotePages requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetPromotePages requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetPromotePages requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetPromotePages requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetPromotePages requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetPromotePages requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetPromotePages requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetPromotePages requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetPromotePages requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetPromotePages requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetPromotePages requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetPromotePages requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetPromotePages requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetPromotePages requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetPromotePages requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetPromotePages requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetPromotePages requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetPromotePages requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetPromotePages requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetPromotePages requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetPromotePages requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetPromotePages requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetPromotePages requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetPromotePages requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetPromotePages requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetPromotePages requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetPromotePages requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetPromotePages requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetPromotePages requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetPromotePages requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetPromotePages requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetPromotePages requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetPromotePages requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetPromotePages requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestGetPublisherBlockLists extends APIRequest<PublisherBlockList> {

    APINodeList<PublisherBlockList> lastResponse = null;
    @Override
    public APINodeList<PublisherBlockList> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "app_publishers",
      "business_owner_id",
      "id",
      "is_auto_blocking_on",
      "is_eligible_at_campaign_level",
      "last_update_time",
      "last_update_user",
      "name",
      "owner_ad_account_id",
      "web_publishers",
    };

    @Override
    public APINodeList<PublisherBlockList> parseResponse(String response, String header) throws APIException {
      return PublisherBlockList.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<PublisherBlockList> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<PublisherBlockList> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<PublisherBlockList>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<PublisherBlockList>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<PublisherBlockList>>() {
           public APINodeList<PublisherBlockList> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPublisherBlockLists.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPublisherBlockLists(String nodeId, APIContext context) {
      super(context, nodeId, "/publisher_block_lists", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPublisherBlockLists setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPublisherBlockLists setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPublisherBlockLists requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPublisherBlockLists requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPublisherBlockLists requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPublisherBlockLists requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPublisherBlockLists requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPublisherBlockLists requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPublisherBlockLists requestAppPublishersField () {
      return this.requestAppPublishersField(true);
    }
    public APIRequestGetPublisherBlockLists requestAppPublishersField (boolean value) {
      this.requestField("app_publishers", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestBusinessOwnerIdField () {
      return this.requestBusinessOwnerIdField(true);
    }
    public APIRequestGetPublisherBlockLists requestBusinessOwnerIdField (boolean value) {
      this.requestField("business_owner_id", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetPublisherBlockLists requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestIsAutoBlockingOnField () {
      return this.requestIsAutoBlockingOnField(true);
    }
    public APIRequestGetPublisherBlockLists requestIsAutoBlockingOnField (boolean value) {
      this.requestField("is_auto_blocking_on", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestIsEligibleAtCampaignLevelField () {
      return this.requestIsEligibleAtCampaignLevelField(true);
    }
    public APIRequestGetPublisherBlockLists requestIsEligibleAtCampaignLevelField (boolean value) {
      this.requestField("is_eligible_at_campaign_level", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestLastUpdateTimeField () {
      return this.requestLastUpdateTimeField(true);
    }
    public APIRequestGetPublisherBlockLists requestLastUpdateTimeField (boolean value) {
      this.requestField("last_update_time", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestLastUpdateUserField () {
      return this.requestLastUpdateUserField(true);
    }
    public APIRequestGetPublisherBlockLists requestLastUpdateUserField (boolean value) {
      this.requestField("last_update_user", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetPublisherBlockLists requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestOwnerAdAccountIdField () {
      return this.requestOwnerAdAccountIdField(true);
    }
    public APIRequestGetPublisherBlockLists requestOwnerAdAccountIdField (boolean value) {
      this.requestField("owner_ad_account_id", value);
      return this;
    }
    public APIRequestGetPublisherBlockLists requestWebPublishersField () {
      return this.requestWebPublishersField(true);
    }
    public APIRequestGetPublisherBlockLists requestWebPublishersField (boolean value) {
      this.requestField("web_publishers", value);
      return this;
    }
  }

  public static class APIRequestCreatePublisherBlockList extends APIRequest<PublisherBlockList> {

    PublisherBlockList lastResponse = null;
    @Override
    public PublisherBlockList getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "name",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public PublisherBlockList parseResponse(String response, String header) throws APIException {
      return PublisherBlockList.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public PublisherBlockList execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public PublisherBlockList execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<PublisherBlockList> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<PublisherBlockList> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, PublisherBlockList>() {
           public PublisherBlockList apply(ResponseWrapper result) {
             try {
               return APIRequestCreatePublisherBlockList.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreatePublisherBlockList(String nodeId, APIContext context) {
      super(context, nodeId, "/publisher_block_lists", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreatePublisherBlockList setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreatePublisherBlockList setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreatePublisherBlockList setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreatePublisherBlockList requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreatePublisherBlockList requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePublisherBlockList requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreatePublisherBlockList requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePublisherBlockList requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreatePublisherBlockList requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetReachEstimate extends APIRequest<ReachEstimate> {

    APINodeList<ReachEstimate> lastResponse = null;
    @Override
    public APINodeList<ReachEstimate> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "adgroup_ids",
      "caller_id",
      "concepts",
      "creative_action_spec",
      "is_debug",
      "object_store_url",
      "targeting_spec",
    };

    public static final String[] FIELDS = {
      "estimate_ready",
      "unsupported",
      "users",
    };

    @Override
    public APINodeList<ReachEstimate> parseResponse(String response, String header) throws APIException {
      return ReachEstimate.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<ReachEstimate> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<ReachEstimate> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<ReachEstimate>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<ReachEstimate>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<ReachEstimate>>() {
           public APINodeList<ReachEstimate> apply(ResponseWrapper result) {
             try {
               return APIRequestGetReachEstimate.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetReachEstimate(String nodeId, APIContext context) {
      super(context, nodeId, "/reachestimate", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetReachEstimate setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetReachEstimate setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetReachEstimate setAdgroupIds (List<String> adgroupIds) {
      this.setParam("adgroup_ids", adgroupIds);
      return this;
    }
    public APIRequestGetReachEstimate setAdgroupIds (String adgroupIds) {
      this.setParam("adgroup_ids", adgroupIds);
      return this;
    }

    public APIRequestGetReachEstimate setCallerId (String callerId) {
      this.setParam("caller_id", callerId);
      return this;
    }

    public APIRequestGetReachEstimate setConcepts (String concepts) {
      this.setParam("concepts", concepts);
      return this;
    }

    public APIRequestGetReachEstimate setCreativeActionSpec (String creativeActionSpec) {
      this.setParam("creative_action_spec", creativeActionSpec);
      return this;
    }

    public APIRequestGetReachEstimate setIsDebug (Boolean isDebug) {
      this.setParam("is_debug", isDebug);
      return this;
    }
    public APIRequestGetReachEstimate setIsDebug (String isDebug) {
      this.setParam("is_debug", isDebug);
      return this;
    }

    public APIRequestGetReachEstimate setObjectStoreUrl (String objectStoreUrl) {
      this.setParam("object_store_url", objectStoreUrl);
      return this;
    }

    public APIRequestGetReachEstimate setTargetingSpec (Targeting targetingSpec) {
      this.setParam("targeting_spec", targetingSpec);
      return this;
    }
    public APIRequestGetReachEstimate setTargetingSpec (String targetingSpec) {
      this.setParam("targeting_spec", targetingSpec);
      return this;
    }

    public APIRequestGetReachEstimate requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetReachEstimate requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetReachEstimate requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetReachEstimate requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetReachEstimate requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetReachEstimate requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetReachEstimate requestEstimateReadyField () {
      return this.requestEstimateReadyField(true);
    }
    public APIRequestGetReachEstimate requestEstimateReadyField (boolean value) {
      this.requestField("estimate_ready", value);
      return this;
    }
    public APIRequestGetReachEstimate requestUnsupportedField () {
      return this.requestUnsupportedField(true);
    }
    public APIRequestGetReachEstimate requestUnsupportedField (boolean value) {
      this.requestField("unsupported", value);
      return this;
    }
    public APIRequestGetReachEstimate requestUsersField () {
      return this.requestUsersField(true);
    }
    public APIRequestGetReachEstimate requestUsersField (boolean value) {
      this.requestField("users", value);
      return this;
    }
  }

  public static class APIRequestGetReachFrequencyPredictions extends APIRequest<ReachFrequencyPrediction> {

    APINodeList<ReachFrequencyPrediction> lastResponse = null;
    @Override
    public APINodeList<ReachFrequencyPrediction> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "activity_status",
      "ad_formats",
      "auction_entry_option_index",
      "business_id",
      "buying_type",
      "campaign_group_id",
      "campaign_id",
      "campaign_time_start",
      "campaign_time_stop",
      "currency",
      "curve_budget_reach",
      "curve_reach",
      "daily_grp_curve",
      "daily_impression_curve",
      "daily_impression_curve_map",
      "day_parting_schedule",
      "demo_breakdown",
      "destination_id",
      "end_time",
      "expiration_time",
      "external_budget",
      "external_impression",
      "external_maximum_budget",
      "external_maximum_impression",
      "external_maximum_reach",
      "external_minimum_budget",
      "external_minimum_impression",
      "external_minimum_reach",
      "external_reach",
      "external_values_breakdown",
      "feed_ratio_0000",
      "frequency_cap",
      "frequency_distribution",
      "frequency_distribution_map",
      "frequency_distribution_map_agg",
      "grp_audience_size",
      "grp_avg_probability_map",
      "grp_country_audience_size",
      "grp_curve",
      "grp_dmas_audience_size",
      "grp_filtering_threshold_00",
      "grp_points",
      "grp_ratio",
      "grp_reach_ratio",
      "grp_status",
      "holdout_percentage",
      "id",
      "impression_curve",
      "instagram_destination_id",
      "instream_packages",
      "interval_frequency_cap",
      "interval_frequency_cap_reset_period",
      "is_bonus_media",
      "is_conversion_goal",
      "is_higher_average_frequency",
      "is_io",
      "is_reserved_buying",
      "is_trp",
      "name",
      "objective",
      "objective_name",
      "pause_periods",
      "placement_breakdown",
      "placement_breakdown_map",
      "plan_name",
      "plan_type",
      "prediction_mode",
      "prediction_progress",
      "reference_id",
      "reservation_status",
      "start_time",
      "status",
      "story_event_type",
      "target_audience_size",
      "target_cpm",
      "target_spec",
      "time_created",
      "time_updated",
      "timezone_id",
      "timezone_name",
      "topline_id",
      "tv_viewer_cluster_map",
      "video_view_benchmark_map",
      "video_view_length_constraint",
      "viewtag",
    };

    @Override
    public APINodeList<ReachFrequencyPrediction> parseResponse(String response, String header) throws APIException {
      return ReachFrequencyPrediction.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<ReachFrequencyPrediction> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<ReachFrequencyPrediction> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<ReachFrequencyPrediction>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<ReachFrequencyPrediction>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<ReachFrequencyPrediction>>() {
           public APINodeList<ReachFrequencyPrediction> apply(ResponseWrapper result) {
             try {
               return APIRequestGetReachFrequencyPredictions.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetReachFrequencyPredictions(String nodeId, APIContext context) {
      super(context, nodeId, "/reachfrequencypredictions", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetReachFrequencyPredictions setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetReachFrequencyPredictions setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetReachFrequencyPredictions requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetReachFrequencyPredictions requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetReachFrequencyPredictions requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetReachFrequencyPredictions requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetReachFrequencyPredictions requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetReachFrequencyPredictions requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetReachFrequencyPredictions requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestActivityStatusField () {
      return this.requestActivityStatusField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestActivityStatusField (boolean value) {
      this.requestField("activity_status", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestAdFormatsField () {
      return this.requestAdFormatsField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestAdFormatsField (boolean value) {
      this.requestField("ad_formats", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestAuctionEntryOptionIndexField () {
      return this.requestAuctionEntryOptionIndexField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestAuctionEntryOptionIndexField (boolean value) {
      this.requestField("auction_entry_option_index", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestBusinessIdField () {
      return this.requestBusinessIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestBusinessIdField (boolean value) {
      this.requestField("business_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestBuyingTypeField () {
      return this.requestBuyingTypeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestBuyingTypeField (boolean value) {
      this.requestField("buying_type", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignGroupIdField () {
      return this.requestCampaignGroupIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignGroupIdField (boolean value) {
      this.requestField("campaign_group_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignIdField () {
      return this.requestCampaignIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignIdField (boolean value) {
      this.requestField("campaign_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignTimeStartField () {
      return this.requestCampaignTimeStartField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignTimeStartField (boolean value) {
      this.requestField("campaign_time_start", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignTimeStopField () {
      return this.requestCampaignTimeStopField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCampaignTimeStopField (boolean value) {
      this.requestField("campaign_time_stop", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCurveBudgetReachField () {
      return this.requestCurveBudgetReachField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCurveBudgetReachField (boolean value) {
      this.requestField("curve_budget_reach", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestCurveReachField () {
      return this.requestCurveReachField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestCurveReachField (boolean value) {
      this.requestField("curve_reach", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestDailyGrpCurveField () {
      return this.requestDailyGrpCurveField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestDailyGrpCurveField (boolean value) {
      this.requestField("daily_grp_curve", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestDailyImpressionCurveField () {
      return this.requestDailyImpressionCurveField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestDailyImpressionCurveField (boolean value) {
      this.requestField("daily_impression_curve", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestDailyImpressionCurveMapField () {
      return this.requestDailyImpressionCurveMapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestDailyImpressionCurveMapField (boolean value) {
      this.requestField("daily_impression_curve_map", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestDayPartingScheduleField () {
      return this.requestDayPartingScheduleField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestDayPartingScheduleField (boolean value) {
      this.requestField("day_parting_schedule", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestDemoBreakdownField () {
      return this.requestDemoBreakdownField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestDemoBreakdownField (boolean value) {
      this.requestField("demo_breakdown", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestDestinationIdField () {
      return this.requestDestinationIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestDestinationIdField (boolean value) {
      this.requestField("destination_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExpirationTimeField () {
      return this.requestExpirationTimeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExpirationTimeField (boolean value) {
      this.requestField("expiration_time", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalBudgetField () {
      return this.requestExternalBudgetField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalBudgetField (boolean value) {
      this.requestField("external_budget", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalImpressionField () {
      return this.requestExternalImpressionField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalImpressionField (boolean value) {
      this.requestField("external_impression", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMaximumBudgetField () {
      return this.requestExternalMaximumBudgetField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMaximumBudgetField (boolean value) {
      this.requestField("external_maximum_budget", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMaximumImpressionField () {
      return this.requestExternalMaximumImpressionField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMaximumImpressionField (boolean value) {
      this.requestField("external_maximum_impression", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMaximumReachField () {
      return this.requestExternalMaximumReachField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMaximumReachField (boolean value) {
      this.requestField("external_maximum_reach", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMinimumBudgetField () {
      return this.requestExternalMinimumBudgetField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMinimumBudgetField (boolean value) {
      this.requestField("external_minimum_budget", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMinimumImpressionField () {
      return this.requestExternalMinimumImpressionField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMinimumImpressionField (boolean value) {
      this.requestField("external_minimum_impression", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMinimumReachField () {
      return this.requestExternalMinimumReachField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalMinimumReachField (boolean value) {
      this.requestField("external_minimum_reach", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalReachField () {
      return this.requestExternalReachField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalReachField (boolean value) {
      this.requestField("external_reach", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestExternalValuesBreakdownField () {
      return this.requestExternalValuesBreakdownField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestExternalValuesBreakdownField (boolean value) {
      this.requestField("external_values_breakdown", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestFeedRatio0000Field () {
      return this.requestFeedRatio0000Field(true);
    }
    public APIRequestGetReachFrequencyPredictions requestFeedRatio0000Field (boolean value) {
      this.requestField("feed_ratio_0000", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyCapField () {
      return this.requestFrequencyCapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyCapField (boolean value) {
      this.requestField("frequency_cap", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyDistributionField () {
      return this.requestFrequencyDistributionField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyDistributionField (boolean value) {
      this.requestField("frequency_distribution", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyDistributionMapField () {
      return this.requestFrequencyDistributionMapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyDistributionMapField (boolean value) {
      this.requestField("frequency_distribution_map", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyDistributionMapAggField () {
      return this.requestFrequencyDistributionMapAggField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestFrequencyDistributionMapAggField (boolean value) {
      this.requestField("frequency_distribution_map_agg", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpAudienceSizeField () {
      return this.requestGrpAudienceSizeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpAudienceSizeField (boolean value) {
      this.requestField("grp_audience_size", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpAvgProbabilityMapField () {
      return this.requestGrpAvgProbabilityMapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpAvgProbabilityMapField (boolean value) {
      this.requestField("grp_avg_probability_map", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpCountryAudienceSizeField () {
      return this.requestGrpCountryAudienceSizeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpCountryAudienceSizeField (boolean value) {
      this.requestField("grp_country_audience_size", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpCurveField () {
      return this.requestGrpCurveField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpCurveField (boolean value) {
      this.requestField("grp_curve", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpDmasAudienceSizeField () {
      return this.requestGrpDmasAudienceSizeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpDmasAudienceSizeField (boolean value) {
      this.requestField("grp_dmas_audience_size", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpFilteringThreshold00Field () {
      return this.requestGrpFilteringThreshold00Field(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpFilteringThreshold00Field (boolean value) {
      this.requestField("grp_filtering_threshold_00", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpPointsField () {
      return this.requestGrpPointsField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpPointsField (boolean value) {
      this.requestField("grp_points", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpRatioField () {
      return this.requestGrpRatioField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpRatioField (boolean value) {
      this.requestField("grp_ratio", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpReachRatioField () {
      return this.requestGrpReachRatioField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpReachRatioField (boolean value) {
      this.requestField("grp_reach_ratio", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestGrpStatusField () {
      return this.requestGrpStatusField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestGrpStatusField (boolean value) {
      this.requestField("grp_status", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestHoldoutPercentageField () {
      return this.requestHoldoutPercentageField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestHoldoutPercentageField (boolean value) {
      this.requestField("holdout_percentage", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestImpressionCurveField () {
      return this.requestImpressionCurveField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestImpressionCurveField (boolean value) {
      this.requestField("impression_curve", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestInstagramDestinationIdField () {
      return this.requestInstagramDestinationIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestInstagramDestinationIdField (boolean value) {
      this.requestField("instagram_destination_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestInstreamPackagesField () {
      return this.requestInstreamPackagesField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestInstreamPackagesField (boolean value) {
      this.requestField("instream_packages", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIntervalFrequencyCapField () {
      return this.requestIntervalFrequencyCapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIntervalFrequencyCapField (boolean value) {
      this.requestField("interval_frequency_cap", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIntervalFrequencyCapResetPeriodField () {
      return this.requestIntervalFrequencyCapResetPeriodField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIntervalFrequencyCapResetPeriodField (boolean value) {
      this.requestField("interval_frequency_cap_reset_period", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIsBonusMediaField () {
      return this.requestIsBonusMediaField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIsBonusMediaField (boolean value) {
      this.requestField("is_bonus_media", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIsConversionGoalField () {
      return this.requestIsConversionGoalField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIsConversionGoalField (boolean value) {
      this.requestField("is_conversion_goal", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIsHigherAverageFrequencyField () {
      return this.requestIsHigherAverageFrequencyField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIsHigherAverageFrequencyField (boolean value) {
      this.requestField("is_higher_average_frequency", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIsIoField () {
      return this.requestIsIoField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIsIoField (boolean value) {
      this.requestField("is_io", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIsReservedBuyingField () {
      return this.requestIsReservedBuyingField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIsReservedBuyingField (boolean value) {
      this.requestField("is_reserved_buying", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestIsTrpField () {
      return this.requestIsTrpField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestIsTrpField (boolean value) {
      this.requestField("is_trp", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestObjectiveField () {
      return this.requestObjectiveField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestObjectiveField (boolean value) {
      this.requestField("objective", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestObjectiveNameField () {
      return this.requestObjectiveNameField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestObjectiveNameField (boolean value) {
      this.requestField("objective_name", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPausePeriodsField () {
      return this.requestPausePeriodsField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPausePeriodsField (boolean value) {
      this.requestField("pause_periods", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPlacementBreakdownField () {
      return this.requestPlacementBreakdownField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPlacementBreakdownField (boolean value) {
      this.requestField("placement_breakdown", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPlacementBreakdownMapField () {
      return this.requestPlacementBreakdownMapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPlacementBreakdownMapField (boolean value) {
      this.requestField("placement_breakdown_map", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPlanNameField () {
      return this.requestPlanNameField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPlanNameField (boolean value) {
      this.requestField("plan_name", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPlanTypeField () {
      return this.requestPlanTypeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPlanTypeField (boolean value) {
      this.requestField("plan_type", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPredictionModeField () {
      return this.requestPredictionModeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPredictionModeField (boolean value) {
      this.requestField("prediction_mode", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestPredictionProgressField () {
      return this.requestPredictionProgressField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestPredictionProgressField (boolean value) {
      this.requestField("prediction_progress", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestReferenceIdField () {
      return this.requestReferenceIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestReferenceIdField (boolean value) {
      this.requestField("reference_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestReservationStatusField () {
      return this.requestReservationStatusField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestReservationStatusField (boolean value) {
      this.requestField("reservation_status", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestStoryEventTypeField () {
      return this.requestStoryEventTypeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestStoryEventTypeField (boolean value) {
      this.requestField("story_event_type", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTargetAudienceSizeField () {
      return this.requestTargetAudienceSizeField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTargetAudienceSizeField (boolean value) {
      this.requestField("target_audience_size", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTargetCpmField () {
      return this.requestTargetCpmField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTargetCpmField (boolean value) {
      this.requestField("target_cpm", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTargetSpecField () {
      return this.requestTargetSpecField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTargetSpecField (boolean value) {
      this.requestField("target_spec", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTimeCreatedField () {
      return this.requestTimeCreatedField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTimeCreatedField (boolean value) {
      this.requestField("time_created", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTimeUpdatedField () {
      return this.requestTimeUpdatedField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTimeUpdatedField (boolean value) {
      this.requestField("time_updated", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTimezoneNameField () {
      return this.requestTimezoneNameField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTimezoneNameField (boolean value) {
      this.requestField("timezone_name", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestToplineIdField () {
      return this.requestToplineIdField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestToplineIdField (boolean value) {
      this.requestField("topline_id", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestTvViewerClusterMapField () {
      return this.requestTvViewerClusterMapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestTvViewerClusterMapField (boolean value) {
      this.requestField("tv_viewer_cluster_map", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestVideoViewBenchmarkMapField () {
      return this.requestVideoViewBenchmarkMapField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestVideoViewBenchmarkMapField (boolean value) {
      this.requestField("video_view_benchmark_map", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestVideoViewLengthConstraintField () {
      return this.requestVideoViewLengthConstraintField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestVideoViewLengthConstraintField (boolean value) {
      this.requestField("video_view_length_constraint", value);
      return this;
    }
    public APIRequestGetReachFrequencyPredictions requestViewtagField () {
      return this.requestViewtagField(true);
    }
    public APIRequestGetReachFrequencyPredictions requestViewtagField (boolean value) {
      this.requestField("viewtag", value);
      return this;
    }
  }

  public static class APIRequestCreateReachFrequencyPrediction extends APIRequest<ReachFrequencyPrediction> {

    ReachFrequencyPrediction lastResponse = null;
    @Override
    public ReachFrequencyPrediction getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action",
      "ad_formats",
      "auction_entry_option_index",
      "budget",
      "buying_type",
      "campaign_group_id",
      "day_parting_schedule",
      "deal_id",
      "destination_id",
      "destination_ids",
      "end_time",
      "exceptions",
      "existing_campaign_id",
      "expiration_time",
      "frequency_cap",
      "grp_buying",
      "impression",
      "instream_packages",
      "interval_frequency_cap_reset_period",
      "is_bonus_media",
      "is_conversion_goal",
      "is_full_view",
      "is_higher_average_frequency",
      "is_reach_and_frequency_io_buying",
      "is_reserved_buying",
      "num_curve_points",
      "objective",
      "prediction_mode",
      "reach",
      "rf_prediction_id",
      "rf_prediction_id_to_release",
      "rf_prediction_id_to_share",
      "start_time",
      "stop_time",
      "story_event_type",
      "target_cpm",
      "target_spec",
      "video_view_length_constraint",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public ReachFrequencyPrediction parseResponse(String response, String header) throws APIException {
      return ReachFrequencyPrediction.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public ReachFrequencyPrediction execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public ReachFrequencyPrediction execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<ReachFrequencyPrediction> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<ReachFrequencyPrediction> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, ReachFrequencyPrediction>() {
           public ReachFrequencyPrediction apply(ResponseWrapper result) {
             try {
               return APIRequestCreateReachFrequencyPrediction.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateReachFrequencyPrediction(String nodeId, APIContext context) {
      super(context, nodeId, "/reachfrequencypredictions", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateReachFrequencyPrediction setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateReachFrequencyPrediction setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateReachFrequencyPrediction setAction (ReachFrequencyPrediction.EnumAction action) {
      this.setParam("action", action);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setAction (String action) {
      this.setParam("action", action);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setAdFormats (List<Map<String, String>> adFormats) {
      this.setParam("ad_formats", adFormats);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setAdFormats (String adFormats) {
      this.setParam("ad_formats", adFormats);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setAuctionEntryOptionIndex (Long auctionEntryOptionIndex) {
      this.setParam("auction_entry_option_index", auctionEntryOptionIndex);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setAuctionEntryOptionIndex (String auctionEntryOptionIndex) {
      this.setParam("auction_entry_option_index", auctionEntryOptionIndex);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setBudget (Long budget) {
      this.setParam("budget", budget);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setBudget (String budget) {
      this.setParam("budget", budget);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setBuyingType (ReachFrequencyPrediction.EnumBuyingType buyingType) {
      this.setParam("buying_type", buyingType);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setBuyingType (String buyingType) {
      this.setParam("buying_type", buyingType);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setCampaignGroupId (String campaignGroupId) {
      this.setParam("campaign_group_id", campaignGroupId);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setDayPartingSchedule (List<Object> dayPartingSchedule) {
      this.setParam("day_parting_schedule", dayPartingSchedule);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setDayPartingSchedule (String dayPartingSchedule) {
      this.setParam("day_parting_schedule", dayPartingSchedule);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setDealId (String dealId) {
      this.setParam("deal_id", dealId);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setDestinationId (Long destinationId) {
      this.setParam("destination_id", destinationId);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setDestinationId (String destinationId) {
      this.setParam("destination_id", destinationId);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setDestinationIds (List<String> destinationIds) {
      this.setParam("destination_ids", destinationIds);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setDestinationIds (String destinationIds) {
      this.setParam("destination_ids", destinationIds);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setEndTime (Long endTime) {
      this.setParam("end_time", endTime);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setEndTime (String endTime) {
      this.setParam("end_time", endTime);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setExceptions (Boolean exceptions) {
      this.setParam("exceptions", exceptions);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setExceptions (String exceptions) {
      this.setParam("exceptions", exceptions);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setExistingCampaignId (String existingCampaignId) {
      this.setParam("existing_campaign_id", existingCampaignId);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setExpirationTime (Long expirationTime) {
      this.setParam("expiration_time", expirationTime);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setExpirationTime (String expirationTime) {
      this.setParam("expiration_time", expirationTime);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setFrequencyCap (Long frequencyCap) {
      this.setParam("frequency_cap", frequencyCap);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setFrequencyCap (String frequencyCap) {
      this.setParam("frequency_cap", frequencyCap);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setGrpBuying (Boolean grpBuying) {
      this.setParam("grp_buying", grpBuying);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setGrpBuying (String grpBuying) {
      this.setParam("grp_buying", grpBuying);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setImpression (Long impression) {
      this.setParam("impression", impression);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setImpression (String impression) {
      this.setParam("impression", impression);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setInstreamPackages (List<ReachFrequencyPrediction.EnumInstreamPackages> instreamPackages) {
      this.setParam("instream_packages", instreamPackages);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setInstreamPackages (String instreamPackages) {
      this.setParam("instream_packages", instreamPackages);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIntervalFrequencyCapResetPeriod (Long intervalFrequencyCapResetPeriod) {
      this.setParam("interval_frequency_cap_reset_period", intervalFrequencyCapResetPeriod);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIntervalFrequencyCapResetPeriod (String intervalFrequencyCapResetPeriod) {
      this.setParam("interval_frequency_cap_reset_period", intervalFrequencyCapResetPeriod);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIsBonusMedia (Boolean isBonusMedia) {
      this.setParam("is_bonus_media", isBonusMedia);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIsBonusMedia (String isBonusMedia) {
      this.setParam("is_bonus_media", isBonusMedia);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIsConversionGoal (Boolean isConversionGoal) {
      this.setParam("is_conversion_goal", isConversionGoal);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIsConversionGoal (String isConversionGoal) {
      this.setParam("is_conversion_goal", isConversionGoal);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIsFullView (Boolean isFullView) {
      this.setParam("is_full_view", isFullView);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIsFullView (String isFullView) {
      this.setParam("is_full_view", isFullView);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIsHigherAverageFrequency (Boolean isHigherAverageFrequency) {
      this.setParam("is_higher_average_frequency", isHigherAverageFrequency);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIsHigherAverageFrequency (String isHigherAverageFrequency) {
      this.setParam("is_higher_average_frequency", isHigherAverageFrequency);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIsReachAndFrequencyIoBuying (Boolean isReachAndFrequencyIoBuying) {
      this.setParam("is_reach_and_frequency_io_buying", isReachAndFrequencyIoBuying);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIsReachAndFrequencyIoBuying (String isReachAndFrequencyIoBuying) {
      this.setParam("is_reach_and_frequency_io_buying", isReachAndFrequencyIoBuying);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setIsReservedBuying (Boolean isReservedBuying) {
      this.setParam("is_reserved_buying", isReservedBuying);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setIsReservedBuying (String isReservedBuying) {
      this.setParam("is_reserved_buying", isReservedBuying);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setNumCurvePoints (Long numCurvePoints) {
      this.setParam("num_curve_points", numCurvePoints);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setNumCurvePoints (String numCurvePoints) {
      this.setParam("num_curve_points", numCurvePoints);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setObjective (String objective) {
      this.setParam("objective", objective);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setPredictionMode (Long predictionMode) {
      this.setParam("prediction_mode", predictionMode);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setPredictionMode (String predictionMode) {
      this.setParam("prediction_mode", predictionMode);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setReach (Long reach) {
      this.setParam("reach", reach);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setReach (String reach) {
      this.setParam("reach", reach);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setRfPredictionId (String rfPredictionId) {
      this.setParam("rf_prediction_id", rfPredictionId);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setRfPredictionIdToRelease (String rfPredictionIdToRelease) {
      this.setParam("rf_prediction_id_to_release", rfPredictionIdToRelease);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setRfPredictionIdToShare (String rfPredictionIdToShare) {
      this.setParam("rf_prediction_id_to_share", rfPredictionIdToShare);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setStartTime (Long startTime) {
      this.setParam("start_time", startTime);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setStartTime (String startTime) {
      this.setParam("start_time", startTime);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setStopTime (Long stopTime) {
      this.setParam("stop_time", stopTime);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setStopTime (String stopTime) {
      this.setParam("stop_time", stopTime);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setStoryEventType (Long storyEventType) {
      this.setParam("story_event_type", storyEventType);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setStoryEventType (String storyEventType) {
      this.setParam("story_event_type", storyEventType);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setTargetCpm (Long targetCpm) {
      this.setParam("target_cpm", targetCpm);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setTargetCpm (String targetCpm) {
      this.setParam("target_cpm", targetCpm);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setTargetSpec (Targeting targetSpec) {
      this.setParam("target_spec", targetSpec);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setTargetSpec (String targetSpec) {
      this.setParam("target_spec", targetSpec);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction setVideoViewLengthConstraint (Long videoViewLengthConstraint) {
      this.setParam("video_view_length_constraint", videoViewLengthConstraint);
      return this;
    }
    public APIRequestCreateReachFrequencyPrediction setVideoViewLengthConstraint (String videoViewLengthConstraint) {
      this.setParam("video_view_length_constraint", videoViewLengthConstraint);
      return this;
    }

    public APIRequestCreateReachFrequencyPrediction requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateReachFrequencyPrediction requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateReachFrequencyPrediction requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateReachFrequencyPrediction requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateReachFrequencyPrediction requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateReachFrequencyPrediction requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetRoas extends APIRequest<AdAccountRoas> {

    APINodeList<AdAccountRoas> lastResponse = null;
    @Override
    public APINodeList<AdAccountRoas> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "fields",
      "filtering",
      "time_increment",
      "time_range",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<AdAccountRoas> parseResponse(String response, String header) throws APIException {
      return AdAccountRoas.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountRoas> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountRoas> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountRoas>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountRoas>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountRoas>>() {
           public APINodeList<AdAccountRoas> apply(ResponseWrapper result) {
             try {
               return APIRequestGetRoas.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetRoas(String nodeId, APIContext context) {
      super(context, nodeId, "/roas", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetRoas setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetRoas setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetRoas setFields (List<String> fields) {
      this.setParam("fields", fields);
      return this;
    }
    public APIRequestGetRoas setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGetRoas setFiltering (List<Object> filtering) {
      this.setParam("filtering", filtering);
      return this;
    }
    public APIRequestGetRoas setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestGetRoas setTimeIncrement (String timeIncrement) {
      this.setParam("time_increment", timeIncrement);
      return this;
    }

    public APIRequestGetRoas setTimeRange (Object timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }
    public APIRequestGetRoas setTimeRange (String timeRange) {
      this.setParam("time_range", timeRange);
      return this;
    }

    public APIRequestGetRoas requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetRoas requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetRoas requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetRoas requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetRoas requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetRoas requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetSavedAudiences extends APIRequest<SavedAudience> {

    APINodeList<SavedAudience> lastResponse = null;
    @Override
    public APINodeList<SavedAudience> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business_id",
      "fields",
      "filtering",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<SavedAudience> parseResponse(String response, String header) throws APIException {
      return SavedAudience.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<SavedAudience> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<SavedAudience> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<SavedAudience>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<SavedAudience>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<SavedAudience>>() {
           public APINodeList<SavedAudience> apply(ResponseWrapper result) {
             try {
               return APIRequestGetSavedAudiences.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetSavedAudiences(String nodeId, APIContext context) {
      super(context, nodeId, "/saved_audiences", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetSavedAudiences setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetSavedAudiences setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetSavedAudiences setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetSavedAudiences setFields (List<String> fields) {
      this.setParam("fields", fields);
      return this;
    }
    public APIRequestGetSavedAudiences setFields (String fields) {
      this.setParam("fields", fields);
      return this;
    }

    public APIRequestGetSavedAudiences setFiltering (List<Object> filtering) {
      this.setParam("filtering", filtering);
      return this;
    }
    public APIRequestGetSavedAudiences setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestGetSavedAudiences requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetSavedAudiences requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetSavedAudiences requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetSavedAudiences requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetSavedAudiences requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetSavedAudiences requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateSponsoredMessageAd extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "bid_amount",
      "daily_budget",
      "message_creative_id",
      "targeting",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateSponsoredMessageAd.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateSponsoredMessageAd(String nodeId, APIContext context) {
      super(context, nodeId, "/sponsored_message_ads", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateSponsoredMessageAd setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateSponsoredMessageAd setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateSponsoredMessageAd setBidAmount (Long bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }
    public APIRequestCreateSponsoredMessageAd setBidAmount (String bidAmount) {
      this.setParam("bid_amount", bidAmount);
      return this;
    }

    public APIRequestCreateSponsoredMessageAd setDailyBudget (Long dailyBudget) {
      this.setParam("daily_budget", dailyBudget);
      return this;
    }
    public APIRequestCreateSponsoredMessageAd setDailyBudget (String dailyBudget) {
      this.setParam("daily_budget", dailyBudget);
      return this;
    }

    public APIRequestCreateSponsoredMessageAd setMessageCreativeId (String messageCreativeId) {
      this.setParam("message_creative_id", messageCreativeId);
      return this;
    }

    public APIRequestCreateSponsoredMessageAd setTargeting (Targeting targeting) {
      this.setParam("targeting", targeting);
      return this;
    }
    public APIRequestCreateSponsoredMessageAd setTargeting (String targeting) {
      this.setParam("targeting", targeting);
      return this;
    }

    public APIRequestCreateSponsoredMessageAd requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateSponsoredMessageAd requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateSponsoredMessageAd requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateSponsoredMessageAd requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateSponsoredMessageAd requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateSponsoredMessageAd requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetTargetingBrowse extends APIRequest<AdAccountTargetingUnified> {

    APINodeList<AdAccountTargetingUnified> lastResponse = null;
    @Override
    public APINodeList<AdAccountTargetingUnified> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "excluded_category",
      "include_nodes",
      "is_exclusion",
      "limit_type",
      "regulated_categories",
      "whitelisted_types",
    };

    public static final String[] FIELDS = {
      "audience_size",
      "conversion_lift",
      "description",
      "id",
      "img",
      "info",
      "info_title",
      "is_recommendation",
      "key",
      "link",
      "name",
      "parent",
      "partner",
      "path",
      "performance_rating",
      "raw_name",
      "recommendation_model",
      "search_interest_id",
      "source",
      "spend",
      "type",
      "valid",
    };

    @Override
    public APINodeList<AdAccountTargetingUnified> parseResponse(String response, String header) throws APIException {
      return AdAccountTargetingUnified.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountTargetingUnified>>() {
           public APINodeList<AdAccountTargetingUnified> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTargetingBrowse.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTargetingBrowse(String nodeId, APIContext context) {
      super(context, nodeId, "/targetingbrowse", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTargetingBrowse setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTargetingBrowse setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTargetingBrowse setExcludedCategory (String excludedCategory) {
      this.setParam("excluded_category", excludedCategory);
      return this;
    }

    public APIRequestGetTargetingBrowse setIncludeNodes (Boolean includeNodes) {
      this.setParam("include_nodes", includeNodes);
      return this;
    }
    public APIRequestGetTargetingBrowse setIncludeNodes (String includeNodes) {
      this.setParam("include_nodes", includeNodes);
      return this;
    }

    public APIRequestGetTargetingBrowse setIsExclusion (Boolean isExclusion) {
      this.setParam("is_exclusion", isExclusion);
      return this;
    }
    public APIRequestGetTargetingBrowse setIsExclusion (String isExclusion) {
      this.setParam("is_exclusion", isExclusion);
      return this;
    }

    public APIRequestGetTargetingBrowse setLimitType (AdAccountTargetingUnified.EnumLimitType limitType) {
      this.setParam("limit_type", limitType);
      return this;
    }
    public APIRequestGetTargetingBrowse setLimitType (String limitType) {
      this.setParam("limit_type", limitType);
      return this;
    }

    public APIRequestGetTargetingBrowse setRegulatedCategories (List<AdAccountTargetingUnified.EnumRegulatedCategories> regulatedCategories) {
      this.setParam("regulated_categories", regulatedCategories);
      return this;
    }
    public APIRequestGetTargetingBrowse setRegulatedCategories (String regulatedCategories) {
      this.setParam("regulated_categories", regulatedCategories);
      return this;
    }

    public APIRequestGetTargetingBrowse setWhitelistedTypes (List<AdAccountTargetingUnified.EnumWhitelistedTypes> whitelistedTypes) {
      this.setParam("whitelisted_types", whitelistedTypes);
      return this;
    }
    public APIRequestGetTargetingBrowse setWhitelistedTypes (String whitelistedTypes) {
      this.setParam("whitelisted_types", whitelistedTypes);
      return this;
    }

    public APIRequestGetTargetingBrowse requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTargetingBrowse requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingBrowse requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTargetingBrowse requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingBrowse requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTargetingBrowse requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTargetingBrowse requestAudienceSizeField () {
      return this.requestAudienceSizeField(true);
    }
    public APIRequestGetTargetingBrowse requestAudienceSizeField (boolean value) {
      this.requestField("audience_size", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestConversionLiftField () {
      return this.requestConversionLiftField(true);
    }
    public APIRequestGetTargetingBrowse requestConversionLiftField (boolean value) {
      this.requestField("conversion_lift", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetTargetingBrowse requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTargetingBrowse requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestImgField () {
      return this.requestImgField(true);
    }
    public APIRequestGetTargetingBrowse requestImgField (boolean value) {
      this.requestField("img", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestInfoField () {
      return this.requestInfoField(true);
    }
    public APIRequestGetTargetingBrowse requestInfoField (boolean value) {
      this.requestField("info", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestInfoTitleField () {
      return this.requestInfoTitleField(true);
    }
    public APIRequestGetTargetingBrowse requestInfoTitleField (boolean value) {
      this.requestField("info_title", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestIsRecommendationField () {
      return this.requestIsRecommendationField(true);
    }
    public APIRequestGetTargetingBrowse requestIsRecommendationField (boolean value) {
      this.requestField("is_recommendation", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestKeyField () {
      return this.requestKeyField(true);
    }
    public APIRequestGetTargetingBrowse requestKeyField (boolean value) {
      this.requestField("key", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetTargetingBrowse requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetTargetingBrowse requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestParentField () {
      return this.requestParentField(true);
    }
    public APIRequestGetTargetingBrowse requestParentField (boolean value) {
      this.requestField("parent", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetTargetingBrowse requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestPathField () {
      return this.requestPathField(true);
    }
    public APIRequestGetTargetingBrowse requestPathField (boolean value) {
      this.requestField("path", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestPerformanceRatingField () {
      return this.requestPerformanceRatingField(true);
    }
    public APIRequestGetTargetingBrowse requestPerformanceRatingField (boolean value) {
      this.requestField("performance_rating", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestRawNameField () {
      return this.requestRawNameField(true);
    }
    public APIRequestGetTargetingBrowse requestRawNameField (boolean value) {
      this.requestField("raw_name", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestRecommendationModelField () {
      return this.requestRecommendationModelField(true);
    }
    public APIRequestGetTargetingBrowse requestRecommendationModelField (boolean value) {
      this.requestField("recommendation_model", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestSearchInterestIdField () {
      return this.requestSearchInterestIdField(true);
    }
    public APIRequestGetTargetingBrowse requestSearchInterestIdField (boolean value) {
      this.requestField("search_interest_id", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetTargetingBrowse requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestSpendField () {
      return this.requestSpendField(true);
    }
    public APIRequestGetTargetingBrowse requestSpendField (boolean value) {
      this.requestField("spend", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetTargetingBrowse requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetTargetingBrowse requestValidField () {
      return this.requestValidField(true);
    }
    public APIRequestGetTargetingBrowse requestValidField (boolean value) {
      this.requestField("valid", value);
      return this;
    }
  }

  public static class APIRequestGetTargetingSearch extends APIRequest<AdAccountTargetingUnified> {

    APINodeList<AdAccountTargetingUnified> lastResponse = null;
    @Override
    public APINodeList<AdAccountTargetingUnified> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "allow_only_fat_head_interests",
      "countries",
      "is_exclusion",
      "limit_type",
      "q",
      "regulated_categories",
      "session_id",
      "targeting_list",
      "whitelisted_types",
    };

    public static final String[] FIELDS = {
      "audience_size",
      "conversion_lift",
      "description",
      "id",
      "img",
      "info",
      "info_title",
      "is_recommendation",
      "key",
      "link",
      "name",
      "parent",
      "partner",
      "path",
      "performance_rating",
      "raw_name",
      "recommendation_model",
      "search_interest_id",
      "source",
      "spend",
      "type",
      "valid",
    };

    @Override
    public APINodeList<AdAccountTargetingUnified> parseResponse(String response, String header) throws APIException {
      return AdAccountTargetingUnified.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountTargetingUnified>>() {
           public APINodeList<AdAccountTargetingUnified> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTargetingSearch.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTargetingSearch(String nodeId, APIContext context) {
      super(context, nodeId, "/targetingsearch", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTargetingSearch setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTargetingSearch setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTargetingSearch setAllowOnlyFatHeadInterests (Boolean allowOnlyFatHeadInterests) {
      this.setParam("allow_only_fat_head_interests", allowOnlyFatHeadInterests);
      return this;
    }
    public APIRequestGetTargetingSearch setAllowOnlyFatHeadInterests (String allowOnlyFatHeadInterests) {
      this.setParam("allow_only_fat_head_interests", allowOnlyFatHeadInterests);
      return this;
    }

    public APIRequestGetTargetingSearch setCountries (List<String> countries) {
      this.setParam("countries", countries);
      return this;
    }
    public APIRequestGetTargetingSearch setCountries (String countries) {
      this.setParam("countries", countries);
      return this;
    }

    public APIRequestGetTargetingSearch setIsExclusion (Boolean isExclusion) {
      this.setParam("is_exclusion", isExclusion);
      return this;
    }
    public APIRequestGetTargetingSearch setIsExclusion (String isExclusion) {
      this.setParam("is_exclusion", isExclusion);
      return this;
    }

    public APIRequestGetTargetingSearch setLimitType (AdAccountTargetingUnified.EnumLimitType limitType) {
      this.setParam("limit_type", limitType);
      return this;
    }
    public APIRequestGetTargetingSearch setLimitType (String limitType) {
      this.setParam("limit_type", limitType);
      return this;
    }

    public APIRequestGetTargetingSearch setQ (String q) {
      this.setParam("q", q);
      return this;
    }

    public APIRequestGetTargetingSearch setRegulatedCategories (List<AdAccountTargetingUnified.EnumRegulatedCategories> regulatedCategories) {
      this.setParam("regulated_categories", regulatedCategories);
      return this;
    }
    public APIRequestGetTargetingSearch setRegulatedCategories (String regulatedCategories) {
      this.setParam("regulated_categories", regulatedCategories);
      return this;
    }

    public APIRequestGetTargetingSearch setSessionId (Long sessionId) {
      this.setParam("session_id", sessionId);
      return this;
    }
    public APIRequestGetTargetingSearch setSessionId (String sessionId) {
      this.setParam("session_id", sessionId);
      return this;
    }

    public APIRequestGetTargetingSearch setTargetingList (List<Object> targetingList) {
      this.setParam("targeting_list", targetingList);
      return this;
    }
    public APIRequestGetTargetingSearch setTargetingList (String targetingList) {
      this.setParam("targeting_list", targetingList);
      return this;
    }

    public APIRequestGetTargetingSearch setWhitelistedTypes (List<AdAccountTargetingUnified.EnumWhitelistedTypes> whitelistedTypes) {
      this.setParam("whitelisted_types", whitelistedTypes);
      return this;
    }
    public APIRequestGetTargetingSearch setWhitelistedTypes (String whitelistedTypes) {
      this.setParam("whitelisted_types", whitelistedTypes);
      return this;
    }

    public APIRequestGetTargetingSearch requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTargetingSearch requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingSearch requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTargetingSearch requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingSearch requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTargetingSearch requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTargetingSearch requestAudienceSizeField () {
      return this.requestAudienceSizeField(true);
    }
    public APIRequestGetTargetingSearch requestAudienceSizeField (boolean value) {
      this.requestField("audience_size", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestConversionLiftField () {
      return this.requestConversionLiftField(true);
    }
    public APIRequestGetTargetingSearch requestConversionLiftField (boolean value) {
      this.requestField("conversion_lift", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetTargetingSearch requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTargetingSearch requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestImgField () {
      return this.requestImgField(true);
    }
    public APIRequestGetTargetingSearch requestImgField (boolean value) {
      this.requestField("img", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestInfoField () {
      return this.requestInfoField(true);
    }
    public APIRequestGetTargetingSearch requestInfoField (boolean value) {
      this.requestField("info", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestInfoTitleField () {
      return this.requestInfoTitleField(true);
    }
    public APIRequestGetTargetingSearch requestInfoTitleField (boolean value) {
      this.requestField("info_title", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestIsRecommendationField () {
      return this.requestIsRecommendationField(true);
    }
    public APIRequestGetTargetingSearch requestIsRecommendationField (boolean value) {
      this.requestField("is_recommendation", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestKeyField () {
      return this.requestKeyField(true);
    }
    public APIRequestGetTargetingSearch requestKeyField (boolean value) {
      this.requestField("key", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetTargetingSearch requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetTargetingSearch requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestParentField () {
      return this.requestParentField(true);
    }
    public APIRequestGetTargetingSearch requestParentField (boolean value) {
      this.requestField("parent", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetTargetingSearch requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestPathField () {
      return this.requestPathField(true);
    }
    public APIRequestGetTargetingSearch requestPathField (boolean value) {
      this.requestField("path", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestPerformanceRatingField () {
      return this.requestPerformanceRatingField(true);
    }
    public APIRequestGetTargetingSearch requestPerformanceRatingField (boolean value) {
      this.requestField("performance_rating", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestRawNameField () {
      return this.requestRawNameField(true);
    }
    public APIRequestGetTargetingSearch requestRawNameField (boolean value) {
      this.requestField("raw_name", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestRecommendationModelField () {
      return this.requestRecommendationModelField(true);
    }
    public APIRequestGetTargetingSearch requestRecommendationModelField (boolean value) {
      this.requestField("recommendation_model", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestSearchInterestIdField () {
      return this.requestSearchInterestIdField(true);
    }
    public APIRequestGetTargetingSearch requestSearchInterestIdField (boolean value) {
      this.requestField("search_interest_id", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetTargetingSearch requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestSpendField () {
      return this.requestSpendField(true);
    }
    public APIRequestGetTargetingSearch requestSpendField (boolean value) {
      this.requestField("spend", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetTargetingSearch requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetTargetingSearch requestValidField () {
      return this.requestValidField(true);
    }
    public APIRequestGetTargetingSearch requestValidField (boolean value) {
      this.requestField("valid", value);
      return this;
    }
  }

  public static class APIRequestGetTargetingSentenceLines extends APIRequest<TargetingSentenceLine> {

    APINodeList<TargetingSentenceLine> lastResponse = null;
    @Override
    public APINodeList<TargetingSentenceLine> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "discard_ages",
      "discard_placements",
      "hide_targeting_spec_from_return",
      "targeting_spec",
    };

    public static final String[] FIELDS = {
      "id",
      "params",
      "targetingsentencelines",
    };

    @Override
    public APINodeList<TargetingSentenceLine> parseResponse(String response, String header) throws APIException {
      return TargetingSentenceLine.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<TargetingSentenceLine> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<TargetingSentenceLine> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<TargetingSentenceLine>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<TargetingSentenceLine>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<TargetingSentenceLine>>() {
           public APINodeList<TargetingSentenceLine> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTargetingSentenceLines.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTargetingSentenceLines(String nodeId, APIContext context) {
      super(context, nodeId, "/targetingsentencelines", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTargetingSentenceLines setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTargetingSentenceLines setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTargetingSentenceLines setDiscardAges (Boolean discardAges) {
      this.setParam("discard_ages", discardAges);
      return this;
    }
    public APIRequestGetTargetingSentenceLines setDiscardAges (String discardAges) {
      this.setParam("discard_ages", discardAges);
      return this;
    }

    public APIRequestGetTargetingSentenceLines setDiscardPlacements (Boolean discardPlacements) {
      this.setParam("discard_placements", discardPlacements);
      return this;
    }
    public APIRequestGetTargetingSentenceLines setDiscardPlacements (String discardPlacements) {
      this.setParam("discard_placements", discardPlacements);
      return this;
    }

    public APIRequestGetTargetingSentenceLines setHideTargetingSpecFromReturn (Boolean hideTargetingSpecFromReturn) {
      this.setParam("hide_targeting_spec_from_return", hideTargetingSpecFromReturn);
      return this;
    }
    public APIRequestGetTargetingSentenceLines setHideTargetingSpecFromReturn (String hideTargetingSpecFromReturn) {
      this.setParam("hide_targeting_spec_from_return", hideTargetingSpecFromReturn);
      return this;
    }

    public APIRequestGetTargetingSentenceLines setTargetingSpec (Targeting targetingSpec) {
      this.setParam("targeting_spec", targetingSpec);
      return this;
    }
    public APIRequestGetTargetingSentenceLines setTargetingSpec (String targetingSpec) {
      this.setParam("targeting_spec", targetingSpec);
      return this;
    }

    public APIRequestGetTargetingSentenceLines requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTargetingSentenceLines requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingSentenceLines requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTargetingSentenceLines requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingSentenceLines requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTargetingSentenceLines requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTargetingSentenceLines requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTargetingSentenceLines requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTargetingSentenceLines requestParamsField () {
      return this.requestParamsField(true);
    }
    public APIRequestGetTargetingSentenceLines requestParamsField (boolean value) {
      this.requestField("params", value);
      return this;
    }
    public APIRequestGetTargetingSentenceLines requestTargetingsentencelinesField () {
      return this.requestTargetingsentencelinesField(true);
    }
    public APIRequestGetTargetingSentenceLines requestTargetingsentencelinesField (boolean value) {
      this.requestField("targetingsentencelines", value);
      return this;
    }
  }

  public static class APIRequestGetTargetingSuggestions extends APIRequest<AdAccountTargetingUnified> {

    APINodeList<AdAccountTargetingUnified> lastResponse = null;
    @Override
    public APINodeList<AdAccountTargetingUnified> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "countries",
      "limit_type",
      "mode",
      "objective",
      "objects",
      "regulated_categories",
      "session_id",
      "targeting_list",
      "whitelisted_types",
    };

    public static final String[] FIELDS = {
      "audience_size",
      "conversion_lift",
      "description",
      "id",
      "img",
      "info",
      "info_title",
      "is_recommendation",
      "key",
      "link",
      "name",
      "parent",
      "partner",
      "path",
      "performance_rating",
      "raw_name",
      "recommendation_model",
      "search_interest_id",
      "source",
      "spend",
      "type",
      "valid",
    };

    @Override
    public APINodeList<AdAccountTargetingUnified> parseResponse(String response, String header) throws APIException {
      return AdAccountTargetingUnified.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountTargetingUnified>>() {
           public APINodeList<AdAccountTargetingUnified> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTargetingSuggestions.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTargetingSuggestions(String nodeId, APIContext context) {
      super(context, nodeId, "/targetingsuggestions", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTargetingSuggestions setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTargetingSuggestions setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTargetingSuggestions setCountries (List<String> countries) {
      this.setParam("countries", countries);
      return this;
    }
    public APIRequestGetTargetingSuggestions setCountries (String countries) {
      this.setParam("countries", countries);
      return this;
    }

    public APIRequestGetTargetingSuggestions setLimitType (AdAccountTargetingUnified.EnumLimitType limitType) {
      this.setParam("limit_type", limitType);
      return this;
    }
    public APIRequestGetTargetingSuggestions setLimitType (String limitType) {
      this.setParam("limit_type", limitType);
      return this;
    }

    public APIRequestGetTargetingSuggestions setMode (AdAccountTargetingUnified.EnumMode mode) {
      this.setParam("mode", mode);
      return this;
    }
    public APIRequestGetTargetingSuggestions setMode (String mode) {
      this.setParam("mode", mode);
      return this;
    }

    public APIRequestGetTargetingSuggestions setObjective (AdAccountTargetingUnified.EnumObjective objective) {
      this.setParam("objective", objective);
      return this;
    }
    public APIRequestGetTargetingSuggestions setObjective (String objective) {
      this.setParam("objective", objective);
      return this;
    }

    public APIRequestGetTargetingSuggestions setObjects (Object objects) {
      this.setParam("objects", objects);
      return this;
    }
    public APIRequestGetTargetingSuggestions setObjects (String objects) {
      this.setParam("objects", objects);
      return this;
    }

    public APIRequestGetTargetingSuggestions setRegulatedCategories (List<AdAccountTargetingUnified.EnumRegulatedCategories> regulatedCategories) {
      this.setParam("regulated_categories", regulatedCategories);
      return this;
    }
    public APIRequestGetTargetingSuggestions setRegulatedCategories (String regulatedCategories) {
      this.setParam("regulated_categories", regulatedCategories);
      return this;
    }

    public APIRequestGetTargetingSuggestions setSessionId (Long sessionId) {
      this.setParam("session_id", sessionId);
      return this;
    }
    public APIRequestGetTargetingSuggestions setSessionId (String sessionId) {
      this.setParam("session_id", sessionId);
      return this;
    }

    public APIRequestGetTargetingSuggestions setTargetingList (List<Object> targetingList) {
      this.setParam("targeting_list", targetingList);
      return this;
    }
    public APIRequestGetTargetingSuggestions setTargetingList (String targetingList) {
      this.setParam("targeting_list", targetingList);
      return this;
    }

    public APIRequestGetTargetingSuggestions setWhitelistedTypes (List<AdAccountTargetingUnified.EnumWhitelistedTypes> whitelistedTypes) {
      this.setParam("whitelisted_types", whitelistedTypes);
      return this;
    }
    public APIRequestGetTargetingSuggestions setWhitelistedTypes (String whitelistedTypes) {
      this.setParam("whitelisted_types", whitelistedTypes);
      return this;
    }

    public APIRequestGetTargetingSuggestions requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTargetingSuggestions requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingSuggestions requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTargetingSuggestions requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingSuggestions requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTargetingSuggestions requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTargetingSuggestions requestAudienceSizeField () {
      return this.requestAudienceSizeField(true);
    }
    public APIRequestGetTargetingSuggestions requestAudienceSizeField (boolean value) {
      this.requestField("audience_size", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestConversionLiftField () {
      return this.requestConversionLiftField(true);
    }
    public APIRequestGetTargetingSuggestions requestConversionLiftField (boolean value) {
      this.requestField("conversion_lift", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetTargetingSuggestions requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTargetingSuggestions requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestImgField () {
      return this.requestImgField(true);
    }
    public APIRequestGetTargetingSuggestions requestImgField (boolean value) {
      this.requestField("img", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestInfoField () {
      return this.requestInfoField(true);
    }
    public APIRequestGetTargetingSuggestions requestInfoField (boolean value) {
      this.requestField("info", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestInfoTitleField () {
      return this.requestInfoTitleField(true);
    }
    public APIRequestGetTargetingSuggestions requestInfoTitleField (boolean value) {
      this.requestField("info_title", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestIsRecommendationField () {
      return this.requestIsRecommendationField(true);
    }
    public APIRequestGetTargetingSuggestions requestIsRecommendationField (boolean value) {
      this.requestField("is_recommendation", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestKeyField () {
      return this.requestKeyField(true);
    }
    public APIRequestGetTargetingSuggestions requestKeyField (boolean value) {
      this.requestField("key", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetTargetingSuggestions requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetTargetingSuggestions requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestParentField () {
      return this.requestParentField(true);
    }
    public APIRequestGetTargetingSuggestions requestParentField (boolean value) {
      this.requestField("parent", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetTargetingSuggestions requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestPathField () {
      return this.requestPathField(true);
    }
    public APIRequestGetTargetingSuggestions requestPathField (boolean value) {
      this.requestField("path", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestPerformanceRatingField () {
      return this.requestPerformanceRatingField(true);
    }
    public APIRequestGetTargetingSuggestions requestPerformanceRatingField (boolean value) {
      this.requestField("performance_rating", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestRawNameField () {
      return this.requestRawNameField(true);
    }
    public APIRequestGetTargetingSuggestions requestRawNameField (boolean value) {
      this.requestField("raw_name", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestRecommendationModelField () {
      return this.requestRecommendationModelField(true);
    }
    public APIRequestGetTargetingSuggestions requestRecommendationModelField (boolean value) {
      this.requestField("recommendation_model", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestSearchInterestIdField () {
      return this.requestSearchInterestIdField(true);
    }
    public APIRequestGetTargetingSuggestions requestSearchInterestIdField (boolean value) {
      this.requestField("search_interest_id", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetTargetingSuggestions requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestSpendField () {
      return this.requestSpendField(true);
    }
    public APIRequestGetTargetingSuggestions requestSpendField (boolean value) {
      this.requestField("spend", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetTargetingSuggestions requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetTargetingSuggestions requestValidField () {
      return this.requestValidField(true);
    }
    public APIRequestGetTargetingSuggestions requestValidField (boolean value) {
      this.requestField("valid", value);
      return this;
    }
  }

  public static class APIRequestGetTargetingValidation extends APIRequest<AdAccountTargetingUnified> {

    APINodeList<AdAccountTargetingUnified> lastResponse = null;
    @Override
    public APINodeList<AdAccountTargetingUnified> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "id_list",
      "is_exclusion",
      "name_list",
      "targeting_list",
    };

    public static final String[] FIELDS = {
      "audience_size",
      "conversion_lift",
      "description",
      "id",
      "img",
      "info",
      "info_title",
      "is_recommendation",
      "key",
      "link",
      "name",
      "parent",
      "partner",
      "path",
      "performance_rating",
      "raw_name",
      "recommendation_model",
      "search_interest_id",
      "source",
      "spend",
      "type",
      "valid",
    };

    @Override
    public APINodeList<AdAccountTargetingUnified> parseResponse(String response, String header) throws APIException {
      return AdAccountTargetingUnified.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountTargetingUnified> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountTargetingUnified>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountTargetingUnified>>() {
           public APINodeList<AdAccountTargetingUnified> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTargetingValidation.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTargetingValidation(String nodeId, APIContext context) {
      super(context, nodeId, "/targetingvalidation", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTargetingValidation setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTargetingValidation setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTargetingValidation setIdList (List<Long> idList) {
      this.setParam("id_list", idList);
      return this;
    }
    public APIRequestGetTargetingValidation setIdList (String idList) {
      this.setParam("id_list", idList);
      return this;
    }

    public APIRequestGetTargetingValidation setIsExclusion (Boolean isExclusion) {
      this.setParam("is_exclusion", isExclusion);
      return this;
    }
    public APIRequestGetTargetingValidation setIsExclusion (String isExclusion) {
      this.setParam("is_exclusion", isExclusion);
      return this;
    }

    public APIRequestGetTargetingValidation setNameList (List<String> nameList) {
      this.setParam("name_list", nameList);
      return this;
    }
    public APIRequestGetTargetingValidation setNameList (String nameList) {
      this.setParam("name_list", nameList);
      return this;
    }

    public APIRequestGetTargetingValidation setTargetingList (List<Object> targetingList) {
      this.setParam("targeting_list", targetingList);
      return this;
    }
    public APIRequestGetTargetingValidation setTargetingList (String targetingList) {
      this.setParam("targeting_list", targetingList);
      return this;
    }

    public APIRequestGetTargetingValidation requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTargetingValidation requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingValidation requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTargetingValidation requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTargetingValidation requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTargetingValidation requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTargetingValidation requestAudienceSizeField () {
      return this.requestAudienceSizeField(true);
    }
    public APIRequestGetTargetingValidation requestAudienceSizeField (boolean value) {
      this.requestField("audience_size", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestConversionLiftField () {
      return this.requestConversionLiftField(true);
    }
    public APIRequestGetTargetingValidation requestConversionLiftField (boolean value) {
      this.requestField("conversion_lift", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetTargetingValidation requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTargetingValidation requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestImgField () {
      return this.requestImgField(true);
    }
    public APIRequestGetTargetingValidation requestImgField (boolean value) {
      this.requestField("img", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestInfoField () {
      return this.requestInfoField(true);
    }
    public APIRequestGetTargetingValidation requestInfoField (boolean value) {
      this.requestField("info", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestInfoTitleField () {
      return this.requestInfoTitleField(true);
    }
    public APIRequestGetTargetingValidation requestInfoTitleField (boolean value) {
      this.requestField("info_title", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestIsRecommendationField () {
      return this.requestIsRecommendationField(true);
    }
    public APIRequestGetTargetingValidation requestIsRecommendationField (boolean value) {
      this.requestField("is_recommendation", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestKeyField () {
      return this.requestKeyField(true);
    }
    public APIRequestGetTargetingValidation requestKeyField (boolean value) {
      this.requestField("key", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetTargetingValidation requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetTargetingValidation requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestParentField () {
      return this.requestParentField(true);
    }
    public APIRequestGetTargetingValidation requestParentField (boolean value) {
      this.requestField("parent", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetTargetingValidation requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestPathField () {
      return this.requestPathField(true);
    }
    public APIRequestGetTargetingValidation requestPathField (boolean value) {
      this.requestField("path", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestPerformanceRatingField () {
      return this.requestPerformanceRatingField(true);
    }
    public APIRequestGetTargetingValidation requestPerformanceRatingField (boolean value) {
      this.requestField("performance_rating", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestRawNameField () {
      return this.requestRawNameField(true);
    }
    public APIRequestGetTargetingValidation requestRawNameField (boolean value) {
      this.requestField("raw_name", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestRecommendationModelField () {
      return this.requestRecommendationModelField(true);
    }
    public APIRequestGetTargetingValidation requestRecommendationModelField (boolean value) {
      this.requestField("recommendation_model", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestSearchInterestIdField () {
      return this.requestSearchInterestIdField(true);
    }
    public APIRequestGetTargetingValidation requestSearchInterestIdField (boolean value) {
      this.requestField("search_interest_id", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetTargetingValidation requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestSpendField () {
      return this.requestSpendField(true);
    }
    public APIRequestGetTargetingValidation requestSpendField (boolean value) {
      this.requestField("spend", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetTargetingValidation requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetTargetingValidation requestValidField () {
      return this.requestValidField(true);
    }
    public APIRequestGetTargetingValidation requestValidField (boolean value) {
      this.requestField("valid", value);
      return this;
    }
  }

  public static class APIRequestDeleteTracking extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "tracking_specs",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteTracking.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteTracking(String nodeId, APIContext context) {
      super(context, nodeId, "/tracking", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteTracking setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteTracking setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteTracking setTrackingSpecs (Object trackingSpecs) {
      this.setParam("tracking_specs", trackingSpecs);
      return this;
    }
    public APIRequestDeleteTracking setTrackingSpecs (String trackingSpecs) {
      this.setParam("tracking_specs", trackingSpecs);
      return this;
    }

    public APIRequestDeleteTracking requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteTracking requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteTracking requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteTracking requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteTracking requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteTracking requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetTracking extends APIRequest<AdAccountTrackingData> {

    APINodeList<AdAccountTrackingData> lastResponse = null;
    @Override
    public APINodeList<AdAccountTrackingData> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "tracking_specs",
    };

    @Override
    public APINodeList<AdAccountTrackingData> parseResponse(String response, String header) throws APIException {
      return AdAccountTrackingData.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountTrackingData> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountTrackingData> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountTrackingData>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountTrackingData>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountTrackingData>>() {
           public APINodeList<AdAccountTrackingData> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTracking.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTracking(String nodeId, APIContext context) {
      super(context, nodeId, "/tracking", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTracking setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTracking setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTracking requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTracking requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTracking requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTracking requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTracking requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTracking requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTracking requestTrackingSpecsField () {
      return this.requestTrackingSpecsField(true);
    }
    public APIRequestGetTracking requestTrackingSpecsField (boolean value) {
      this.requestField("tracking_specs", value);
      return this;
    }
  }

  public static class APIRequestCreateTracking extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "tracking_specs",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateTracking.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateTracking(String nodeId, APIContext context) {
      super(context, nodeId, "/tracking", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateTracking setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateTracking setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateTracking setTrackingSpecs (Object trackingSpecs) {
      this.setParam("tracking_specs", trackingSpecs);
      return this;
    }
    public APIRequestCreateTracking setTrackingSpecs (String trackingSpecs) {
      this.setParam("tracking_specs", trackingSpecs);
      return this;
    }

    public APIRequestCreateTracking requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateTracking requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateTracking requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateTracking requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateTracking requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateTracking requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeleteUsers extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "uid",
      "uids",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteUsers.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteUsers(String nodeId, APIContext context) {
      super(context, nodeId, "/users", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteUsers setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteUsers setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteUsers setUid (Long uid) {
      this.setParam("uid", uid);
      return this;
    }
    public APIRequestDeleteUsers setUid (String uid) {
      this.setParam("uid", uid);
      return this;
    }

    public APIRequestDeleteUsers setUids (List<String> uids) {
      this.setParam("uids", uids);
      return this;
    }
    public APIRequestDeleteUsers setUids (String uids) {
      this.setParam("uids", uids);
      return this;
    }

    public APIRequestDeleteUsers requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteUsers requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteUsers requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteUsers requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteUsers requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteUsers requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetUsers extends APIRequest<AdAccountUser> {

    APINodeList<AdAccountUser> lastResponse = null;
    @Override
    public APINodeList<AdAccountUser> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "id",
      "name",
      "tasks",
    };

    @Override
    public APINodeList<AdAccountUser> parseResponse(String response, String header) throws APIException {
      return AdAccountUser.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccountUser> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccountUser> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccountUser>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccountUser>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccountUser>>() {
           public APINodeList<AdAccountUser> apply(ResponseWrapper result) {
             try {
               return APIRequestGetUsers.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetUsers(String nodeId, APIContext context) {
      super(context, nodeId, "/users", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetUsers setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetUsers setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetUsers requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetUsers requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetUsers requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetUsers requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetUsers requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetUsers requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetUsers requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetUsers requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetUsers requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetUsers requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetUsers requestTasksField () {
      return this.requestTasksField(true);
    }
    public APIRequestGetUsers requestTasksField (boolean value) {
      this.requestField("tasks", value);
      return this;
    }
  }

  public static class APIRequestCreateUser extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "tasks",
      "uid",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestCreateUser.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateUser(String nodeId, APIContext context) {
      super(context, nodeId, "/users", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateUser setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateUser setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateUser setTasks (List<AdAccount.EnumTasks> tasks) {
      this.setParam("tasks", tasks);
      return this;
    }
    public APIRequestCreateUser setTasks (String tasks) {
      this.setParam("tasks", tasks);
      return this;
    }

    public APIRequestCreateUser setUid (Long uid) {
      this.setParam("uid", uid);
      return this;
    }
    public APIRequestCreateUser setUid (String uid) {
      this.setParam("uid", uid);
      return this;
    }

    public APIRequestCreateUser requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateUser requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateUser requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateUser requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateUser requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateUser requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeleteUsersOfAnyAudience extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "namespace",
      "payload",
      "session",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteUsersOfAnyAudience.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteUsersOfAnyAudience(String nodeId, APIContext context) {
      super(context, nodeId, "/usersofanyaudience", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteUsersOfAnyAudience setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteUsersOfAnyAudience setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteUsersOfAnyAudience setNamespace (String namespace) {
      this.setParam("namespace", namespace);
      return this;
    }

    public APIRequestDeleteUsersOfAnyAudience setPayload (Object payload) {
      this.setParam("payload", payload);
      return this;
    }
    public APIRequestDeleteUsersOfAnyAudience setPayload (String payload) {
      this.setParam("payload", payload);
      return this;
    }

    public APIRequestDeleteUsersOfAnyAudience setSession (Object session) {
      this.setParam("session", session);
      return this;
    }
    public APIRequestDeleteUsersOfAnyAudience setSession (String session) {
      this.setParam("session", session);
      return this;
    }

    public APIRequestDeleteUsersOfAnyAudience requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteUsersOfAnyAudience requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteUsersOfAnyAudience requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteUsersOfAnyAudience requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteUsersOfAnyAudience requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteUsersOfAnyAudience requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGet extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "account_status",
      "ad_account_creation_request",
      "ad_account_promotable_objects",
      "age",
      "agency_client_declaration",
      "amount_spent",
      "attribution_spec",
      "balance",
      "business",
      "business_city",
      "business_country_code",
      "business_name",
      "business_state",
      "business_street",
      "business_street2",
      "business_zip",
      "capabilities",
      "created_time",
      "currency",
      "disable_reason",
      "end_advertiser",
      "end_advertiser_name",
      "failed_delivery_checks",
      "fb_entity",
      "funding_source",
      "funding_source_details",
      "has_migrated_permissions",
      "has_page_authorized_adaccount",
      "id",
      "io_number",
      "is_attribution_spec_system_default",
      "is_direct_deals_enabled",
      "is_in_3ds_authorization_enabled_market",
      "is_in_middle_of_local_entity_migration",
      "is_notifications_enabled",
      "is_personal",
      "is_prepay_account",
      "is_tax_id_required",
      "line_numbers",
      "media_agency",
      "min_campaign_group_spend_cap",
      "min_daily_budget",
      "name",
      "offsite_pixels_tos_accepted",
      "owner",
      "partner",
      "rf_spec",
      "show_checkout_experience",
      "spend_cap",
      "tax_id",
      "tax_id_status",
      "tax_id_type",
      "timezone_id",
      "timezone_name",
      "timezone_offset_hours_utc",
      "tos_accepted",
      "user_role",
      "user_tos_accepted",
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestGet.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGet(String nodeId, APIContext context) {
      super(context, nodeId, "/", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGet setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGet setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGet requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGet requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGet requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGet requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGet requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGet requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGet requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGet requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGet requestAccountStatusField () {
      return this.requestAccountStatusField(true);
    }
    public APIRequestGet requestAccountStatusField (boolean value) {
      this.requestField("account_status", value);
      return this;
    }
    public APIRequestGet requestAdAccountCreationRequestField () {
      return this.requestAdAccountCreationRequestField(true);
    }
    public APIRequestGet requestAdAccountCreationRequestField (boolean value) {
      this.requestField("ad_account_creation_request", value);
      return this;
    }
    public APIRequestGet requestAdAccountPromotableObjectsField () {
      return this.requestAdAccountPromotableObjectsField(true);
    }
    public APIRequestGet requestAdAccountPromotableObjectsField (boolean value) {
      this.requestField("ad_account_promotable_objects", value);
      return this;
    }
    public APIRequestGet requestAgeField () {
      return this.requestAgeField(true);
    }
    public APIRequestGet requestAgeField (boolean value) {
      this.requestField("age", value);
      return this;
    }
    public APIRequestGet requestAgencyClientDeclarationField () {
      return this.requestAgencyClientDeclarationField(true);
    }
    public APIRequestGet requestAgencyClientDeclarationField (boolean value) {
      this.requestField("agency_client_declaration", value);
      return this;
    }
    public APIRequestGet requestAmountSpentField () {
      return this.requestAmountSpentField(true);
    }
    public APIRequestGet requestAmountSpentField (boolean value) {
      this.requestField("amount_spent", value);
      return this;
    }
    public APIRequestGet requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGet requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGet requestBalanceField () {
      return this.requestBalanceField(true);
    }
    public APIRequestGet requestBalanceField (boolean value) {
      this.requestField("balance", value);
      return this;
    }
    public APIRequestGet requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGet requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGet requestBusinessCityField () {
      return this.requestBusinessCityField(true);
    }
    public APIRequestGet requestBusinessCityField (boolean value) {
      this.requestField("business_city", value);
      return this;
    }
    public APIRequestGet requestBusinessCountryCodeField () {
      return this.requestBusinessCountryCodeField(true);
    }
    public APIRequestGet requestBusinessCountryCodeField (boolean value) {
      this.requestField("business_country_code", value);
      return this;
    }
    public APIRequestGet requestBusinessNameField () {
      return this.requestBusinessNameField(true);
    }
    public APIRequestGet requestBusinessNameField (boolean value) {
      this.requestField("business_name", value);
      return this;
    }
    public APIRequestGet requestBusinessStateField () {
      return this.requestBusinessStateField(true);
    }
    public APIRequestGet requestBusinessStateField (boolean value) {
      this.requestField("business_state", value);
      return this;
    }
    public APIRequestGet requestBusinessStreetField () {
      return this.requestBusinessStreetField(true);
    }
    public APIRequestGet requestBusinessStreetField (boolean value) {
      this.requestField("business_street", value);
      return this;
    }
    public APIRequestGet requestBusinessStreet2Field () {
      return this.requestBusinessStreet2Field(true);
    }
    public APIRequestGet requestBusinessStreet2Field (boolean value) {
      this.requestField("business_street2", value);
      return this;
    }
    public APIRequestGet requestBusinessZipField () {
      return this.requestBusinessZipField(true);
    }
    public APIRequestGet requestBusinessZipField (boolean value) {
      this.requestField("business_zip", value);
      return this;
    }
    public APIRequestGet requestCapabilitiesField () {
      return this.requestCapabilitiesField(true);
    }
    public APIRequestGet requestCapabilitiesField (boolean value) {
      this.requestField("capabilities", value);
      return this;
    }
    public APIRequestGet requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGet requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGet requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGet requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGet requestDisableReasonField () {
      return this.requestDisableReasonField(true);
    }
    public APIRequestGet requestDisableReasonField (boolean value) {
      this.requestField("disable_reason", value);
      return this;
    }
    public APIRequestGet requestEndAdvertiserField () {
      return this.requestEndAdvertiserField(true);
    }
    public APIRequestGet requestEndAdvertiserField (boolean value) {
      this.requestField("end_advertiser", value);
      return this;
    }
    public APIRequestGet requestEndAdvertiserNameField () {
      return this.requestEndAdvertiserNameField(true);
    }
    public APIRequestGet requestEndAdvertiserNameField (boolean value) {
      this.requestField("end_advertiser_name", value);
      return this;
    }
    public APIRequestGet requestFailedDeliveryChecksField () {
      return this.requestFailedDeliveryChecksField(true);
    }
    public APIRequestGet requestFailedDeliveryChecksField (boolean value) {
      this.requestField("failed_delivery_checks", value);
      return this;
    }
    public APIRequestGet requestFbEntityField () {
      return this.requestFbEntityField(true);
    }
    public APIRequestGet requestFbEntityField (boolean value) {
      this.requestField("fb_entity", value);
      return this;
    }
    public APIRequestGet requestFundingSourceField () {
      return this.requestFundingSourceField(true);
    }
    public APIRequestGet requestFundingSourceField (boolean value) {
      this.requestField("funding_source", value);
      return this;
    }
    public APIRequestGet requestFundingSourceDetailsField () {
      return this.requestFundingSourceDetailsField(true);
    }
    public APIRequestGet requestFundingSourceDetailsField (boolean value) {
      this.requestField("funding_source_details", value);
      return this;
    }
    public APIRequestGet requestHasMigratedPermissionsField () {
      return this.requestHasMigratedPermissionsField(true);
    }
    public APIRequestGet requestHasMigratedPermissionsField (boolean value) {
      this.requestField("has_migrated_permissions", value);
      return this;
    }
    public APIRequestGet requestHasPageAuthorizedAdaccountField () {
      return this.requestHasPageAuthorizedAdaccountField(true);
    }
    public APIRequestGet requestHasPageAuthorizedAdaccountField (boolean value) {
      this.requestField("has_page_authorized_adaccount", value);
      return this;
    }
    public APIRequestGet requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGet requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGet requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGet requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGet requestIsAttributionSpecSystemDefaultField () {
      return this.requestIsAttributionSpecSystemDefaultField(true);
    }
    public APIRequestGet requestIsAttributionSpecSystemDefaultField (boolean value) {
      this.requestField("is_attribution_spec_system_default", value);
      return this;
    }
    public APIRequestGet requestIsDirectDealsEnabledField () {
      return this.requestIsDirectDealsEnabledField(true);
    }
    public APIRequestGet requestIsDirectDealsEnabledField (boolean value) {
      this.requestField("is_direct_deals_enabled", value);
      return this;
    }
    public APIRequestGet requestIsIn3dsAuthorizationEnabledMarketField () {
      return this.requestIsIn3dsAuthorizationEnabledMarketField(true);
    }
    public APIRequestGet requestIsIn3dsAuthorizationEnabledMarketField (boolean value) {
      this.requestField("is_in_3ds_authorization_enabled_market", value);
      return this;
    }
    public APIRequestGet requestIsInMiddleOfLocalEntityMigrationField () {
      return this.requestIsInMiddleOfLocalEntityMigrationField(true);
    }
    public APIRequestGet requestIsInMiddleOfLocalEntityMigrationField (boolean value) {
      this.requestField("is_in_middle_of_local_entity_migration", value);
      return this;
    }
    public APIRequestGet requestIsNotificationsEnabledField () {
      return this.requestIsNotificationsEnabledField(true);
    }
    public APIRequestGet requestIsNotificationsEnabledField (boolean value) {
      this.requestField("is_notifications_enabled", value);
      return this;
    }
    public APIRequestGet requestIsPersonalField () {
      return this.requestIsPersonalField(true);
    }
    public APIRequestGet requestIsPersonalField (boolean value) {
      this.requestField("is_personal", value);
      return this;
    }
    public APIRequestGet requestIsPrepayAccountField () {
      return this.requestIsPrepayAccountField(true);
    }
    public APIRequestGet requestIsPrepayAccountField (boolean value) {
      this.requestField("is_prepay_account", value);
      return this;
    }
    public APIRequestGet requestIsTaxIdRequiredField () {
      return this.requestIsTaxIdRequiredField(true);
    }
    public APIRequestGet requestIsTaxIdRequiredField (boolean value) {
      this.requestField("is_tax_id_required", value);
      return this;
    }
    public APIRequestGet requestLineNumbersField () {
      return this.requestLineNumbersField(true);
    }
    public APIRequestGet requestLineNumbersField (boolean value) {
      this.requestField("line_numbers", value);
      return this;
    }
    public APIRequestGet requestMediaAgencyField () {
      return this.requestMediaAgencyField(true);
    }
    public APIRequestGet requestMediaAgencyField (boolean value) {
      this.requestField("media_agency", value);
      return this;
    }
    public APIRequestGet requestMinCampaignGroupSpendCapField () {
      return this.requestMinCampaignGroupSpendCapField(true);
    }
    public APIRequestGet requestMinCampaignGroupSpendCapField (boolean value) {
      this.requestField("min_campaign_group_spend_cap", value);
      return this;
    }
    public APIRequestGet requestMinDailyBudgetField () {
      return this.requestMinDailyBudgetField(true);
    }
    public APIRequestGet requestMinDailyBudgetField (boolean value) {
      this.requestField("min_daily_budget", value);
      return this;
    }
    public APIRequestGet requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGet requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGet requestOffsitePixelsTosAcceptedField () {
      return this.requestOffsitePixelsTosAcceptedField(true);
    }
    public APIRequestGet requestOffsitePixelsTosAcceptedField (boolean value) {
      this.requestField("offsite_pixels_tos_accepted", value);
      return this;
    }
    public APIRequestGet requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGet requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGet requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGet requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGet requestRfSpecField () {
      return this.requestRfSpecField(true);
    }
    public APIRequestGet requestRfSpecField (boolean value) {
      this.requestField("rf_spec", value);
      return this;
    }
    public APIRequestGet requestShowCheckoutExperienceField () {
      return this.requestShowCheckoutExperienceField(true);
    }
    public APIRequestGet requestShowCheckoutExperienceField (boolean value) {
      this.requestField("show_checkout_experience", value);
      return this;
    }
    public APIRequestGet requestSpendCapField () {
      return this.requestSpendCapField(true);
    }
    public APIRequestGet requestSpendCapField (boolean value) {
      this.requestField("spend_cap", value);
      return this;
    }
    public APIRequestGet requestTaxIdField () {
      return this.requestTaxIdField(true);
    }
    public APIRequestGet requestTaxIdField (boolean value) {
      this.requestField("tax_id", value);
      return this;
    }
    public APIRequestGet requestTaxIdStatusField () {
      return this.requestTaxIdStatusField(true);
    }
    public APIRequestGet requestTaxIdStatusField (boolean value) {
      this.requestField("tax_id_status", value);
      return this;
    }
    public APIRequestGet requestTaxIdTypeField () {
      return this.requestTaxIdTypeField(true);
    }
    public APIRequestGet requestTaxIdTypeField (boolean value) {
      this.requestField("tax_id_type", value);
      return this;
    }
    public APIRequestGet requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGet requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGet requestTimezoneNameField () {
      return this.requestTimezoneNameField(true);
    }
    public APIRequestGet requestTimezoneNameField (boolean value) {
      this.requestField("timezone_name", value);
      return this;
    }
    public APIRequestGet requestTimezoneOffsetHoursUtcField () {
      return this.requestTimezoneOffsetHoursUtcField(true);
    }
    public APIRequestGet requestTimezoneOffsetHoursUtcField (boolean value) {
      this.requestField("timezone_offset_hours_utc", value);
      return this;
    }
    public APIRequestGet requestTosAcceptedField () {
      return this.requestTosAcceptedField(true);
    }
    public APIRequestGet requestTosAcceptedField (boolean value) {
      this.requestField("tos_accepted", value);
      return this;
    }
    public APIRequestGet requestUserRoleField () {
      return this.requestUserRoleField(true);
    }
    public APIRequestGet requestUserRoleField (boolean value) {
      this.requestField("user_role", value);
      return this;
    }
    public APIRequestGet requestUserTosAcceptedField () {
      return this.requestUserTosAcceptedField(true);
    }
    public APIRequestGet requestUserTosAcceptedField (boolean value) {
      this.requestField("user_tos_accepted", value);
      return this;
    }
  }

  public static class APIRequestUpdate extends APIRequest<AdAccount> {

    AdAccount lastResponse = null;
    @Override
    public AdAccount getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "agency_client_declaration",
      "attribution_spec",
      "business_info",
      "currency",
      "end_advertiser",
      "is_notifications_enabled",
      "media_agency",
      "name",
      "partner",
      "spend_cap",
      "spend_cap_action",
      "timezone_id",
      "tos_accepted",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdAccount parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdAccount execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdAccount execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdAccount> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdAccount> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdAccount>() {
           public AdAccount apply(ResponseWrapper result) {
             try {
               return APIRequestUpdate.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestUpdate(String nodeId, APIContext context) {
      super(context, nodeId, "/", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestUpdate setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestUpdate setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestUpdate setAgencyClientDeclaration (Map<String, String> agencyClientDeclaration) {
      this.setParam("agency_client_declaration", agencyClientDeclaration);
      return this;
    }
    public APIRequestUpdate setAgencyClientDeclaration (String agencyClientDeclaration) {
      this.setParam("agency_client_declaration", agencyClientDeclaration);
      return this;
    }

    public APIRequestUpdate setAttributionSpec (List<Object> attributionSpec) {
      this.setParam("attribution_spec", attributionSpec);
      return this;
    }
    public APIRequestUpdate setAttributionSpec (String attributionSpec) {
      this.setParam("attribution_spec", attributionSpec);
      return this;
    }

    public APIRequestUpdate setBusinessInfo (Map<String, String> businessInfo) {
      this.setParam("business_info", businessInfo);
      return this;
    }
    public APIRequestUpdate setBusinessInfo (String businessInfo) {
      this.setParam("business_info", businessInfo);
      return this;
    }

    public APIRequestUpdate setCurrency (AdAccount.EnumCurrency currency) {
      this.setParam("currency", currency);
      return this;
    }
    public APIRequestUpdate setCurrency (String currency) {
      this.setParam("currency", currency);
      return this;
    }

    public APIRequestUpdate setEndAdvertiser (String endAdvertiser) {
      this.setParam("end_advertiser", endAdvertiser);
      return this;
    }

    public APIRequestUpdate setIsNotificationsEnabled (Boolean isNotificationsEnabled) {
      this.setParam("is_notifications_enabled", isNotificationsEnabled);
      return this;
    }
    public APIRequestUpdate setIsNotificationsEnabled (String isNotificationsEnabled) {
      this.setParam("is_notifications_enabled", isNotificationsEnabled);
      return this;
    }

    public APIRequestUpdate setMediaAgency (String mediaAgency) {
      this.setParam("media_agency", mediaAgency);
      return this;
    }

    public APIRequestUpdate setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestUpdate setPartner (String partner) {
      this.setParam("partner", partner);
      return this;
    }

    public APIRequestUpdate setSpendCap (Double spendCap) {
      this.setParam("spend_cap", spendCap);
      return this;
    }
    public APIRequestUpdate setSpendCap (String spendCap) {
      this.setParam("spend_cap", spendCap);
      return this;
    }

    public APIRequestUpdate setSpendCapAction (String spendCapAction) {
      this.setParam("spend_cap_action", spendCapAction);
      return this;
    }

    public APIRequestUpdate setTimezoneId (Long timezoneId) {
      this.setParam("timezone_id", timezoneId);
      return this;
    }
    public APIRequestUpdate setTimezoneId (String timezoneId) {
      this.setParam("timezone_id", timezoneId);
      return this;
    }

    public APIRequestUpdate setTosAccepted (Map<String, String> tosAccepted) {
      this.setParam("tos_accepted", tosAccepted);
      return this;
    }
    public APIRequestUpdate setTosAccepted (String tosAccepted) {
      this.setParam("tos_accepted", tosAccepted);
      return this;
    }

    public APIRequestUpdate requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestUpdate requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestUpdate requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestUpdate requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestUpdate requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestUpdate requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static enum EnumCurrency {
      @SerializedName("AED")
      VALUE_AED("AED"),
      @SerializedName("ARS")
      VALUE_ARS("ARS"),
      @SerializedName("AUD")
      VALUE_AUD("AUD"),
      @SerializedName("BDT")
      VALUE_BDT("BDT"),
      @SerializedName("BOB")
      VALUE_BOB("BOB"),
      @SerializedName("BRL")
      VALUE_BRL("BRL"),
      @SerializedName("CAD")
      VALUE_CAD("CAD"),
      @SerializedName("CHF")
      VALUE_CHF("CHF"),
      @SerializedName("CLP")
      VALUE_CLP("CLP"),
      @SerializedName("CNY")
      VALUE_CNY("CNY"),
      @SerializedName("COP")
      VALUE_COP("COP"),
      @SerializedName("CRC")
      VALUE_CRC("CRC"),
      @SerializedName("CZK")
      VALUE_CZK("CZK"),
      @SerializedName("DKK")
      VALUE_DKK("DKK"),
      @SerializedName("DZD")
      VALUE_DZD("DZD"),
      @SerializedName("EGP")
      VALUE_EGP("EGP"),
      @SerializedName("EUR")
      VALUE_EUR("EUR"),
      @SerializedName("GBP")
      VALUE_GBP("GBP"),
      @SerializedName("GTQ")
      VALUE_GTQ("GTQ"),
      @SerializedName("HKD")
      VALUE_HKD("HKD"),
      @SerializedName("HNL")
      VALUE_HNL("HNL"),
      @SerializedName("HUF")
      VALUE_HUF("HUF"),
      @SerializedName("IDR")
      VALUE_IDR("IDR"),
      @SerializedName("ILS")
      VALUE_ILS("ILS"),
      @SerializedName("INR")
      VALUE_INR("INR"),
      @SerializedName("ISK")
      VALUE_ISK("ISK"),
      @SerializedName("JPY")
      VALUE_JPY("JPY"),
      @SerializedName("KES")
      VALUE_KES("KES"),
      @SerializedName("KRW")
      VALUE_KRW("KRW"),
      @SerializedName("MOP")
      VALUE_MOP("MOP"),
      @SerializedName("MXN")
      VALUE_MXN("MXN"),
      @SerializedName("MYR")
      VALUE_MYR("MYR"),
      @SerializedName("NGN")
      VALUE_NGN("NGN"),
      @SerializedName("NIO")
      VALUE_NIO("NIO"),
      @SerializedName("NOK")
      VALUE_NOK("NOK"),
      @SerializedName("NZD")
      VALUE_NZD("NZD"),
      @SerializedName("PEN")
      VALUE_PEN("PEN"),
      @SerializedName("PHP")
      VALUE_PHP("PHP"),
      @SerializedName("PKR")
      VALUE_PKR("PKR"),
      @SerializedName("PLN")
      VALUE_PLN("PLN"),
      @SerializedName("PYG")
      VALUE_PYG("PYG"),
      @SerializedName("QAR")
      VALUE_QAR("QAR"),
      @SerializedName("RON")
      VALUE_RON("RON"),
      @SerializedName("RUB")
      VALUE_RUB("RUB"),
      @SerializedName("SAR")
      VALUE_SAR("SAR"),
      @SerializedName("SEK")
      VALUE_SEK("SEK"),
      @SerializedName("SGD")
      VALUE_SGD("SGD"),
      @SerializedName("THB")
      VALUE_THB("THB"),
      @SerializedName("TRY")
      VALUE_TRY("TRY"),
      @SerializedName("TWD")
      VALUE_TWD("TWD"),
      @SerializedName("USD")
      VALUE_USD("USD"),
      @SerializedName("UYU")
      VALUE_UYU("UYU"),
      @SerializedName("VND")
      VALUE_VND("VND"),
      @SerializedName("ZAR")
      VALUE_ZAR("ZAR"),
      NULL(null);

      private String value;

      private EnumCurrency(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumPermittedTasks {
      @SerializedName("ADVERTISE")
      VALUE_ADVERTISE("ADVERTISE"),
      @SerializedName("ANALYZE")
      VALUE_ANALYZE("ANALYZE"),
      @SerializedName("MANAGE")
      VALUE_MANAGE("MANAGE"),
      NULL(null);

      private String value;

      private EnumPermittedTasks(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumTasks {
      @SerializedName("ADVERTISE")
      VALUE_ADVERTISE("ADVERTISE"),
      @SerializedName("ANALYZE")
      VALUE_ANALYZE("ANALYZE"),
      @SerializedName("MANAGE")
      VALUE_MANAGE("MANAGE"),
      NULL(null);

      private String value;

      private EnumTasks(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumClaimObjective {
      @SerializedName("AUTOMOTIVE_MODEL")
      VALUE_AUTOMOTIVE_MODEL("AUTOMOTIVE_MODEL"),
      @SerializedName("COLLABORATIVE_ADS")
      VALUE_COLLABORATIVE_ADS("COLLABORATIVE_ADS"),
      @SerializedName("HOME_LISTING")
      VALUE_HOME_LISTING("HOME_LISTING"),
      @SerializedName("MEDIA_TITLE")
      VALUE_MEDIA_TITLE("MEDIA_TITLE"),
      @SerializedName("PRODUCT")
      VALUE_PRODUCT("PRODUCT"),
      @SerializedName("TRAVEL")
      VALUE_TRAVEL("TRAVEL"),
      @SerializedName("VEHICLE")
      VALUE_VEHICLE("VEHICLE"),
      @SerializedName("VEHICLE_OFFER")
      VALUE_VEHICLE_OFFER("VEHICLE_OFFER"),
      NULL(null);

      private String value;

      private EnumClaimObjective(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumContentType {
      @SerializedName("AUTOMOTIVE_MODEL")
      VALUE_AUTOMOTIVE_MODEL("AUTOMOTIVE_MODEL"),
      @SerializedName("DESTINATION")
      VALUE_DESTINATION("DESTINATION"),
      @SerializedName("FLIGHT")
      VALUE_FLIGHT("FLIGHT"),
      @SerializedName("HOME_LISTING")
      VALUE_HOME_LISTING("HOME_LISTING"),
      @SerializedName("HOTEL")
      VALUE_HOTEL("HOTEL"),
      @SerializedName("MEDIA_TITLE")
      VALUE_MEDIA_TITLE("MEDIA_TITLE"),
      @SerializedName("PRODUCT")
      VALUE_PRODUCT("PRODUCT"),
      @SerializedName("VEHICLE")
      VALUE_VEHICLE("VEHICLE"),
      @SerializedName("VEHICLE_OFFER")
      VALUE_VEHICLE_OFFER("VEHICLE_OFFER"),
      NULL(null);

      private String value;

      private EnumContentType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumSubtype {
      @SerializedName("APP")
      VALUE_APP("APP"),
      @SerializedName("BAG_OF_ACCOUNTS")
      VALUE_BAG_OF_ACCOUNTS("BAG_OF_ACCOUNTS"),
      @SerializedName("CLAIM")
      VALUE_CLAIM("CLAIM"),
      @SerializedName("CUSTOM")
      VALUE_CUSTOM("CUSTOM"),
      @SerializedName("ENGAGEMENT")
      VALUE_ENGAGEMENT("ENGAGEMENT"),
      @SerializedName("FOX")
      VALUE_FOX("FOX"),
      @SerializedName("LOOKALIKE")
      VALUE_LOOKALIKE("LOOKALIKE"),
      @SerializedName("MANAGED")
      VALUE_MANAGED("MANAGED"),
      @SerializedName("MEASUREMENT")
      VALUE_MEASUREMENT("MEASUREMENT"),
      @SerializedName("OFFLINE_CONVERSION")
      VALUE_OFFLINE_CONVERSION("OFFLINE_CONVERSION"),
      @SerializedName("PARTNER")
      VALUE_PARTNER("PARTNER"),
      @SerializedName("REGULATED_CATEGORIES_AUDIENCE")
      VALUE_REGULATED_CATEGORIES_AUDIENCE("REGULATED_CATEGORIES_AUDIENCE"),
      @SerializedName("STUDY_RULE_AUDIENCE")
      VALUE_STUDY_RULE_AUDIENCE("STUDY_RULE_AUDIENCE"),
      @SerializedName("VIDEO")
      VALUE_VIDEO("VIDEO"),
      @SerializedName("WEBSITE")
      VALUE_WEBSITE("WEBSITE"),
      NULL(null);

      private String value;

      private EnumSubtype(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumActionsGroupBy {
      @SerializedName("action_canvas_component_id")
      VALUE_ACTION_CANVAS_COMPONENT_ID("action_canvas_component_id"),
      @SerializedName("action_canvas_component_name")
      VALUE_ACTION_CANVAS_COMPONENT_NAME("action_canvas_component_name"),
      @SerializedName("action_carousel_card_id")
      VALUE_ACTION_CAROUSEL_CARD_ID("action_carousel_card_id"),
      @SerializedName("action_carousel_card_name")
      VALUE_ACTION_CAROUSEL_CARD_NAME("action_carousel_card_name"),
      @SerializedName("action_converted_product_id")
      VALUE_ACTION_CONVERTED_PRODUCT_ID("action_converted_product_id"),
      @SerializedName("action_destination")
      VALUE_ACTION_DESTINATION("action_destination"),
      @SerializedName("action_device")
      VALUE_ACTION_DEVICE("action_device"),
      @SerializedName("action_event_channel")
      VALUE_ACTION_EVENT_CHANNEL("action_event_channel"),
      @SerializedName("action_target_id")
      VALUE_ACTION_TARGET_ID("action_target_id"),
      @SerializedName("action_type")
      VALUE_ACTION_TYPE("action_type"),
      @SerializedName("action_video_sound")
      VALUE_ACTION_VIDEO_SOUND("action_video_sound"),
      @SerializedName("action_video_type")
      VALUE_ACTION_VIDEO_TYPE("action_video_type"),
      @SerializedName("interactive_component_sticker_id")
      VALUE_INTERACTIVE_COMPONENT_STICKER_ID("interactive_component_sticker_id"),
      @SerializedName("interactive_component_sticker_response")
      VALUE_INTERACTIVE_COMPONENT_STICKER_RESPONSE("interactive_component_sticker_response"),
      NULL(null);

      private String value;

      private EnumActionsGroupBy(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBuiltinColumnSet {
      @SerializedName("APP_ENGAGEMENT")
      VALUE_APP_ENGAGEMENT("APP_ENGAGEMENT"),
      @SerializedName("AUDIENCE_DIRECT")
      VALUE_AUDIENCE_DIRECT("AUDIENCE_DIRECT"),
      @SerializedName("BIDDING_AND_OPTIMIZATION")
      VALUE_BIDDING_AND_OPTIMIZATION("BIDDING_AND_OPTIMIZATION"),
      @SerializedName("CAROUSEL_ENGAGEMENT")
      VALUE_CAROUSEL_ENGAGEMENT("CAROUSEL_ENGAGEMENT"),
      @SerializedName("CROSS_DEVICE")
      VALUE_CROSS_DEVICE("CROSS_DEVICE"),
      @SerializedName("DELIVERY")
      VALUE_DELIVERY("DELIVERY"),
      @SerializedName("ENGAGEMENT")
      VALUE_ENGAGEMENT("ENGAGEMENT"),
      @SerializedName("HOUSEHOLD")
      VALUE_HOUSEHOLD("HOUSEHOLD"),
      @SerializedName("MESSAGING_ENGAGEMENT")
      VALUE_MESSAGING_ENGAGEMENT("MESSAGING_ENGAGEMENT"),
      @SerializedName("MESSENGER")
      VALUE_MESSENGER("MESSENGER"),
      @SerializedName("OFFLINE_CONVERSIONS")
      VALUE_OFFLINE_CONVERSIONS("OFFLINE_CONVERSIONS"),
      @SerializedName("PERFORMANCE")
      VALUE_PERFORMANCE("PERFORMANCE"),
      @SerializedName("PERFORMANCE_LEGACY")
      VALUE_PERFORMANCE_LEGACY("PERFORMANCE_LEGACY"),
      @SerializedName("TARGETING_AND_CREATIVE")
      VALUE_TARGETING_AND_CREATIVE("TARGETING_AND_CREATIVE"),
      @SerializedName("VALIDATION_VIEW")
      VALUE_VALIDATION_VIEW("VALIDATION_VIEW"),
      @SerializedName("VIDEO_ENGAGEMENT")
      VALUE_VIDEO_ENGAGEMENT("VIDEO_ENGAGEMENT"),
      NULL(null);

      private String value;

      private EnumBuiltinColumnSet(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCreationSource {
      @SerializedName("adsExcelAddin")
      VALUE_ADSEXCELADDIN("adsExcelAddin"),
      @SerializedName("adsManagerReporting")
      VALUE_ADSMANAGERREPORTING("adsManagerReporting"),
      @SerializedName("newAdsManager")
      VALUE_NEWADSMANAGER("newAdsManager"),
      NULL(null);

      private String value;

      private EnumCreationSource(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumDatePreset {
      @SerializedName("last_14d")
      VALUE_LAST_14D("last_14d"),
      @SerializedName("last_28d")
      VALUE_LAST_28D("last_28d"),
      @SerializedName("last_30d")
      VALUE_LAST_30D("last_30d"),
      @SerializedName("last_3d")
      VALUE_LAST_3D("last_3d"),
      @SerializedName("last_7d")
      VALUE_LAST_7D("last_7d"),
      @SerializedName("last_90d")
      VALUE_LAST_90D("last_90d"),
      @SerializedName("last_month")
      VALUE_LAST_MONTH("last_month"),
      @SerializedName("last_quarter")
      VALUE_LAST_QUARTER("last_quarter"),
      @SerializedName("last_week_mon_sun")
      VALUE_LAST_WEEK_MON_SUN("last_week_mon_sun"),
      @SerializedName("last_week_sun_sat")
      VALUE_LAST_WEEK_SUN_SAT("last_week_sun_sat"),
      @SerializedName("last_year")
      VALUE_LAST_YEAR("last_year"),
      @SerializedName("lifetime")
      VALUE_LIFETIME("lifetime"),
      @SerializedName("this_month")
      VALUE_THIS_MONTH("this_month"),
      @SerializedName("this_quarter")
      VALUE_THIS_QUARTER("this_quarter"),
      @SerializedName("this_week_mon_today")
      VALUE_THIS_WEEK_MON_TODAY("this_week_mon_today"),
      @SerializedName("this_week_sun_today")
      VALUE_THIS_WEEK_SUN_TODAY("this_week_sun_today"),
      @SerializedName("this_year")
      VALUE_THIS_YEAR("this_year"),
      @SerializedName("today")
      VALUE_TODAY("today"),
      @SerializedName("yesterday")
      VALUE_YESTERDAY("yesterday"),
      NULL(null);

      private String value;

      private EnumDatePreset(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumLevel {
      @SerializedName("account")
      VALUE_ACCOUNT("account"),
      @SerializedName("ad")
      VALUE_AD("ad"),
      @SerializedName("adgroup")
      VALUE_ADGROUP("adgroup"),
      @SerializedName("campaign")
      VALUE_CAMPAIGN("campaign"),
      @SerializedName("campaign_group")
      VALUE_CAMPAIGN_GROUP("campaign_group"),
      @SerializedName("politicalad")
      VALUE_POLITICALAD("politicalad"),
      NULL(null);

      private String value;

      private EnumLevel(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumScheduleFrequency {
      @SerializedName("daily")
      VALUE_DAILY("daily"),
      @SerializedName("monthly")
      VALUE_MONTHLY("monthly"),
      @SerializedName("weekly")
      VALUE_WEEKLY("weekly"),
      NULL(null);

      private String value;

      private EnumScheduleFrequency(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumStatus {
      @SerializedName("Active")
      VALUE_ACTIVE("Active"),
      @SerializedName("Deleted")
      VALUE_DELETED("Deleted"),
      @SerializedName("Paused")
      VALUE_PAUSED("Paused"),
      NULL(null);

      private String value;

      private EnumStatus(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumDeleteStrategy {
      @SerializedName("DELETE_ANY")
      VALUE_DELETE_ANY("DELETE_ANY"),
      @SerializedName("DELETE_ARCHIVED_BEFORE")
      VALUE_DELETE_ARCHIVED_BEFORE("DELETE_ARCHIVED_BEFORE"),
      @SerializedName("DELETE_OLDEST")
      VALUE_DELETE_OLDEST("DELETE_OLDEST"),
      NULL(null);

      private String value;

      private EnumDeleteStrategy(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumType {
      @SerializedName("SHARE_PC")
      VALUE_SHARE_PC("SHARE_PC"),
      NULL(null);

      private String value;

      private EnumType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }


  synchronized /*package*/ static Gson getGson() {
    if (gson != null) {
      return gson;
    } else {
      gson = new GsonBuilder()
        .excludeFieldsWithModifiers(Modifier.STATIC)
        .excludeFieldsWithModifiers(Modifier.PROTECTED)
        .disableHtmlEscaping()
        .create();
    }
    return gson;
  }

  public AdAccount copyFrom(AdAccount instance) {
    this.mAccountId = instance.mAccountId;
    this.mAccountStatus = instance.mAccountStatus;
    this.mAdAccountCreationRequest = instance.mAdAccountCreationRequest;
    this.mAdAccountPromotableObjects = instance.mAdAccountPromotableObjects;
    this.mAge = instance.mAge;
    this.mAgencyClientDeclaration = instance.mAgencyClientDeclaration;
    this.mAmountSpent = instance.mAmountSpent;
    this.mAttributionSpec = instance.mAttributionSpec;
    this.mBalance = instance.mBalance;
    this.mBusiness = instance.mBusiness;
    this.mBusinessCity = instance.mBusinessCity;
    this.mBusinessCountryCode = instance.mBusinessCountryCode;
    this.mBusinessName = instance.mBusinessName;
    this.mBusinessState = instance.mBusinessState;
    this.mBusinessStreet = instance.mBusinessStreet;
    this.mBusinessStreet2 = instance.mBusinessStreet2;
    this.mBusinessZip = instance.mBusinessZip;
    this.mCanCreateBrandLiftStudy = instance.mCanCreateBrandLiftStudy;
    this.mCapabilities = instance.mCapabilities;
    this.mCreatedTime = instance.mCreatedTime;
    this.mCurrency = instance.mCurrency;
    this.mDisableReason = instance.mDisableReason;
    this.mEndAdvertiser = instance.mEndAdvertiser;
    this.mEndAdvertiserName = instance.mEndAdvertiserName;
    this.mFailedDeliveryChecks = instance.mFailedDeliveryChecks;
    this.mFbEntity = instance.mFbEntity;
    this.mFundingSource = instance.mFundingSource;
    this.mFundingSourceDetails = instance.mFundingSourceDetails;
    this.mHasMigratedPermissions = instance.mHasMigratedPermissions;
    this.mHasPageAuthorizedAdaccount = instance.mHasPageAuthorizedAdaccount;
    this.mId = instance.mId;
    this.mIoNumber = instance.mIoNumber;
    this.mIsAttributionSpecSystemDefault = instance.mIsAttributionSpecSystemDefault;
    this.mIsDirectDealsEnabled = instance.mIsDirectDealsEnabled;
    this.mIsIn3dsAuthorizationEnabledMarket = instance.mIsIn3dsAuthorizationEnabledMarket;
    this.mIsInMiddleOfLocalEntityMigration = instance.mIsInMiddleOfLocalEntityMigration;
    this.mIsNotificationsEnabled = instance.mIsNotificationsEnabled;
    this.mIsPersonal = instance.mIsPersonal;
    this.mIsPrepayAccount = instance.mIsPrepayAccount;
    this.mIsTaxIdRequired = instance.mIsTaxIdRequired;
    this.mLineNumbers = instance.mLineNumbers;
    this.mMediaAgency = instance.mMediaAgency;
    this.mMinCampaignGroupSpendCap = instance.mMinCampaignGroupSpendCap;
    this.mMinDailyBudget = instance.mMinDailyBudget;
    this.mName = instance.mName;
    this.mOffsitePixelsTosAccepted = instance.mOffsitePixelsTosAccepted;
    this.mOwner = instance.mOwner;
    this.mPartner = instance.mPartner;
    this.mRfSpec = instance.mRfSpec;
    this.mShowCheckoutExperience = instance.mShowCheckoutExperience;
    this.mSpendCap = instance.mSpendCap;
    this.mTaxId = instance.mTaxId;
    this.mTaxIdStatus = instance.mTaxIdStatus;
    this.mTaxIdType = instance.mTaxIdType;
    this.mTimezoneId = instance.mTimezoneId;
    this.mTimezoneName = instance.mTimezoneName;
    this.mTimezoneOffsetHoursUtc = instance.mTimezoneOffsetHoursUtc;
    this.mTosAccepted = instance.mTosAccepted;
    this.mUserRole = instance.mUserRole;
    this.mUserTosAccepted = instance.mUserTosAccepted;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<AdAccount> getParser() {
    return new APIRequest.ResponseParser<AdAccount>() {
      public APINodeList<AdAccount> parseResponse(String response, APIContext context, APIRequest<AdAccount> request, String header) throws MalformedResponseException {
        return AdAccount.parseResponse(response, context, request, header);
      }
    };
  }
}
