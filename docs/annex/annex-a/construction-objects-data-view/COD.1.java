	public interface IfcDefinitionSelect
	{
	}
	

	public interface IfcPropertySetDefinitionSelect
	{
	}
	

	public class IfcComplexPropertyTemplate extends IfcPropertyTemplate
	{
		private string UsageName;
		private IfcComplexPropertyTemplateTypeEnum TemplateType;
		private IfcPropertyTemplate[] HasPropertyTemplates;
	}
	

	public class IfcContext extends IfcObjectDefinition
	{
		private string ObjectType;
		private string LongName;
		private string Phase;
		private IfcRepresentationContext[] RepresentationContexts;
		private IfcUnitAssignment UnitsInContext;
		private IfcRelDefinesByProperties[] IsDefinedBy;
		private IfcRelDeclares[] Declares;
	}
	

	public class IfcGroup extends IfcObject
	{
		private IfcRelAssignsToGroup[] IsGroupedBy;
	}
	

	public class IfcObject extends IfcObjectDefinition
	{
		private string ObjectType;
		private IfcRelDefinesByObject[] IsDeclaredBy;
		private IfcRelDefinesByObject[] Declares;
		private IfcRelDefinesByType[] IsTypedBy;
		private IfcRelDefinesByProperties[] IsDefinedBy;
	}
	

	public class IfcObjectDefinition extends IfcRoot
	{
		private IfcRelAssigns[] HasAssignments;
		private IfcRelNests[] Nests;
		private IfcRelNests[] IsNestedBy;
		private IfcRelDeclares[] HasContext;
		private IfcRelAggregates[] IsDecomposedBy;
		private IfcRelAggregates[] Decomposes;
		private IfcRelAssociates[] HasAssociations;
	}
	

	public class IfcProduct extends IfcObject
	{
		private IfcObjectPlacement ObjectPlacement;
		private IfcProductRepresentation Representation;
		private IfcRelAssignsToProduct[] ReferencedBy;
	}
	

	public class IfcProject extends IfcContext
	{
	}
	

	public class IfcProjectLibrary extends IfcContext
	{
	}
	

	public class IfcPropertyDefinition extends IfcRoot
	{
		private IfcRelDeclares[] HasContext;
		private IfcRelAssociates[] HasAssociations;
	}
	

	public class IfcPropertySet extends IfcPropertySetDefinition
	{
		private IfcProperty[] HasProperties;
	}
	

	public class IfcPropertySetDefinition extends IfcPropertyDefinition
	{
		private IfcTypeObject[] DefinesType;
		private IfcRelDefinesByTemplate[] IsDefinedBy;
		private IfcRelDefinesByProperties[] DefinesOccurrence;
	}
	

	public class IfcPropertySetTemplate extends IfcPropertyTemplateDefinition
	{
		private IfcPropertySetTemplateTypeEnum TemplateType;
		private string ApplicableEntity;
		private IfcPropertyTemplate[] HasPropertyTemplates;
		private IfcRelDefinesByTemplate[] Defines;
	}
	

	public class IfcPropertyTemplate extends IfcPropertyTemplateDefinition
	{
		private IfcComplexPropertyTemplate[] PartOfComplexTemplate;
		private IfcPropertySetTemplate[] PartOfPsetTemplate;
	}
	

	public class IfcPropertyTemplateDefinition extends IfcPropertyDefinition
	{
	}
	

	public class IfcRelAggregates extends IfcRelDecomposes
	{
		private IfcObjectDefinition RelatingObject;
		private IfcObjectDefinition[] RelatedObjects;
	}
	

	public class IfcRelAssigns extends IfcRelationship
	{
		private IfcObjectDefinition[] RelatedObjects;
		private IfcObjectTypeEnum RelatedObjectsType;
	}
	

	public class IfcRelAssignsToGroup extends IfcRelAssigns
	{
		private IfcGroup RelatingGroup;
	}
	

	public class IfcRelAssociates extends IfcRelationship
	{
		private IfcDefinitionSelect[] RelatedObjects;
	}
	

	public class IfcRelAssociatesClassification extends IfcRelAssociates
	{
		private IfcClassificationSelect RelatingClassification;
	}
	

	public class IfcRelAssociatesDocument extends IfcRelAssociates
	{
		private IfcDocumentSelect RelatingDocument;
	}
	

	public class IfcRelAssociatesLibrary extends IfcRelAssociates
	{
		private IfcLibrarySelect RelatingLibrary;
	}
	

	public class IfcRelationship extends IfcRoot
	{
	}
	

	public class IfcRelConnects extends IfcRelationship
	{
	}
	

	public class IfcRelDeclares extends IfcRelationship
	{
		private IfcContext RelatingContext;
		private IfcDefinitionSelect[] RelatedDefinitions;
	}
	

	public class IfcRelDecomposes extends IfcRelationship
	{
	}
	

	public class IfcRelDefines extends IfcRelationship
	{
	}
	

	public class IfcRelDefinesByProperties extends IfcRelDefines
	{
		private IfcObjectDefinition[] RelatedObjects;
		private IfcPropertySetDefinitionSelect RelatingPropertyDefinition;
	}
	

	public class IfcRelDefinesByType extends IfcRelDefines
	{
		private IfcObject[] RelatedObjects;
		private IfcTypeObject RelatingType;
	}
	

	public class IfcRoot extends IfcBase
	{
		private string GlobalId;
		private IfcOwnerHistory OwnerHistory;
		private string Name;
		private string Description;
	}
	

	public class IfcSimplePropertyTemplate extends IfcPropertyTemplate
	{
		private IfcSimplePropertyTemplateTypeEnum TemplateType;
		private string PrimaryMeasureType;
		private string SecondaryMeasureType;
		private IfcPropertyEnumeration Enumerators;
		private IfcUnit PrimaryUnit;
		private IfcUnit SecondaryUnit;
		private string Expression;
		private IfcStateEnum AccessState;
	}
	

	public class IfcTypeObject extends IfcObjectDefinition
	{
		private string ApplicableOccurrence;
		private IfcPropertySetDefinition[] HasPropertySets;
		private IfcRelDefinesByType[] Types;
	}
	

	public enum IfcOpeningElementTypeEnum
	{
		OPENING,
		RECESS,
		USERDEFINED,
		NOTDEFINED,
	}
	

	public class IfcElement extends IfcProduct
	{
		private string Tag;
		private IfcRelFillsElement[] FillsVoids;
		private IfcRelConnectsElements[] ConnectedTo;
		private IfcRelInterferesElements[] IsInterferedByElements;
		private IfcRelInterferesElements[] InterferesElements;
		private IfcRelProjectsElement[] HasProjections;
		private IfcRelReferencedInSpatialStructure[] ReferencedInStructures;
		private IfcRelVoidsElement[] HasOpenings;
		private IfcRelConnectsWithRealizingElements[] IsConnectionRealization;
		private IfcRelSpaceBoundary[] ProvidesBoundaries;
		private IfcRelConnectsElements[] ConnectedFrom;
		private IfcRelContainedInSpatialStructure[] ContainedInStructure;
		private IfcRelCoversBldgElements[] HasCoverings;
	}
	

	public class IfcFeatureElement extends IfcElement
	{
	}
	

	public class IfcFeatureElementSubtraction extends IfcFeatureElement
	{
		private IfcRelVoidsElement VoidsElements;
	}
	

	public class IfcOpeningElement extends IfcFeatureElementSubtraction
	{
		private IfcOpeningElementTypeEnum PredefinedType;
		private IfcRelFillsElement[] HasFillings;
	}
	

	public class IfcRelAssociatesMaterial extends IfcRelAssociates
	{
		private IfcMaterialSelect RelatingMaterial;
	}
	

	public class IfcRelFillsElement extends IfcRelConnects
	{
		private IfcOpeningElement RelatingOpeningElement;
		private IfcElement RelatedBuildingElement;
	}
	

	public class IfcSystem extends IfcGroup
	{
		private IfcRelServicesBuildings[] ServicesBuildings;
	}
	

	public enum IfcBuildingSystemTypeEnum
	{
		FENESTRATION,
		FOUNDATION,
		LOADBEARING,
		OUTERSHELL,
		SHADING,
		TRANSPORT,
		USERDEFINED,
		NOTDEFINED,
	}
	

	public class IfcBuildingSystem extends IfcSystem
	{
		private IfcBuildingSystemTypeEnum PredefinedType;
		private string LongName;
	}
	

	public enum IfcDistributionSystemEnum
	{
		AIRCONDITIONING,
		AUDIOVISUAL,
		CHEMICAL,
		CHILLEDWATER,
		COMMUNICATION,
		COMPRESSEDAIR,
		CONDENSERWATER,
		CONTROL,
		CONVEYING,
		DATA,
		DISPOSAL,
		DOMESTICCOLDWATER,
		DOMESTICHOTWATER,
		DRAINAGE,
		EARTHING,
		ELECTRICAL,
		ELECTROACOUSTIC,
		EXHAUST,
		FIREPROTECTION,
		FUEL,
		GAS,
		HAZARDOUS,
		HEATING,
		LIGHTING,
		LIGHTNINGPROTECTION,
		MUNICIPALSOLIDWASTE,
		OIL,
		OPERATIONAL,
		POWERGENERATION,
		RAINWATER,
		REFRIGERATION,
		SECURITY,
		SEWAGE,
		SIGNAL,
		STORMWATER,
		TELEPHONE,
		TV,
		VACUUM,
		VENT,
		VENTILATION,
		WASTEWATER,
		WATERSUPPLY,
		USERDEFINED,
		NOTDEFINED,
	}
	

	public class IfcDistributionSystem extends IfcSystem
	{
		private string LongName;
		private IfcDistributionSystemEnum PredefinedType;
	}
	

	public enum IfcRoleEnum
	{
		SUPPLIER,
		MANUFACTURER,
		CONTRACTOR,
		SUBCONTRACTOR,
		ARCHITECT,
		STRUCTURALENGINEER,
		COSTENGINEER,
		CLIENT,
		BUILDINGOWNER,
		BUILDINGOPERATOR,
		MECHANICALENGINEER,
		ELECTRICALENGINEER,
		PROJECTMANAGER,
		FACILITIESMANAGER,
		CIVILENGINEER,
		COMMISSIONINGENGINEER,
		ENGINEER,
		OWNER,
		CONSULTANT,
		CONSTRUCTIONMANAGER,
		FIELDCONSTRUCTIONMANAGER,
		RESELLER,
		USERDEFINED,
	}
	

	public interface IfcActorSelect
	{
	}
	

	public class IfcActorRole extends IfcBase
	{
		private IfcRoleEnum Role;
		private string UserDefinedRole;
		private string Description;
		private IfcExternalReferenceRelationship[] HasExternalReference;
	}
	

	public class IfcOrganization extends IfcBase
	{
		private string Identification;
		private string Name;
		private string Description;
		private IfcActorRole[] Roles;
		private IfcAddress[] Addresses;
		private IfcOrganizationRelationship[] IsRelatedBy;
		private IfcOrganizationRelationship[] Relates;
		private IfcPersonAndOrganization[] Engages;
	}
	

	public class IfcPerson extends IfcBase
	{
		private string Identification;
		private string FamilyName;
		private string GivenName;
		private string[] MiddleNames;
		private string[] PrefixTitles;
		private string[] SuffixTitles;
		private IfcActorRole[] Roles;
		private IfcAddress[] Addresses;
		private IfcPersonAndOrganization[] EngagedIn;
	}
	

	public class IfcPersonAndOrganization extends IfcBase
	{
		private IfcPerson ThePerson;
		private IfcOrganization TheOrganization;
		private IfcActorRole[] Roles;
	}
	

	public class IfcApproval extends IfcBase
	{
		private string Identifier;
		private string Name;
		private string Description;
		private string TimeOfApproval;
		private string Status;
		private string Level;
		private string Qualifier;
		private IfcActorSelect RequestingApproval;
		private IfcActorSelect GivingApproval;
		private IfcExternalReferenceRelationship[] HasExternalReferences;
		private IfcRelAssociatesApproval[] ApprovedObjects;
		private IfcResourceApprovalRelationship[] ApprovedResources;
		private IfcApprovalRelationship[] IsRelatedWith;
		private IfcApprovalRelationship[] Relates;
	}
	

	public enum IfcConstraintEnum
	{
		HARD,
		SOFT,
		ADVISORY,
		USERDEFINED,
		NOTDEFINED,
	}
	

	public class IfcConstraint extends IfcBase
	{
		private string Name;
		private string Description;
		private IfcConstraintEnum ConstraintGrade;
		private string ConstraintSource;
		private IfcActorSelect CreatingActor;
		private string CreationTime;
		private string UserDefinedGrade;
		private IfcExternalReferenceRelationship[] HasExternalReferences;
		private IfcResourceConstraintRelationship[] PropertiesForConstraint;
	}
	

	public class IfcAppliedValue extends IfcBase
	{
		private string Name;
		private string Description;
		private IfcAppliedValueSelect AppliedValue;
		private IfcMeasureWithUnit UnitBasis;
		private string ApplicableDate;
		private string FixedUntilDate;
		private string Category;
		private string Condition;
		private IfcArithmeticOperatorEnum ArithmeticOperator;
		private IfcAppliedValue[] Components;
		private IfcExternalReferenceRelationship[] HasExternalReference;
	}
	

	/* IfcDate : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcDateTime : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcTimeStamp : INTEGER (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	public enum IfcDataOriginEnum
	{
		MEASURED,
		PREDICTED,
		SIMULATED,
		USERDEFINED,
		NOTDEFINED,
	}
	

	public enum IfcTimeSeriesDataTypeEnum
	{
		CONTINUOUS,
		DISCRETE,
		DISCRETEBINARY,
		PIECEWISEBINARY,
		PIECEWISECONSTANT,
		PIECEWISECONTINUOUS,
		NOTDEFINED,
	}
	

	public class IfcTimeSeries extends IfcBase
	{
		private string Name;
		private string Description;
		private string StartTime;
		private string EndTime;
		private IfcTimeSeriesDataTypeEnum TimeSeriesDataType;
		private IfcDataOriginEnum DataOrigin;
		private string UserDefinedDataOrigin;
		private IfcUnit Unit;
		private IfcExternalReferenceRelationship[] HasExternalReference;
	}
	

	/* IfcURIReference : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	public interface IfcClassificationReferenceSelect
	{
	}
	

	public interface IfcClassificationSelect
	{
	}
	

	public interface IfcDocumentSelect
	{
	}
	

	public interface IfcLibrarySelect
	{
	}
	

	public interface IfcResourceObjectSelect
	{
	}
	

	public class IfcClassification extends IfcExternalInformation
	{
		private string Source;
		private string Edition;
		private string EditionDate;
		private string Name;
		private string Description;
		private string Location;
		private string[] ReferenceTokens;
		private IfcRelAssociatesClassification[] ClassificationForObjects;
		private IfcClassificationReference[] HasReferences;
	}
	

	public class IfcClassificationReference extends IfcExternalReference
	{
		private IfcClassificationReferenceSelect ReferencedSource;
		private string Description;
		private string Sort;
		private IfcRelAssociatesClassification[] ClassificationRefForObjects;
		private IfcClassificationReference[] HasReferences;
	}
	

	public class IfcDocumentInformation extends IfcExternalInformation
	{
		private string Identification;
		private string Name;
		private string Description;
		private string Location;
		private string Purpose;
		private string IntendedUse;
		private string Scope;
		private string Revision;
		private IfcActorSelect DocumentOwner;
		private IfcActorSelect[] Editors;
		private string CreationTime;
		private string LastRevisionTime;
		private string ElectronicFormat;
		private string ValidFrom;
		private string ValidUntil;
		private IfcDocumentConfidentialityEnum Confidentiality;
		private IfcDocumentStatusEnum Status;
		private IfcRelAssociatesDocument[] DocumentInfoForObjects;
		private IfcDocumentReference[] HasDocumentReferences;
		private IfcDocumentInformationRelationship[] IsPointedTo;
		private IfcDocumentInformationRelationship[] IsPointer;
	}
	

	public class IfcDocumentReference extends IfcExternalReference
	{
		private string Description;
		private IfcDocumentInformation ReferencedDocument;
		private IfcRelAssociatesDocument[] DocumentRefForObjects;
	}
	

	public class IfcExternalInformation extends IfcBase
	{
	}
	

	public class IfcExternalReference extends IfcBase
	{
		private string Location;
		private string Identification;
		private string Name;
		private IfcExternalReferenceRelationship[] ExternalReferenceForResources;
	}
	

	public class IfcExternalReferenceRelationship extends IfcResourceLevelRelationship
	{
		private IfcExternalReference RelatingReference;
		private IfcResourceObjectSelect[] RelatedResourceObjects;
	}
	

	public class IfcLibraryInformation extends IfcExternalInformation
	{
		private string Name;
		private string Version;
		private IfcActorSelect Publisher;
		private string VersionDate;
		private string Location;
		private string Description;
		private IfcRelAssociatesLibrary[] LibraryInfoForObjects;
		private IfcLibraryReference[] HasLibraryReferences;
	}
	

	public class IfcLibraryReference extends IfcExternalReference
	{
		private string Description;
		private IfcIdentifier Language;
		private IfcLibraryInformation ReferencedLibrary;
		private IfcRelAssociatesLibrary[] LibraryRefForObjects;
	}
	

	public class IfcResourceLevelRelationship extends IfcBase
	{
		private string Name;
		private string Description;
	}
	

	public class IfcRepresentationItem extends IfcBase
	{
		private IfcPresentationLayerAssignment[] LayerAssignment;
		private IfcStyledItem[] StyledByItem;
	}
	

	/* IfcCardinalPointReference : INTEGER (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	public enum IfcDirectionSenseEnum
	{
		POSITIVE,
		NEGATIVE,
	}
	

	public enum IfcLayerSetDirectionEnum
	{
		AXIS1,
		AXIS2,
		AXIS3,
	}
	

	public interface IfcMaterialSelect
	{
	}
	

	public class IfcMaterial extends IfcMaterialDefinition
	{
		private string Name;
		private string Description;
		private string Category;
		private IfcMaterialDefinitionRepresentation[] HasRepresentation;
		private IfcMaterialRelationship[] IsRelatedWith;
		private IfcMaterialRelationship[] RelatesTo;
	}
	

	public class IfcMaterialDefinition extends IfcBase
	{
		private IfcRelAssociatesMaterial[] AssociatedTo;
		private IfcExternalReferenceRelationship[] HasExternalReferences;
		private IfcMaterialProperties[] HasProperties;
	}
	

	public class IfcMaterialLayer extends IfcMaterialDefinition
	{
		private IfcMaterial Material;
		private IfcLengthMeasure LayerThickness;
		private int IsVentilated;
		private string Name;
		private string Description;
		private string Category;
		private int Priority;
		private IfcMaterialLayerSet ToMaterialLayerSet;
	}
	

	public class IfcMaterialLayerSet extends IfcMaterialDefinition
	{
		private IfcMaterialLayer[] MaterialLayers;
		private string LayerSetName;
		private string Description;
		private double TotalThickness;
	}
	

	public class IfcMaterialLayerSetUsage extends IfcMaterialUsageDefinition
	{
		private IfcMaterialLayerSet ForLayerSet;
		private IfcLayerSetDirectionEnum LayerSetDirection;
		private IfcDirectionSenseEnum DirectionSense;
		private double OffsetFromReferenceLine;
		private IfcLengthMeasure ReferenceExtent;
	}
	

	public class IfcMaterialLayerWithOffsets extends IfcMaterialLayer
	{
		private IfcLayerSetDirectionEnum OffsetDirection;
		private double OffsetValues;
	}
	

	public class IfcMaterialList extends IfcBase
	{
		private IfcMaterial[] Materials;
	}
	

	public class IfcMaterialProfile extends IfcMaterialDefinition
	{
		private string Name;
		private string Description;
		private IfcMaterial Material;
		private IfcProfileDef Profile;
		private int Priority;
		private string Category;
		private IfcMaterialProfileSet ToMaterialProfileSet;
	}
	

	public class IfcMaterialProfileSet extends IfcMaterialDefinition
	{
		private string Name;
		private string Description;
		private IfcMaterialProfile[] MaterialProfiles;
		private IfcCompositeProfileDef CompositeProfile;
	}
	

	public class IfcMaterialProfileSetUsage extends IfcMaterialUsageDefinition
	{
		private IfcMaterialProfileSet ForProfileSet;
		private int CardinalPoint;
		private IfcLengthMeasure ReferenceExtent;
	}
	

	public class IfcMaterialProfileSetUsageTapering extends IfcMaterialProfileSetUsage
	{
		private IfcMaterialProfileSet ForProfileEndSet;
		private int CardinalEndPoint;
	}
	

	public class IfcMaterialProfileWithOffsets extends IfcMaterialProfile
	{
		private double OffsetValues;
	}
	

	public class IfcMaterialUsageDefinition extends IfcBase
	{
		private IfcRelAssociatesMaterial[] AssociatedTo;
	}
	

	/* IfcIdentifier : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcLabel : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcLengthMeasure : REAL (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcLogical : LOGICAL (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcNonNegativeLengthMeasure : IfcLengthMeasure (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcNormalisedRatioMeasure : IfcRatioMeasure (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcPositiveLengthMeasure : IfcLengthMeasure (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcRatioMeasure : REAL (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcReal : REAL (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	/* IfcText : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	public enum IfcDerivedUnitEnum
	{
		ANGULARVELOCITYUNIT,
		AREADENSITYUNIT,
		COMPOUNDPLANEANGLEUNIT,
		DYNAMICVISCOSITYUNIT,
		HEATFLUXDENSITYUNIT,
		INTEGERCOUNTRATEUNIT,
		ISOTHERMALMOISTURECAPACITYUNIT,
		KINEMATICVISCOSITYUNIT,
		LINEARVELOCITYUNIT,
		MASSDENSITYUNIT,
		MASSFLOWRATEUNIT,
		MOISTUREDIFFUSIVITYUNIT,
		MOLECULARWEIGHTUNIT,
		SPECIFICHEATCAPACITYUNIT,
		THERMALADMITTANCEUNIT,
		THERMALCONDUCTANCEUNIT,
		THERMALRESISTANCEUNIT,
		THERMALTRANSMITTANCEUNIT,
		VAPORPERMEABILITYUNIT,
		VOLUMETRICFLOWRATEUNIT,
		ROTATIONALFREQUENCYUNIT,
		TORQUEUNIT,
		MOMENTOFINERTIAUNIT,
		LINEARMOMENTUNIT,
		LINEARFORCEUNIT,
		PLANARFORCEUNIT,
		MODULUSOFELASTICITYUNIT,
		SHEARMODULUSUNIT,
		LINEARSTIFFNESSUNIT,
		ROTATIONALSTIFFNESSUNIT,
		MODULUSOFSUBGRADEREACTIONUNIT,
		ACCELERATIONUNIT,
		CURVATUREUNIT,
		HEATINGVALUEUNIT,
		IONCONCENTRATIONUNIT,
		LUMINOUSINTENSITYDISTRIBUTIONUNIT,
		MASSPERLENGTHUNIT,
		MODULUSOFLINEARSUBGRADEREACTIONUNIT,
		MODULUSOFROTATIONALSUBGRADEREACTIONUNIT,
		PHUNIT,
		ROTATIONALMASSUNIT,
		SECTIONAREAINTEGRALUNIT,
		SECTIONMODULUSUNIT,
		SOUNDPOWERLEVELUNIT,
		SOUNDPOWERUNIT,
		SOUNDPRESSURELEVELUNIT,
		SOUNDPRESSUREUNIT,
		TEMPERATUREGRADIENTUNIT,
		TEMPERATURERATEOFCHANGEUNIT,
		THERMALEXPANSIONCOEFFICIENTUNIT,
		WARPINGCONSTANTUNIT,
		WARPINGMOMENTUNIT,
		USERDEFINED,
	}
	

	public enum IfcSIPrefix
	{
		EXA,
		PETA,
		TERA,
		GIGA,
		MEGA,
		KILO,
		HECTO,
		DECA,
		DECI,
		CENTI,
		MILLI,
		MICRO,
		NANO,
		PICO,
		FEMTO,
		ATTO,
	}
	

	public enum IfcSIUnitName
	{
		AMPERE,
		BECQUEREL,
		CANDELA,
		COULOMB,
		CUBIC_METRE,
		DEGREE_CELSIUS,
		FARAD,
		GRAM,
		GRAY,
		HENRY,
		HERTZ,
		JOULE,
		KELVIN,
		LUMEN,
		LUX,
		METRE,
		MOLE,
		NEWTON,
		OHM,
		PASCAL,
		RADIAN,
		SECOND,
		SIEMENS,
		SIEVERT,
		SQUARE_METRE,
		STERADIAN,
		TESLA,
		VOLT,
		WATT,
		WEBER,
	}
	

	public enum IfcUnitEnum
	{
		ABSORBEDDOSEUNIT,
		AMOUNTOFSUBSTANCEUNIT,
		AREAUNIT,
		DOSEEQUIVALENTUNIT,
		ELECTRICCAPACITANCEUNIT,
		ELECTRICCHARGEUNIT,
		ELECTRICCONDUCTANCEUNIT,
		ELECTRICCURRENTUNIT,
		ELECTRICRESISTANCEUNIT,
		ELECTRICVOLTAGEUNIT,
		ENERGYUNIT,
		FORCEUNIT,
		FREQUENCYUNIT,
		ILLUMINANCEUNIT,
		INDUCTANCEUNIT,
		LENGTHUNIT,
		LUMINOUSFLUXUNIT,
		LUMINOUSINTENSITYUNIT,
		MAGNETICFLUXDENSITYUNIT,
		MAGNETICFLUXUNIT,
		MASSUNIT,
		PLANEANGLEUNIT,
		POWERUNIT,
		PRESSUREUNIT,
		RADIOACTIVITYUNIT,
		SOLIDANGLEUNIT,
		THERMODYNAMICTEMPERATUREUNIT,
		TIMEUNIT,
		VOLUMEUNIT,
		USERDEFINED,
	}
	

	public interface IfcMeasureValue
	{
	}
	

	public interface IfcSimpleValue
	{
	}
	

	public interface IfcUnit
	{
	}
	

	public interface IfcValue
	{
	}
	

	public class IfcContextDependentUnit extends IfcNamedUnit
	{
		private string Name;
		private IfcExternalReferenceRelationship[] HasExternalReference;
	}
	

	public class IfcConversionBasedUnit extends IfcNamedUnit
	{
		private string Name;
		private IfcMeasureWithUnit ConversionFactor;
		private IfcExternalReferenceRelationship[] HasExternalReference;
	}
	

	public class IfcConversionBasedUnitWithOffset extends IfcConversionBasedUnit
	{
		private double ConversionOffset;
	}
	

	public class IfcDerivedUnit extends IfcBase
	{
		private IfcDerivedUnitElement[] Elements;
		private IfcDerivedUnitEnum UnitType;
		private string UserDefinedType;
		private IfcDimensionalExponents Dimensions;
	}
	

	public class IfcDerivedUnitElement extends IfcBase
	{
		private IfcNamedUnit Unit;
		private INTEGER Exponent;
	}
	

	public class IfcDimensionalExponents extends IfcBase
	{
		private INTEGER LengthExponent;
		private INTEGER MassExponent;
		private INTEGER TimeExponent;
		private INTEGER ElectricCurrentExponent;
		private INTEGER ThermodynamicTemperatureExponent;
		private INTEGER AmountOfSubstanceExponent;
		private INTEGER LuminousIntensityExponent;
	}
	

	public class IfcMeasureWithUnit extends IfcBase
	{
		private IfcValue ValueComponent;
		private IfcUnit UnitComponent;
	}
	

	public class IfcMonetaryUnit extends IfcBase
	{
		private string Currency;
	}
	

	public class IfcNamedUnit extends IfcBase
	{
		private IfcDimensionalExponents Dimensions;
		private IfcUnitEnum UnitType;
	}
	

	public class IfcSIUnit extends IfcNamedUnit
	{
		private IfcSIPrefix Prefix;
		private IfcSIUnitName Name;
		private IfcDimensionalExponents Dimensions;
	}
	

	public class IfcUnitAssignment extends IfcBase
	{
		private IfcUnit[] Units;
	}
	

	public enum IfcProfileTypeEnum
	{
		CURVE,
		AREA,
	}
	

	public class IfcProfileDef extends IfcBase
	{
		private IfcProfileTypeEnum ProfileType;
		private string ProfileName;
		private IfcExternalReferenceRelationship[] HasExternalReference;
		private IfcProfileProperties[] HasProperties;
	}
	

	public enum IfcCurveInterpolationEnum
	{
		LINEAR,
		LOG_LINEAR,
		LOG_LOG,
		NOTDEFINED,
	}
	

	public class IfcComplexProperty extends IfcProperty
	{
		private string UsageName;
		private IfcProperty[] HasProperties;
	}
	

	public class IfcProperty extends IfcPropertyAbstraction
	{
		private string Name;
		private string Description;
		private IfcPropertySet[] PartOfPset;
		private IfcPropertyDependencyRelationship[] PropertyForDependance;
		private IfcPropertyDependencyRelationship[] PropertyDependsOn;
		private IfcComplexProperty[] PartOfComplex;
		private IfcResourceConstraintRelationship[] HasConstraints;
		private IfcResourceApprovalRelationship[] HasApprovals;
	}
	

	public class IfcPropertyAbstraction extends IfcBase
	{
		private IfcExternalReferenceRelationship[] HasExternalReferences;
	}
	

	public class IfcPropertyBoundedValue extends IfcSimpleProperty
	{
		private IfcValue UpperBoundValue;
		private IfcValue LowerBoundValue;
		private IfcUnit Unit;
		private IfcValue SetPointValue;
	}
	

	public class IfcPropertyEnumeratedValue extends IfcSimpleProperty
	{
		private IfcValue[] EnumerationValues;
		private IfcPropertyEnumeration EnumerationReference;
	}
	

	public class IfcPropertyEnumeration extends IfcPropertyAbstraction
	{
		private string Name;
		private IfcValue[] EnumerationValues;
		private IfcUnit Unit;
	}
	

	public class IfcPropertyListValue extends IfcSimpleProperty
	{
		private IfcValue[] ListValues;
		private IfcUnit Unit;
	}
	

	public class IfcPropertySingleValue extends IfcSimpleProperty
	{
		private IfcValue NominalValue;
		private IfcUnit Unit;
	}
	

	public class IfcPropertyTableValue extends IfcSimpleProperty
	{
		private IfcValue[] DefiningValues;
		private IfcValue[] DefinedValues;
		private string Expression;
		private IfcUnit DefiningUnit;
		private IfcUnit DefinedUnit;
		private IfcCurveInterpolationEnum CurveInterpolation;
	}
	

	public class IfcSimpleProperty extends IfcProperty
	{
	}
	

	public class IfcPhysicalQuantity extends IfcBase
	{
		private string Name;
		private string Description;
		private IfcExternalReferenceRelationship[] HasExternalReferences;
		private IfcPhysicalComplexQuantity[] PartOfComplex;
	}
	

	public class IfcMaterialDefinitionRepresentation extends IfcProductRepresentation
	{
		private IfcMaterial RepresentedMaterial;
	}
	

	public class IfcProductRepresentation extends IfcBase
	{
		private string Name;
		private string Description;
		private IfcRepresentation[] Representations;
	}
	

	public class IfcRepresentation extends IfcBase
	{
		private IfcRepresentationContext ContextOfItems;
		private string RepresentationIdentifier;
		private string RepresentationType;
		private IfcRepresentationItem[] Items;
		private IfcRepresentationMap[] RepresentationMap;
		private IfcPresentationLayerAssignment[] LayerAssignments;
		private IfcProductRepresentation[] OfProductRepresentation;
	}
	

	public class IfcRepresentationContext extends IfcBase
	{
		private string ContextIdentifier;
		private string ContextType;
		private IfcRepresentation[] RepresentationsInContext;
	}
	

	/* IfcGloballyUniqueId : STRING (Java does not support structures, so usage of defined types are inline for efficiency.) */
	

	public class IfcApplication extends IfcBase
	{
		private IfcOrganization ApplicationDeveloper;
		private string Version;
		private string ApplicationFullName;
		private string ApplicationIdentifier;
	}
	

	public class IfcOwnerHistory extends IfcBase
	{
		private IfcPersonAndOrganization OwningUser;
		private IfcApplication OwningApplication;
		private IfcStateEnum State;
		private IfcChangeActionEnum ChangeAction;
		private int LastModifiedDate;
		private IfcPersonAndOrganization LastModifyingUser;
		private IfcApplication LastModifyingApplication;
		private int CreationDate;
	}
	

