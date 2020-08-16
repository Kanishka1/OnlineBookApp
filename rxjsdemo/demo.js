import{Observable} from'rxjs'

let observable=new Observable((sub)=>{
sub.next(10)
sub.next(10)
sub.next(10)
sub.next(10)
});
observable.subscribe({
     next(data)
    {
        console.log(data);
    },
    error(err)
    {
        console.log(err);
    }
})