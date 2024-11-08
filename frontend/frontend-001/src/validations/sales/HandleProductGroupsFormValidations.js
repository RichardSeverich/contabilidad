const classNameRed = "puggysoft-red-text";

const classNameFormTextNew = {
  name: classNameRed,
  image: "",
};

const handleValidation = (data, setClassNameFormText) => {
  let isValid = true;
  // NAME VALIDATION
  if (!(data.name.length >= 3 && data.name.length <= 60)) {
    isValid = false;
    classNameFormTextNew.name = classNameRed;
  } else {
    classNameFormTextNew.name = "";
  }
  setClassNameFormText({ ...classNameFormTextNew });
  return isValid;
};

export { handleValidation, classNameFormTextNew };
