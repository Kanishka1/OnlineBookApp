function gadgetDetails() {
    console.log('gadgets');
    return ({
        charging: function () { },
        call: function () { console.log("call Called"); }
    });
}
var newgadget = gadgetDetails();
newgadget.charging(); // same method can be called  
var gadget;
gadget.call(); // not visible, throws error  
